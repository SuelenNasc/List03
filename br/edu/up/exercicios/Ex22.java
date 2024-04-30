package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.ContaLuzCalculadora;

public class Ex22 {

    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tipo de cliente (1 - Residência, 2 - Comércio, 3 - Indústria):");
        int tipoCliente = scanner.nextInt();

        System.out.println("Digite a quantidade de kWh consumidos:");
        double kWhConsumidos = scanner.nextDouble();

        double valorConta = ContaLuzCalculadora.calcularContaLuz(tipoCliente, kWhConsumidos);
        System.out.println("Valor da conta de luz: R$" + valorConta);

        scanner.close();
    }
}