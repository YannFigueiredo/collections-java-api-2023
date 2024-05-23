package main.java.list.Pesquisa.Exercicio;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;

        for(Integer n : numeros) {
            soma += n;
        }

        return soma;
    }

    public int encontrarMaiorNumero() {
        int maior = Integer.MIN_VALUE;

        if(!numeros.isEmpty()) {
            for(Integer n : numeros) {
                if(n >= maior)
                    maior = n;
            }
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

        return maior;
    }

    public int encontrarMenorNumero() {
        int menor = Integer.MAX_VALUE;

        if(!numeros.isEmpty()) {
            for(Integer n : numeros) {
                if(n <= menor)
                    menor = n;
            }
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

        return menor;
    }

    public void exibirNumeros() {
        System.out.println(this.numeros);
    }
}
