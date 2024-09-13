package Exercicio1;

public class Produto {
    //Atributos
    String name;
    double valor;
    String descricao;


    //Construtor
    public Produto(String name, double valor, String descricao) {
        this.name = name;
        this.valor = valor;
        this.descricao = descricao;
    }

    public String toString() { //Fizemos isso para que não retorne o local da memória e sim o valor
        return "Nome " + name + " Valor: " + valor + " Descrição: " + descricao;
    }
}
