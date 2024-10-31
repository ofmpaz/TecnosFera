package aula02;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {


    /*Objetivo: Escrever um programa que exiba uma saudação personalizada usando uma
    variável para o nome.
    Declare uma variável String chamada nome e atribua um nome a ela.
    Exiba a mensagem de saudação no console.*/

        Scanner sc = new Scanner(System.in);
        //String nome = "Maria";

        System.out.println("Olá, qual é o seu nome?");
        String nome2 = sc.nextLine();

        System.out.println("Bom dia, seja bem vindo(a): " + nome2);


    }

}
