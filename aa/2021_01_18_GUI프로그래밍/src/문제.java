import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ���� {
	static class minical extends JFrame{
		
		minical(){
			setDefaultCloseOperation(3);
			setTitle("�̴� ����");
			
			setLayout(new FlowLayout());
			
			JLabel label1 = new JLabel("ù���� ��");
			JLabel label2 = new JLabel("�ι��� ��");
			JLabel label3 = new JLabel("     ���    ");
			
			JTextField textField1 = new JTextField(10);
			JTextField textField2 = new JTextField(10);
			JTextField textField3 = new JTextField(10);
			
			
			JButton btn_plus = new JButton("+");
			JButton btn_minus = new JButton("-");
			JButton btn_multi = new JButton("*");
			JButton btn_division = new JButton("/");
			
			this.add(label1);
			this.add(textField1);
			this.add(label2);
			this.add(textField2);
			this.add(label3);
			this.add(textField3);
			this.add(btn_plus);
			this.add(btn_minus);
			this.add(btn_multi);
			this.add(btn_division);
			
			
			setSize(224,256);
			setVisible(true);
			
			btn_plus.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						int n1 = Integer.parseInt(textField1.getText());
						int n2 = Integer.parseInt(textField2.getText());
						textField3.setText(String.valueOf(n1+n2));
					}catch (Exception ee) {
						textField3.setText("����Ÿ���� ���ڿ��� �Է��ϼ���");
					}
					
				}
				
			});
			
			btn_minus.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					int n1 = Integer.parseInt(textField1.getText());
					int n2 = Integer.parseInt(textField2.getText());
					textField3.setText(String.valueOf(n1-n2));
					
				}
				
			});
			
			btn_multi.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					int n1 = Integer.parseInt(textField1.getText());
					int n2 = Integer.parseInt(textField2.getText());
					textField3.setText(String.valueOf(n1*n2));
					
				}
				
			});
			
			btn_division.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					int n1 = Integer.parseInt(textField1.getText());
					int n2 = Integer.parseInt(textField2.getText());
					textField3.setText(String.valueOf(n1/n2));
					
				}
				
			});
			
			
			
		}//minical
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new minical();
	}

}
