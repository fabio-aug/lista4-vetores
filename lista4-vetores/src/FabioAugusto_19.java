import javax.swing.*;

public class FabioAugusto_19 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            int[] valores = new int[10];
            for (int i = 0; i < valores.length; i++) {
                valores[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor inteiro: "));
            }
            boolean continuar = true;
            while (continuar) {
                int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor para pesquisar: "));
                boolean presente = false;
                int posicao = 0;
                for (int i = 0; i < valores.length; i++) {
                    if (valores[i] == num) {
                        presente = true;
                        posicao = i;
                        break;
                    }
                }
                if (presente) {
                    JOptionPane.showMessageDialog(null, "Valor " + num + " está na posição " + posicao + " no vetor");
                } else {
                    JOptionPane.showMessageDialog(null, "Valor " + num + " não está presente no vetor");
                }
                int aux = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja continuar?\n1 - Sim\n0 - Não"));
                if (aux == 0) {
                    continuar = false;
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
