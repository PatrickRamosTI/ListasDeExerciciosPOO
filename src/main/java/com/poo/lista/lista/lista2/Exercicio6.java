package com.poo.lista.lista.lista2;

import java.util.Scanner;


public class Exercicio6 {

    public static void resolucao(){

    Scanner Leia = new Scanner(System.in);
        
    System.out.print("Digite a nota da primeira prova: ");
    double nota1 = Leia.nextDouble();
    
    System.out.print("Digite a nota da segunda prova: ");
    double nota2 = Leia.nextDouble();
    
    double media = (nota1 + nota2) / 2;

        if (media >= 6) {
    System.out.println("Aprovado com média " + media);
        } else {
    System.out.println("Média insuficiente. Você precisa fazer a prova de recuperação.");
        
    System.out.print("Digite a nota da prova de recuperação: ");
    double notaRecuperacao = Leia.nextDouble();
        
        if (nota1 < nota2) {
            nota1 = notaRecuperacao;
        } else {
            nota2 = notaRecuperacao;
        }
    
        media = (nota1 + nota2) / 2;
        
        if (media >= 6) {
    System.out.println("Aprovado após recuperação com média " + media);
        } else {
    System.out.println("Reprovado após recuperação com média " + media);
        }
    }
    
    Leia.close();
}
    //Exercicio 6 da lista 2
}