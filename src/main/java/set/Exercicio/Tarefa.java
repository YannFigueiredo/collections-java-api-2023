package main.java.set.Exercicio;

import java.util.Comparator;
import java.util.Objects;

public class Tarefa implements Comparable<Tarefa> {
    private String descricao;
    private boolean done;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.done = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean getDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(descricao, tarefa.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(descricao);
    }

    @Override
    public int compareTo(Tarefa tarefa) {
        return this.descricao.compareToIgnoreCase(tarefa.getDescricao());
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", done=" + done +
                '}';
    }
}

//Implementação para não excluir elementos com o done repetido
class CompatorPorDone implements Comparator<Tarefa> {
    @Override
    public int compare(Tarefa tarefa1, Tarefa tarefa2) {
        int statusCompare = Boolean.compare(tarefa1.getDone(), tarefa2.getDone());
        if (statusCompare != 0) {
            return statusCompare;
        } else {
            return tarefa1.getDescricao().compareTo(tarefa2.getDescricao());
        }
    }
}

