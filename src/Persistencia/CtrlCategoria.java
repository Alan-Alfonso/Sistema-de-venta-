package Persistencia;

import Logica.Categoria;
import Persistencia.Conexion_BD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CtrlCategoria {

    public boolean Guardar(Categoria objeto) {
        boolean respuesta = false;
        java.sql.Connection conexion = Conexion_BD.conectar();

        String sql = "INSERT INTO tb_categoria VALUES (?,?,?)";

        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
                // Asignamos valores a los parámetros de la consulta
            ps.setInt(1, 0);
            ps.setString(2, objeto.getDescripcion());
            ps.setInt(3, objeto.getEstado());

            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al guardar categoria" + e);
        }
        return respuesta;

    }

    //revisar categoria
  public boolean ExisteCategoria(String categoria) {
    boolean respuesta = false;
    String sql = "SELECT Descripcion FROM tb_categoria WHERE Descripcion = ?";
    
    java.sql.Connection conexion = Conexion_BD.conectar(); 
    
    try (PreparedStatement st = conexion.prepareStatement(sql)) {
        st.setString(1, categoria); 
        ResultSet rs = st.executeQuery(); 

        if (rs.next()) {
            respuesta = true; 
        }

    } catch (SQLException e) {
        System.out.println("Error al consultar categoría: " + e.getMessage());
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
  // metodo actualizar
  public boolean Actualizar(Categoria objeto, int idCategoria) {
        boolean respuesta = false;
        java.sql.Connection conexion = Conexion_BD.conectar();

        String sql = "update tb_categoria set Descripcion = ? where idCategoria = ?";

        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
                // Asignamos valores a los parámetros de la consulta
            ps.setString(1, objeto.getDescripcion());
            ps.setInt(2, idCategoria);

            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                respuesta = true;
            }
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Error al actualizar categoria" + e);
        }
        return respuesta;

    }
//metodo de Eliminar categoria
 public boolean Eliminar(int idCategoria) {
    boolean respuesta = false;
    java.sql.Connection conexion = Conexion_BD.conectar();

    String sql = "DELETE FROM tb_categoria WHERE idCategoria = ?";

    try (PreparedStatement ps = conexion.prepareStatement(sql)) {
        ps.setInt(1, idCategoria);

        int filasAfectadas = ps.executeUpdate();
        if (filasAfectadas > 0) {
            respuesta = true;
        }

    } catch (SQLException e) {
        System.out.println("Error al eliminar categoría: " + e.getMessage());
    } finally {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
            }
        } catch (SQLException ex) {
            System.out.println("Error al cerrar conexión: " + ex.getMessage());
        }
    }

    return respuesta;
}
  
  
}
