import javax.swing.*;

public class FabioAugusto_4 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            int[] potencia = new int[10];
            StringBuilder print = new StringBuilder("[ ");
            for (int i = 0; i < 10; i++) {
                potencia[i] = i * i;
                if (i == 9) {
                    print.append(potencia[i]);
                } else {
                    print.append(potencia[i]).append(", ");
                }
            }
            print.append(" ]");
            JOptionPane.showMessageDialog(null, print.toString());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
