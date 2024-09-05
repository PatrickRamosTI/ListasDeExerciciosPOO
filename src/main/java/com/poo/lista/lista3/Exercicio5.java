package com.poo.lista.lista3;

import java.util.Scanner;

public class Exercicio5 {
    public static void resolucao() {
        
        Scanner Leia = new Scanner(System.in);

        String loginCorreto = "usuario123";
        String senhaCorreta = "senha456";

        int tentativas = 0;
        boolean acessoConcedido = false;

        while (tentativas < 3 && !acessoConcedido) {
            System.out.print("Digite seu login: ");
            String login = Leia.nextLine();
            System.out.print("Digite sua senha: ");
            String senha = Leia.nextLine();
            boolean loginValido = login.equals(loginCorreto);
            boolean senhaValida = senha.equals(senhaCorreta);

            if (loginValido && senhaValida) {
                System.out.println("Acesso concedido!");
                acessoConcedido = true;
            } else {
                tentativas++;

                if (!loginValido && !senhaValida) {
                    System.out.println("Login e senha incorretos.");
                } else if (!loginValido) {
                    System.out.println("Login incorreto.");
                } else {
                    System.out.println("Senha incorreta.");
                }

                if (tentativas == 2) {
                    System.out.println("Última tentativa");
                }
            }
        }

        if (!acessoConcedido) {
            System.out.println("Tentativas excedidas.");
        }

        Leia.close();
    }
    //Exercicio 1 Lista 3
}