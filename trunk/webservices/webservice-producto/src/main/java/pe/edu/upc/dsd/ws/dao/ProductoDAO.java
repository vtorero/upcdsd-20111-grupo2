/**
 * 
 */
package pe.edu.upc.dsd.ws.dao;

import java.util.List;

import pe.edu.upc.dsd.ws.bean.Producto;

/**
 * @author andres
 *
 */
public interface ProductoDAO
{
    /**
     * @param codigo
     * @return
     */
    Producto obtenerProducto(String codigo);
    
    /**
     * @param tipo
     * @return
     */
    List<Producto> obtenerListaProducto(String tipo);
}
