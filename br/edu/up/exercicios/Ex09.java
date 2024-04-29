package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.VerificadorIntervalo;

public class Ex09 {

    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[80];

        for (int i = 0; i < 80; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int quantidadeNoIntervalo = VerificadorIntervalo.contarNumerosNoIntervalo(numeros);

        System.out.println("Quantidade de números no intervalo entre 10 e 150 (inclusive): " + quantidadeNoIntervalo);

        scanner.close();
    }
}
