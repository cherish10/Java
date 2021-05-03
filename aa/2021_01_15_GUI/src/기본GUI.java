import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 기본GUI {

	static class MyGUI extends JFrame { //static class 별도로 MyGUI의 object를 생성할 수있다. 
		MyGUI(){ //JRrame을 상속해서 받아온것. <- 생성자
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //JFrame에서 받아온 메소드
		//일반적으로 대문자 필드는 상수
		
		setTitle("FlowLayout 연습");
		
		this.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("버튼 1");
		this.add(btn1);
		
		JButton btn2 = new JButton("버튼 2");
		this.add(btn2);
		
		JButton btn3 = new JButton("버튼 3");
		this.add(btn3);
		
		JButton btn4 = new JButton("버튼 4");
		this.add(btn4);
		
		JButton btn5 = new JButton("버튼 5");
		this.add(btn5);
		
		setSize(256,256);
		setVisible(true);
		}
	}
	
	public static void main(String args[]) {
		new MyGUI();
	}
}