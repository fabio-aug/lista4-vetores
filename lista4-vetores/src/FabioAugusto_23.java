import javax.swing.*;
import java.util.Arrays;

public class FabioAugusto_23 {

    /* Fábio Augusto Araújo Santos */

    static int cruzamentos(int[] eixoY, int[] eixoX) {
        int[] ordenado = new int[eixoY.length];
        int numCruzamento = 0, y = 0;
        while (y < eixoY.length) {
            int x = 0;
            while (x < eixoX.length) {
                if (eixoY[y] == eixoX[x]) {
                    ordenado[y] = x;
                    for (int numeroOrdenado : ordenado) {
                        if (numeroOrdenado > x) {
                            numCruzamento++;
                        }
                    }
                }
                x++;
            }
            y++;
        }
        return numCruzamento;
    }

    public static void main(String[] args) {
        try {
            int numeroLinhas = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de linhas: "));
            int[] eixoY = new int[numeroLinhas];
            int[] eixoX = new int[numeroLinhas];

            for (int i = 0; i < eixoX.length; i++) {
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da posição " + (i + 1) + " no eixo X:"));
                eixoX[i] = numero;
                eixoY[i] = numero;
            }

            Arrays.sort(eixoY);

            JOptionPane.showMessageDialog(null, cruzamentos(eixoY, eixoX));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
