//import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class App {
    public static void main(String[] args) throws Exception {
        
        showMessageDialog(null, "bom dia");
        showInputDialog("cual su numbre?");

        int idade = parseInt(showInputDialog("idade"));
        double media = parseDouble(showInputDialog("média"));

        showMessageDialog(null,"Idade: " + idade + " |" + " Média: "  + media);
    }
}
