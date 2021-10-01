import javax.swing.*;

public class FabioAugusto_6 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja informar quantos números? "));
            int[] geral = new int[n];
            int count1 = 0, count2 = 0;
            StringBuilder g = new StringBuilder("\nConjunto Geral: \n");
            StringBuilder c1 = new StringBuilder("\nConjunto1: \n");
            StringBuilder c2 = new StringBuilder("\nConjunto2: \n");
            for (int i = 0; i < n; i++) {
                int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: "));
                while (numero > 100) {
                    numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número menor ou igual a 100: "));
                }
                geral[i] = numero;
                g.append(geral[i]).append("; ");
                if (geral[i] > 0 && geral[i] % 2 == 0) {
                    count1++;
                } else {
                    count2++;
                }
            }
            int[] conjunto1 = new int[count1], conjunto2 = new int[count2];
            count1 = 0;
            count2 = 0;
            for (int i = 0; i < n; i++) {
                if (geral[i] > 0 && geral[i] % 2 == 0) {
                    conjunto1[count1] = geral[i];
                    c1.append(geral[i]).append("; ");
                    count1++;
                } else {
                    conjunto2[count2] = geral[i];
                    c2.append(geral[i]).append("; ");
                    count2++;
                }
            }
            JOptionPane.showMessageDialog(null, g + c1.toString() + c2);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
