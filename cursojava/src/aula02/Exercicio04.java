package aula02;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        /*Criar um programa que exiba algumas informações pessoais, como nome, idade e cidade.
          Crie uma classe chamada InformacoesPessoais.
          Declare variáveis nome (String), idade (int) e cidade (String).
          Exiba essas informações no console.*/

        String nome;
        int idade;
        String cidade;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu seu nome, idade e cidade em que mora.");

        nome = sc.nextLine();
        idade = sc.nextInt();
        sc.nextLine();
        cidade = sc.nextLine();

        System.out.println("Seu nome é: " + nome + ", sua idade é: " + idade + " e você mora em: " + cidade);


    }
}
