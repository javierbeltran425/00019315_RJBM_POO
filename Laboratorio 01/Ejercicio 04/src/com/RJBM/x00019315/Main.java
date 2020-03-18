package com.RJBM.x00019315;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean cont = true;
        char op;

        System.out.println("*********************************************");
        System.out.println("Sustitucion de caracteres a por caracteres b");
        System.out.println("*********************************************");

        do{
            System.out.print("Digite una palabra: ");   // Se le solicita al usuario que digite la palabra a modificar
            String word = in.nextLine();                //Se guarda la palabra en la variable word

            convertion(word);                           // Llamado a la función

            System.out.println("\nDesea ingresar otra palabra? s/n");   //Se pregunta al usuario si desea ingresar una nueva palabra
            System.out.print("Su opción: ");
            op = in.next().charAt(0); in.nextLine();                    // Guardamos su opción en la variable op

            if(op == 'n' || op == 'N'){         // Validamos la opción escogida por el usuario por medio de una condicional if
                cont = false;
            }
        }while(cont);
    }

    public static void convertion(String word){

        word = word.replace('a', 'b').replace('A', 'B');    // Utilizamos el método replace(char oldChar, char newChar) para realizar la sustitucion de los caracteres

        System.out.println("Sustituyendo caracteres...");
        System.out.print("Palabra modificada: " + word);        // Mostramos la palabra con la modificación realizada
    }
}