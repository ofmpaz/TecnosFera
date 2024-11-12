package aula04;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número");
        int numero = sc.nextInt();

        if((numero % 3 == 0) && (numero % 5 == 0)){
            System.out.println("O número: " + numero + " é multiplo");
        }else {
            System.out.println("O número: " + numero + " não é multiplo");
        }

    }
}
