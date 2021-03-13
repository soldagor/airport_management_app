package com.soldagor;

import java.sql.*;

public class MainAppWithJDBCSupport {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String USER = "ask";
    static final String PASS = "ask";
    static final String DB_URL = "jdbc:mysql://localhost:3306/airport_db";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to DB...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected DB successfully...");

            stmt = conn.createStatement();
            String query = "select * from test_table";

            ResultSet result = stmt.executeQuery(query);

            while (result.next()) {
                System.out.println(result.getString(1));
            }

        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            }catch (SQLException se) {
                se.printStackTrace();
            }
        }


    }
}
