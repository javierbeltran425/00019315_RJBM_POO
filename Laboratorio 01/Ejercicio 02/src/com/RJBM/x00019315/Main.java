package com.RJBM.x00019315;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static boolean Palindrome(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean cont = true;

        do {
            String word = "";
            char option;

            System.out.println("*****************");
            System.out.println("   PALINDROMA");
            System.out.println("*****************");

            System.out.print("Ingrese una frase: ");
            word = in.nextLine();

            if (Palindrome(word) == true) {
                System.out.println("La frase " + word + " es palindroma");
            } else {
                System.out.println("La frase " + word + " no es palindroma");
            }

            System.out.print("Desea ingresar otra palabra? s/n: ");
            option = in.next().charAt(0); in.nextLine();

            if(option == 'n' || option == 'N'){
                cont = false;
            }
        } while (cont);
    }
}