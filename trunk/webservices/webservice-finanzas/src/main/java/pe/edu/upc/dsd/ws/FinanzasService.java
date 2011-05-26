package pe.edu.upc.dsd.ws;

import java.util.List;
import javax.jws.WebParam;
import javax.jws.WebService;

import pe.edu.upc.dsd.ws.bean.DocumentoPendiente;

@WebService
public interface FinanzasService {

	/**
     * Obtiene la consulta deuda vencida.
     * 
     * @param codigoCliente
	 * @return List<DocumentoPendiente>
     */
	public List<DocumentoPendiente> obtenerConsultaDeuda(@WebParam(name = "codigoCliente") String codigoCliente);
	
	/**
     * Obtiene la consulta de la Línea de Credito del Cliente
     * 
     * @param codigoCliente
	 * @return   double   
     */
	public double obtenerLineaCredito(@WebParam(name = "codigoCliente") String codigoCliente);
}
