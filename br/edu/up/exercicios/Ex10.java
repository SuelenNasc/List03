package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.VerificadorIdade;

public class Ex10 {

    public static void executar () {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite o número de pessoas: ");
        int numeroPessoas = scanner.nextInt();

        for (int i = 1; i <= numeroPessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

            String mensagem = VerificadorIdade.verificarMaioridade(idade);

            System.out.println(mensagem);
        }

        scanner.close();
    }
}
