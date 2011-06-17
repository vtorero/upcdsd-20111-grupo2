package pe.edu.upc.dsd.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import pe.edu.upc.dsd.jms.MessageSender;
import pe.edu.upc.dsd.ws.bean.Cliente;
import pe.edu.upc.dsd.ws.bean.Pedido;
import pe.edu.upc.dsd.ws.bean.Producto;

@WebService(endpointInterface = "pe.edu.upc.dsd.ws.PedidoService")
public class PedidoServiceImpl implements PedidoService
{
	private List<Pedido> pedidos;
	
	private MessageSender messageSender;
	
	public PedidoServiceImpl()
	{
		this.pedidos = getPedidosPrueba();
	}
	
    @Override
    public Pedido obtenerPedido(String codigo)
    {
    	for (Pedido pedido : this.pedidos) 
    	{
			if(pedido.getCodigo().equals(codigo))
			{
				return pedido;
			}
		}

        return null;
    }

    @Override
    public String registrarPedido(Pedido pedido)
    {
    	this.pedidos.add(pedido);
    	
    	//Se envia el pedido a la cola de pedidos
    	messageSender.send(pedido.toString());
    	
        return "VTA00" + this.pedidos.size();
    }

    private List<Pedido> getPedidosPrueba()
    {
    	List<Pedido> pedidosPrueba = new ArrayList<Pedido>();
    	
        Pedido pedido = new Pedido();
        pedido.setCodigo("01");
        pedido.setFecha("16-05-2011");
        pedido.setTipoPago("Contado");

        Cliente cliente = new Cliente();
        cliente.setCodigo("01");
        cliente.setNombre("Carolina");
        cliente.setApellidoPaterno("Romero");
        cliente.setApellidoMaterno("Pizarro");
        cliente.setDireccion("Alameda los misioneros 664");
        cliente.setTelefono("5752045");
        cliente.setTipoPersona("1");

        pedido.setCliente(cliente);

        ArrayList<Producto> listaProductos = new ArrayList<Producto>();
        Producto producto1 = new Producto();
        producto1.setCodigo("01");
        producto1.setDescripcion("HONDA XR 125");
        producto1.setPrecio(860.00);
        producto1.setTipo("01");
        producto1.setCantidad(0);

        listaProductos.add(producto1);

        Producto producto2 = new Producto();
        producto2.setCodigo("02");
        producto2.setDescripcion("LLANTAS HR21");
        producto2.setPrecio(350.00);
        producto2.setTipo("03");
        producto2.setCantidad(0);

        listaProductos.add(producto2);

        pedido.setDescuento(0.00);
        pedido.setTotal(2210.00);
        pedido.setProductos(listaProductos);
    	
        pedidosPrueba.add(pedido);
        
    	return pedidosPrueba;
    }
    
    /**
     * @param messageSender
     */
    public void setMessageSender(MessageSender messageSender)
    {
    	this.messageSender = messageSender;
    }
}