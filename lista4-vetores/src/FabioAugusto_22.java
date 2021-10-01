import javax.swing.*;

public class FabioAugusto_22 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            int tamanhoFita = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho da fita: "));
            int quantidadeGotas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de gotas do reagente: "));
            int countDias = 0, countLimpo = 0;
            boolean[] fita = new boolean[tamanhoFita];
            for (int i = 0; i < quantidadeGotas; i++) {
                int gota = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição da gota" + (i + 1) + ": "));
                while (gota > tamanhoFita) {
                    gota = Integer.parseInt(JOptionPane.showInputDialog("Informe uma posição válida de 0 até " + tamanhoFita + ": "));
                }
                fita[gota - 1] = true;
            }
            while (countLimpo == 0) {
                int countArray = 0;
                while (countArray < fita.length) {
                    if (fita[countArray]) {
                        if (countArray == 0) {
                            if (!fita[countArray + 1]) {
                                fita[countArray + 1] = true;
                                countArray++;
                            }
                        } else if (countArray == (fita.length - 1)) {
                            if (!fita[countArray - 1]) {
                                fita[countArray - 1] = true;
                            }
                        } else {
                            if (!fita[countArray - 1]) {
                                fita[countArray - 1] = true;
                            }
                            if (!fita[countArray + 1]) {
                                fita[countArray + 1] = true;
                                countArray++;
                            }
                        }
                    }
                    countArray++;
                }
                for (boolean reagente : fita) {
                    if (!reagente) {
                        countLimpo = 0;
                        break;
                    } else {
                        countLimpo = 1;
                    }
                }
                countDias++;
            }
            JOptionPane.showMessageDialog(null, "Total de dias necessários: " + countDias);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
