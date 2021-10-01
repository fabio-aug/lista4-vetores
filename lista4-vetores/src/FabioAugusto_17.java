import javax.swing.*;

public class FabioAugusto_17 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            int[] primosTradicional = new int[25];
            int count = 0, erros = 0;
            StringBuilder t = new StringBuilder("Primos Tradicional:\n[ ");
            long tempoTradicional = System.currentTimeMillis();
            for (int i = 1; i < 100; i++) {
                boolean primo = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        primo = false;
                        break;
                    }
                }
                if (primo) {
                    primosTradicional[count] = i;
                    if (count == 24) {
                        if (erros == 0) {
                            t.append(primosTradicional[count]).append(", ");
                            erros++;
                        } else {
                            t.append(primosTradicional[count]).append(" ]\nTempo total: ").append(System.currentTimeMillis() - tempoTradicional).append(" milissegundos");
                        }
                    } else {
                        t.append(primosTradicional[count]).append(", ");
                    }
                    if (count < 24) {
                        count++;
                    }
                }
            }

            boolean[] aux = new boolean[101];
            StringBuilder c = new StringBuilder("\n\nPrimos Crivo:\n[ ");
            long tempoCrivo = System.currentTimeMillis();
            for (int i = 0; i < 100; i++) {
                aux[i] = true;
            }
            int num = (int) Math.floor(Math.sqrt(aux.length));
            for (int i = 2; i < num; i++) {
                if (aux[i]) {
                    for (int j = i; i * j <= 100; j++) {
                        aux[i * j] = false;
                    }
                }
            }
            for (int i = 1; i < aux.length; i++) {
                if (aux[i]) {
                    if (i == 97) {
                        c.append(i).append(" ]\nTempo total: ").append(System.currentTimeMillis() - tempoCrivo).append(" milissegundos");
                    } else {
                        c.append(i).append(", ");
                    }
                }
            }
            JOptionPane.showMessageDialog(null, t.toString() + c);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
