# Q2

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 6, contadorImpar = 0, contadorPar = 0;
        int[] parImpar = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Escreva 6 numeros: ");
            parImpar[i] = scan.nextInt();

            if (parImpar[i] % 2 == 0) {
                contadorPar++;
            } else {
                contadorImpar++;
            }
        }
        System.out.println("\n\n====PARES====");
        for (int i = 0; i < n; i++) {
            if (parImpar[i] % 2 == 0) {
                System.out.println(parImpar[i]);
            }
        }
        System.out.println("==== " + contadorPar + " Numeros pares====");
        System.out.println("\n\n====IMPARES====");
        for (int i = 0; i < n; i++) {
            if (parImpar[i] % 2 != 0) {
                System.out.println(parImpar[i]);
            }
        }
        System.out.println("==== " + contadorImpar + " Numeros Impares ====");

    }
}
