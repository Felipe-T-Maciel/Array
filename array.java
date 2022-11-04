import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 1, n = 11;
        double menorValor = 9999999, maiorValor = 0, totalVendas = 0;
        String[] nome = new String[n];
        double[] vendas = new double[n];
        double[] comissao = new double[n];

        for (i = 1; i < n; i++) {
            System.out.println("\n\n\n");
            System.out.println("======" + i + "º VENDEDOR======\n");
            System.out.println("O total da suas vendas: ");
            vendas[i] = scan.nextDouble();
            System.out.println("Seu percentual de comissão: ");
            comissao[i] = scan.nextDouble();
            System.out.println("O seu nome: ");
            nome[i] = scan.next();
            comissao[i] = vendas[i] * (comissao[i] / 100);

            if (menorValor > comissao[i]) {
                menorValor = comissao[i];
            }
            if (maiorValor < comissao[i]) {
                maiorValor = comissao[i];
            }
            totalVendas += vendas[i];
        }

        for (i = 1; i < n; i++) {
            if (menorValor == comissao[i]) {
                System.out.println("O vendedor " + nome[i] + " foi o que menos recebeu: " + comissao[i] + "\n");
            }
            if (maiorValor == comissao[i]) {
                System.out.println("O vendedor " + nome[i] + " foi o que mais recebeu: " + comissao[i] + "\n");
            }
        }
        for (i = 1; i < n; i++) {
            System.out.println("O vendedor " + nome[i] + " recebe " + comissao[i] + "\n");
        }
        System.out.println("O total de vendas foi: " + totalVendas);
    }
}
