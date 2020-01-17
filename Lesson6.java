package java_swing;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Lesson6 {

	private JFrame frame;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lesson6 window = new Lesson6();
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
	public Lesson6() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Lesson 6");
		frame.setBounds(100, 100, 800, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel endPage = new JPanel();
		endPage.setBounds(0, 0, 782, 553);
		frame.getContentPane().add(endPage);
		endPage.setLayout(null);
		endPage.setVisible(false);
		
		
		JLabel lblSuccessfullyLoggeIn = new JLabel("Successfully Logge In");
		lblSuccessfullyLoggeIn.setFont(new Font("±¼¸²", Font.BOLD, 24));
		lblSuccessfullyLoggeIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuccessfullyLoggeIn.setBounds(89, 57, 600, 150);
		endPage.add(lblSuccessfullyLoggeIn);
		
		JPanel startPage = new JPanel();
		startPage.setBounds(0, 0, 782, 553);
		frame.getContentPane().add(startPage);
		startPage.setLayout(null);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = "doongdang";
				String pwrd = "shripper31532";
				
				if(id.equals(textField.getText())&& pwrd.equals(passwordField.getText())) {
					startPage.setVisible(false);
					endPage.setVisible(true);
					}
				else {
					JOptionPane.showMessageDialog(null, "Try Again");
					
				}
			}
		});
		
		
		btnLogIn.setBounds(560, 93, 175, 361);
		btnLogIn.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 24));
		startPage.add(btnLogIn);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(14, 118, 148, 56);
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		startPage.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(298, 245, 223, 56);
		passwordField.setToolTipText("");
		passwordField.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		startPage.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(306, 124, 143, 56);
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.BOLD, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		startPage.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(14, 245, 197, 56);
		textField.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		startPage.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Log Out");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				endPage.setVisible(false);
				startPage.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btnNewButton.setBounds(236, 278, 309, 194);
		endPage.add(btnNewButton);
			
	}
}
