package HotelManagementSystem;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class Conn {
	Connection c;
	Statement s;
	public Conn() {
		try {
		//	 String connectionURL = "jdbc:mysql://localhost:3306/Peoples";
			Class.forName("com.mysql.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql:///javaminiproject?useSSL=false","root","malhar");
			s=c.createStatement();		
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
