package Exercicio1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Criando objetos Exercicio1.Produto
        Produto camiseta = new Produto("Camiseta Nike", 59.90, "Camiseta em algodão premium");
        Produto calca = new Produto("Calça Jogger", 109.90, "Calça do momento");
        Produto bone = new Produto("Bone Nike", 39.90, "Perfeito para dias de sol");

        //Criando o objeto CarrinhoDeCompras
        CarrinhoDeCompras meucarrinho = new CarrinhoDeCompras();

        //Adicionando produtos ao carrinho
        meucarrinho.adicionarAoCarrinho(camiseta);
        meucarrinho.adicionarAoCarrinho(calca);
        meucarrinho.adicionarAoCarrinho(bone);


        System.out.println("Produtos do meu carrinho:");
        meucarrinho.testar();
    }
}