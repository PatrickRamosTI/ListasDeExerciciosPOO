package com.poo.lista.lista.lista2;

import java.util.Scanner;

public class Exercicio8 {

    public static void resolucao(){
    
        Scanner Leia = new Scanner(System.in);
        int acertos = 0;
        int erros = 0;

        // Primeira pergunta 
        System.out.println("Pergunta 1: Quem construiu a arca para sobreviver ao dilúvio?");
        System.out.println("a) Moisés\nb) Noé\nc) Abraão\nd) Davi");
        String resposta = Leia.nextLine();
        if (resposta.equalsIgnoreCase("b")) {
            acertos++;
        System.out.println("Parabéns, voce acertou! ");
        } else {
            erros++;
        System.out.println("Você errou!");
        }
        if (erros >= 3) {
        System.out.println("Você perdeu o jogo!");
            return;
        }

        // Segunda pergunta 
        System.out.println("Pergunta 2: Qual era o nome da esposa de Adão?");
        System.out.println("a) Eva\nb) Sara\nc) Rebeca\nd) Raquel");
        resposta = Leia.nextLine();
        if (resposta.equalsIgnoreCase("a")) {
            acertos++;
        System.out.println("Parabéns, voce acertou!");
        } else {
            erros++;
        System.out.println("Você errou!");
        }
        if (erros >= 3) {
        System.out.println("Você perdeu o jogo!");
            return;
        }

        // Terceira pergunta
        System.out.println("Pergunta 3: Qual profeta foi engolido por um grande peixe?");
        System.out.println("a) Elias\nb) Jonas\nc) Daniel\nd) José");
        resposta = Leia.nextLine();
        if (resposta.equalsIgnoreCase("b")) {
            acertos++;
        System.out.println("Parabéns, voce acertou! ");
        } else {
            erros++;
        System.out.println("Você errou!");
        }
        if (erros >= 3) {
        System.out.println("Você perdeu o jogo!");
            return;
        }

        // Quarta pergunta
        System.out.println("Pergunta 4: Quantos dias Deus levou para criar o mundo?");
        System.out.println("a) 5\nb) 6\nc) 7\nd) 8");
        resposta = Leia.nextLine();
        if (resposta.equalsIgnoreCase("b")) {
            acertos++;
        System.out.println("Parabéns, voce acertou! ");
        } else {
            erros++;
        System.out.println("Você errou!");
        }
        if (erros >= 3) {
        System.out.println("Você perdeu o jogo!");
            return;
        }

        // Quinta pergunta
        System.out.println("Pergunta 5: Qual era o nome do gigante derrotado por Davi?");
        System.out.println("a) Golias\nb) Sansão\nc) Saul\nd) Nabucodonosor");
        resposta = Leia.nextLine();
        if (resposta.equalsIgnoreCase("a")) {
            acertos++;
        System.out.println("Parabéns, voce acertou! ");

        } else {
            erros++;
        System.out.println("Você errou!");
        }
        if (erros >= 3) {
        System.out.println("Você perdeu o jogo!");
            return;
        }

        if (acertos == 0) {
        System.out.println("Você errou todas as perguntas!");
        } else {
        System.out.println("Você terminou o jogo com " + acertos + " acertos!");
        }

        Leia.close();
    }
    //Exercicio 8 da lista 2
}