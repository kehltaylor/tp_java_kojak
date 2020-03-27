package pack;

import java.sql.*;
import java.util.Scanner;

public class Delete {
    public static void main(String[] args){
        try {
            System.out.println("Start Delete");
            String strClassName = "com.mysql.jdbc.Driver";
            String dbName = "Test";
            String login = "root";
            String pwd = "root";
            String strUrl = "jdbc:mysql://localhost:3306/" + dbName + "?useSSL=false";
            Class.forName(strClassName);
            Connection conn = DriverManager.getConnection(strUrl, login, pwd);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter user id to delete : ");
            String str = sc.nextLine();
            String query = "DELETE from Acces WHERE id = " + str;
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.execute();
            conn.close();
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found, Driver not loaded");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
