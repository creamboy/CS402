
import java.awt.*;

import javax.swing.*;


public class AddressScreen {
	public static void main(String[] args){
		new AddressScreen();
	}
	public AddressScreen(){
		JFrame frame=new JFrame("Address Information");
		JPanel panel=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		JPanel panel4=new JPanel();
		JPanel panel5=new JPanel();
		JPanel panel6=new JPanel();
		panel.setLayout(new GridLayout(1,2));
		panel2.setLayout(new GridLayout(1,2));
		panel3.setLayout(new GridLayout(1,2));
		panel4.setLayout(new GridLayout(1,2));
		panel5.setLayout(new GridLayout(1,2));
		JButton buttonone=new JButton("Add");
		JButton buttontwo=new JButton("Modify");
		JButton buttonthree=new JButton("Delete");
		JLabel label1=new JLabel("Name         ");
		JTextField field1=new JTextField(15);
		JLabel label2=new JLabel("Address      ");
		JTextField field2=new JTextField(15);
		JLabel label3=new JLabel("City         ");
		JTextField field3=new JTextField(15);
		JLabel label4=new JLabel("State        ");
		JTextField field4=new JTextField(15);
		JLabel label5=new JLabel("Zip          ");
		JTextField field5=new JTextField(15);
		panel.add(label1);
		panel.add(field1);
		panel2.add(label2);
		panel2.add(field2);
		panel3.add(label3);
		panel3.add(field3);
		panel4.add(label4);
		panel4.add(field4);
		panel5.add(label5);
		panel5.add(field5);
		panel6.add(buttonone);
		panel6.add(buttontwo);
		panel6.add(buttonthree);
		frame.setLayout(new GridLayout(6,1));
		frame.add(panel);
		frame.add(panel2);
		frame.add(panel3);
		frame.add(panel4);
		frame.add(panel5);
		frame.add(panel6);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
