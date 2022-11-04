package array;

import java.util.Random;

public class q3 {
    public static void main(String[] args) {
        Random ran = new Random();

        int n = 121, menor = 9999999, maior = 0, media = 0;
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = ran.nextInt(26) + 15;

            if (menor > temp[i]) {
                menor = temp[i];
            }
            if (maior < temp[i]) {
                maior = temp[i];
            }
            media += temp[i];
        }
        System.out.println("\n\nA menor temperatura foi: " + menor);
        System.out.println("A maior temperatura foi: " + maior);
        System.out.println("A media das temperaturas foi: " + media / n);

    }
}
