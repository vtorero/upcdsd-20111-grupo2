package pe.com.upc.dsd.ws;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import pe.com.upc.dsd.ws.bean.DocumentoPendiente;

@WebService
public interface FinanzasService 
{
	/**
     * Obtiene la consulta deuda vencida.
     * 
     * @param codigoCliente
	 * @return 
     * @return
     */
	public List<DocumentoPendiente> getDocumentosPendientes(@WebParam(name = "codigoCliente") String codigoCliente);
	/**
     * Obtiene la consulta  Linea Credito.
     * 
     * @param codigoCliente
	 * @return 
     * @return
     */
	public double obtenerLineaCredito(@WebParam(name = "codigoCliente") String codigoCliente);
}