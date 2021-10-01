import javax.swing.*;

public class FabioAugusto_10 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            double[] a = new double[10];
            double s = 0;
            for (int i = 0; i < a.length; i++) {
                a[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um número: "));
            }
            for (int i = 0, j = 9; i < a.length; i++, j--) {
                s += Math.pow((a[i] - a[j]), 2);
            }
            JOptionPane.showMessageDialog(null, "Resultado: " + s);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
