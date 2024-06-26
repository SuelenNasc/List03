package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.CalculoPesoIdeal;

public class Ex23 {
    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa:");
        String nome = scanner.nextLine();

        System.out.println("Digite o sexo da pessoa (M/F):");
        char sexo = scanner.next().charAt(0);

        System.out.println("Digite a altura da pessoa (em metros):");
        double altura = scanner.nextDouble();

        System.out.println("Digite a idade da pessoa:");
        int idade = scanner.nextInt();

        double pesoIdeal = CalculoPesoIdeal.calcularPesoIdeal(sexo, altura, idade);
        System.out.println("O peso ideal de " + nome + " é: " + pesoIdeal + " kg");

        scanner.close();
    }
}