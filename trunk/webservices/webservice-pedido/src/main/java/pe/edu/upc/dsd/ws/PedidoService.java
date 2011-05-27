package pe.edu.upc.dsd.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

import pe.edu.upc.dsd.ws.bean.Pedido;
import pe.edu.upc.dsd.ws.bean.Cliente;

@WebService
public interface PedidoService
{
    /**
     * @param codigo
     * @return
     */
    public Pedido obtenerPedido(@WebParam(name = "codigo") String codigo);

    /**
     * @param pedido
     * @return
     */
    public String registrarPedido(@WebParam(name = "pedido") Pedido pedido);
    
    
    /**
     * @param codigoCliente
     * @return
     */
    public Cliente consultarCliente(@WebParam(name = "codigoCliente") String codigoCliente);
    
    
}