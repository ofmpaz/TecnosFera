package aula03;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        /*Escreva um programa que pergunte ao usuário uma temperatura em Celsius (tipo double)
            e a converta para Fahrenheit usando a fórmula:
           fahrenheit=(celsius×9/5)+32\text{fahrenheit} = (\text{celsius} \times 9/5) +
           32fahrenheit=(celsius×9/5)+32*/

        Scanner sc = new Scanner(System.in);

        double temperaturaC;
        double temperaturaF;

        System.out.println("Informe a temperatura em C");
        temperaturaC = sc.nextDouble();

        temperaturaF = (temperaturaC * 9 / 5) + 32;

        System.out.println("A temperatura convertida é: " + temperaturaF);


    }
}
