package java_swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Lesson3 {

	private JFrame frame;
	private JTextField txtDoongdang;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lesson3 window = new Lesson3();
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
	public Lesson3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("πŸ≈¡", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(121, 12, 90, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("πŸ≈¡", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(353, 12, 122, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("LogIn");
		btnNewButton.setFont(new Font("±º∏≤", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id = "doongdang";
				String pass = "1234";
				
				if(id.equals(txtDoongdang.getText()) &&pass.equals(passwordField.getText())) {
					JOptionPane.showMessageDialog(null, "Logged in Successfully");
					
				}else {
					JOptionPane.showMessageDialog(null, "Failed to Log in");
				}
				
			}
		});
		btnNewButton.setBounds(641, 12, 105, 35);
		frame.getContentPane().add(btnNewButton);
		
		txtDoongdang = new JTextField();
		txtDoongdang.setBounds(206, 17, 133, 30);
		frame.getContentPane().add(txtDoongdang);
		txtDoongdang.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("±º∏≤", Font.BOLD, 15));
		passwordField.setToolTipText("");
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setBounds(482, 19, 146, 30);
		frame.getContentPane().add(passwordField);
	}
}
