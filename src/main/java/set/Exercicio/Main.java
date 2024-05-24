package main.java.set.Exercicio;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Comprar pão");
        listaTarefas.adicionarTarefa("Jogar o lixo fora");
        listaTarefas.adicionarTarefa("Fazer o almoço");
        listaTarefas.adicionarTarefa("Levar o cachorro para passear");

        System.out.println("TAREFAS CADASTRADAS: ");
        listaTarefas.listarTarefas();

        System.out.println("\nTAREFAS COM REMOÇÃO: ");
        listaTarefas.removerTarefa("jogar o lixo fora");
        listaTarefas.listarTarefas();

        System.out.println("\nTAREFAS COM 1 FEITA: ");
        listaTarefas.mudarStatusTarefa("comprar pão");
        listaTarefas.listarTarefas();

        System.out.println("\nTAREFAS ORDENADAS POR DESCRIÇÃO: ");
        Set<Tarefa> listaOrdanadaDesc = listaTarefas.ordenarPorDescricao();
        System.out.println(listaOrdanadaDesc);

        System.out.println("\nTAREFAS ORDENADAS POR STATUS: ");
        Set<Tarefa> listaOrdenadaStatus = listaTarefas.ordenarPorStatus();
        System.out.println(listaOrdenadaStatus);

        System.out.println("\nTAREFAS EXCLUÍDAS: ");
        listaTarefas.limparListaTarefas();
        listaTarefas.listarTarefas();
    }
}
