package pe.edu.upc.dsd.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import pe.edu.upc.dsd.ws.bean.Producto;

@WebService(endpointInterface="pe.edu.upc.dsd.ws.ProductoService")
public class ProductoServiceImpl implements ProductoService{

	public Producto obtenerProducto(String codigo) {
		
		Producto producto = new Producto();
		producto.setCodigo(codigo);
		producto.setDescripcion("LLantas Good Year");
		producto.setPrecio(250.05);
		producto.setTipo("Mantenimiento");
	    
		return producto;

	}

	@Override
	public List<Producto> obtenerListaProducto(String tipo) {
		// TODO Auto-generated method stub
		List<Producto> productos = new ArrayList<Producto>();
		
		Producto producto1 = new Producto();
		producto1.setCodigo("P001");
		producto1.setDescripcion("Cadenas");
		producto1.setPrecio(250.05);
		producto1.setTipo("Repuestos");
		
		productos.add(producto1);
		
		Producto producto2 = new Producto();
		producto2.setCodigo("P002");
		producto2.setDescripcion("Espejos");
		producto2.setPrecio(250.05);
		producto2.setTipo("Accesorios");
		
		productos.add(producto2);
		
		Producto producto3 = new Producto();
		producto3.setCodigo("P003");
		producto3.setDescripcion("LLantas");
		producto3.setPrecio(250.05);
		producto3.setTipo("Repuestos");
		
		productos.add(producto3);
		
		
		return productos;
	}
	

}
