package pe.edu.upc.dsd.ws.bean;

import java.util.ArrayList;

public class Pedido
{
    private String codigo;

    private String fecha;

    private String tipoPago;

    private Cliente cliente;

    private ArrayList<Producto> productos;

    private double descuento;

    private double total;

    /**
     * @return the codigo
     */
    public String getCodigo()
    {
        return codigo;
    }

    /**
     * @param codigo
     *            the codigo to set
     */
    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }

    /**
     * @return the fecha
     */
    public String getFecha()
    {
        return fecha;
    }

    /**
     * @param fecha
     *            the fecha to set
     */
    public void setFecha(String fecha)
    {
        this.fecha = fecha;
    }

    /**
     * @return the tipoPago
     */
    public String getTipoPago()
    {
        return tipoPago;
    }

    /**
     * @param tipoPago
     *            the tipoPago to set
     */
    public void setTipoPago(String tipoPago)
    {
        this.tipoPago = tipoPago;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente()
    {
        return cliente;
    }

    /**
     * @param cliente
     *            the cliente to set
     */
    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }

    /**
     * @return the productos
     */
    public ArrayList<Producto> getProductos()
    {
        return productos;
    }

    /**
     * @param productos
     *            the productos to set
     */
    public void setProductos(ArrayList<Producto> productos)
    {
        this.productos = productos;
    }

    /**
     * @return the descuento
     */
    public double getDescuento()
    {
        return descuento;
    }

    /**
     * @param descuento
     *            the descuento to set
     */
    public void setDescuento(double descuento)
    {
        this.descuento = descuento;
    }

    /**
     * @return the total
     */
    public double getTotal()
    {
        return total;
    }

    /**
     * @param total
     *            the total to set
     */
    public void setTotal(double total)
    {
        this.total = total;
    }
}
