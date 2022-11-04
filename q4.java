package array;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, opcao = 1, i = 0;
        String nomeAcha;

        System.out.println("Quantos nomes você quer que o prorama receba?\n> ");
        n = scan.nextInt();
        String[] nome = new String[n];

        while (opcao != 0) {
            System.out.println("\n====== MENU ======\n");
            System.out.println("1) Cadastrar nome\n2) Pesquisar nome\n3) Listar todos os nomes\n0) Sair do programa");
            opcao = scan.nextInt();
            if (opcao == 0) {
            } else {
                if (opcao == 1) {
                    for (i = 0; i < n; i++) {
                        System.out.println(i + "° nome - Digite seu nome: ");
                        nome[i] = scan.next();
                    }
                }
                if (opcao == 2) {
                    System.out.println("Qual a numeração do nome que deseja?\n> ");
                    i = scan.nextInt();
                    if (i < n) {
                        System.out.println("O nome que você deseja é: " + nome[i]);
                    } else {
                        System.out.println("O numero procurado não tem nome atribuido...Tente novamente");
                    }
                }
                if (opcao == 3) {
                    for (i = 0; i < n; i++) {
                        System.out.println(i + "° Nome: " + nome[i] + "\n");
                    }
                }
            }
        }
    }
}
