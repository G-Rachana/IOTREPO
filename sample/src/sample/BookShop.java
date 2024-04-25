package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class BookShop {
	
	int items=0;
	int price=0;

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookShop window = new BookShop();
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
	public BookShop() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BOOK SHOP");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(33, 26, 139, 17);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ITEMS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(254, 29, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PRICE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(254, 54, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setBounds(321, 26, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(321, 51, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\online\\Pictures\\Screenshots\\Screenshot 2024-04-23 153332.png"));
		lblNewLabel_3.setBounds(33, 79, 89, 119);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\online\\Pictures\\Screenshots\\Screenshot 2024-04-23 153456.png"));
		lblNewLabel_4.setBounds(161, 79, 86, 119);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\online\\Pictures\\Screenshots\\Screenshot 2024-04-23 153527.png"));
		lblNewLabel_5.setBounds(290, 79, 89, 119);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton b1 = new JButton("ADD");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				price=price+500;
				tb1.setText(" "+items);
				tb2.setText(" "+price);
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 12));
		b1.setBounds(33, 199, 89, 23);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("ADD");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				price=price+600;
				tb1.setText(" "+items);
				tb2.setText(" "+price);
			}
		});
		b2.setFont(new Font("Tahoma", Font.BOLD, 12));
		b2.setBounds(161, 199, 89, 23);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("ADD");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				price=price+700;
				tb1.setText(" "+items);
				tb2.setText(" "+price);
			}
		});
		b3.setFont(new Font("Tahoma", Font.BOLD, 12));
		b3.setBounds(290, 199, 89, 23);
		frame.getContentPane().add(b3);
		
		JLabel lblNewLabel_6 = new JLabel("Price: 500/-");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(33, 223, 89, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Price: 600/-");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(161, 223, 89, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Price: 700/-");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(290, 223, 89, 14);
		frame.getContentPane().add(lblNewLabel_8);
	}
}
