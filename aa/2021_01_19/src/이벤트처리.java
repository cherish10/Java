import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class �̺�Ʈó�� {
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("�̺�Ʈó��2");
			this.setLayout( new FlowLayout());
			
			JTextField txtX = new JTextField(10);
			JTextField txtY = new JTextField(10);
			this.add(txtX);
			this.add(txtY);
			
			this.addMouseListener(new MouseListener() {

				@Override
				public void mouseClicked(MouseEvent e) {
					txtX.setText(Integer.toString(e.getX()));
					txtY.setText(Integer.toString(e.getY()));
					
				}

				@Override
				public void mousePressed(MouseEvent e) {
				}

				@Override
				public void mouseReleased(MouseEvent e) {
				}

				@Override
				public void mouseEntered(MouseEvent e) {
				}

				@Override
				public void mouseExited(MouseEvent e) {	
				}
				
			});
			
			setSize(500,200);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
	}

}
