import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class �⺻GUI {

	static class MyGUI extends JFrame { //static class ������ MyGUI�� object�� ������ ���ִ�. 
		MyGUI(){ //JRrame�� ����ؼ� �޾ƿ°�. <- ������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //JFrame���� �޾ƿ� �޼ҵ�
		//�Ϲ������� �빮�� �ʵ�� ���
		
		setTitle("FlowLayout ����");
		
		this.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("��ư 1");
		this.add(btn1);
		
		JButton btn2 = new JButton("��ư 2");
		this.add(btn2);
		
		JButton btn3 = new JButton("��ư 3");
		this.add(btn3);
		
		JButton btn4 = new JButton("��ư 4");
		this.add(btn4);
		
		JButton btn5 = new JButton("��ư 5");
		this.add(btn5);
		
		setSize(256,256);
		setVisible(true);
		}
	}
	
	public static void main(String args[]) {
		new MyGUI();
	}
}