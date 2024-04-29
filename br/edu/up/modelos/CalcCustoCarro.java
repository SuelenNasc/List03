package br.edu.up.modelos;
import java.util.Scanner;

public class CalcCustoCarro {
    
    public static double calcularCustoConsumidor(double custoFabrica) {
       
        double porcentagemDistribuidor = 0.28;
        double porcentagemImpostos = 0.45;

        double impostos = custoFabrica * porcentagemImpostos;

        return custoFabrica + impostos + (custoFabrica * porcentagemDistribuidor);
        
    }
}