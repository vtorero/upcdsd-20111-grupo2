package pe.edu.upc.dsd.ws;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import pe.edu.upc.dsd.ws.bean.Producto;


@WebService
public interface ProductoService
{
	/**
	 * Obtiene el producto por el codigo enviado.
	 * 
	 * @param codigo
	 * @return
	 */
	public Producto obtenerProducto(@WebParam(name = "codigoProducto") String codigo);
	
	/**
	 * Obtiene el listado de productos por categoria.
	 * 
	 * @param tipo
	 * @return
	 */
	public List<Producto> obtenerListaProducto(@WebParam(name = "tipoProducto") String tipo);
}