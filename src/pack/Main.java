package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DAOAcces daoAcces = new DAOAcces("Test", "root", "root");
        daoAcces.Lister();
        daoAcces.Add(10, "Kojak", "Lind", "azerty1234", "bg", 23);
        System.out.println("Added");
        daoAcces.Lister();
        daoAcces.Delete(10);
        System.out.println("Deleted");
        daoAcces.Lister();
    }
}