package pe.edu.upc.dsd.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.view.RedirectView;

import pe.edu.upc.dsd.service.Service;
import pe.edu.upc.dsd.ws.bean.Cliente;
import pe.edu.upc.dsd.ws.bean.Pedido;
import pe.edu.upc.dsd.ws.bean.Producto;

public class RegistroPedidoController extends AbstractController 
{
	private static final Logger logger = Logger.getLogger(RegistroPedidoController.class);
	
	private static final String VISTA_REGISTRO_PEDIDO = "RegistrarPedido";
	private static final String VISTA_REGISTRO_EXITOSO = "RegistroExitoso";
	
	private static final String PARAMETRO_ACCION = "accion";
	private static final String ACCION_CARGAR = "cargar";
	private static final String ACCION_FINALIZAR = "finalizar";
	private static final String ACCION_ATRAS = "atras";	
	
	private Service service;
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		logger.debug("La accion a realizar es: " + request.getParameter(PARAMETRO_ACCION));
		
		if(esAccionCargar(request))
		{
			// Se direcciona a la pagina de registro de pedido junto con los datos 
			// recolectados previamente.
			Double subtotal = obtenerSubTotal(request);
			Double igv = subtotal * 0.18;
			
			BigDecimal bd = new BigDecimal(igv);
			bd.setScale(2, BigDecimal.ROUND_HALF_UP);
			
			setAttributeToModel(request, "codigoPedido", service.generarNumeroPedido());
			setAttributeToModel(request, "subtotal", subtotal);
			setAttributeToModel(request, "igv", new Double(bd.doubleValue()));
			setAttributeToModel(request, "total", subtotal + igv);
			return new ModelAndView(VISTA_REGISTRO_PEDIDO, getModel(request));
		}
		else if(esAccionAtras(request))
		{
			// Se redirecciona al servlet de busqueda de documento para mostrar los documentos ya consultados
			return new ModelAndView(new RedirectView("buscarProducto.do"));
		}
		else if(esAccionFinalizar(request))
		{
			String codigoVenta = registrarPedido(request);
			setAttributeToModel(request, "codigoVenta", codigoVenta);
			return new ModelAndView(VISTA_REGISTRO_EXITOSO, getModel(request));
		}
		
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public String registrarPedido(HttpServletRequest request)
	{
		// Se obtiene los datos guardados en sesion para preparar el pedido a ser enviado.
		Cliente clienteSeleccionado = (Cliente) getModel(request).get("clienteSeleccionado");
		ArrayList<Producto> productosSeleccionados = (ArrayList<Producto>) getModel(request).get("productosSeleccionados");
		
		System.out.println( "descuento: " + request.getParameter("descuento") );
		
		// Se prepara el pedido
		Pedido pedido = new Pedido();
		pedido.setCodigo(request.getParameter("codPedido"));
		pedido.setFecha(request.getParameter("fechaPedido"));
		pedido.setTipoPago(request.getParameter("cboTipoPago"));
		pedido.setDescuento(new Double(request.getParameter("descuento")));
		pedido.setTotal((Double) getModel(request).get("total"));
		pedido.setCliente(clienteSeleccionado);
		pedido.setProductos(productosSeleccionados);
		
		// Se envia el pedido hacia el servicio web
		return service.registrarPedido(pedido);
	}
	
	@SuppressWarnings("unchecked")
	private Double obtenerSubTotal(HttpServletRequest request)
	{
		List<Producto> productos = (List<Producto>) getModel(request).get("productosSeleccionados");
		double subtotal = 0.00;
		
		for (Producto producto : productos) 
		{
			subtotal = subtotal + producto.getTotal();
		}
		
		return new Double(subtotal);
	}
	
	/**
	 * @param request
	 * @param name
	 * @param value
	 */
	private void setAttributeToModel(HttpServletRequest request, String name, Object value)
	{
		getModel(request).put(name, value);
	}
	
	@SuppressWarnings("unchecked")
	private Map<String, Object> getModel(HttpServletRequest request)
	{
		Map<String, Object> model = (Map<String, Object>) request.getSession().getAttribute("model");
		
		if(model == null)
		{
			model = new HashMap<String, Object>();
			request.getSession().setAttribute("model", model);
			
			return model;
		}
		
		return model;
	}
	
	/**
	 * @param request
	 * @return
	 */
	private boolean esAccionCargar(HttpServletRequest request)
	{
		return ACCION_CARGAR.equals(request.getParameter(PARAMETRO_ACCION));
	}
	
	/**
	 * @param request
	 * @return
	 */
	private boolean esAccionFinalizar(HttpServletRequest request)
	{
		return ACCION_FINALIZAR.equals(request.getParameter(PARAMETRO_ACCION));
	}
	
	/**
	 * @param request
	 * @return
	 */
	private boolean esAccionAtras(HttpServletRequest request)
	{
		return ACCION_ATRAS.equals(request.getParameter(PARAMETRO_ACCION));
	}
	
	/**
	 * @param service
	 */
	public void setService(Service service)
	{
		this.service = service;
	}
}