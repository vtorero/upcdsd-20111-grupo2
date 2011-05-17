package pe.edu.upc.dsd.ws;

import java.util.List;

import javax.jws.WebService;

import pe.edu.upc.dsd.ws.bean.Producto;

/**
 * @author Carolina Romero P.
 * 
 */

@WebService
public interface ProductoService {
	
	public Producto obtenerProducto(String codigo);
	
	public List<Producto> obtenerListaProducto(String tipo);

}
