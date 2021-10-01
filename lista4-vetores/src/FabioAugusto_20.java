import javax.swing.*;

public class FabioAugusto_20 {

    /* Fábio Augusto Araújo Santos */

    static class DadosBanco {
        String nome;
        int numConta;
        double saldo;
    }

    static DadosBanco[] criarVetor() {
        DadosBanco[] aux = new DadosBanco[1];
        try {
            for (int i = 0; i < aux.length; i++) {
                DadosBanco dados = new DadosBanco();
                dados.nome = JOptionPane.showInputDialog("Informe o nome: ");
                dados.numConta = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da conta: "));
                dados.saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo da conta: "));
                aux[i] = dados;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!");
        }
        return aux;
    }

    static void efetuarDeposito(DadosBanco[] aux) {
        try {
            int numConta = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da conta para o deposito: "));
            boolean error = true;
            for (DadosBanco dadosBanco : aux) {
                if (dadosBanco.numConta == numConta) {
                    dadosBanco.saldo += Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do deposito: "));
                    JOptionPane.showMessageDialog(null, "----- DADOS USUÁRIO -----" +
                            "\nNome: " + dadosBanco.nome +
                            "\nNúmero da conta: " + dadosBanco.numConta +
                            "\nSaldo: " + dadosBanco.saldo);
                    error = false;
                }
            }
            if (error) {
                JOptionPane.showMessageDialog(null, "Conta não encontrada!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!");
        }
    }

    static void efetuarSaque(DadosBanco[] aux) {
        try {
            int numConta = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da conta para o saque: "));
            boolean error = true;
            for (DadosBanco dadosBanco : aux) {
                if (dadosBanco.numConta == numConta) {
                    double saque = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do saque: "));
                    if (saque > dadosBanco.saldo) {
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
                    } else {
                        dadosBanco.saldo -= saque;
                        JOptionPane.showMessageDialog(null, "----- DADOS USUÁRIO -----" +
                                "\nNome: " + dadosBanco.nome +
                                "\nNúmero da conta: " + dadosBanco.numConta +
                                "\nSaldo: " + dadosBanco.saldo);
                    }
                    error = false;
                }
            }
            if (error) {
                JOptionPane.showMessageDialog(null, "Conta não encontrada!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!");
        }
    }

    static void consultarSaldo(DadosBanco[] aux) {
        try {
            int numConta = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da conta para consultar o saldo: "));
            boolean error = true;
            for (DadosBanco dadosBanco : aux) {
                if (dadosBanco.numConta == numConta) {
                    JOptionPane.showMessageDialog(null, "----- DADOS USUÁRIO -----" +
                            "\nNome: " + dadosBanco.nome +
                            "\nNúmero da conta: " + dadosBanco.numConta +
                            "\nSaldo: " + dadosBanco.saldo);
                    error = false;
                }
            }
            if (error) {
                JOptionPane.showMessageDialog(null, "Conta não encontrada!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!");
        }
    }

    public static void main(String[] args) {
        try {
            DadosBanco[] pessoas = criarVetor();
            int options;
            while (true) {
                options = Integer.parseInt(JOptionPane.showInputDialog("Menu de Operações" +
                        "\n1. Efetuar depósito" +
                        "\n2. Efetuar saque" +
                        "\n3. Consultar saldo em conta" +
                        "\n4. Finalizar o programa"));
                if (options == 1) {
                    efetuarDeposito(pessoas);
                } else if (options == 2) {
                    efetuarSaque(pessoas);
                } else if (options == 3) {
                    consultarSaldo(pessoas);
                } else if (options == 4) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Informe somente valores da lista!");
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
