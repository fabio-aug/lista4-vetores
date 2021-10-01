import javax.swing.*;

public class FabioAugusto_15 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            double[] vetor = {5, 67, 78, 98, 1};
            double somatorio = 0, produtorio = 1;
            for (double v : vetor) {
                somatorio += v;
                produtorio *= v;
            }
            JOptionPane.showMessageDialog(null, "Somatório: " + somatorio +
                    "\nProdutório: " + produtorio);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
