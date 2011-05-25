package pe.edu.upc.dsd.ws;

import java.util.List;

import javax.jws.WebService;

import pe.edu.upc.dsd.ws.bean.Producto;
import pe.edu.upc.dsd.ws.dao.ProductoDAO;

/**
 * @author andres
 * 
 */
@WebService(endpointInterface = "pe.edu.upc.dsd.ws.ProductoService")
public class ProductoServiceImpl implements ProductoService
{
    private ProductoDAO productoDao;

    /**
     * @see pe.edu.upc.dsd.ws.ProductoService#obtenerProducto(java.lang.String)
     */
    @Override
    public Producto obtenerProducto(String codigo)
    {
        return productoDao.obtenerProducto(codigo);
    }

    /**
     * @see pe.edu.upc.dsd.ws.ProductoService#obtenerListaProducto(java.lang.String)
     */
    @Override
    public List<Producto> obtenerListaProducto(String tipo)
    {
        return productoDao.obtenerListaProducto(tipo);
    }

    /**
     * @param productoDao
     *            the productoDao to set
     */
    public void setProductoDao(ProductoDAO productoDao)
    {
        this.productoDao = productoDao;
    }
}