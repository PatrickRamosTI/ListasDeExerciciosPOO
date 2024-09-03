package com.poo.lista.lista.lista1;

import java.util.Scanner;

public class Exercicio5 {
    public static void resolucao(){

    Scanner leia = new Scanner(System.in);

    double largura;
    double comprimento;

    
    System.out.println("Largura: ");
        largura = leia.nextDouble();

    
    System.out.println("Comprimento: ");
        comprimento = leia.nextDouble();

    double area = largura * comprimento;
    System.out.println("Área: " + area);

    double precoMetroQuadrado;
    System.out.println("\nPreço metro quadrado: ");
        precoMetroQuadrado = leia.nextDouble();

    double preco = area * precoMetroQuadrado;
    System.out.println("Preço total: " + preco);

        leia.close();

//Exercicio 5
}
}
