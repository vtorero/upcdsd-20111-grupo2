package pe.edu.upc.dsd.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

import pe.edu.upc.dsd.ws.bean.Stock;

@WebService
public interface AlmacenService {
	/**
     * Obtiene la consulta  de Stock
     * 
     * @param codigoProducto
	 * @return 
     * @return
     */
	public Stock obtenerStock(@WebParam(name = "codigoProducto") String codigoProducto);
}
