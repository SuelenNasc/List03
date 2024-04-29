package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.CalcPrecoProduto;

public class Ex06 {

    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço de custo do produto: ");
        double precoCusto = scanner.nextDouble();

        System.out.print("Digite o percentual de lucro desejado (%): ");
        double percentualLucro = scanner.nextDouble();

        double precoVenda = CalcPrecoProduto.calcularPrecoVenda(precoCusto, percentualLucro);

        System.out.println("O preço de venda do produto é: R$ " + String.format("%.2f", precoVenda));

        scanner.close();
    }
}
