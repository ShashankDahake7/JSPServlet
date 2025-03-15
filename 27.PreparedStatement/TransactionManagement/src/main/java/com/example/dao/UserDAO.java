package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {

    public static int insertUser(int id, String name, int salary, Connection con) {
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO user420 VALUES(?, ?, ?)");
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, salary);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void commitTransaction(Connection con) {
        try {
            con.commit();
            System.out.println("Transaction committed.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void rollbackTransaction(Connection con) {
        try {
            con.rollback();
            System.out.println("Transaction rolled back.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
