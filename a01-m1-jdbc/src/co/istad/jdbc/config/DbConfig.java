package co.istad.jdbc.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConfig {

    // Singleton object
    private static Connection conn;

    public static Connection getInstance() {
        return conn;
    }

    // Initialize connection object
    public static void init() {
        if (conn == null) {
            // Start JDBC foundation steps
            // Step 1. Load driver
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException e) {
                System.out.println("driver load failed: " + e.getMessage());
            }

            // Step 2. Define connection URL
            final String URL = "jdbc:postgresql://localhost:5432/a01_m1";
            final String USER = "postgres";
            final String PASSWORD = "qwer";

            // Step 3. Establish connection
            try {
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (SQLException e) {
                System.out.println("Error SQL: " + e.getMessage());
            }
        } else {
            System.out.println("Connection already initialized");
        }
    }

}
