package pe.edu.upc.dsd.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import pe.edu.upc.dsd.service.Service;

public class BusquedaDocumentosController extends AbstractController 
{
	private static final Logger logger = Logger.getLogger(BusquedaDocumentosController.class);
	
	private static final String VISTA_BUSQUEDA_DOCUMENTOS = "ConsultaDocumentosPago";
	private static final String VISTA_BUSQUEDA_PRODUCTOS = "ConsultaProductos";
	private static final String VISTA_REGISTRO_PEDIDO = "RegistroPedido";
	
	private static final String PARAMETRO_ACCION = "accion";
	private static final String PARAMETRO_CODIGO = "codigo";
	
	private static final String ACCION_BUSCAR = "buscar";
	private static final String ACCION_SIGUIENTE = "siguiente";
	private static final String ACCION_ATRAS = "atras";
	
	private Service service;
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		logger.debug("La accion que se realizara sera: " + request.getParameter(PARAMETRO_ACCION));
		
		if(esAccionBuscar(request))
		{
			
		}
		else if(esAccionSiguiente(request))
		{
			
		}
		else if(esAccionAtras(request))
		{
			
		}
		
		return new ModelAndView(VISTA_BUSQUEDA_DOCUMENTOS);
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
			return new HashMap<String, Object>();
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