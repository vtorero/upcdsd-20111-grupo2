package pe.com.upc.dsd.service.ws;

import javax.jws.WebParam;

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