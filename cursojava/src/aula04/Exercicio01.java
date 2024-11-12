package aula04;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe uma idade");
        int idade = sc.nextInt();
        boolean maioridade = idade >= 18;


        if(idade >= 18){
            System.out.println("Idade permitida: " + maioridade );
        }else{
            System.out.println("Idade não permitida: " + maioridade);
        }


    }
}
