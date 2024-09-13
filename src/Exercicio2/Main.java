package Exercicio2;

public class Main {
    public static void main(String[] args) {

        //Criando objetos veiculo
        Veiculo corsa = new Veiculo("Chevrolet","Corsa A", 2020);
        Veiculo uno = new Veiculo("Fiat","mille", 2021);

        MeusCarros meusCarros = new MeusCarros();

        meusCarros.adicionarCarros(corsa);
        meusCarros.adicionarCarros(uno);

        uno.ligar();
    }
}
