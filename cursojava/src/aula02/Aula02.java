package aula02;

import java.util.Scanner;

public class Aula02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe dois números para serem somados");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int soma = numero1 + numero2;
        System.out.println(soma);


    }
}
