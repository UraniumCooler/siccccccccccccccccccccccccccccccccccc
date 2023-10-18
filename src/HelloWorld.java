import javax.swing.JOptionPane;
import java.util.Scanner;

public class HelloWorld{
	public static void main(String[] args) {
		for (int i=0 ; i < 10 ;i++) {
			System.out.println(i);
		} 
		
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		
		i = 0; 
		do {
			System.out.println(i);
			i++;
		} while (i < 10); 
			/*
		String namn;
		namn =JOptionPane.showInputDialog(null, "Vad heter du?");
		int alder = Integer.parseInt(JOptionPane.showInputDialog(null, "Hur gammal är du?"));
			*/
			/*
		namn = JOptionPane.showInputDialog(null, "Vad heter du?");
		if (namn.equalsIgnoreCase("Daniel")){ 
			JOptionPane.showMessageDialog(null, namn + ", Fuck you");
		
		} else if (namn.equalsIgnoreCase("Japaleno"))
			{ JOptionPane.showMessageDialog(null, "Pequiliar name " + namn);
			
		} else { JOptionPane.showMessageDialog(null, "Hej " + namn);
			
		} 
			*/
			/*
		System.out.println("Vad heter du?");
		Scanner tgb = new Scanner(System.in);
		String namn;
		namn = tgb.nextLine();
		System.out.println("Hur gammal \u00E4r du?");
		
		int alder = tgb.nextInt();
		tgb.nextLine();
		System.out.println("Vad \u00E4r din favorit mat?");
		String food = tgb.nextLine();
		System.out.println("Hej + namn");
		System.out.println("Du \u00E4r " + alder + " \u00e5r gammal och gillar " + food);
			*/
			/*
		System.out.print("Hej") ;
		System.out.println(namn);
			*/
		// använd en av dessa
		//System.out.println ("Hej " + namn);
		
		// JOptionPane.showMessageDialog(null , "This program is a fun killer"); 
	}
}