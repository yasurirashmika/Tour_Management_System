package Staff;

import java.sql.*;

public class DatabaseConnection {
    public static Connection connect(){
        Connection conn = null;
        
        String url,user,pass;
        
        url = "jdbc:mysql://localhost:3306/Tour_Management_DataBase?userSSL=true";
        user = "root";
        pass = "";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,pass);
            System.out.println("Driver loaded");
        } catch (Exception e) {
            System.err.println(e);
        }
        
        return conn;
    }
}
