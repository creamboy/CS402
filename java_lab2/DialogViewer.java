import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class DialogViewer {
	public static void main(String args[]){
		final String SENTINEL = "exit";
		final String INPUT_PROMPT = "\nPlease enter an argument(f, c, m) (or " +
				SENTINEL + " to quit): ";
		Scanner sc = new Scanner (System.in);
		String arg;
		while(true){
			try{
				System.out.print (INPUT_PROMPT);
				arg=sc.nextLine();
				if (args.equals(SENTINEL))
					break;
				if(arg.equals("f")){
					 JFileChooser chooser = new JFileChooser();
					 int result = chooser.showOpenDialog(chooser);
					    if(result == JFileChooser.APPROVE_OPTION) {
					       System.out.println("You chose to open this file: " +
					            chooser.getSelectedFile().getName());
					    }else{
					    	System.out.println("You did not choose any file! ");
					    }
				}
				if(arg.equals("c")){
					
					JOptionPane.showMessageDialog(null, "Are you sure? ", "Warning",JOptionPane.YES_NO_OPTION);  
				}
				if(arg.equals("m")){
					Object[] but ={ "Yes", "No", "Cancel" };  
					JOptionPane.showOptionDialog(null, "My name is Fan Zhang. ", "Name",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, but, but[0]);
				}
			}catch (Exception e)
			{
				System.out.println(e);
				sc.nextLine();
				} 
		}
	}
}
