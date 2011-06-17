package pe.edu.upc.dsd.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.junit.runner.notification.StoppedByUserException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.view.RedirectView;

import pe.edu.upc.dsd.service.Service;
import pe.edu.upc.dsd.ws.bean.Cliente;
import pe.edu.upc.dsd.ws.bean.Producto;
import pe.edu.upc.dsd.ws.bean.Stock;

public class BusquedaStockController extends AbstractController 
{
	private static final Logger logger = Logger.getLogger(BusquedaStockController.class);
	
	
	private static final String VISTA_BUSQUEDA_PRODUCTOS = "ConsultaStock";
	
	private static final String PARAMETRO_ACCION = "accion";
	private static final String PARAMETRO_CODIGO = "codigoProducto";
	
	private static final String ACCION_BUSCAR = "buscar";
	
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
			
			//String criterioBusqueda = request.getParameter(PARAMETRO_CRITERIO);
			String codigo = request.getParameter(PARAMETRO_CODIGO);
			
			logger.debug("Se realizara la busqueda con los siguientes parametros: codigo='" + codigo + "'");
			
			Stock stock = buscarStock(codigo);
			setAttributeToModel(request, "stock", stock);
			
			return new ModelAndView(VISTA_BUSQUEDA_PRODUCTOS, getModel(request));
		}
		
		
		return new ModelAndView(VISTA_BUSQUEDA_PRODUCTOS);
	}
	
	/**
	 * @param codigo
	 * @return
	 */
	private Stock buscarStock(String codigo)
	{
		
		Stock stock = service.obtenerStock(codigo);
			
		return stock;
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
	 * @param service
	 */
	public void setService(Service service)
	{
		this.service = service;
	}
}