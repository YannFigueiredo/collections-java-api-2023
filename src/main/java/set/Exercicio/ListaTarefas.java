package main.java.set.Exercicio;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListaTarefas {
    Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;

        if(!this.tarefaSet.isEmpty()) {
            for(Tarefa tarefa : tarefaSet) {
                if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = tarefa;
                    break;
                }
            }

            this.tarefaSet.remove(tarefaParaRemover);
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void mostrarTarefas() {
        System.out.println(this.tarefaSet);
    }

    public void listarTarefas() {
        if(!this.tarefaSet.isEmpty()) {
            for(Tarefa tarefa : tarefaSet) {
                String status = tarefa.getDone() ? "Concluída" : "Pendente";
                System.out.println("Tarefa: " + tarefa.getDescricao() + " | Status: " + status);
            }
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        if(!this.tarefaSet.isEmpty()) {
            for(Tarefa tarefa : tarefaSet) {
                if(tarefa.getDone())
                    tarefasConcluidas.add(tarefa);
            }
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        if(!this.tarefaSet.isEmpty()) {
            for(Tarefa tarefa : tarefaSet) {
                if(!tarefa.getDone())
                    tarefasPendentes.add(tarefa);
            }
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

        return tarefasPendentes;
    }

    public void mudarStatusTarefa(String descricao) {
        if(!this.tarefaSet.isEmpty()) {
            for(Tarefa tarefa : tarefaSet) {
                if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefa.setDone(!tarefa.getDone());
                    break;
                }
            }
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void limparListaTarefas() {
        if(!this.tarefaSet.isEmpty()) {
            Set<Tarefa> tarefasParaRemocao = this.tarefaSet;

            this.tarefaSet.removeAll(tarefasParaRemocao);
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public Set<Tarefa> ordenarPorDescricao() {
        Set<Tarefa> tarefasOrdenadas;

        if(!this.tarefaSet.isEmpty()) {
            tarefasOrdenadas = new TreeSet<>(tarefaSet);
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

        return tarefasOrdenadas;
    }

    public Set<Tarefa> ordenarPorStatus() {
        Set<Tarefa> tarefasOrdenadas;

        if(!this.tarefaSet.isEmpty()) {
            tarefasOrdenadas = new TreeSet<>(new CompatorPorDone());
            tarefasOrdenadas.addAll(tarefaSet);
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

        return tarefasOrdenadas;
    }
}
