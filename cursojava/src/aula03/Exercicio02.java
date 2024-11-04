package aula03;

public class Exercicio02 {

    public static void main(String[] args) {

        int num1 = 15;
        double num2 = 7.5;
        float num3 = 3.2f;

        double resultado;
        int resultado1;

        resultado = num1 + num2;

        resultado1 = num1 + (int) num2;


        resultado = num1 * num3;

        resultado1 = num1 * (int) num3;


        resultado = (num1 / num3) + num2;
        System.out.println(resultado);
        resultado1 = (num1 / (int) num3) + (int) num2;
        System.out.println(resultado1);
    }
}
