package com.RJBM.x00019315;

import java.util.Scanner; // IMPORTAMOS LA LIBRERIA SCANNER PARA RECIBIR DATOS DESDE TECLADO

public class Main {
    static Scanner in = new Scanner(System.in); // DECLARACION DEL SCANNER GLOBAL DE LA CLASE

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;

        System.out.println("**********************");
        System.out.println("   SERIE FIBONACCI");
        System.out.println("**********************");

        System.out.print("Ingrese la cantidad de números que desea mostrar: "); // SOLICITAMOS AL USUARIO LA CANTIDAD DE NUMEROS FIBONACCI QUE DESEA VER
        int n = in.nextInt(); in.nextLine(); // GUADAMOS EL NUMERO QUE EL USUARIO A INGRESADO

        System.out.println("Esta es tu serie:");

        for(int i = 0; i < n; i++) {        // OPERACION FIBONACCI
            System.out.print(a + ", ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}