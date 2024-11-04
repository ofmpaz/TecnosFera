package aula03;

public class Exercicio01 {

    public static void main(String[] args) {

        /*Descrição: Crie um programa que declare uma variável double para armazenar um valor
        decimal, como 10.5. Em seguida, converta esse valor para int e float,
        exibindo os resultados. Observe a diferença entre os valores antes e depois da conversão.
         */

        double valor = 10.5;
        System.out.println(valor);

        int valorInteiro = (int) valor;
        System.out.println(valorInteiro);
        float valorFloat = (float) valor;
        System.out.println(valorFloat);
    }
}
