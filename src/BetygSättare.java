import javax.swing.*;

public class BetygSättare {
    public static void main(String[] args) {
        String Betyg;
        Betyg = JOptionPane.showInputDialog(null, "Hur mycket po\u00E4ng fick eleven");
        int betygsomsiffra = Integer.parseInt(Betyg);
        if (betygsomsiffra <= 15){
            JOptionPane.showMessageDialog(null, "Eleven fick F");
        } else if (betygsomsiffra >= 15 && betygsomsiffra < 18){
            JOptionPane.showMessageDialog(null, "Eleven fick E");
        } else if (betygsomsiffra >= 18 && betygsomsiffra < 21){
            JOptionPane.showMessageDialog(null, "Eleven fick D");
        } else if (betygsomsiffra >= 21 && betygsomsiffra < 24){
            JOptionPane.showMessageDialog(null, "Eleven fick C");
        } else if (betygsomsiffra >= 24 && betygsomsiffra < 27){
            JOptionPane.showMessageDialog(null, "Eleven fick B");
        } else if (betygsomsiffra >= 27 && betygsomsiffra < 30) {
            JOptionPane.showMessageDialog(null, "Eleven fick A");
        } else {
            JOptionPane.showMessageDialog(null, "Skriv en giltig SIFRA");
        }
    }
}
