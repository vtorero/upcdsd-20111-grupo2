package pe.com.upc.dsd.service.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

import pe.com.upc.dsd.model.Cliente;

@WebService
public interface ClienteService 
{
	public Cliente consultarCliente(@WebParam(name = "codigoCliente") String codigoCliente);
}