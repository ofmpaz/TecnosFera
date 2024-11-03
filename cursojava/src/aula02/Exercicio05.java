package aula02;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        //Criar um programa para calcular a área de um retângulo com base na altura e largura fornecidas.

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe altura e largura");

        int largura = sc.nextInt();
        int altura = sc.nextInt();
        int resultado = largura * altura;

        System.out.println("A área do retângulo é: " + resultado);
    }
}
