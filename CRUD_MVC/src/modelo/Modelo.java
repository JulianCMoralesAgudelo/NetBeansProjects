package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Modelo extends Conexion {

    // Variable para realizar consultas
    PreparedStatement ps;
    // Variable para almacenar los resultados
    ResultSet rs;

    // Metodo para insertar datos
    public boolean insertar(Persona persona) {
        Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("INSERT INTO escuela.persona (clave, nombre, domicilio, celular, correoElectronico, fechaNacimiento, genero) VALUES(?, ?, ?, ?, ?, ?, ?)");

            ps.setString(1, persona.getClave());
            ps.setString(2, persona.getNombre());
            ps.setString(3, persona.getDomicilio());
            ps.setString(4, persona.getCelular());
            ps.setString(5, persona.getCorreoElectronico());
            ps.setDate(6, persona.getFechaNacimiento());
            ps.setString(7, persona.getGenero());

            int resultado = ps.executeUpdate();

            return (resultado > 0) ? true : false;

        } catch (Exception e) {
            System.err.println("Error: " + e);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (Exception ex) {
                System.err.println("Error: " + ex);
            }
        }
    }

    public boolean buscar(Persona persona) {
        Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("SELECT * FROM escuela.persona WHERE clave=?");
            ps.setString(1, persona.getClave());
            rs = ps.executeQuery();

            if (rs.next()) {
                persona.setIdPersona(rs.getInt("idPersona"));
                persona.setClave(rs.getString("clave"));
                persona.setNombre(rs.getString("nombre"));
                persona.setDomicilio(rs.getString("domicilio"));
                persona.setCelular(rs.getString("celular"));
                persona.setCorreoElectronico(rs.getString("correoElectronico"));
                persona.setFechaNacimiento(rs.getDate("fechaNacimiento"));
                persona.setGenero(rs.getString("genero"));
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            System.err.println("Error: " + e);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (Exception ex) {
                System.err.println("Error: " + ex);
            }
        }
    }

    // Metodo para modificar datos
    public boolean modificar(Persona persona) {
        Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("UPDATE escuela.persona SET clave=?, nombre=?, domicilio=?, celular=?, correoElectronico=?, fechaNacimiento=?, genero=? WHERE idPersona=?");

            ps.setString(1, persona.getClave());
            ps.setString(2, persona.getNombre());
            ps.setString(3, persona.getDomicilio());
            ps.setString(4, persona.getCelular());
            ps.setString(5, persona.getCorreoElectronico());
            ps.setDate(6, persona.getFechaNacimiento());
            ps.setString(7, persona.getGenero());
            ps.setInt(8, persona.getIdPersona());

            int resultado = ps.executeUpdate();

            return (resultado > 0) ? true : false;

        } catch (Exception e) {
            System.err.println("Error: " + e);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (Exception ex) {
                System.err.println("Error: " + ex);
            }
        }
    }

    // Metodo para modificar datos
    public boolean eliminar(Persona persona) {
        Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("DELETE FROM escuela.persona WHERE idPersona=?");

            ps.setInt(1, persona.getIdPersona());

            int resultado = ps.executeUpdate();

            return (resultado > 0) ? true : false;

        } catch (Exception e) {
            System.err.println("Error: " + e);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (Exception ex) {
                System.err.println("Error: " + ex);
            }
        }
    }
}
