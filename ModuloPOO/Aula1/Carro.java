package Aula1;

public class Carro {

    private int ano;
    private String placa;
    private String cor;

    public void acelerar(){
        System.out.println("Acelerando");
    }
    public void desacelerar(){
        System.out.println("Desacelerando");
    }

    public void freiar(){
        System.out.println("Freiando");
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
