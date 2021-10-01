import javax.swing.*;

public class FabioAugusto_18 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        double[] latas = new double[5];
        double media = 0, desvio = 0;
        try {
            for (int i = 0; i < latas.length; i++) {
                latas[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de Ml encontrada na lata " + (i + 1) + ": "));
                media += latas[i];
            }
            media = media / latas.length;
            for (double lata : latas) {
                desvio += (lata - media) * (lata - media);
            }
            desvio = Math.sqrt(desvio / (latas.length - 1));
            if ((media + desvio) < 385 || (media + desvio) > 395) {
                JOptionPane.showMessageDialog(null, "O processo deve ser revisado!!!");
            } else {
                JOptionPane.showMessageDialog(null, "O processo não precisa ser revisado!!!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
