package porjec_kasir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Supplier {
    private String kodeSup;
    private String name;
    private String address;
    private String phone;
    private String email;

    // Database connection details
    private static final String DB_URL = "jdbc:mysql://localhost:3306/projectpbo";
    private static final String DB_USER = "your_username";
    private static final String DB_PASSWORD = "your_password";

    // Constructor
    public Supplier(String kodeSup, String name, String address, String phone, String email) {
        this.kodeSup = kodeSup;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    // Getter and Setter methods
    public String getKodeSup() {
        return kodeSup;
    }

    public void setKodeSup(String kodeSup) {
        this.kodeSup = kodeSup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

     public static Supplier getSupplierByKodeSup(String kodeSup) {
        Supplier supplier = null;
       try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectpbo", "root", "")){
            String query = "SELECT * FROM supplier WHERE kode_sup = ?";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, kodeSup);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String name = resultSet.getString("nama_sup");
                String phone = resultSet.getString("tlpn");
                String email = resultSet.getString("email");
                String address = resultSet.getString("alamat");
                supplier = new Supplier(kodeSup, name, phone, email, address);
            } 

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return supplier;
    }


    // Method to save Supplier details to the database
   public void save() {
    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectpbo", "root", "");
         PreparedStatement ps = con.prepareStatement("INSERT INTO supplier (kode_sup, nama_sup, tlpn, email, alamat) VALUES (?, ?, ?, ?, ?)")) {

        ps.setString(1, this.kodeSup);
        ps.setString(2, this.name);
        ps.setString(3, this.phone);
        ps.setString(4, this.email);
        ps.setString(5, this.address);
        ps.executeUpdate();

    } catch (SQLException e) {
        e.printStackTrace();
    }
   }
}