package com.poo.lista.lista.lista2;

import java.util.Scanner;

public class Exercicio2 {

    public static void resolucao(){
     Scanner Leia = new Scanner(System.in);
    System.out.println("Digite o primeiro numero: ");
    int numero1 = Leia.nextInt();
    System.out.println("Digite o segundo numero: ");
    int numero2 = Leia.nextInt();

         if (numero1 > numero2) {
            System.out.println("O numero " + numero1 + " É maior que o numero "+ numero2);
        }else if (numero2 > numero1) {
            System.out.println("O numero " + numero2 + " É maior que o numero " + numero1);
        }else{
    System.out.println("OS numeros são iguais.");
    }
           Leia.close(); 
}
    //Exercicio 2 da lista 2
}