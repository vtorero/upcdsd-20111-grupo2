package pe.edu.upc.dsd.ws;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.edu.upc.dsd.ws.bean.Cliente;

public class ClientServiceTest 
{
	private ClienteService clienteService;
	
	public ClientServiceTest() 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
		this.clienteService = (ClienteService) context.getBean("clienteServiceClient");
	}

	@Test
	public void testObtenerCliente()
	{
		Cliente cliente = clienteService.obtenerCliente("AAA");
		{
			Assert.assertEquals("AAA", cliente.getCodigo());
		}
	}
}