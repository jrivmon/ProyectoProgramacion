package Proyecto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    // Datos de conexión
    private static final String URL = "jdbc:mysql://localhost:3306/proyectoProg";
    private static final String USUARIO = "root";
    private static final String PASSWD = "root";

    // Objeto de conexión a la base de datos
    private static Connection conexion;

    // Método para obtener la conexión a la base de datos
    // Si ya existe una conexión, no crea una nueva, sino que la devuelve
    // Así evitamos tener muchas conexiones abiertas con la bbdd
    public static Connection getConexion() {
        if (conexion == null) {
            try {
                // Cargar el driver de MySQL
                // Class.forName("com.mysql.cj.jdbc.Driver");
                conexion = DriverManager.getConnection(URL, USUARIO, PASSWD);
                System.out.println("Conexión OK");
            } catch (SQLException e) {
                System.out.println("Error al conectar a la base de datos");
                e.printStackTrace();
            }
        }
        return conexion;
    }

    // Método para cerrar la conexión a la base de datos
    public static void cerrarConexion() {
        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("Conexión cerrada con la bbdd");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión a la base de datos");
                e.printStackTrace();
            }
        }
    }
}
