package com.poo.lista.lista.lista3;

import java.util.Scanner;

public class Exercicio3 {
     public static void resolucao(){
        Scanner Leia = new Scanner(System.in);
        int num1;
        System.out.println("Digite o primeiro numero");
        num1 = Leia.nextInt();

        int num2;
        System.out.println("Digite o segundo numero");
        num2 = Leia.nextInt();
          int min = Math.min(num1, num2);
          int max = Math.max(num2, num1);

          System.out.println("Numeros pares entre " + min  + " é " +  max + ": ");
          for(int i = min + 1; i <= max -1; i++){ // add o +1 e o -1 pq estva contando contado com ele mesmo
               if (i %2 == 0){
                    System.out.println(i + "");
               }
               Leia.close();
          }
          //Exercicio 3 Lista 3
     }
   }