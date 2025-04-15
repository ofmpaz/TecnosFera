package Aula1;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;

    public void andar(String andando){
        System.out.println("Andando: "+ andando);
    }

    public void dormir(String dormir){
        System.out.println("Dormir: "+ dormir);
    }

    public void acordar(String acordar){
        System.out.println("Acordar: "+ acordar);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
