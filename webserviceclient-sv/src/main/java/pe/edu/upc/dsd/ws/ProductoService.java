package pe.edu.upc.dsd.ws;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import pe.edu.upc.dsd.ws.bean.Producto;

/**
 * @author Carolina Romero P.
 * 
 */

@WebService
public interface ProductoService {
	
	public Producto obtenerProducto(@WebParam(name = "codigoProducto") String codigo);
	
	public List<Producto> obtenerListaProducto(@WebParam(name = "tipoProducto") String tipo);

}
