import javax.swing.*;
import java.util.Arrays;

public class FabioAugusto_13 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            int tamanhoA = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o tamanho da tabela A: "));
            int[] a = new int[tamanhoA];
            for (int i = 0; i < a.length; i++) {
                int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número para a tabela A: "));
                while (num > 100) {
                    num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número para a tabela A: "));
                }
                a[i] = num;
            }
            int tamanhoB = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o tamanho da tabela B: "));
            int[] b = new int[tamanhoB];
            for (int i = 0; i < b.length; i++) {
                int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número para a tabela B: "));
                while (num > 100) {
                    num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número para a tabela B: "));
                }
                b[i] = num;
            }
            int[] c = new int[tamanhoA + tamanhoB];
            System.arraycopy(a, 0, c, 0, tamanhoA);
            System.arraycopy(b, 0, c, tamanhoA, tamanhoB);
            Arrays.sort(c);
            JOptionPane.showMessageDialog(null, "Tabela A: " + Arrays.toString(a)
                    + "\nTabela B: " + Arrays.toString(b)
                    + "\nTabela C: " + Arrays.toString(c));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
