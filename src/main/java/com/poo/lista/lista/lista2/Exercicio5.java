package com.poo.lista.lista.lista2;

import java.util.Scanner;

public class Exercicio5 {

    public static void resolucao(){
    Scanner Leia = new Scanner(System.in);
    String loginCorreto = ("usuario");
    String senhaCorreta = ("senha123");

    System.out.println("Digite seu login: ");
    String login = Leia.nextLine();

    System.out.println("Digite seu login: ");
    String senha = Leia.nextLine();

        if (! login.equals(loginCorreto)) {
    System.out.println("login incorreto");

        } else if (! senha.equals(senhaCorreta)){
    System.out.println("Senha incorreta ");

        } else { 
    System.out.println("login e senha corretos");}

    Leia.close();
}
    //Exercicio 5 da lista 2
}