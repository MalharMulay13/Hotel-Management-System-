package HotelManagementSystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MoreInfo extends JFrame {
	MoreInfo() {
		
		
	/*	ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/Icons/Hotel.jpg"));
		JLabel l10 = new JLabel(i10);
        l10.setBounds(0,0,200,200);	
        add(l10);*/
        
		
	    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/Icons/third.jpg"));
		Image i2 = i1.getImage().getScaledInstance(10000,1500,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l1 = new JLabel(i1);
		l1.setBounds(-700,0,2900,470);
		add(l1);
		
	/*	ImageIcon i5 = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/Icons/bed.jpeg"));
		Image i6 = i5.getImage().getScaledInstance(10000,1500,Image.SCALE_DEFAULT);
		ImageIcon i = new ImageIcon(i6);
		JLabel l5 = new JLabel(i5);
		l5.setBounds(500,900,100,100);
		add(l5);*/
		
		
		
		setLayout(null);
		setBounds(0,0,1850,1020);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new MoreInfo();
 		

	}

}
