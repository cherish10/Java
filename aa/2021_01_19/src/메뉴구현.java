import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class �޴����� {
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("�޴������");
			this.setLayout(new FlowLayout());
			
			JLabel lbl = new JLabel("�� ���ڰ� �ٲ�ϴ�");
			this.add(lbl);
			
			JMenuBar menuBar = new JMenuBar();
			
			JMenu fileMenu = new JMenu("����");
			JMenu editMenu = new JMenu("����");
			
			JMenuItem newItem = new JMenuItem("������");
			JMenuItem openItem = new JMenuItem("����");
			JMenuItem closeItem = new JMenuItem("�ݱ�");
			
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
					lbl.setText("[����]�� �����߽��ϴ�.");
					
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
