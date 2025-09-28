/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.msconnectaccess2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author SERVER 1
 */
public class Msconnectaccess2 {

    public static Connection conn() {
        try {
            String url = "jdbc:ucanaccess://C://Users//admin//Documents//myDB.accdb";
            Connection conn = DriverManager.getConnection(url);
            return conn;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;

    }

}
