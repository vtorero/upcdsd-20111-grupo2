package pe.edu.upc.dsd.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import pe.edu.upc.dsd.ws.bean.Producto;

@WebService(endpointInterface = "pe.edu.upc.dsd.ws.ProductoService")
public class ProductoServiceImpl implements ProductoService
{  
    private List<Producto> productos;
    
    public ProductoServiceImpl()
    {
    	this.productos = getProductosPrueba();
    }
    
    /**
     * @see pe.edu.upc.dsd.ws.ProductoService#obtenerProducto(java.lang.String)
     */
    @Override
    public Producto obtenerProducto(String codigo)
    {   
    	for(int i = 0; i < this.productos.size(); i++)
    	{
    		Producto producto = productos.get(i);
    		
    		if(producto.getCodigo().equals(codigo))
    		{
    			return producto;
    		}
    	}
        return null;
    }

    /**
     * @see pe.edu.upc.dsd.ws.ProductoService#obtenerListaProducto(java.lang.String)
     */
    @Override
    public List<Producto> obtenerListaProducto(String tipo)
    {
    	List<Producto> productosPorCategoria = new ArrayList<Producto>();
    	
    	for(int i = 0; i < this.productos.size(); i++)
    	{
    		Producto producto = productos.get(i);
    		
    		if(producto.getTipo().equals(tipo))
    		{
    			productosPorCategoria.add(producto);
    		}
    	}
    	
    	return productosPorCategoria;
    }
    
    private List<Producto> getProductosPrueba()
    {
    	List<Producto> productos = new ArrayList<Producto>();
    	
    	Producto producto1 = new Producto();
    	producto1.setCodigo("01");
    	producto1.setDescripcion("HONDA XR 125");
    	producto1.setPrecio(860.00);
    	producto1.setTipo("01");
    	producto1.setCantidad(0);
    	
    	Producto producto2 = new Producto();
    	producto2.setCodigo("02");
    	producto2.setDescripcion("LLANTAS HR21");
    	producto2.setPrecio(350.00);
    	producto2.setTipo("03");
    	producto2.setCantidad(0);

    	Producto producto3 = new Producto();
    	producto3.setCodigo("03");
    	producto3.setDescripcion("YAMAHA XJ6-N");
    	producto3.setPrecio(1020.00);
    	producto3.setTipo("01");
    	producto3.setCantidad(0);
    	
    	Producto producto4 = new Producto();
    	producto4.setCodigo("04");
    	producto4.setDescripcion("TUBO DE ESCAPE H500");
    	producto4.setPrecio(860.00);
    	producto4.setTipo("02");
    	producto4.setCantidad(0);
    	
    	Producto producto5 = new Producto();
    	producto5.setCodigo("05");
    	producto5.setDescripcion("LLANTAS Z7G1");
    	producto5.setPrecio(480.00);
    	producto5.setTipo("03");
    	producto5.setCantidad(0);
    	
    	Producto producto6 = new Producto();
    	producto6.setCodigo("06");
    	producto6.setDescripcion("TIMON T823");
    	producto6.setPrecio(910.00);
    	producto6.setTipo("02");
    	producto6.setCantidad(0);
    	
    	productos.add(producto1);
    	productos.add(producto2);
    	productos.add(producto3);
    	productos.add(producto4);
    	productos.add(producto5);
    	productos.add(producto6);
    	
    	return productos;
    }
}