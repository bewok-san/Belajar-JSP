/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;
import java.sql.*;
/**
 *
 * @author hp
 */
public class DBConnection {
    public Connection open(){
        Connection con;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost:3306/belajarjsp";
            
            con = DriverManager.getConnection(url, "root", "");
            
            return con;
        } catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}
