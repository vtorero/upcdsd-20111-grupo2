package pe.edu.upc.dsd.ws;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import pe.edu.upc.dsd.ws.bean.Producto;

/**
 * @author andres
 * 
 */
@WebService
public interface ProductoService
{
    /**
     * Obtiene el producto &uacute;nico identificado con el codigo recibido.
     * 
     * @param codigo
     * @return
     */
    public Producto obtenerProducto(@WebParam(name = "codigoProducto") String codigo);

    /**
     * Obtiene el listado de productos filtrados por categoria.
     * 
     * @param tipo
     * @return
     */
    public List<Producto> obtenerListaProducto(@WebParam(name = "tipoProducto") String tipo);
}
