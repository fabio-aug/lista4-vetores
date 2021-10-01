import javax.swing.*;

public class FabioAugusto_2 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            int[] vetorOriginal = new int[10];
            int[] vetorInvertido = new int[10];
            StringBuilder pv1 = new StringBuilder();
            StringBuilder pv2 = new StringBuilder();
            for (int i = 0, j = 10; i < 10; i++, j--) {
                vetorOriginal[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número:"));
                pv1.append(vetorOriginal[i]).append("; ");
                vetorInvertido[j - 1] = vetorOriginal[i];
            }
            for (int i = 0; i < 10; i++) {
                pv2.append(+vetorInvertido[i]).append("; ");
            }
            JOptionPane.showMessageDialog(null, "Vetor 1: \n" + pv1 + "\nVetor 2: \n" + pv2);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }

    }
}
