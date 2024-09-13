package Exercicio2;

public class Veiculo {
    String marca;
    String modelo;
    int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar (){
        System.out.println("O carro da marca: " + marca + ", modelo: " + modelo + ", ano: " + ano + "\n" + "Está ligado");
    }

    public String desligar(){
        return "Desligado";
    }

    public String toString() {
        return "O carro da marca: " + marca + ", modelo: " + modelo + ", ano: " + ano + "\n";
    }
}
