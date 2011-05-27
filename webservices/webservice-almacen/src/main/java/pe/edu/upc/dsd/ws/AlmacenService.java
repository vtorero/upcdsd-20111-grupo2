package pe.edu.upc.dsd.ws;

import javax.jws.WebParam;
import javax.jws.WebService;


@WebService
public interface AlmacenService {

	/**
     * Obtiene la consulta de Stock de un producto
     * 
     * @param codigoProducto
	 * @return   int   
     */
	public int obtenerStock(@WebParam(name = "codigoProducto") String codigoProducto);
}
