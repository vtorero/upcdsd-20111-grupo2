package pe.edu.upc.dsd.controller;

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
import pe.edu.upc.dsd.ws.bean.DocumentoPendiente;

public class BusquedaDocumentosController extends AbstractController 
{
	private static final Logger logger = Logger.getLogger(BusquedaDocumentosController.class);
	
	private static final String VISTA_BUSQUEDA_DOCUMENTOS = "ConsultaDocumentosPago";
	
	private static final String PARAMETRO_ACCION = "accion";
	
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
			List<DocumentoPendiente> documentos = buscarDocumentosPendientes(request);
			Double lineaCredito = obtenerLineaCreditoCliente(request);
			Double lineaDisponible = obtenerLineaDisponible(documentos, lineaCredito); 
			
			setAttributeToModel(request, "documentosPendientes", documentos);
			setAttributeToModel(request, "lineaCredito", lineaCredito);
			setAttributeToModel(request, "lineaDisponible", lineaDisponible);
			
			return new ModelAndView(VISTA_BUSQUEDA_DOCUMENTOS, getModel(request));
		}
		else if(esAccionSiguiente(request))
		{
			return new ModelAndView(new RedirectView("buscarProducto.do"));
		}
		else if(esAccionAtras(request))
		{
			return new ModelAndView(new RedirectView("buscarCliente.do"));
		}
		
		return new ModelAndView(VISTA_BUSQUEDA_DOCUMENTOS);
	}
	
	/**
	 * @param request
	 * @return
	 */
	private List<DocumentoPendiente> buscarDocumentosPendientes(HttpServletRequest request)
	{
		logger.debug("Realizando la busqueda de documentos pendientes...");
		
		Cliente cliente = (Cliente) getModel(request).get("clienteSeleccionado");		
		List<DocumentoPendiente> documentos = service.obtenerDocumentosPendientes(cliente.getCodigo());

		logger.debug("Cantidad de documentos pendientes encontrados para el cliente con codigo '" + cliente.getCodigo() + "': " + documentos.size());
		
		return documentos;
	}
	
	/**
	 * @param request
	 * @return
	 */
	private Double obtenerLineaCreditoCliente(HttpServletRequest request)
	{
		logger.debug("Realizando la busqueda de documentos pendientes...");
		
		Cliente cliente = (Cliente) getModel(request).get("clienteSeleccionado");
		double lineaCredito = service.obtenerLineaDeCredito(cliente.getCodigo());
		
		return new Double(lineaCredito);
	}
	
	/**
	 * @param documentos
	 * @param lineaCredito
	 * @return
	 */
	private Double obtenerLineaDisponible(List<DocumentoPendiente> documentos, double lineaCredito)
	{
		double acumulado = 0.0;
		
		for (DocumentoPendiente documentoPendiente : documentos) 
		{
			acumulado = acumulado + documentoPendiente.getMonto();
		}
		
		return lineaCredito - acumulado;
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