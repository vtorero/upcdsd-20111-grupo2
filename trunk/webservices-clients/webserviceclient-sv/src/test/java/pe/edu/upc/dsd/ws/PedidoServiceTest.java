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
		Pedido pedido  = pedidoService.obtenerPedido("01");
		Assert.assertEquals("01", pedido.getCodigo());
		Assert.assertEquals("16-05-2011", pedido.getFecha());
		Assert.assertEquals("Contado", pedido.getTipoPago());
		Assert.assertEquals(0.00, pedido.getDescuento());
		Assert.assertEquals(2210.00, pedido.getTotal());
		
		Assert.assertEquals("01", pedido.getCliente().getCodigo());
		Assert.assertEquals("Carolina", pedido.getCliente().getNombre());
		Assert.assertEquals("Romero", pedido.getCliente().getApellidoPaterno());
		Assert.assertEquals("Pizarro", pedido.getCliente().getApellidoMaterno());
		Assert.assertEquals("Alameda los misioneros 664", pedido.getCliente().getDireccion());
		Assert.assertEquals("5752045", pedido.getCliente().getTelefono());
		Assert.assertEquals("1", pedido.getCliente().getTipoPersona());
		
		Assert.assertEquals("01", pedido.getProductos().get(0).getCodigo());
		Assert.assertEquals("HONDA XR 125", pedido.getProductos().get(0).getDescripcion());
		Assert.assertEquals(860.00, pedido.getProductos().get(0).getPrecio());
		Assert.assertEquals("01", pedido.getProductos().get(0).getTipo());

		Assert.assertEquals("02", pedido.getProductos().get(1).getCodigo());
		Assert.assertEquals("LLANTAS HR21", pedido.getProductos().get(1).getDescripcion());
		Assert.assertEquals(350.00, pedido.getProductos().get(1).getPrecio());
		Assert.assertEquals("03", pedido.getProductos().get(1).getTipo());
		
		Assert.assertEquals(2, pedido.getProductos().size());
	}
	
	@Test
	public void testRegistrarPedido()
    {
        Assert.assertEquals("VTA002", pedidoService.registrarPedido(new Pedido()));
    }
}