package pe.edu.upc.dsd.ws;

import java.util.ArrayList;

import javax.jws.WebService;

import pe.edu.upc.dsd.ws.bean.Cliente;
import pe.edu.upc.dsd.ws.bean.Pedido;
import pe.edu.upc.dsd.ws.bean.Producto;

@WebService(endpointInterface = "pe.edu.upc.dsd.ws.PedidoService")
public class PedidoServiceImpl implements PedidoService
{
    @Override
    public Pedido obtenerPedido(String codigo)
    {

        Pedido pedido = new Pedido();
        pedido.setCodigo(codigo);
        pedido.setFecha("16-05-2011");
        pedido.setTipoPago("Contado");

        Cliente cliente = new Cliente();
        cliente.setCodigo("1");
        cliente.setNombre("Carolina");
        cliente.setApellidoPaterno("Romero");
        cliente.setApellidoMaterno("Pizarro");
        cliente.setDireccion("Alameda los misioneros 664");
        cliente.setTelefono("5752045");
        cliente.setTipoPersona("1");

        pedido.setCliente(cliente);

        ArrayList<Producto> listaProductos = new ArrayList<Producto>();
        Producto producto1 = new Producto();
        producto1.setCodigo("1");
        producto1.setDescripcion("Llantas");
        producto1.setPrecio(20.50);
        producto1.setTipo("Repuestos");

        listaProductos.add(producto1);

        Producto producto2 = new Producto();
        producto2.setCodigo("2");
        producto2.setDescripcion("Timon");
        producto2.setPrecio(29.50);
        producto2.setTipo("Repuestos");

        listaProductos.add(producto2);

        pedido.setDescuento(10.60);
        pedido.setTotal(170.30);
        pedido.setProductos(listaProductos);

        return pedido;
    }

    @Override
    public String registrarPedido(Pedido pedido)
    {
        // Deberia registrar en BAse de Datos el Pedido Indicado
        String nroPedido = "0K123456";

        return nroPedido;
    }
    
    @Override
    public Cliente consultarCliente(String codigoCliente)
    {

        Cliente cliente = new Cliente();
        cliente.setCodigo("1");
        cliente.setNombre("Carolina");
        cliente.setApellidoPaterno("Romero");
        cliente.setApellidoMaterno("Pizarro");
        cliente.setDireccion("Alameda los misioneros 664");
        cliente.setTelefono("5752045");
        cliente.setTipoPersona("1");        

        return cliente;
    }
    
    
}