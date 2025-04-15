public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Maria");
        pessoa1.setIdade(25);
        pessoa1.setAltura(1.56);
        pessoa1.setCorDoCabelo("Castanho");
        pessoa1.setPeso(53.0);

        pessoa1.andar();
        pessoa1.dormir();
        pessoa1.falar();

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Altura: " + pessoa1.getAltura());
        System.out.println("Cor do cabelo: " + pessoa1.getCorDoCabelo());
        System.out.println("Peso: " + pessoa1.getPeso());
    }
}