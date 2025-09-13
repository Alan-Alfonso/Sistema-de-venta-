
package Persistencia;

import Persistencia.Conexion_BD;
import java.sql.Connection;
import Logica.Usuario;
import Logica.Usuario;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class CtrlUsuario {
    
    //metodo de iniciar sesion
    // recibe del login el ususario y password para coprobar si es verdadero o falso
    public boolean loginUser(Usuario objeto){
    
        boolean respuesta = false;
        
        Connection conexion = Conexion_BD.conectar();
       
        if (conexion == null) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
            return false;
        }

        String sql = "SELECT Usuario, Password FROM tb_usuario WHERE Usuario = ? AND Password = ?";

        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setString(1, objeto.getUsuario());
            ps.setString(2, objeto.getPassword());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al iniciar sesión: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión: " + e.getMessage());
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