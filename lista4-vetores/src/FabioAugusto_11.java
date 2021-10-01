import javax.swing.*;

public class FabioAugusto_11 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            int[] vetor1 = {70, 71, 72, 73, 74, 75, 76, 77, 78, 79};
            int[] vetor2 = {80, 81, 82, 83, 84, 85, 86, 87, 88, 89};
            int[] vetor3 = new int[10];
            StringBuilder p1 = new StringBuilder("Vetor 1: [ ");
            StringBuilder p2 = new StringBuilder("Vetor 2: [ ");
            StringBuilder p3 = new StringBuilder("Vetor 3: [ ");
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    vetor3[i] = vetor1[i];
                } else {
                    vetor3[i] = vetor2[i];
                }
                if (i == 9) {
                    p1.append(vetor1[i]).append(" ]");
                    p2.append(vetor2[i]).append(" ]");
                    p3.append(vetor3[i]).append(" ]");
                } else {
                    p1.append(vetor1[i]).append(", ");
                    p2.append(vetor2[i]).append(", ");
                    p3.append(vetor3[i]).append(", ");
                }
            }
            JOptionPane.showMessageDialog(null, p1 + "\n" + p2 + "\n" + p3);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
