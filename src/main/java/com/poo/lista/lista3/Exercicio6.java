package com.poo.lista.lista3;

import java.util.Scanner;

public class Exercicio6 {

    public static void resolucao() {
        
        int altura;
        
        System.out.println("Altura: ");
        Scanner leia = new Scanner(System.in);
        altura = leia.nextInt();

        for (int i = 1; i < altura; i++) {
        for (int j = 1; j < altura- i; j++) {
                System.out.print(" ");
            }  
        for (int k = 0; k <= (2 * i - 1); k++) {
            System.out.print("*");
        }
            System.out.println();
        }
        leia.close();
    }
    //Exercicio 6 Lista 3
}
