package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.SpinnerListModel;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class booking {

	protected static final int YES_OPTION = 0;
	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					booking window = new booking();
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
	public booking() {
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
		
		JLabel lblNewLabel = new JLabel("MOVIE BOOKING");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(122, 24, 173, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(60, 81, 68, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MOVIE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(60, 120, 68, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("TICKETS");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(60, 155, 86, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tb1 = new JTextField();
		tb1.setBounds(216, 78, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "RRR", "KGF", "DJT2", "MCA"}));
		cb1.setBounds(216, 116, 86, 22);
		frame.getContentPane().add(cb1);
		
		JSpinner sp1 = new JSpinner();
		sp1.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		sp1.setBounds(216, 152, 86, 20);
		frame.getContentPane().add(sp1);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//JOptionPane.showMessageDialog(btnNewButton, "value"+value);
				String name=tb1.getText();
				String movie=(String) cb1.getSelectedItem();
				int value = (Integer) sp1.getValue();
				int bill=0;
				if(movie.equals("RRR")) 
				{
					bill=bill+value*150;
				}
				if(movie.equals("KGF")) 
				{
					bill=bill+value*150;
				}
				if(movie.equals("DJT2")) 
				{
					bill=bill+value*150;
				}
				if(movie.equals("MCA")) 
				{
					bill=bill+value*150;
				}
				int res=0;
				res=JOptionPane.showConfirmDialog(btnNewButton, "NAME: "+name+"\nMOVIE: "+movie+"\nTICKETS: "+value+"\nAmount: "+bill);
				if(res==YES_OPTION)
				{
					JOptionPane.showMessageDialog(btnNewButton, "BOOKING CONFIRMED");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "BOOKING CANCELLED");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(174, 227, 121, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\online\\Pictures\\theater2.jpg"));
		lblNewLabel_4.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
