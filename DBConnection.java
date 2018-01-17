/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cab;

import java.sql.*;

/**
 *
 * @author tarun
 */
public class DBConnection {
    public static Connection getConnection() {
			Connection conn = null;
			try {

				// DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
				// String url="jdbc:oracle:thin:@localhost:1521:Student";
				// conn=DriverManager.getConnection(url,"scott","tiger");
				DriverManager.registerDriver(new com.mysql.jdbc.Driver());
				String url = "jdbc:mysql://localhost:3306/arun";
				conn = DriverManager.getConnection(url, "root", "arun210#");
			}catch (Exception e) {
				System.out.println("Error in connection----------------------" + e);
				e.printStackTrace();
			}
			return conn;
		}
    
}
