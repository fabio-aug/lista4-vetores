import javax.swing.*;

public class FabioAugusto_24 {

    /* Fábio Augusto Araújo Santos */

    static class Flecha {
        int eixoX;
        int eixoY;
    }

    public static void main(String[] args) {
        try {
            int tiros = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de tiros ao alvo: "));
            Flecha[] alvo = new Flecha[tiros];
            int penalidade = 0, countPenalidade = 0, decrescente = 0;
            Flecha flechaDecrescente = new Flecha();
            for (int i = 0; i < alvo.length; i++) {
                Flecha tiro = new Flecha();
                tiro.eixoX = Math.abs(Integer.parseInt(JOptionPane.showInputDialog("Informe a posição da flecha " + (i + 1) + " no eixo X: ")));
                tiro.eixoY = Math.abs(Integer.parseInt(JOptionPane.showInputDialog("Informe a posição da flecha " + (i + 1) + " no eixo Y: ")));
                alvo[i] = tiro;
                if (i != 0) {
                    for (int j = (i - 1); j >= 0; j--) {
                        if (alvo[j].eixoX <= alvo[i].eixoX && alvo[j].eixoY <= alvo[i].eixoY) {
                            countPenalidade++;
                        }
                    }
                    if (alvo[i].eixoX < flechaDecrescente.eixoX && alvo[i].eixoY < flechaDecrescente.eixoY) {
                        flechaDecrescente.eixoX = alvo[i].eixoX;
                        flechaDecrescente.eixoY = alvo[i].eixoY;
                        decrescente++;
                    }
                } else {
                    flechaDecrescente.eixoX = alvo[i].eixoX;
                    flechaDecrescente.eixoY = alvo[i].eixoY;
                }
                penalidade += countPenalidade;
                countPenalidade = 0;
                if (i == (alvo.length - 1)) {
                    if (decrescente == (alvo.length - 1)) {
                        penalidade = 0;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, penalidade);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!");
        }
    }
}
