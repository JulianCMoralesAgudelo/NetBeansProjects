package conectar;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conectar {

    public static final String URL = "jdbc:mysql://localhost:3306/escuela";
    public static final String USER = "root";
    public static final String CLAVE = "pmysqlpw";

    public Connection getConexion() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return conexion;
    }
}


