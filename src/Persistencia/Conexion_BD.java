package Persistencia;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author alana
 */
public class Conexion_BD {

  private static String URL = "jdbc:mysql://localhost:3306/bd_burbujitas?useSSL=false&serverTimezone=UTC";
    private static String Usuario = "root";
    private static String Contraseña = "";
    
    public static Connection conectar() {
        Connection conexion = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, Usuario, Contraseña);
            System.out.println("Conexion establecida");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la conexion :" + e);
        }

        return conexion;
    }

}
