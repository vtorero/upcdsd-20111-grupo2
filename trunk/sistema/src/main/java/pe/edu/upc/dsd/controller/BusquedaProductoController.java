package pe.edu.upc.dsd.controller;

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
import pe.edu.upc.dsd.ws.bean.Producto;

public class BusquedaProductoController extends AbstractController 
{
	private static final Logger logger = Logger.getLogger(BusquedaProductoController.class);

	private static final String VISTA_BUSQUEDA_PRODUCTOS = "ConsultaProductos";
	
	private static final String PARAMETRO_ACCION = "accion";
	private static final String PARAMETRO_CRITERIO = "criterioBusqueda";
	private static final String PARAMETRO_CODIGO = "codigoProducto";
	private static final String PARAMETRO_CATEGORIA = "categoriaProducto";
	
	private static final String ACCION_BUSCAR = "buscar";
	private static final String ACCION_SIGUIENTE = "siguiente";
	private static final String ACCION_ATRAS = "atras";
	
	private static final String CRITERIO_CODIGO = "1";
	private static final String CRITERIO_CATEGORIA = "2";
	
	private Service service;
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		logger.debug("Accion es: " + request.getParameter(PARAMETRO_ACCION));
		
		if(esAccionBuscar(request))
		{
			logger.debug("Obtenemos el criterio de busqueda...");
			
			String criterioBusqueda = request.getParameter(PARAMETRO_CRITERIO);
			
			List<Producto> productos = buscarProducto(request, criterioBusqueda);
			setAttributeToModel(request, "productos", productos);
			
			return new ModelAndView(VISTA_BUSQUEDA_PRODUCTOS, getModel(request));
		}
		else if(esAccionSiguiente(request))
		{
			logger.debug("Redireccionando a la pagina de Pedido...");

			guardarProductosSeleccionados(request);
			return new ModelAndView(new RedirectView("registrarPedido.do?accion=cargar"));

		}
		else if(esAccionAtras(request))
		{
			logger.debug("Redireccionando a la pagina anterior de busqueda de documentos...");
			return new ModelAndView(new RedirectView("buscarDocumentos.do"));
		}
		
		return new ModelAndView(VISTA_BUSQUEDA_PRODUCTOS);
	}
	
	/**
	 * @param codigo
	 * @return
	 */
	private List<Producto> buscarProducto(HttpServletRequest request, String criterio)
	{
		List<Producto> productos = new ArrayList<Producto>();
		
		if(CRITERIO_CODIGO.equals(criterio))
		{
			logger.debug("Se realizara la busqueda con los siguientes parametros: criterio='" + criterio + "', codigo='" + request.getParameter(PARAMETRO_CODIGO) + "'");
			
			Producto producto = service.obtenerProducto(request.getParameter(PARAMETRO_CODIGO));
			
			if(producto != null)
			{
				productos.add(producto);
			}
		}
		else if(CRITERIO_CATEGORIA.equals(criterio))
		{
			logger.debug("Se realizara la busqueda con los siguientes parametros: criterio='" + criterio + "', codigo='" + request.getParameter(PARAMETRO_CATEGORIA) + "'");
			
			List<Producto> resultado = service.obtenerProductosPorCategoria(request.getParameter(PARAMETRO_CATEGORIA));
			
			if(resultado != null)
			{
				productos.addAll(resultado);
			}
		}
			
		return productos;
	}
	
	private void guardarProductosSeleccionados(HttpServletRequest request)
	{
		String[] seleccion = request.getParameterValues("chkProducto");
		
		if(seleccion.length > 0)
		{
			List<Producto> productosSeleccionados = new ArrayList<Producto>();
			for (int i = 0; i < seleccion.length; i++) {
				String codigo = seleccion[i];
				Producto productoSeleccionado = obtenerProductoSeleccionado(request, codigo);
				String cantidadProducto = request.getParameter("cantidad".concat(productoSeleccionado.getCodigo()));
				
				productoSeleccionado.setCantidad(Integer.parseInt(cantidadProducto));
				productosSeleccionados.add(productoSeleccionado);
				
			}
			setAttributeToModel(request, "productosSeleccionados", productosSeleccionados);
		}
	}
	
	@SuppressWarnings("unchecked")
	private Producto obtenerProductoSeleccionado(HttpServletRequest request, String codigo)
	{
		for (Producto producto : (List<Producto>) getModel(request).get("productos")) 
		{
			if(producto.getCodigo().equals(codigo))
			{
				return producto;
			}
		}
		
		return null;
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
	private boolean esAccionBuscar(HttpServletRequest request)
	{
		return ACCION_BUSCAR.equals(request.getParameter(PARAMETRO_ACCION));
	}
	
	/**
	 * @param request
	 * @return
	 */
	private boolean esAccionSiguiente(HttpServletRequest request)
	{
		return ACCION_SIGUIENTE.equals(request.getParameter(PARAMETRO_ACCION));
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