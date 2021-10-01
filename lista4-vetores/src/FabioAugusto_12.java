import javax.swing.*;
import java.util.Arrays;

public class FabioAugusto_12 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            double[] crescente = new double[10], decrescente = new double[10];
            StringBuilder p1 = new StringBuilder("Original: [ ");
            StringBuilder p2 = new StringBuilder("Crescente: [ ");
            StringBuilder p3 = new StringBuilder("Decrescente: [ ");
            for (int i = 0; i < 10; i++) {
                crescente[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um número: "));
                if (i == 9) {
                    p1.append(crescente[i]).append(" ]");
                } else {
                    p1.append(crescente[i]).append(", ");
                }
            }
            Arrays.sort(crescente);
            for (int i = 9, j = 0; i > 0; i--, j++) {
                decrescente[i] = crescente[j];
                if (i == 1) {
                    p2.append(crescente[j]).append(" ]");
                    p3.append(decrescente[i]).append(" ]");
                } else {
                    p2.append(crescente[j]).append(", ");
                    p3.append(decrescente[i]).append(", ");
                }
            }
            JOptionPane.showMessageDialog(null, p1 + "\n" + p2 + "\n" + p3);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
