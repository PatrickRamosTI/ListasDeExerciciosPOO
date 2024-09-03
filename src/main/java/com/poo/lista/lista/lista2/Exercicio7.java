package com.poo.lista.lista.lista2;

import java.util.Scanner;


public class Exercicio7 {

    public static void resolucao(){

    Scanner Leia = new Scanner(System.in);
        
    System.out.print("Digite o número a ser verificado: ");
    int numero = Leia.nextInt();
    
    System.out.print("Digite o divisor: ");
    int divisor = Leia.nextInt();
    
        if (numero % divisor == 0) {
    System.out.println("O número " + numero + " é divisível por " + divisor);
        } else {
    System.out.println("O número " + numero + " não é divisível por " + divisor);
    }
    
    Leia.close();
}
    //Exercicio 7 da lista 2
}

