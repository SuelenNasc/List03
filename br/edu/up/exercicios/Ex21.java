package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Nadador;

public class Ex21 {
    
    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do nadador:");
        int idade = scanner.nextInt();

        String categoria = Nadador.classificarNadador(idade);

        System.out.println("Categoria do nadador: " + categoria);

        scanner.close();
    }
}