package aula03;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float altura;
        float largura;

        System.out.println("Insera altura e largura");

        altura = sc.nextFloat();
        largura = sc.nextFloat();

        float perimetro = (2 * (largura + altura));

        System.out.println("A área do perímetro é: " + perimetro);

    }
}
