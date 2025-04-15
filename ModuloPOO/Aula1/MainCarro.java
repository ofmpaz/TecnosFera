package Aula1;

public class MainCarro {

    public static void main(String[] args) {
        Carro carroVeloz = new Carro();

        carroVeloz.setAno(2000);
        carroVeloz.setCor("Vermelho");
        carroVeloz.setPlaca("FDSFDS78978");

        System.out.println("Esse é meu novo carro: Ano: " + carroVeloz.getAno() + " Placa: " + carroVeloz.getPlaca() + " Cor: " + carroVeloz.getCor());
        carroVeloz.acelerar();
        carroVeloz.desacelerar();
        carroVeloz.freiar();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------");

        Carro carroDeMaria = new Carro();
        carroDeMaria.setAno(2025);
        carroDeMaria.setCor("Rosa");
        carroDeMaria.setPlaca("DM123456");

        System.out.println("Carro de Maria: Ano: " + carroDeMaria.getAno() + " Placa: " + carroDeMaria.getPlaca() + " Cor: " + carroDeMaria.getCor());


    }
}
