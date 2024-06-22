/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package porjec_kasir;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;


public class configDB {
    private static Connection mysqlconfig;
    public static Connection config()throws SQLException{
        try {
            String ulr = "jdbc:mysql://localhost:3306/projectpbo";
            String username = "root";
            String password = "";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(ulr, username, password);
        } catch (Exception e) {
            System.out.println("koneksi gagal" +e.getMessage());
        }
        return mysqlconfig;
    }
}
