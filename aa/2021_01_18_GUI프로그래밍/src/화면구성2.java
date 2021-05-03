import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class 화면구성2 {
	static class MyGUI extends JFrame{
	MyGUI(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("이번트 연습2");
		
		this.setLayout(new FlowLayout());
		JButton btn1 = new JButton("버튼1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn1.setBackground(Color.RED);
				
			}

		});
		this.add(btn1);
		
		setSize(200,200);
		setVisible(true);
	}

	}	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
	}

}
