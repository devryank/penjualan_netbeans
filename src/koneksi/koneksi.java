/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */
public class koneksi {
    private Connection koneksi;
    public Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Berhasil connect");
        }
        catch(ClassNotFoundException ex) {
            System.out.println("gagal koneksi" + ex);
        }
        String url = "jdbc:mysql://localhost/penjualan";
        try {
            koneksi = DriverManager.getConnection(url, "root", "");
            System.out.println("Berhasil koneksi ke database");
        }
        catch(SQLException ex) {
            System.out.println("gagal koneksi ke database"+ ex);
        }
        return koneksi;
    }   
}
