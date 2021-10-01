import javax.swing.*;

public class FabioAugusto_7 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            int[] notas = new int[80];
            StringBuilder print = new StringBuilder();
            for (int i = 0; i < notas.length; i++) {
                int nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a nota do aluno: "));
                while (nota < 0 || nota > 10) {
                    nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe uma nota entre 0 e 10: "));
                }
                notas[i] = nota;
            }
            for (int i = 0; i <= 10; i++) {
                int count = 0;
                for (int nota : notas) {
                    if (nota == i) {
                        count++;
                    }
                }
                print.append("\nNota ").append(i).append(" - Frequência absoluta: ").append(count).append(" - Frequência relativa: ").append(((double) count / notas.length) * 100).append("%");
            }
            JOptionPane.showMessageDialog(null, print.toString());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
