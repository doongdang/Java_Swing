package java_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame{
	public Login() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID : ");
		JLabel pswrd = new JLabel("Password : ");
		JTextField txtID = new JTextField(10);
		JPasswordField txtpass = new JPasswordField(10);
		JButton btnlog = new JButton("Log In");
		
		
		panel.add(label);
		panel.add(txtID);
		panel.add(pswrd);
		panel.add(txtpass);
		panel.add(btnlog);
		
		
		btnlog.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				
				String id = "doongdang";
				String pass = "1234";
				
				if(id.equals(txtID.getText()) && pass.equals(txtpass.getText())){
					JOptionPane.showMessageDialog(null, "Logged IN Successfully");
				}else {
					JOptionPane.showMessageDialog(null, "Failed to Log IN");
				}
			}
			
		});
		
		
		add(panel);
		
		
		setVisible(true);
		setSize(800,600);
		setLocationRelativeTo(null);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	public static void main(String args[]) {
			
		new Login();
		
	}
 
}

	