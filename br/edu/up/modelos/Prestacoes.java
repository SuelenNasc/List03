package br.edu.up.modelos;
import java.util.Scanner;

public class Prestacoes {
    private double valorCompra;

    public Prestacoes(double valorCompra) {
        this.valorCompra = valorCompra;
    }
    
    public double calcularValorPrestacao() {
        return valorCompra / 5;
    }
}
