package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loginpage {

	private JFrame frame;
	private JTextField tb1;
	private JTextField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginpage window = new loginpage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public loginpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(223, 223, 223));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tb1 = new JTextField();
		tb1.setBounds(189, 61, 116, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		p1 = new JTextField();
		p1.setBounds(189, 138, 116, 20);
		frame.getContentPane().add(p1);
		p1.setColumns(10);
		
		JLabel use = new JLabel("USER NAME");
		use.setFont(new Font("Tahoma", Font.BOLD, 11));
		use.setBounds(41, 64, 72, 14);
		frame.getContentPane().add(use);
		
		JLabel pw = new JLabel("PASSWORD");
		pw.setFont(new Font("Tahoma", Font.BOLD, 11));
		pw.setBounds(41, 141, 72, 14);
		frame.getContentPane().add(pw);
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN PAGE");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(172, 11, 100, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String pwd=p1.getText();
				if(name.equals("raju") && pwd.equals("1234")) 
				{
					JOptionPane.showMessageDialog(btnNewButton, "Valid User");
				}
				else 
				{
					JOptionPane.showMessageDialog(btnNewButton, "Invalid User");
				}
			}
		});
		btnNewButton.setBounds(172, 210, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
