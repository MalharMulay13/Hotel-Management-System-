package HotelManagementSystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {
	JMenuBar mb;
	JMenu m1, m2;
	JMenuItem i1, i2, i3, i4;
	
	Dashboard() {
		mb = new JMenuBar();
		add(mb);
		
		m1 = new JMenu("Hotel Management");
		m1.setForeground(Color.red);
		mb.add(m1);
		
		m2 = new JMenu("ADMIN");
		m2.setForeground(Color.blue);
		mb.add(m2);
		
		i1 = new JMenuItem("Reception");
		i1.addActionListener(this);
		m1.add(i1);
		
		i2 = new JMenuItem("Add Employee");
		i2.addActionListener(this);
		m2.add(i2);
		
		i3 = new JMenuItem("Add Rooms");
		i3.addActionListener(this);
		m2.add(i3);
		
		i4 = new JMenuItem("Add Drivers");
		i4.addActionListener(this);
		m2.add(i4);
		
		mb.setBounds(0,0,1950,20);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/Icons/third.jpg"));
		Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l1 = new JLabel(i1);
		l1.setBounds(-715,0,2400,650);
		add(l1);
		
		setLayout(null);
		setBounds(-8,0,1850,1020);
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals("Reception")) {
		    new Reception().setVisible(true);
		}else if(ae.getActionCommand().equals("Add Employee")) {
			new AddEmployee().setVisible(true);
		}else if (ae.getActionCommand().equals("Add Rooms")) {
			new AddRooms().setVisible(true);
		}else if (ae.getActionCommand().equals("Add Drivers")) {
			new AddDrivers().setVisible(true);
		}
	} 

	public static void main(String[] args) {
		new Dashboard().setVisible(true);
	}

}
