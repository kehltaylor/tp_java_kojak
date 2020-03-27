package pack;

import java.sql.*;
import java.util.Scanner;

public class Update {
    public static void main(String[] args){
        try {
            System.out.println("Start Update");
            String strClassName = "com.mysql.jdbc.Driver";
            String dbName = "Test";
            String login = "root";
            String pwd = "root";
            String strUrl = "jdbc:mysql://localhost:3306/" + dbName + "?useSSL=false";
            Class.forName(strClassName);
            Connection conn = DriverManager.getConnection(strUrl, login, pwd);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter user id to update : ");
            String id = sc.nextLine();
            System.out.println("Select status : ");
            String status = sc.nextLine();
            PreparedStatement ps = conn.prepareStatement("UPDATE Acces SET statut = ? WHERE id = ?");
            ps.setString(1, status);
            ps.setString(2, id);
            ps.execute();
            conn.close();
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found, Driver not loaded");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
