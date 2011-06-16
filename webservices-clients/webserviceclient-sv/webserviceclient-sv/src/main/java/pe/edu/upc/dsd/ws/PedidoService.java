package pe.edu.upc.dsd.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

import pe.edu.upc.dsd.ws.bean.Pedido;
import pe.edu.upc.dsd.ws.bean.Cliente;

@WebService
public interface PedidoService {
    
	public Pedido obtenerPedido(@WebParam(name = "codigo") String codigo);
	
	public String registrarPedido(@WebParam(name = "pedido") Pedido pedido);
	
	public Cliente consultarCliente(@WebParam(name = "codigoCliente") String codigoCliente);
	
}
