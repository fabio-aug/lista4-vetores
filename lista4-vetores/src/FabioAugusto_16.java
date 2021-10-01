import javax.swing.*;

public class FabioAugusto_16 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            int[] vetor = new int[10];
            StringBuilder p1 = new StringBuilder("Original: [ ");
            StringBuilder p2 = new StringBuilder("Fatorial: [ ");
            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: "));
                p1.append((i == vetor.length - 1) ? vetor[i] + " ]" : vetor[i] + ", ");
                int fatorial = 1;
                for (int j = vetor[i]; j >= 1; j--) {
                    fatorial *= j;
                }
                if (vetor[i] == 0) {
                    fatorial = 0;
                }
                vetor[i] = fatorial;
                p2.append((i == vetor.length - 1) ? vetor[i] + " ]" : vetor[i] + ", ");
            }
            JOptionPane.showMessageDialog(null, p1 + "\n" + p2);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
