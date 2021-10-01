import javax.swing.*;

public class FabioAugusto_3 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor N: "));
            int atual = 1, anterior = 0;
            int[] fibonacci = new int[n];
            StringBuilder print = new StringBuilder();
            for (int i = 0; i < n; i++) {
                fibonacci[i] = atual;
                atual = atual + anterior;
                anterior = atual - anterior;
            }
            for (int i = 0; i < n; i++) {
                print.append(fibonacci[i]).append(" ");
            }
            JOptionPane.showMessageDialog(null, "Vetor de fibonacci: \n" + print);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
