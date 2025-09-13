
package Logica;

/**
 *
 * @author alana
 */
public class Usuario {
    
    private int idUsuario;
    private String Nombre;
    private String Apellido;
    private String Usuario;
    private String Password;
    private String Email;
    private int Estado;
    
    //contructor
    public Usuario(){
        this.idUsuario = 0;
        this.Nombre = "";
        this.Apellido = "";
        this.Password = "";
        this.Usuario = "";
        this.Email = "";
        this.Estado = 0;
        
}
    
    //setr and get

    public int getId_Usuario() {
        return idUsuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.idUsuario = id_Usuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }
    
    
    
    
    
    
    
    
    
}
