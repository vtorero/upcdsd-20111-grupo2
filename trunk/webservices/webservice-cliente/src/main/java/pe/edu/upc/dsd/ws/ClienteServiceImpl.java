package pe.edu.upc.dsd.ws;

import javax.jws.WebService;

import pe.edu.upc.dsd.ws.bean.Cliente;

/**
 * @author Andres Deza V.
 * 
 */
@WebService(endpointInterface="pe.edu.upc.dsd.ws.ClienteService")
public class ClienteServiceImpl implements ClienteService
{
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