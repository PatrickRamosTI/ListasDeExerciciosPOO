package com.poo.lista.lista.lista1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 { 
    public static void resolucao() {
        Scanner leia =new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double valorEmReal;
        double dolar = 5.25;

        System.out.println("Escreva o valor em real: ");
            valorEmReal= leia.nextDouble();

        System.out.printf("O valor em dolar é: $ %.2f", dolar * valorEmReal);

            leia.close();

        //Exercicio3
}
}
