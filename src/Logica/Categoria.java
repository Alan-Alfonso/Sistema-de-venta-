package Logica;

/**
 *
 * @author alana
 */
public class Categoria {

    private int idCategoria;
    private String Descripcion;
    private int Estado;

    public Categoria() {

        this.idCategoria = 0;
        this.Descripcion = "";
        this.Estado = 0;

    }

    public Categoria(int idCategoria, String Descripcion, int Estado) {
        this.idCategoria = idCategoria;
        this.Descripcion = Descripcion;
        this.Estado = Estado;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

}
