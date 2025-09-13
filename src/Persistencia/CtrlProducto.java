
package Persistencia;


import Logica.Producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author alana
 */
public class CtrlProducto {
    
     public boolean Guardar(Producto objeto) {
        boolean respuesta = false;
        java.sql.Connection conexion = Conexion_BD.conectar();

        String sql = "INSERT INTO TB_Producto VALUES (?,?,?,?,?,?,?)";

        try (PreparedStatement Consulta = conexion.prepareStatement(sql)) {
                // Asignamos valores a los parámetros de la consulta
                
            Consulta.setInt(1, 0);//id
            Consulta.setString(2, objeto.getNombre());
            Consulta.setInt(3, objeto.getCantidad());
            Consulta.setInt(4, objeto.getPrecio());
            Consulta.setString(5, objeto.getDescripcion());
            Consulta.setInt(6, objeto.getIdCategoria());
            Consulta.setInt(7, objeto.getEstado());

            int filasAfectadas = Consulta.executeUpdate();
            if (filasAfectadas > 0) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al guardar Producto" + e);
        }
        return respuesta;

    }

    //revisar si el producto existe
  public boolean ExisteProducto(String Producto) {
    boolean respuesta = false;
    String sql = "SELECT Nombre FROM Producto WHERE Nombre = ?";
    
    java.sql.Connection conexion = Conexion_BD.conectar(); 
    
    try (PreparedStatement st = conexion.prepareStatement(sql)) {
        st.setString(1, Producto); 
        ResultSet rs = st.executeQuery(); 

        if (rs.next()) {
            respuesta = true; 
        }

    } catch (SQLException e) {
        System.out.println("Error al consultar el producto: " + e.getMessage());
    } finally {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
            }
        } catch (SQLException ex) {
            System.out.println("Error al cerrar la conexión: " + ex.getMessage());
        }
    }
         return respuesta;
   
    }
}
