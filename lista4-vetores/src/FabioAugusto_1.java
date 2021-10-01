import javax.swing.*;

public class FabioAugusto_1 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            String[] nome = new String[40];
            int[] idade = new int[40];
            double media = 0;
            int maior16 = 0, menor16 = 0, idadeMenor = 0, idadeMaior = 0;
            String nomeMenor = "";
            String nomeMaior = "";
            StringBuilder alunosAcimaMedia = new StringBuilder();
            for (int i = 0; i < idade.length; i++) {
                nome[i] = JOptionPane.showInputDialog(null, "Informe o nome do aluno " + (i + 1) + ":");
                idade[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a nota do aluno " + (i + 1) + ":"));
                media += idade[i];
                if (idade[i] < 16) {
                    menor16++;
                } else {
                    maior16++;
                }
                if (i == 0) {
                    nomeMenor = nome[i];
                    nomeMaior = nome[i];
                    idadeMaior = idade[i];
                    idadeMenor = idade[i];
                } else {
                    if (idade[i] < idadeMenor) {
                        idadeMenor = idade[i];
                        nomeMenor = nome[i];
                    } else if (idade[i] > idadeMaior) {
                        idadeMaior = idade[i];
                        nomeMaior = nome[i];
                    }
                }
            }
            media = (media / idade.length);
            for (int i = 0; i < idade.length; i++) {
                if (idade[i] > media) {
                    alunosAcimaMedia.append("\nNome aluno: ").append(nome[i]).append(" - Idade: ").append(idade[i]);
                }
            }
            JOptionPane.showMessageDialog(null, "Total de alunos com a idade menor que 16: " + menor16 +
                    "\nTotal de alunos com a idade maior que 16: " + maior16 +
                    "\nMédia das idades: " + media +
                    "\nAlunos com idade acima da média:" + alunosAcimaMedia +
                    "\nAluno mais velho - Nome: " + nomeMaior + " - Idade: " + idadeMaior +
                    "\nAluno mais novo - Nome: " + nomeMenor + " - Idade: " + idadeMenor);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
