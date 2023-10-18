import javax.swing.JOptionPane;
import java.util.Scanner;

public class ManOnAMission{
	public static void main(String[] args) {
		int Score = 0;
		
		String Chapter1;
		Chapter1 = JOptionPane.showInputDialog(null, "You've been captured by an old hag, she smirks and asks you 'Red or Blue?'");
		if (Chapter1.equalsIgnoreCase("Blue")){
			JOptionPane.showMessageDialog(null, "She laughs, 'Blue you say?' She laughs some more before opening the door to your cage and lets you free.");
			JOptionPane.showMessageDialog(null, "Score Increased to "+( Score += 1));
		} else if (Chapter1.equalsIgnoreCase("Red")){
			
			JOptionPane.showMessageDialog(null, "She laughs, 'Red you say?' She laughs some more before splashing a potion over your cage. The liquid slowly dripped down corroding your skin at touch.");
			JOptionPane.showMessageDialog(null, "Congratulations, you've died.");
			System.exit(0);
			
		} else if (Chapter1.equalsIgnoreCase("Blurple")){
			JOptionPane.showMessageDialog(null, "She looks at you like you're stupid. 'Are you fucking serious? That's not a color you know?' she looks at you some more before opening the door to your cage. 'Get out stupid'");
			JOptionPane.showMessageDialog(null, "Score Increased to "+( Score += 2));
			
		} else { JOptionPane.showMessageDialog(null, "You took too long to answer her question. She looks at you displeased before splashing a potion over your cage. The liquid slowly dripped down corroding your skin at touch.");
			JOptionPane.showMessageDialog(null, "Congratulations, you've died.");
			System.exit(0);
		}
		
			String Chapter2;
			Chapter2 = JOptionPane.showInputDialog(null, "After fleeing from the witch you run into a 3 way cross road, which way do you go?");
			while (Chapter2 != "Left") {//&& "Right" && "Middle") {
				Chapter2 = JOptionPane.showInputDialog(null, "You apparently either can't spell or just stupid enough not knowing that the three directions are Left, Right and Middle.");
				
			}	
				
			if (Chapter2.equalsIgnoreCase("Left")){
				JOptionPane.showMessageDialog(null, "You wander left");
			} else if (Chapter2.equalsIgnoreCase("Middle")){
				JOptionPane.showMessageDialog(null, "You wander straight ahead");
			} else if (Chapter2.equalsIgnoreCase("Right")){
				JOptionPane.showInputDialog(null, "You wander right");
			} 
			}
		}

