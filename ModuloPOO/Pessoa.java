public class Pessoa {

    private String nome;
    private int idade;
    private String corDoCabelo;
    private double altura;
    private double peso;

    public Pessoa(){

    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
    }

    public void andar() {

    }

    public void falar(){

    }

    public void dormir(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCorDoCabelo() {
        return corDoCabelo;
    }

    public void setCorDoCabelo(String corDoCabelo) {
        this.corDoCabelo = corDoCabelo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
