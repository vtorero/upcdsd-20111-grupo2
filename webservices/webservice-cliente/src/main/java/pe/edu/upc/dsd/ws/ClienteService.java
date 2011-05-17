package pe.edu.upc.dsd.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

import pe.edu.upc.dsd.ws.bean.Cliente;

/**
 * @author Andres Deza V.
 * 
 */
@WebService
public interface ClienteService 
{
	public Cliente obtenerCliente(@WebParam(name="codigo") String codigo);
}
