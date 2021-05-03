import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class 계산기만들기 {
static class Cal extends JFrame {
	

	Cal(){
		setDefaultCloseOperation(3);
		setTitle("계산기");
		
		setLayout(new GridLayout(5,4,10,10));
		
		JButton btn[] = new JButton[16];
		JTextField result[] = new JTextField[4];
		for(int i = 0; i < result.length; i++) {
			
			result[i] = new JTextField();
			this.add(result[i]);
		}
		for(int i =0; i < btn.length; i++) {
			btn[i] = new JButton();
			btn[i].setFont(new Font("맑은고딕",Font.BOLD,20));
			this.add(btn[i]);
		}
		
		
		
		btn[0].setText("7");
		btn[1].setText("8");
		btn[2].setText("9");
		btn[3].setText("+");
		btn[4].setText("4");
		btn[5].setText("5");
		btn[6].setText("6");
		btn[7].setText("-");
		btn[8].setText("1");
		btn[9].setText("2");
		btn[10].setText("3");
		btn[11].setText("*");
		btn[12].setText("/");
		btn[13].setText("0");
		
		btn[8].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(result[0] == null) {
					result[0].setText(btn[8].getText());
				} else {
					result[0].setText(result[0].getText()+btn[8].getText());
				}
				
				
			}
			
		});
		
		setSize(512,512);
		setVisible(true);
		
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Cal();
	}

}
