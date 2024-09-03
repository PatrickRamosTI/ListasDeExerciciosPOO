package com.poo.lista.lista.lista2;

import java.util.Scanner;

public class Exercicio1 {

    public static void resolucao(){
    Scanner Leia = new Scanner(System.in);
    System.out.println("digite um numero");
    int numero=Leia.nextInt();
        if (numero == 0) {
    System.out.println(" O numero é 0 ");
        }else if (numero % 2 == 0) {
    System.out.println(" O numero é Par");
                    
        } else{
    System.out.println(" O numero é Impar");}

        Leia.close();
                   
}
       //Exercicio 1 da lista 2                 
}