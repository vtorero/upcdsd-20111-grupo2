package pe.edu.upc.dsd.ws;


import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.edu.upc.dsd.ws.bean.Producto;


public class ProductoTest {
	
	private ProductoService productoService;
	
	public ProductoTest()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
		this.productoService = (ProductoService) context.getBean("productoClient");
	}
	
	@Test
	public void testObtenerProducto()
	{
		Producto producto  = productoService.obtenerProducto("P001");
		Assert.assertEquals("P001", producto.getCodigo());
	}
	
	@Test
	public void testObtenerListaProducto()
	{
		List<Producto> productos  = productoService.obtenerListaProducto("Accesorios");
		Assert.assertEquals(3, productos.size());
	}

}
