package pe.edu.upc.dsd.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

import pe.edu.upc.dsd.ws.bean.Stock;


@WebService
public interface AlmacenService {

	/**
     * Obtiene la consulta de Stock de un producto
     * 
     * @param codigoProducto
	 * @return   int   
     */
	public Stock obtenerStock(@WebParam(name = "codigoProducto") String codigoProducto);
}
