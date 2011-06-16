package pe.edu.upc.dsd.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.view.RedirectView;

import pe.edu.upc.dsd.service.Service;

public class RegistroPedidoController extends AbstractController 
{
	private static final Logger logger = Logger.getLogger(RegistroPedidoController.class);
	
	private static final String VISTA_REGISTRO_PEDIDO = "RegistrarPedido";
	
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
			setAttributeToModel(request, "codigoPedido", service.generarNumeroPedido());
			return new ModelAndView(VISTA_REGISTRO_PEDIDO, getModel(request));
		}
		else if(esAccionAtras(request))
		{
			// Se redirecciona al servlet de busqueda de documento para mostrar los documentos ya consultados
			return new ModelAndView(new RedirectView("buscarProducto.do"));
		}
		else if(esAccionFinalizar(request))
		{
			
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