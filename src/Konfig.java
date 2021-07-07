/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LEGION
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Konfig {
    static Connection MySQLConfig;
    public static Connection ConfigDB(){
        try {
            String url="jdbc:mysql://localhost:3306/zer0martdb"; //urldb
            String user="root"; //User db
            String pass=""; //Pass db
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig=DriverManager.getConnection(url, user, pass);
        }
        catch (SQLException e) {
            System.out.println("Koneksi Gagal "+e.getMessage()); //Perintah menampilkan error pada koneksi
        }
        
        return MySQLConfig;
    }   
}
