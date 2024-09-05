package com.poo.lista.lista3;

import java.util.Scanner;

public class Exercicio2 {
     public static void resolucao(){
        Scanner Leia = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero");
        numero = Leia.nextInt();
        System.out.println("Tabuada do numero: " + numero);
            for(int i= 1; i <= 10; i++){
                System.out.println(i + " X " + numero + " = " + (numero * i));
                 }
                 Leia.close();
    }
    //Exercicio 2 Lista 3
}