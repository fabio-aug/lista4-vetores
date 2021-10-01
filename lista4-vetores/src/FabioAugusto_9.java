import javax.swing.*;

public class FabioAugusto_9 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            double[] altura = new double[5];
            int[] sexo = new int[5];
            double menorTurma = 0, maiorTurma = 0, mediaTurma = 0, mediaHomem = 0, mediaMulher = 0;
            int countHomem = 0, countMulher = 0;
            StringBuilder p1 = new StringBuilder("\nAltura abaixo da média da turma:\n");
            StringBuilder p2 = new StringBuilder("Mulheres com altura acima da média da altura dos homens:\n");
            StringBuilder p3 = new StringBuilder("Homens com altura abaixo da média da altura das mulheres:\n");
            for (int i = 0; i < altura.length; i++) {
                altura[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura: "));
                sexo[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o sexo:\n1 - Masculino\n0 - Feminino"));
                if (i == 0) {
                    menorTurma = altura[i];
                    maiorTurma = altura[i];
                } else {
                    if (altura[i] > maiorTurma) {
                        menorTurma = altura[i];
                    } else if (altura[i] < menorTurma) {
                        maiorTurma = altura[i];
                    }
                }
                mediaTurma += altura[i];
                if (sexo[i] == 1) {
                    mediaHomem += altura[i];
                    countHomem++;
                } else {
                    mediaMulher += altura[i];
                    countMulher++;
                }
            }
            mediaTurma = (mediaTurma / altura.length);
            mediaHomem = (countHomem == 0) ? mediaHomem : (mediaHomem / countHomem);
            mediaMulher = (countMulher == 0) ? mediaMulher : (mediaMulher / countMulher);
            for (int i = 0; i < altura.length; i++) {
                if (altura[i] < mediaTurma) {
                    if (sexo[i] == 1) {
                        p1.append("Aluno ").append(i + 1).append(" - Altura: ").append(altura[i]).append("\n");
                    } else {
                        p1.append("Aluna ").append(i + 1).append(" - Altura: ").append(altura[i]).append("\n");
                    }
                }
                if (sexo[i] == 0 && altura[i] > mediaHomem) {
                    p2.append("Aluna ").append(i + 1).append(" - Altura: ").append(altura[i]).append("\n");
                }
                if (sexo[i] == 1 && altura[i] > mediaMulher) {
                    p3.append("Aluno ").append(i + 1).append(" - Altura: ").append(altura[i]).append("\n");
                }
            }
            JOptionPane.showInputDialog(null, "Menor altura da turma: " + menorTurma +
                    "\nMaior altura da turma: " + maiorTurma +
                    "\nMédia de altura da turma: " + mediaTurma + p1 + p2 + p3);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
