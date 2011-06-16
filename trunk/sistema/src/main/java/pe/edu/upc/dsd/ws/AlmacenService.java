package pe.edu.upc.dsd.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface AlmacenService 
{
	/**
     * Obtiene la consulta  de Stock
     * 
     * @param codigoProducto
	 * @return 
     * @return
     */
	public int obtenerStock(@WebParam(name = "codigoProducto") String codigoProducto);
}