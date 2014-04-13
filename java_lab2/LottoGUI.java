import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class LottoGUI {
	public static void main(String[] args){
		new LottoGUI();
	}
	public LottoGUI(){
		JFrame frame=new JFrame("CompSci Lotto");
		JPanel panel=new JPanel();
		JPanel panel2=new JPanel();
		panel2.setLayout(new GridLayout(7,7));
		JButton button1=new JButton("Draw");
		button1.setBackground(Color.black);
		button1.setForeground(Color.green);
		JButton button2=new JButton("Reset");
		button2.setBackground(Color.black);
		button2.setForeground(Color.red);
		JButton button3=new JButton("Quit");
		button3.setBackground(Color.black);
		button3.setForeground(Color.white);
		panel.setLayout(new GridLayout(3,1));
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		for(int i=0;i<49;i++){
			panel2.add(new JButton(""+i));
		}
		frame.getContentPane().add(BorderLayout.WEST, panel);
		frame.getContentPane().add(BorderLayout.EAST, panel2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
