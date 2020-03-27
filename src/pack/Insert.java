package pack;


import javafx.util.Pair;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
    public static void main(String[] args){
        try {
            System.out.println("Start Insert");
            String strClassName = "com.mysql.jdbc.Driver";
            String dbName = "Test";
            String login = "root";
            String pwd = "root";
            String strUrl = "jdbc:mysql://localhost:3306/" + dbName + "?useSSL=false";
            Class.forName(strClassName);
            Connection conn = DriverManager.getConnection(strUrl, login, pwd);
            Statement stAddUser = conn.createStatement();
            stAddUser.executeUpdate("insert into Acces values ( 6, 'Vincent', 'MadaFukaz', 'azerty', 'Dieu', 24 )");
            conn.close();
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found, driver not loaded");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
