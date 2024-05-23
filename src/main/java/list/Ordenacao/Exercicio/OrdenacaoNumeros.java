package main.java.list.Ordenacao.Exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosOrdenadosAsc = new ArrayList<>(this.numeros);

        if(!numeros.isEmpty()) {
            Collections.sort(numerosOrdenadosAsc);

            return numerosOrdenadosAsc;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosOrdenadosDesc = new ArrayList<>(this.numeros);

        if(!numeros.isEmpty()) {
            numerosOrdenadosDesc.sort(Collections.reverseOrder());

            return numerosOrdenadosDesc;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
}
