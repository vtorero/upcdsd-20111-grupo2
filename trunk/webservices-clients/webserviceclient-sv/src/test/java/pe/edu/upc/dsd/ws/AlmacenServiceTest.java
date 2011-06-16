package pe.edu.upc.dsd.ws;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AlmacenServiceTest {
	
	private AlmacenService almacenService;
	
	public AlmacenServiceTest()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
		this.almacenService = (AlmacenService) context.getBean("almacenServiceClient");
	}
	
	@Test
	public void testObtenerStock()
	{
		int Stock  = almacenService.obtenerStock("01");
		{
		    Assert.assertEquals(100,Stock);
		}
	}
}
