/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isgb.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author isgb
 */
public class Conexion {
    
    public Connection get_connection(){
        
        Connection connection = null;
        
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app?serverTimezone=UTC","root","");
            if(connection != null){
                System.out.println("Conexion exitosa");
            }
        } catch (SQLException e) {
           System.out.println(e);
        }
        
        return connection;
    }
    
}
