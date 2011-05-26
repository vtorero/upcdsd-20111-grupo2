package pe.edu.upc.dsd.ws;

import javax.jws.WebService;

import pe.edu.upc.dsd.ws.bean.Pedido;

@WebService
public interface PedidoService {
	public Pedido obtenerPedido(String codigo);
	
	public String registrarPedido(Pedido pedido);
	
}
