package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author alana
 */
public class InicializarBD {

    public static void main(String[] args) {
        String urlServidor = "jdbc:mysql://localhost:3306/?useSSL=false&serverTimezone=UTC";
        String usuario = "root";
        String contraseña = "";

        try (Connection conexion = DriverManager.getConnection(urlServidor, usuario, contraseña)) {
            Statement st = conexion.createStatement();

            // Crear base de datos
            st.execute("CREATE DATABASE IF NOT EXISTS bd_burbujitas");

            // Conectarse a la base recién creada
            Connection connBD = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bd_burbujitas?useSSL=false&serverTimezone=UTC",
                    usuario, contraseña
            );
            Statement stBD = connBD.createStatement();

            // Crear tabla TB_Usuario
            stBD.execute(
                    "CREATE TABLE IF NOT EXISTS tb_usuario (\n"
                    + "    idUsuario INT(11) AUTO_INCREMENT PRIMARY KEY,\n"
                    + "    Nombre VARCHAR(30) NOT NULL,\n"
                    + "    Apellido VARCHAR(30) NOT NULL,\n"
                    + "    Usuario VARCHAR(15) NOT NULL,\n"
                    + "    Password VARCHAR(15) NOT NULL,\n"
                    + "    Email VARCHAR(50) NOT NULL,\n"
                    + "    Estado TINYINT(1) NOT NULL\n"
                    + ");");
            System.out.println("Base de datos 'bd_burbujitas' creada o ya existente ");

            // Crear tabla TB_Categoria
            stBD.execute(
                    "CREATE TABLE IF NOT EXISTS tb_categoria (\n"
                    + "    idCategoria INT(11) AUTO_INCREMENT PRIMARY KEY,\n"
                    + "    Descripcion VARCHAR(50) NOT NULL,\n"
                    + "    Estado TINYINT(1) NOT NULL\n"
                    + ");"
            );
            System.out.println("✅ Tabla 'tb_categoria' creada o ya existente.");

            stBD.execute("CREATE TABLE if NOT EXISTS tb_producto(\n"
                    + "idProducto INT (11) auto_increment	primary KEY	,\n"
                    + "Nombre VARCHAR(100) NOT NULL,\n"
                    + "Cantidad INT (11) NOT NULL,\n"
                    + "Precio int (10) NOT NULL,\n"
                    + "Descripcion VARCHAR(200) NOT NULL,\n"
                    + "idcategoria int(11) NOT NULL,\n"
                    + "Estado INT (1) NOT NULL\n"
                    + ");");
            System.out.println("Tabla 'tb_producto' creada o ya existente.");

            connBD.close();
        } catch (Exception e) {
            System.out.println("Error al crear la base de datos o trablas" + e.getMessage());
        }

    }
}
