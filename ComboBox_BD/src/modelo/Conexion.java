package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// docker run -d -p 3306:3306 --name mysql -e MYSQL_ROOT_PASSWORD=pmysqlpw mysql:latest --character-set-server=utf8mb4 --collation-server=utf8mb4_unicode_ci
public class Conexion {
    
    public static final String URL = "jdbc:mysql://localhost:3306/datosPaises?autoReconnect=true&useSSL=false";
    public static final String USER = "root";
    public static final String CLAVE = "pmysqlpw";

    public Connection getConnection() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return conexion;
    }    
}
