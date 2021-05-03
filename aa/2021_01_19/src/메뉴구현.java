import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class 메뉴구현 {
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("메뉴만들기");
			this.setLayout(new FlowLayout());
			
			JLabel lbl = new JLabel("이 글자가 바뀝니다");
			this.add(lbl);
			
			JMenuBar menuBar = new JMenuBar();
			
			JMenu fileMenu = new JMenu("파일");
			JMenu editMenu = new JMenu("편집");
			
			JMenuItem newItem = new JMenuItem("새문서");
			JMenuItem openItem = new JMenuItem("열기");
			JMenuItem closeItem = new JMenuItem("닫기");
			
			setJMenuBar(menuBar);
			
			menuBar.add(fileMenu);
			menuBar.add(editMenu);
			
			fileMenu.add(newItem);
			fileMenu.add(openItem);
			fileMenu.addSeparator();
			fileMenu.add(closeItem);
			
			newItem.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					lbl.setText("[열기]를 선택했습니다.");
					
				}
				
			});
			
			closeItem.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
					
				}
				
			});
			
			setSize(300,200);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
	}

}
