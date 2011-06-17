package pe.edu.upc.dsd.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

import pe.edu.upc.dsd.ws.bean.Pedido;

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
}