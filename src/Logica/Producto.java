
package Logica;

/**
 *
 * @author alana
 */
public class Producto {
 
    //Atributos
    private int idProducto;
    private String Nombre ;
    private int Cantidad;
    private int Precio;
    private String Descripcion;
    private int idCategoria;
    private int Estado;
    
    
    //Constructor vacio
    public Producto() {
        this.idProducto = 0;
        this.Nombre = "";
        this.Cantidad = 0;
        this.Precio = 0;
        this.Descripcion = "";
        this.idCategoria = 0;
        this.Estado = 0;
    }

    public Producto(int idProducto, String Nombre, int Cantidad, int Precio, String Descripcion, int idCategoria, int Estado) {
        this.idProducto = idProducto;
        this.Nombre = Nombre;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.Descripcion = Descripcion;
        this.idCategoria = idCategoria;
        this.Estado = Estado;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descipcion) {
        this.Descripcion = Descipcion;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }
    
    
    
    
    
}
