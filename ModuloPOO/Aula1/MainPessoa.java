package Aula1;

public class MainPessoa {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Maria");
        p1.setIdade(18);
        p1.setAltura(1.54);
        p1.setSobrenome("Andrade");

        p1.acordar("Acorda às 6h");
        p1.andar("Anda rápido");
        p1.dormir("Dorme às 21h");
        System.out.println("---------------------------------------------------");
        Pessoa p2 = new Pessoa();
        p2.dormir("às 23h");
        p2.andar("anda devagar");
        p2.acordar("às 12h");
    }
}

