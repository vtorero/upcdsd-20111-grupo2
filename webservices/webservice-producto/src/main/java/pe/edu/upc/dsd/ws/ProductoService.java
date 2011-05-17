package pe.edu.upc.dsd.ws;

import javax.jws.WebService;

import pe.edu.upc.dsd.ws.bean.Producto;

/**
 * @author Carolina Romero P.
 * 
 */
@WebService
public interface ProductoService 
{
	public Producto obtenerProducto(String codigo);
}

