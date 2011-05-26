package pe.edu.upc.dsd.ws;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.edu.upc.dsd.ws.bean.DocumentoPendiente;

public class FinanzasServiceTest {
	
	private FinanzasService finanzasService;
	
	public FinanzasServiceTest()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
		this.finanzasService = (FinanzasService) context.getBean("finanzasServiceClient");
	}
	
	@Test
	public void testObtenerConsultaDeuda()
	{
		List<DocumentoPendiente> documentoPendientes  = finanzasService.obtenerConsultaDeuda("2");
		{
		    Assert.assertEquals(2, documentoPendientes.size());
		}
	}
	
	@Test
	public void testObtenerLineaCredito()
	{
		double lineaCredito  = finanzasService.obtenerLineaCredito("2");
		{
		    Assert.assertEquals(8000.00,lineaCredito);
		}
	}

}
