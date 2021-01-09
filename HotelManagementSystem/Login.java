package HotelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
	JLabel l2, l3;
	JTextField t1;
	JButton b1, b2;
	JPasswordField t2;
	
	Login() {
		
	ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/Icons/background.jpg"));
    Image i3 = i1.getImage().getScaledInstance(585, 400,Image.SCALE_DEFAULT);
    ImageIcon i2 = new ImageIcon(i3);
    JLabel l1 = new JLabel(i2);
    l1.setBounds(-7,0,600,400);
    add(l1);
          
    ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/Icons/login.jpg"));
    Image i6 = i4.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
  	ImageIcon i5 = new ImageIcon(i6);
  	JLabel l4 = new JLabel(i5);
  	l4.setBounds(220,10,170,120);
  	l1.add(l4);
		
		l2 = new JLabel("USERNAME");
		l2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		l2.setBounds(170,150,100,30);
		l2.setForeground(Color.white);
		l1.add(l2);
		
		l3 = new JLabel("PASSWORD");
		l3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		l3.setBounds(170,210,100,30);
		l3.setForeground(Color.white);
		l1.add(l3);
		
		t1 = new JTextField();
		t1.setBounds(280,150,150,30);
		l1.add(t1);
		
		t2 = new JPasswordField();
		t2.setBounds(280,210,150,30);
		l1.add(t2);
		
		b1 = new JButton("LOGIN");
		b1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		b1.setBackground(Color.white);
		b1.setForeground(Color.black);
		b1.setBounds(170,290,120,30);
		b1.addActionListener(this);
		l1.add(b1);
		
		b2 = new JButton("CANCEL");
		b2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		b2.setBackground(Color.white);
		b2.setForeground(Color.black);
		b2.setBounds(330,290,120,30);
		b2.addActionListener(this);
		l1.add(b2);
		
		setLayout(null);
		setBounds(400,200,600,400);
		  getContentPane().setBackground(Color.white);
		setVisible(true);
	}
	
	public void actionPerformed (ActionEvent ae) {
		if(ae.getSource()== b1) {
          String username = t1.getText();
			String password = t2.getText();
			Conn c = new Conn();
			
			String str = "select * from login where username = '"+username+"' and password = '"+password+"'";
			try{
			    ResultSet rs = c.s.executeQuery(str);
			    if (rs.next()) {
			    	new Dashboard().setVisible(true);
			    	new HotelManagementSystem().setVisible(false);
			    	this.setVisible(false);
			    } else {
			    	JOptionPane.showMessageDialog(null, "Invalid Username and Password");
			    	this.setVisible(false);
			    }
			
			} catch(Exception e) {
				
			}
		} else if(ae.getSource()== b2) {
				//System.exit(0);
			this.setVisible(false);
			}
	}

	public static void main(String[] args) {
		new Login();
	}

}
