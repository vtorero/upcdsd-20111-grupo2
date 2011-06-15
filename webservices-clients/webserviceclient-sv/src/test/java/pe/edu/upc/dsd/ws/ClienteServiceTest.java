package pe.edu.upc.dsd.ws;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.edu.upc.dsd.ws.bean.Cliente;

public class ClienteServiceTest {
	
	private ClienteService clienteService;
	
	public ClienteServiceTest()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
		this.clienteService = (ClienteService) context.getBean("clienteServiceClient");
	}
		
	@Test
	public void testConsultarCliente()
    {
		Cliente cliente  =  clienteService.consultarCliente("01");
		Assert.assertEquals("01", cliente.getCodigo());
		Assert.assertEquals("Carolina", cliente.getNombre());
		Assert.assertEquals("Romero", cliente.getApellidoPaterno());
		Assert.assertEquals("Pizarro", cliente.getApellidoMaterno());
		Assert.assertEquals("Alameda los misioneros 664", cliente.getDireccion());
		Assert.assertEquals("5752045", cliente.getTelefono());
		Assert.assertEquals("N", cliente.getTipoPersona());
    }

}
