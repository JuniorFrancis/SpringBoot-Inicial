package br.com.junior.antonio.core;

import br.com.junior.antonio.utils.Calculadora;

public class Runner {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("O resultado é: " + calculadora.mult(5,5));
    }



}
