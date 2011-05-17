package pe.edu.upc.dsd.ws;

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
	

}
