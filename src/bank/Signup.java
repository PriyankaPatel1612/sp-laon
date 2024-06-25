package bank;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Signup extends JFrame {

		JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
		JTextField tf1,tf2,tf,tf4,tf5,tf6,tf7;
		JRadioButton r1,r2,r3,r4,r5;
		JButton b;
		
		Random r= new Random();
		long randnum=r.nextLong()%9000+1000;
		String number=""+Math.abs(randnum);
		
	public Signup()
	{
		setTitle("New Account Application Form");
		setLayout(null);
		
		l1=new JLabel("New Application Form: "+number);
		l1.setFont(new Font("Raleway", Font.BOLD,40));
		l1.setBounds(150,20,600,40);
		add(l1);
		
		l2=new JLabel("Personal Details of Customer");
		l2.setFont(new Font("Arial", Font.BOLD,25));
		l2.setBounds(250,80,600,30);
		add(l2);
		
		l3=new JLabel("Yr Name:");
		l3.setFont(new Font("Arial", Font.BOLD,22));
		l3.setBounds(100,130,200,30);
		add(l3);
		
		l4=new JLabel("Father Name:");
		l4.setFont(new Font("Arial", Font.BOLD,22));
		l4.setBounds(100,180,200,30);
		add(l4);
		
		l5=new JLabel("Date of Birth:");
		l5.setFont(new Font("Raleway", Font.BOLD,20));
		l5.setBounds(100,230,200,30);
		add(l5);
		
		l6=new JLabel("Gender:");
		l6.setFont(new Font("Raleway", Font.BOLD,20));
		l6.setBounds(100,280,200,30);
		add(l6);
		
		l7=new JLabel("Email Address:");
		l7.setFont(new Font("Raleway", Font.BOLD,20));
		l7.setBounds(100,330,200,30);
		add(l7);
		
		l8=new JLabel("Email Address:");
		l8.setFont(new Font("Raleway", Font.BOLD,20));
		l8.setBounds(100,330,200,30);
		add(l8);
		
		getContentPane().setBackground(Color.white);
		setVisible(true);
		setSize(800,700);
		setLocation(400,100);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Signup obj=new Signup();
	}

}
