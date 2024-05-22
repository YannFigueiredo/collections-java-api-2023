package main.java.list.OperacoesBasicas.Exercicio;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int qtde) {
        itemList.add(new Item(nome, preco, qtde));
    }

    public void removerItem(String name) {
        List<Item> itemRemoveList = new ArrayList<>();

        for(Item item : itemList) {
            if(item.getNome().equals(name)) {
                itemRemoveList.add(item);
            }
        }

        itemList.removeAll(itemRemoveList);
    }

    public double calcularValorTotal() {
        double soma = 0;

        for(Item item : itemList) {
            soma += item.getPreco()*item.getQuantidade();
        }

        return soma;
    }

    public void exibirItens() {
        System.out.println("\nItens da lista: " + itemList);
    }
}
