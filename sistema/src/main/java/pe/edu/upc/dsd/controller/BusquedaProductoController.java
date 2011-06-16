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

import pe.edu.upc.dsd.service.Service;
import pe.edu.upc.dsd.ws.bean.Producto;

public class BusquedaProductoController extends AbstractController 
{
	private static final Logger logger = Logger.getLogger(BusquedaProductoController.class);
	
	
	private static final String VISTA_BUSQUEDA_DOCUMENTOS = "ConsultaDocumentosPago";
	private static final String VISTA_BUSQUEDA_PRODUCTOS = "ConsultaProductos";
	private static final String VISTA_TIPO_PAGO = "TipoPago";
	
	private static final String PARAMETRO_ACCION = "accion";
	private static final String PARAMETRO_CRITERIO = "criterioBusqueda";
	private static final String PARAMETRO_CODIGO = "codigoProducto";
	
	private static final String ACCION_BUSCAR = "buscar";
	private static final String ACCION_SIGUIENTE = "siguiente";
	private static final String ACCION_ATRAS = "atras";
	
	private static final String CRITERIO_CODIGO = "0";
	private static final String CRITERIO_CATEGORIA = "1";
	
	private Service service;
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		logger.debug("Accion es: " + request.getParameter(PARAMETRO_ACCION));
		
		if(esAccionBuscar(request))
		{
			logger.debug("Obtenemos el criterio de busqueda...");
			
			String criterioBusqueda = request.getParameter(PARAMETRO_CRITERIO);
			String codigo = request.getParameter(PARAMETRO_CODIGO);
			
			logger.debug("Se realizara la busqueda con los siguientes parametros: criterio='" + criterioBusqueda + "', codigo='" + codigo + "'");
			
			List<Producto> productos = buscarProducto(criterioBusqueda, codigo);
			setAttributeToModel(request, "productos", productos);
			
			return new ModelAndView(VISTA_BUSQUEDA_PRODUCTOS, getModel(request));
		}
		else if(esAccionSiguiente(request))
		{
			logger.debug("Redireccionando a la pagina de consulta de documentos de pago...");
			
			//TODO: Se debe implementar el obtener los codigos de los productos seleccionados
			// y buscarlos en la lista traida por el servicio guardada en sesion
			
			return new ModelAndView(VISTA_TIPO_PAGO);
		}
		else if(esAccionAtras(request))
		{
			logger.debug("Redireccionando a la pagina anterior de busqueda de clientes...");
			return new ModelAndView(VISTA_BUSQUEDA_DOCUMENTOS);
		}
		
		return new ModelAndView(VISTA_BUSQUEDA_PRODUCTOS);
	}
	
	/**
	 * @param codigo
	 * @return
	 */
	private List<Producto> buscarProducto(String criterio, String codigo)
	{
		List<Producto> productos = new ArrayList<Producto>();
		
		if(CRITERIO_CODIGO.equals(criterio))
		{
			Producto producto = service.obtenerProducto(codigo);
			
			if(producto != null)
			{
				productos.add(producto);
			}
		}
		else if(CRITERIO_CATEGORIA.equals(criterio))
		{
			List<Producto> resultado = service.obtenerProductosPorCategoria(codigo);
			
			if(resultado != null)
			{
				productos.addAll(resultado);
			}
		}
			
		return productos;
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
		return ACCION_SIGUIENTE.equals(request.getParameter(ACCION_SIGUIENTE));
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