package com.poo.lista.lista.lista1;

import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao(){

    Scanner leia = new Scanner(System.in);

    double distancia;
    double combustivel;
    double consumo;

    System.out.println("Digite a distância percorrida: ");
        distancia = leia.nextDouble();
    System.out.println("Digite o valor do combustível: ");
        combustivel = leia.nextDouble();
        consumo = combustivel / distancia;

    System.out.println("O consumo medio de combustível é: " + consumo);

        leia.close();

    //Exercicio 6
}
}
