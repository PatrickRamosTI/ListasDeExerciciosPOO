package com.poo.lista.lista.lista1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 { 
    public static void resolucao() {
        Scanner leia = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String nome;
        String sobrenome;

        System.out.println("Escreva seu some");
            nome = leia.nextLine();

        System.out.println("Escreva seu nome sobrenome");
            sobrenome= leia.nextLine();
        
        System.out.println("Ola:"+ nome + " "+ sobrenome + " !");

            leia.close();


        //Exercicio2
}
}
