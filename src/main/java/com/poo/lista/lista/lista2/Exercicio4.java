package com.poo.lista.lista.lista2;

import java.util.Scanner;

public class Exercicio4 {

    public static void resolucao(){
    Scanner Leia = new Scanner(System.in);

    System.out.println("Digite sua idade: ");
    int idade = Leia.nextInt();
        if ( idade < 16){
    System.out.println("Você não pode entrar. ");
    
        }else if(idade >= 16 && idade <= 18) {
    System.out.println("Você so pode entrar como o seu responsavel. ");
        } else {
    System.out.println(" Você pode entrar no evento. ");
}
        Leia.close();
}
        //Exercicio 4 da lista 2
}