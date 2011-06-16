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
import pe.edu.upc.dsd.ws.bean.Cliente;

public class BusquedaClienteController extends AbstractController 
{
	private static final Logger logger = Logger.getLogger(BusquedaClienteController.class);
	
	private static final String VISTA_BUSQUEDA_CLIENTES = "ConsultaCliente";
	private static final String VISTA_CONSULTA_DOCUMENTOS = "ConsultaDocumentosPago";
	
	private static final String PARAMETRO_ACCION = "accion";
	private static final String ACCION_SIGUIENTE = "siguiente";
	private static final String ACCION_BUSCAR = "buscar";
	
	private Service service;
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		logger.debug("Accion es: " + request.getParameter(PARAMETRO_ACCION));
		
		if(esAccionBuscar(request))
		{
			// Se obtiene el cliente del servicio y se muestra el resultado en la misma pantalla
			List<Cliente> clientes = buscarCliente(request);

			setAttributeToModel(request, "clientes", clientes);
			return new ModelAndView(VISTA_BUSQUEDA_CLIENTES, getModel(request));
		}
		else if(esAccionSiguiente(request))
		{
			logger.debug("Redireccionando a la pagina de consulta de documentos...");
			
			//TODO: Se debera guardar en sesion unicamente el cliente seleccionado para su uso en lo que sigue del proceso.
			
			return new ModelAndView(VISTA_CONSULTA_DOCUMENTOS);
		}
		
		return new ModelAndView(VISTA_BUSQUEDA_CLIENTES);
	}

	private List<Cliente> buscarCliente(HttpServletRequest request)
	{
		String codigoCliente = request.getParameter("codigoCliente");
		
		logger.debug("Se buscara el cliente con codigo: " + codigoCliente);
	
		List<Cliente> clientes = new ArrayList<Cliente>();
		Cliente cliente = service.obtenerCliente(codigoCliente);
		
		if(cliente != null)
		{
			clientes.add(cliente);
		}
		
		return clientes;
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
	private boolean esAccionSiguiente(HttpServletRequest request)
	{
		return ACCION_SIGUIENTE.equals(request.getParameter(PARAMETRO_ACCION));
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