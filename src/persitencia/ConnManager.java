/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persitencia;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @version 0.1 --> 2014-11-20
 * @author Marcos
 */
public abstract class ConnManager {
    
    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto","root","");
        } catch (Exception pe) {
            System.out.println("Error al tomar conexión, codigo: " + pe.getMessage()); 
        }
        return con;
    }
    
    
    
}
