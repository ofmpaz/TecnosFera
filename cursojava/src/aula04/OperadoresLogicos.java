package aula04;

import java.util.Scanner;

public class OperadoresLogicos {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       int a = sc.nextInt();
       int b = sc.nextInt();

        if(!(a > 8 && b > 8)) { /*sim*/
            System.out.println("Meu número está acima de 6");
        }
        else{ /*Não*/
            System.out.println("Meu número está abaixo de 6");
        }
    }
}
