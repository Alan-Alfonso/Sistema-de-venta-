
package Logica;


public class detalleVenta {
    
    private int idDetalleVenta;
    private int idCabeceraVenta;
    private int idProducto;
    
    private String nombre;
    private int cantidad;
    private int precioUnitario;
    private int subTotal;
    private int descuento;
    private int totalPagar;
    private int estado;
    
    
    //constructor
    public detalleVenta(){
    this.idDetalleVenta = 0;
    this.idCabeceraVenta = 0;
    this.idProducto = 0;
    
    this.nombre = "";
    this.cantidad = 0;
    this.precioUnitario = 0;
    this.subTotal = 0;
    this.descuento = 0;
    this.totalPagar = 0;
    this.estado= 0;
    }

    public detalleVenta(int idDetalleVenta, int idCabeceraVenta, int idProducto, String nombre, int cantidad, int precioUnitario, int subTotal, int descuento, int totalPagar, int estado) {
        this.idDetalleVenta = idDetalleVenta;
        this.idCabeceraVenta = idCabeceraVenta;
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subTotal = subTotal;
        this.descuento = descuento;
        this.totalPagar = totalPagar;
        this.estado = estado;
    }

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public int getIdCabeceraVenta() {
        return idCabeceraVenta;
    }

    public void setIdCabeceraVenta(int idCabeceraVenta) {
        this.idCabeceraVenta = idCabeceraVenta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(int totalPagar) {
        this.totalPagar = totalPagar;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "detalleVenta{" + "idDetalleVenta=" + idDetalleVenta + ", idCabeceraVenta=" + idCabeceraVenta + ", idProducto=" + idProducto + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + ", subTotal=" + subTotal + ", descuento=" + descuento + ", totalPagar=" + totalPagar + ", estado=" + estado + '}';
    }
    
    
    
    
}
