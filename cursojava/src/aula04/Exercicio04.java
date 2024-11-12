package aula04;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira número inteiro");

        int numero = sc.nextInt();

        if((numero % 2 == 0) || (numero >= 0 )){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
