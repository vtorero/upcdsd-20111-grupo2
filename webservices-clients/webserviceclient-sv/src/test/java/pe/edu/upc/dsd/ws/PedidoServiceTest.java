package pe.edu.upc.dsd.ws;



import junit.framework.Assert;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.edu.upc.dsd.ws.bean.Pedido;



public class PedidoServiceTest {
	
	private PedidoService pedidoService;
	
	public PedidoServiceTest()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
		this.pedidoService = (PedidoService) context.getBean("pedidoServiceClient");
	}
	
	@Test
	public void testObtenerPedido()
	{
		Pedido pedido  = pedidoService.obtenerPedido("1");
		Assert.assertEquals("1", pedido.getCodigo());
		Assert.assertEquals("16-05-2011", pedido.getFecha());
		Assert.assertEquals("Contado", pedido.getTipoPago());
		Assert.assertEquals(10.60, pedido.getDescuento());
		Assert.assertEquals(170.30, pedido.getTotal());
		
		Assert.assertEquals("1", pedido.getCliente().getCodigo());
		Assert.assertEquals("Carolina", pedido.getCliente().getNombre());
		Assert.assertEquals("Romero", pedido.getCliente().getApellidoPaterno());
		Assert.assertEquals("Pizarro", pedido.getCliente().getApellidoMaterno());
		Assert.assertEquals("Alameda los misioneros 664", pedido.getCliente().getDireccion());
		Assert.assertEquals("5752045", pedido.getCliente().getTelefono());
		Assert.assertEquals("1", pedido.getCliente().getTipoPersona());
		
		Assert.assertEquals("1", pedido.getProductos().get(0).getCodigo());
		Assert.assertEquals("Llantas", pedido.getProductos().get(0).getDescripcion());
		Assert.assertEquals(20.50, pedido.getProductos().get(0).getPrecio());
		Assert.assertEquals("Repuestos", pedido.getProductos().get(0).getTipo());
                
		Assert.assertEquals(2, pedido.getProductos().size());
	}
	
	@Test
	public void testRegistrarPedido()
    {
        Assert.assertEquals("0K123456", pedidoService.registrarPedido(new Pedido()));
    }

}
