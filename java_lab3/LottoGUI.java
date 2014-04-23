import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class LottoGUI extends javax.swing.JFrame{
	ArrayList<Integer> lotto;
	ArrayList<Integer> user;
	int counter;
	JFrame frame;
	JButton[] button;
	JButton draw,quit,reset;
	JTextField text;
	public static void main(String[] args){
		new LottoGUI();
	}
	public LottoGUI(){
		user=new ArrayList<Integer>(6); 
		lotto=new ArrayList<Integer>(6); 
		counter=10;
		button=new JButton[49];
		user=new ArrayList<Integer>(); 
		frame=new JFrame("CompSci Lotto");
		JPanel panel=new JPanel();
		JPanel panel2=new JPanel();
		panel2.setLayout(new GridLayout(7,7));
		draw=initializeButton("Draw",Color.BLACK,null,false,new DrawListener());
		reset=initializeButton("Reset",Color.BLACK,Color.RED,true,new ResetListener());
		quit=initializeButton("Quit",Color.BLACK,Color.WHITE,true,new QuitListener());
		panel.setLayout(new GridLayout(3,1));
		panel.add(draw);
		panel.add(reset);
		panel.add(quit);
		for(int i=0;i<49;i++){
			button[i]=initializeButton(""+i,null,null,true,new NumberListener());
			panel2.add(button[i]);
		}
		text=new JTextField("Picking Numbers...                                                                                           $"+counter);
		frame.getContentPane().add(BorderLayout.WEST, panel);
		frame.getContentPane().add(BorderLayout.EAST, panel2);
		frame.getContentPane().add(BorderLayout.SOUTH, text);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	public static JButton initializeButton(String text,Color back,Color textColor,boolean active,ActionListener listener){
		JButton button=new JButton(text);
		button.setBackground(back);
		button.setForeground(textColor);
		button.setEnabled(active);
		button.addActionListener(listener);
		return button;
	}
	public void pickWinner(boolean fix){
		if(fix==false){
			counter--;
			Random rand=new Random();
			lotto.clear();
			for(int i=0;i<6;i++){
				lotto.add(rand.nextInt(48));
			}
		}else{
			for(int i=0;i<6;i++){
				lotto.add(user.get(i));
			}
		}
		String n=lotto.toString();
		for(int i=0;i<6;i++){
			lotto.remove(user.get(i));
		}
		if(lotto.size()==0){
			counter=counter+1000;
			text.setText("You win! Numbers are"+n+"                                                        $"+counter);
		}else{
			text.setText("You Lose! Try again.Numbers are"+n+"                                             $"+counter);
		}
		if(counter<0){
			frame.dispose();
		}
		
	}
	class NumberListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JButton nb=(JButton) event.getSource();
			int number=Integer.parseInt(nb.getText());
			if(user.size()<7){
				if(nb.getBackground()==Color.BLUE){
					nb.setBackground(null);
					user.remove(user.indexOf(number));
					if(user.size()<6){
						draw.setForeground(null);
						draw.setEnabled(false);
					}
						
				}else{
					if(user.size()<6){
					nb.setBackground(Color.BLUE);
					user.add(number);
					if(user.size()==6)
						draw.setForeground(Color.GREEN);
						draw.setEnabled(true);
					}
				}
			}
		
		}
	}
	class DrawListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			lotto.clear();
			if((event.getModifiers() & ActionEvent.SHIFT_MASK)!=0){
				pickWinner(true);
			}else{
				pickWinner(false);
			}
		}
	}
	class ResetListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			user.clear();
			lotto.clear();
			draw.setForeground(null);
			draw.setEnabled(false);
			for(int i=0;i<49;i++){
				button[i].setBackground(null);
			}
			text.setText("Picking Numbers...                                                                                       $"+counter);
		}
	}
	class QuitListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			frame.dispose();
		}
	}
}
