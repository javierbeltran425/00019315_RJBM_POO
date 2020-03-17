package com.RJBM.x00019315;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite un entero: ");
        int number = input.nextInt();
        rec(number, 1, false);
    }

    public static void rec(int n, int aux, boolean ret){
        if(aux == 1 && ret){
            System.out.print(aux);
        }else if(aux < n && !ret){
            System.out.print(aux);
            aux++;
            rec(n, aux, ret);
        }else if(aux == n && !ret){
            System.out.print(aux);
            aux--;
            rec(n, aux, true);
        }else if(aux < n){
            System.out.print(aux);
            aux--;
            rec(n, aux, ret);
        }
    }
}
