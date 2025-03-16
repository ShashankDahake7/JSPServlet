package com.example.jdbc;

import java.sql.*;

public class JDBCSingleton {
    private static JDBCSingleton jdbcInstance;
    private static Connection connection;

    private JDBCSingleton() {
    } // Private constructor

    public static JDBCSingleton getInstance() {
        if (jdbcInstance == null) {
            jdbcInstance = new JDBCSingleton();
        }
        return jdbcInstance;
    }

    private static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "root", "password");
            } catch (ClassNotFoundException e) {
                throw new SQLException("JDBC Driver not found", e);
            }
        }
        return connection;
    }

    // Insert record
    public int insert(String name, String pass) throws SQLException {
        String query = "INSERT INTO userdata(uname, upassword) VALUES(?, ?)";
        try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, name);
            ps.setString(2, pass);
            return ps.executeUpdate();
        }
    }

    // View record
    public String view(String name) throws SQLException {
        StringBuilder result = new StringBuilder();
        String query = "SELECT * FROM userdata WHERE uname=?";
        try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, name);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    result.append("Name: ").append(rs.getString(2))
                            .append(", Password: ").append(rs.getString(3)).append("\n");
                }
            }
        }
        return result.toString();
    }
}