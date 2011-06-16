package pe.edu.upc.dsd.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import pe.edu.upc.dsd.ws.bean.Cliente;

/**
 * @author Andres Deza V.
 * 
 */
@WebService(endpointInterface="pe.edu.upc.dsd.ws.ClienteService")
public class ClienteServiceImpl implements ClienteService
{
	private List<Cliente> clientes;
	
	public ClienteServiceImpl()
	{
		this.clientes = getClientesPrueba();
	}
	
	 @Override
    public Cliente consultarCliente(String codigoCliente)
    {
		for (Cliente cliente : clientes) 
		{
			if(cliente.getDocumentoIdentidad().equals(codigoCliente))
			{
				return cliente;
			}
		}

        return null;
    }
	 
	private List<Cliente> getClientesPrueba()
	{
		List<Cliente> clientesPrueba = new ArrayList<Cliente>();
		
        Cliente cliente1 = new Cliente();
        cliente1.setCodigo("01");
        cliente1.setNombre("Carolina");
        cliente1.setApellidoPaterno("Romero");
        cliente1.setApellidoMaterno("Pizarro");
        cliente1.setDireccion("Alameda los misioneros 664");
        cliente1.setDocumentoIdentidad("1015987716");
        cliente1.setTelefono("5752045");
        cliente1.setTipoPersona("N");
		
        Cliente cliente2 = new Cliente();
        cliente2.setCodigo("02");
        cliente2.setNombre("Andres");
        cliente2.setApellidoPaterno("Deza");
        cliente2.setApellidoMaterno("Villacorta");
        cliente2.setDireccion("Psje. Octavio Bernal 120 dpto F");
        cliente2.setDocumentoIdentidad("1042282207");
        cliente2.setTelefono("4602787");
        cliente2.setTipoPersona("N");        
        
        Cliente cliente3 = new Cliente();
        cliente3.setCodigo("03");
        cliente3.setNombre("Pedro");
        cliente3.setApellidoPaterno("Torres");
        cliente3.setApellidoMaterno("Diez");
        cliente3.setDireccion("Av. La Molina 432");
        cliente3.setDocumentoIdentidad("1044091088");
        cliente3.setTelefono("4339812");
        cliente3.setTipoPersona("N");
        
        clientesPrueba.add(cliente1);
        clientesPrueba.add(cliente2);
        clientesPrueba.add(cliente3);
        
		return clientesPrueba;
	}
}