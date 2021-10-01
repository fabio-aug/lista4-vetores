import javax.swing.*;

public class FabioAugusto_8 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            double[] vetor1 = new double[10], vetor2 = new double[10];
            int[] vetor3 = new int[10];
            String p1 = "";
            String p2 = "";
            StringBuilder p3 = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 10; j++) {
                    if (i == 0) {
                        vetor1[j] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um número para o primeiro verto: "));
                        p1 += vetor1[j] + "; ";
                    } else if (i == 1) {
                        vetor2[j] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um número para o segundo verto: "));
                        p2 += vetor2[j] + "; ";
                    } else {
                        if (vetor1[j] == vetor2[j]) {
                            vetor3[j] = 1;
                        } else {
                            vetor3[j] = 0;
                        }
                        p3.append(vetor3[j]).append("; ");
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "VETOR 1: \n" + p1 + "\nVETOR 2: \n" + p2 + "\nVETOR 3: \n" + p3);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
