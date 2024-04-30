package br.edu.up;
import java.util.Scanner;

import br.edu.up.exercicios.Ex01;
import br.edu.up.exercicios.Ex02;
import br.edu.up.exercicios.Ex03;
import br.edu.up.exercicios.Ex04;
import br.edu.up.exercicios.Ex05;
import br.edu.up.exercicios.Ex06;
import br.edu.up.exercicios.Ex07;
import br.edu.up.exercicios.Ex08;
import br.edu.up.exercicios.Ex09;
import br.edu.up.exercicios.Ex10;
import br.edu.up.exercicios.Ex11;
import br.edu.up.exercicios.Ex12;
import br.edu.up.exercicios.Ex13;
import br.edu.up.exercicios.Ex14;
import br.edu.up.exercicios.Ex15;
import br.edu.up.exercicios.Ex16;
import br.edu.up.exercicios.Ex17;
import br.edu.up.exercicios.Ex18;
import br.edu.up.exercicios.Ex19;
import br.edu.up.exercicios.Ex20;
import br.edu.up.exercicios.Ex21;
import br.edu.up.exercicios.Ex22;
import br.edu.up.exercicios.Ex23;
import br.edu.up.exercicios.Ex24;
import br.edu.up.exercicios.Ex25;
import br.edu.up.exercicios.Ex26;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira o número do exercicio: ");
        int a = scanner.nextInt();

    switch (a) {
        case 1:
            Ex01.executar();
            break;
        case 2:
            Ex02.executar();
            break;
        case 3:
            Ex03.executar();
            break;
        case 4:
            Ex04.executar();
            break;
        case 5:
            Ex05.executar();
            break;
        case 6:
            Ex06.executar();
            break;
        case 7:
            Ex07.executar();
            break;
        case 8:
            Ex08.executar();
            break;
        case 9:
            Ex09.executar();
            break;
        case 10:
            Ex10.executar();
            break;
        case 11:
            Ex11.executar();
            break;
        case 12:
            Ex12.executar();
            break;
        case 13:
            Ex13.executar();
            break;
        case 14:
            Ex14.executar();
            break;
        case 15:
            Ex15.executar();
            break;
        case 16:
            Ex16.executar();
            break;
        case 17:
            Ex17.executar();
            break;
        case 18:
            Ex18.executar();
            break;
        case 19:
            Ex19.executar();
            break;
        case 20:
            Ex20.executar();
            break;
        case 21:
            Ex21.executar();
            break;
        case 22:
            Ex22.executar();
            break;
        case 23:
            Ex23.executar();
            break;
        case 24:
            Ex24.executar();
            break;
        case 25:
            Ex25.executar();
            break;
        case 26:
            Ex26.executar();
            break;
                default:    
            System.out.println("Exercicio não encontrado.");
            break;
        }
        scanner.close();
    }
}