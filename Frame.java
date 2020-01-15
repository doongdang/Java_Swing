package java_swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Frame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Some text");
		JButton btn1 = new JButton("Click");
		JButton btn2 = new JButton("Exit");
		JTextArea txtarea = new JTextArea();//무제한에 가깝다
		JTextField txtfield = new JTextField(1);//숫자 제한
		JPanel btnpanel = new JPanel();
		
		btnpanel.add(btn1);
		btnpanel.add(btn2);
		panel.setLayout(new BorderLayout());
		panel.add(label, BorderLayout.NORTH);
		panel.add(btnpanel, BorderLayout.WEST);
		panel.add(txtarea, BorderLayout.CENTER);
		panel.add(txtfield, BorderLayout.SOUTH);
		
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(txtarea.getText());
				
			}
			
		});
		
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
			
		});
		
		
		frame.add(panel);//프레임에 패널 넣기
		
		
		
		frame.setVisible(true);// 프레임 가시화
		frame.setResizable(true);// 창 크기 조정 가능(true)(false)
		frame.setPreferredSize(new Dimension(840,840/12*9));//
		frame.setSize(840,840/12*9);//초기 화면 크기 설정
		frame.setLocationRelativeTo(null);//화면 등장 위치 중간
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 프로그램 종료시 완전 종료
		
		

	}

}
