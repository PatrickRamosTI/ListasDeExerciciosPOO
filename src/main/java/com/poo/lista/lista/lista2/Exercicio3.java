package com.poo.lista.lista.lista2;

import java.util.Scanner;

public class Exercicio3 {

    public static void resolucao(){
        Scanner Leia = new Scanner(System.in);
        System.out.println("Digite a Sua idade");
        int idade = Leia.nextInt();
        System.out.println("Voce é deficiente ? sim/não: ");
        String deficiente = Leia.next().toLowerCase();

        System.out.println("Voce é gestante ? sim/não: ");
        String gestante = Leia.next().toLowerCase();

            if ( idade >=65 || deficiente.equals("sim") || gestante.equals("sim")) {
        System.out.println("Você e da fila preferencial. ");
            } else{ 
        System.out.println("Você e da fila comum. ");
}
            Leia.close();
}
        //Exercicio 3 da lista 2
}