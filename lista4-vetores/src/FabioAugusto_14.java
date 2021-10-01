import javax.swing.*;

public class FabioAugusto_14 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            int[] vetor1 = new int[10], vetor2 = new int[10], vetor3 = new int[10];
            String p1 = "Vetor 1: [ ";
            String p2 = "Vetor 2: [ ";
            StringBuilder p3 = new StringBuilder("Vetor 3: [ ");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 10; j++) {
                    if (i == 0) {
                        vetor1[j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número para o primeiro verto: "));
                        p1 += (j == 9) ? vetor1[j] + " ]" : vetor1[j] + ", ";
                    } else if (i == 1) {
                        vetor2[j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número para o segundo verto: "));
                        p2 += (j == 9) ? vetor2[j] + " ]" : vetor2[j] + ", ";
                    } else {
                        vetor3[j] = vetor1[j] + vetor2[j];
                        p3.append((j == 9) ? vetor3[j] + " ]" : vetor3[j] + ", ");
                    }
                }
            }
            JOptionPane.showMessageDialog(null, p1 + "\n" + p2 + "\n" + p3);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
