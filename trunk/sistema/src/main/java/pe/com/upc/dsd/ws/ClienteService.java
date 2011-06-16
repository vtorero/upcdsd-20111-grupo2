package pe.com.upc.dsd.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

import pe.com.upc.dsd.ws.bean.Cliente;

@WebService
public interface ClienteService 
{
	public Cliente consultarCliente(@WebParam(name = "codigoCliente") String codigoCliente);
}