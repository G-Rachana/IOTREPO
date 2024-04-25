package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Metro {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Metro window = new Metro();
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
	public Metro() {
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
		
		JLabel lblNewLabel = new JLabel("METRO TICKETS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(114, 24, 200, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(21, 67, 97, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SOURCE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(21, 102, 97, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DESTINATION");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(21, 133, 97, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("TICKETS");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(21, 164, 97, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(128, 64, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KPHP", "NAGOL", "JBS", "MGBS", "MYAPUR"}));
		cb1.setBounds(128, 98, 86, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KPHP", "NAGOL", "JBS", "MGBS", "MYAPUR"}));
		cb2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cb2.setBounds(128, 129, 86, 22);
		frame.getContentPane().add(cb2);
		
		JSpinner sp1 = new JSpinner();
		sp1.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		sp1.setBounds(128, 161, 86, 20);
		frame.getContentPane().add(sp1);
		
		Button button = new Button("New button");
		button.setBounds(50, 215, 110, -37);
		frame.getContentPane().add(button);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String s=(String) cb1.getSelectedItem();
				String d=(String) cb2.getSelectedItem();
				int nt = (Integer) sp1.getValue();
				int bill=0;
				if(s.equals(d))
				{
					JOptionPane.showMessageDialog(btnNewButton, "Please Check Stations..!!");
				}
				else
				{
					bill=bill+nt*45;
					JOptionPane.showMessageDialog(btnNewButton, "NAME: "+name+"\nSOURCE: "+s+"\nDESTINATION: "+d+"TICKETS: "+nt+"\nAMOUNT: "+bill+"\n😊 !!...HAPPY JOURNEY...!! 😊");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(50, 203, 110, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\online\\Pictures\\images.jpg"));
		lblNewLabel_5.setBounds(224, 44, 200, 193);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
