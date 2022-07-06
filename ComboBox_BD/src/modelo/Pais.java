package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class Pais {
    
    private int idPais;
    private String nombrePais;
    
    public int getIdPais() {
        return idPais;
    }
    
    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }
    
    public String getNombrePais() {
        return nombrePais;
    }
    
    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
    
    @Override
    public String toString() {
        return this.nombrePais;
    }
    
    public Vector<Pais> mostarPaises() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        Vector<Pais> vectorPaises = new Vector<Pais>();
        Pais pais = null;
        
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            ps = conexion.prepareStatement("SELECT * FROM paises");            
            rs = ps.executeQuery();
            
            pais = new Pais();
            pais.setIdPais(0);
            pais.setNombrePais("Seleccion pais");
            vectorPaises.add(pais);
            
            while (rs.next()) {
                pais = new Pais();
                pais.setIdPais(rs.getInt("idPais"));
                pais.setNombrePais(rs.getString("nombrePais"));
                vectorPaises.add(pais);                
            }
            rs.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e);
        }
        return vectorPaises;
    }
    
}
