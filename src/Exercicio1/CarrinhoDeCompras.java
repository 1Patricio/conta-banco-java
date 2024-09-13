package Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> listaProdutos; //Lista de produtos no carrinho
    public double valorTotal;

    // Constructor
    public CarrinhoDeCompras() {
        listaProdutos = new ArrayList<> ();
        valorTotal = 0.0;
    }


    void  adicionarAoCarrinho (Produto produto) {
        listaProdutos.add(produto);
        valorTotal += produto.valor;
    }

    public double getTotal () {
        return valorTotal; //Como no adicionar ao carrinho ele já atualiza o valor aqui vamos apenas retornar
    }

    public void testar(){
        for (Produto produto : listaProdutos) { //produto in produtos
            System.out.println(produto); //Imprima produto na posição que está na lista
        }
    }
}
