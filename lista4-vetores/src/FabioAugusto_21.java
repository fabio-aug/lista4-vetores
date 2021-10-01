import javax.swing.*;

public class FabioAugusto_21 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            int picos = 0;
            int base = Integer.parseInt(JOptionPane.showInputDialog("Informe a base da montanha: "));
            int[] montanha = new int[base];
            for (int i = 0; i < montanha.length; i++) {
                montanha[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura da base " + (i + 1) + ": "));
            }
            for (int i = 1; i < montanha.length; i++) {
                if (i != (montanha.length) - 1) {
                    if (montanha[i - 1] < montanha[i] && montanha[i] > montanha[i + 1]) {
                        picos++;
                    }
                }
            }
            if (picos > 1) {
                JOptionPane.showMessageDialog(null, "S");
            } else {
                JOptionPane.showMessageDialog(null, "N");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
