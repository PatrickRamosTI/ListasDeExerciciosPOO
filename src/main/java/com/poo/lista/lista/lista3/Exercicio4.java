package com.poo.lista.lista.lista3;

import java.util.Scanner;

public class Exercicio4 {
    public static void resolucao() {
        
        Scanner Leia = new Scanner(System.in);

        System.out.println("Escolha um número:");
        int numero = Leia.nextInt();

        int palpite;
        boolean acertou = false;

        while (!acertou) {
            System.out.println("Tente adivinhar o número:");
            palpite = Leia.nextInt();

            int errado = Math.abs(palpite - numero); // faz que o valor sempre seja possitivo

            if (palpite == numero) {
                System.out.println("Parabéns, você acertou!");
                acertou = true; 
            } else if (errado >= 20) {
                System.out.println("Muito Frio");
            } else if (errado >= 10) {
                System.out.println("Frio");
            } else if (errado >= 5) {
                System.out.println("Tá quente");
            } else {
                System.out.println("Quase lá");
            }
        }
        Leia.close();
    }
    //Exercicio 4 Lista 3
}