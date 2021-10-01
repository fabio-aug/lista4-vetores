import javax.swing.*;

public class FabioAugusto_5 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            String[] nome = new String[5];
            double[] altura = new double[5];
            double media = 0;
            String print = "";
            for (int i = 0; i < nome.length; i++) {
                nome[i] = JOptionPane.showInputDialog(null, "Informe o nome do jogador:");
                altura[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura do jogador:"));
                media += altura[i];
            }
            media = (media / nome.length);
            for (int i = 0; i < nome.length; i++) {
                if (altura[i] > media) {
                    print = "Nome jogador: " + nome[i] + " - altura: " + altura[i];
                }
            }
            JOptionPane.showMessageDialog(null, print);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
