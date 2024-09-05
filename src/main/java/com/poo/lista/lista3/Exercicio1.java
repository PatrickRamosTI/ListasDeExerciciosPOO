package com.poo.lista.lista3;

import java.util.Scanner;

public class Exercicio1 {
     public static void resolucao(){
         Scanner Leia = new Scanner(System.in);
         int segundos;
         while (true) {
            System.out.println("Digite um numero de  entre 1 e 59");
            segundos = Leia.nextInt();
            if (segundos >= 1 && segundos <= 59) {
                break;   
            }else{ 
                System.out.println("Erro!!!" + "\n" + "Numero incorreto tente nobamente");
        }
            }
            for (int i = 1; i <= segundos;i++){
                try{
                    System.out.println(i);
                    Thread.sleep(1000);  //Vai pausando em por 1000 milisegundos
                }catch ( InterruptedException e){
                
                }
                } 
                Leia.close();
            }
            //Exercicio 1 Lista 3
    }