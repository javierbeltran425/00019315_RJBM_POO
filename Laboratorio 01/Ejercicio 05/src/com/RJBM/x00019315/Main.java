package com.RJBM.x00019315;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static List<Character>myList = new ArrayList<Character>();

    public static void main(String[] args) {
        String characters;
        boolean cont = true;

        do {
            myList.clear();
            System.out.println("**************************************");
            System.out.println("ALMACENAMIENTO DE VOCALES EN UNA LISTA");
            System.out.println("**************************************");

            System.out.print("Digite los caracteres: ");
            characters = in.nextLine();

            register(characters);

            System.out.println("\nMostrar caracteres almacenados? s/n");
            System.out.print("\tSu opción: ");
            char option = in.next().charAt(0); in.nextLine();

            if (option == 's' || option == 'S') {
                reading();
            }

            System.out.println("Desea ingresar una nueva cadena de caracteres? s/n");
            System.out.print("\tSu opción: ");
            option = in.next().charAt(0); in.nextLine();

            if(option == 'n' || option == 'N'){
                cont = false;
            }
        }while(cont);
    }

    public static void register(String characters){
        System.out.print("Procesando datos...");

        for(int i = 0; i < characters.length(); i++){
            if(characters.charAt(i) == 'a' || characters.charAt(i) == 'A' || characters.charAt(i) == 'e' || characters.charAt(i) == 'E' ||
               characters.charAt(i) == 'i' || characters.charAt(i) == 'I' || characters.charAt(i) == 'o' || characters.charAt(i) == 'O' ||
               characters.charAt(i) == 'u' || characters.charAt(i) == 'U'){

                myList.add(characters.charAt(i));
            }
        }
    }

    public static void reading(){
        System.out.println("\nImprimiendo datos...");

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}