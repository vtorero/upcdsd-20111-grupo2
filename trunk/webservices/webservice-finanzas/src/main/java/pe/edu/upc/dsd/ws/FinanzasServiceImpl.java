package pe.edu.upc.dsd.ws;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import pe.edu.upc.dsd.ws.bean.DocumentoPendiente;
import pe.edu.upc.dsd.ws.bean.LineaCreditoDisponible;

@WebService(endpointInterface = "pe.edu.upc.dsd.ws.FinanzasService")
public class FinanzasServiceImpl implements  FinanzasService{
	
	/**
     * @see pe.edu.upc.dsd.ws.FinanzasService#obtenerConsultaDeuda(java.lang.String)
     */
    @Override
    public List<DocumentoPendiente> obtenerConsultaDeuda(String codigoCliente)
    {
    	List<DocumentoPendiente> documentoPendientes = new ArrayList<DocumentoPendiente>();
    	
    	DocumentoPendiente documentoPendiente = new DocumentoPendiente();
    	documentoPendiente.setNumDocumento("D04501");
    	documentoPendiente.setTipoDocumento("Factura");
    	documentoPendiente.setMonto(250.05);
    	documentoPendiente.setMoneda("S/.");
    	documentoPendiente.setDiasRetraso(10);
    	documentoPendiente.setFechaEmision(null);
    	documentoPendiente.setFechaVencimiento(null);
    	
    	documentoPendientes.add(documentoPendiente);
    	    	
    	documentoPendiente = new DocumentoPendiente();
    	documentoPendiente.setNumDocumento("D02501");
    	documentoPendiente.setTipoDocumento("Factura");
    	documentoPendiente.setMonto(1400.05);
    	documentoPendiente.setMoneda("$");
    	documentoPendiente.setDiasRetraso(35);
    	documentoPendiente.setFechaEmision(null);
    	documentoPendiente.setFechaVencimiento(null);
    	    	
    	documentoPendientes.add(documentoPendiente);    	
		
        return documentoPendientes;
    }
    
    /**
     * @see pe.edu.upc.dsd.ws.FinanzasService#obtenerLineaCredito(java.lang.String)
     */
    @Override
    public double obtenerLineaCredito(String codigo)
    {
        LineaCreditoDisponible Linea = new LineaCreditoDisponible();        
    	return 8000.00;
    }

}
