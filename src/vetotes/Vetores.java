package vetotes;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        double[] vetor = new double[n];

        System.out.println("valor nota");
        for (int i = 0; i <3; i++){
            vetor[i] = sc.nextDouble();
        }
        double soma = 0.0;
        for (int i = 0; i < 3; i++){
            soma =+ vetor[i];
        }
        double media = soma/n;
        System.out.println("A media é:" + soma);
    }
}
