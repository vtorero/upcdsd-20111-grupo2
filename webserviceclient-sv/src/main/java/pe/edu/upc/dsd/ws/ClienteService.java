package pe.edu.upc.dsd.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

import pe.edu.upc.dsd.ws.bean.Pedido;
import pe.edu.upc.dsd.ws.bean.Cliente;

@WebService
public interface ClienteService {
    
	public Cliente consultarCliente(@WebParam(name = "codigoCliente") String codigoCliente);
	
}
