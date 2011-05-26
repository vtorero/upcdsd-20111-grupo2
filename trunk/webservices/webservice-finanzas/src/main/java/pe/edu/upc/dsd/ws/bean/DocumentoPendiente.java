package pe.edu.upc.dsd.ws.bean;

import java.util.Date;

public class DocumentoPendiente {
	
	private String numDocumento;
    private String tipoDocumento;
    private Date fechaEmision;
    private Date fechaVencimiento;
    private int diasRetraso;
    private String moneda;
    private double monto;
    
    public String getNumDocumento() {
		return numDocumento;
	}
	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public Date getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public int getDiasRetraso() {
		return diasRetraso;
	}
	public void setDiasRetraso(int diasRetraso) {
		this.diasRetraso = diasRetraso;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}

}
