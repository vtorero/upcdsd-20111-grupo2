package pe.edu.upc.dsd.ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import pe.edu.upc.dsd.ws.bean.DocumentoPendiente;

@WebService(endpointInterface = "pe.edu.upc.dsd.ws.FinanzasService")
public class FinanzasServiceImpl implements FinanzasService {
	
	private Map<String, Double> lineasCredito;
	
	private List<DocumentoPendiente> documentosPendientes;

	public FinanzasServiceImpl() {
		this.documentosPendientes = getDocumentosPendientesPrueba();
		this.lineasCredito = getLineasCreditoPrueba();
	}

	/**
	 * @see pe.edu.upc.dsd.ws.FinanzasService#obtenerConsultaDeuda(java.lang.String)
	 */

	@Override
	public List<DocumentoPendiente> getDocumentosPendientes(String codigoCliente) {
		List<DocumentoPendiente> documentosCliente = new ArrayList<DocumentoPendiente>();
		for (DocumentoPendiente documentoPendiente : documentosPendientes) {
			if (documentoPendiente.getCodCliente().equals(codigoCliente)) {
				documentosCliente.add(documentoPendiente);
			}
		}
		return documentosCliente;
	}

	/**
	 * @see pe.edu.upc.dsd.ws.FinanzasService#obtenerLineaCredito(java.lang.String)
	 */
	@Override
	public double obtenerLineaCredito(String codigo) {
		return this.lineasCredito.get(codigo);
	}

	private List<DocumentoPendiente> getDocumentosPendientesPrueba() {
		List<DocumentoPendiente> documentoPendientes = new ArrayList<DocumentoPendiente>();

		DocumentoPendiente documentoPendiente = new DocumentoPendiente();
		documentoPendiente.setCodCliente("01");
		documentoPendiente.setNumDocumento("D04501");
		documentoPendiente.setTipoDocumento("Factura");
		documentoPendiente.setMonto(250.05);
		documentoPendiente.setMoneda("S/.");
		documentoPendiente.setDiasRetraso(10);
		documentoPendiente.setFechaEmision(new Date());
		documentoPendiente.setFechaVencimiento(new Date());

		documentoPendientes.add(documentoPendiente);

		documentoPendiente = new DocumentoPendiente();
		documentoPendiente.setCodCliente("01");
		documentoPendiente.setNumDocumento("D02501");
		documentoPendiente.setTipoDocumento("Factura");
		documentoPendiente.setMonto(1400.05);
		documentoPendiente.setMoneda("$");
		documentoPendiente.setDiasRetraso(35);
		documentoPendiente.setFechaEmision(new Date());
		documentoPendiente.setFechaVencimiento(new Date());

		documentoPendientes.add(documentoPendiente);

		documentoPendiente = new DocumentoPendiente();
		documentoPendiente.setCodCliente("02");
		documentoPendiente.setNumDocumento("D02708");
		documentoPendiente.setTipoDocumento("Boleta");
		documentoPendiente.setMonto(1480.00);
		documentoPendiente.setMoneda("$");
		documentoPendiente.setDiasRetraso(37);
		documentoPendiente.setFechaEmision(new Date());
		documentoPendiente.setFechaVencimiento(new Date());

		documentoPendientes.add(documentoPendiente);

		documentoPendiente = new DocumentoPendiente();
		documentoPendiente.setCodCliente("03");
		documentoPendiente.setNumDocumento("D02765");
		documentoPendiente.setTipoDocumento("Boleta");
		documentoPendiente.setMonto(80.00);
		documentoPendiente.setMoneda("S/.");
		documentoPendiente.setDiasRetraso(3);
		documentoPendiente.setFechaEmision(new Date());
		documentoPendiente.setFechaVencimiento(new Date());

		documentoPendientes.add(documentoPendiente);

		documentoPendiente = new DocumentoPendiente();
		documentoPendiente.setCodCliente("03");
		documentoPendiente.setNumDocumento("D02655");
		documentoPendiente.setTipoDocumento("fACTURA");
		documentoPendiente.setMonto(80.00);
		documentoPendiente.setMoneda("S/.");
		documentoPendiente.setDiasRetraso(45);
		documentoPendiente.setFechaEmision(new Date());
		documentoPendiente.setFechaVencimiento(new Date());

		documentoPendientes.add(documentoPendiente);

		return documentoPendientes;
	}
	
	private Map<String, Double> getLineasCreditoPrueba(){
		
		Map<String, Double> lineasCreditoPrueba = new HashMap<String, Double>();
		lineasCreditoPrueba.put("01", 12345.90);
		lineasCreditoPrueba.put("02", 20000.90);
		lineasCreditoPrueba.put("03", 50000.00);
		
		
		return lineasCreditoPrueba;
		
	}
	
}
