/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.sql.*;

/**
 *
 * @author tuyen
 */
public class Dbcontext {

    public static Connection getconnect() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost\\LAPTOP-2VO24UNJ\\SQLEXPRESS:1433;databaseName=NOOTEA";
            String user = "sa";
            String pass = "123";
            Connection con = DriverManager.getConnection(url, user, pass);
            return con;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
