package main.java.list.OperacoesBasicas.Exercicio;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("PS5", 4000.0, 5);
        carrinho.adicionarItem("PS5", 3500.0, 4);
        carrinho.adicionarItem("Xbox Series S", 2700.0, 10);
        carrinho.adicionarItem("Nintendo Switch", 2000.0, 5);

        carrinho.exibirItens();

        carrinho.removerItem("PS5");

        carrinho.exibirItens();

        System.out.println(String.format("\nO valor total dos itens é R$ %.2f", carrinho.calcularValorTotal()));
    }
}
