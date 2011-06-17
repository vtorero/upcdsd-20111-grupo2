package pe.edu.upc.dsd.ws;


import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.edu.upc.dsd.ws.bean.Producto;


public class ProductoServiceTest {
	
	private ProductoService productoService;
	
	public ProductoServiceTest()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
		this.productoService = (ProductoService) context.getBean("productoServiceClient");
	}
	
	@Test
	public void testObtenerProducto()
	{
		Producto producto  = productoService.obtenerProducto("02");
		Assert.assertEquals("02", producto.getCodigo());
		Assert.assertEquals("LLANTAS HR21", producto.getDescripcion());
		Assert.assertEquals(350.0, producto.getPrecio());
		Assert.assertEquals("03", producto.getTipo());
		Assert.assertEquals(0, producto.getCantidad());
	}
	
	@Test
	public void testObtenerListaProducto()
	{
		List<Producto> productos  = productoService.obtenerListaProducto("02");
		{
		    Assert.assertEquals(2, productos.size());
		}
	}

}
