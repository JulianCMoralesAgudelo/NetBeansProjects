/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parqueaderoiud.autos_col.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author julian
 */
public class Conectar {

    Connection cn;
    Logger logger = Logger.getLogger(Conectar.class.getName());

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdb.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/autos_db", "dbadmin", "db4dm1n");
            logger.log(Level.INFO, "Conectado");

        } catch (ClassNotFoundException | SQLException e) {
            logger.log(Level.WARNING, e.getMessage());
        }

        return cn;

    }

}
