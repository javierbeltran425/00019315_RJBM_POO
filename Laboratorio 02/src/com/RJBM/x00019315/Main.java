package com.RJBM.x00019315;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<herramientasMinecraft> herramientas = new ArrayList<>();

    static Scanner in = new Scanner(System.in);
    private static String ToolType;
    private static String Material;

    public static void main(String[] args) {
        int op = 0;
        int cont = 0;
        boolean menu = true;
        System.out.println("**********");
        System.out.println("MINECRAFT");
        System.out.println("**********");

        do {
            System.out.println("");
            System.out.println("MENU: ");
            System.out.println("\t1. Agregar herramienta a la lista\n\t2. Consultar herramientas\n\t3. Consultar herramientas de un tipo" +
                            "\n\t4. Usar herramienta\n\t5. Reparar herramientas\n\t6. Salir");
            System.out.print("Su opción: ");
            op = in.nextInt();
            in.nextLine();

            switch (op) {
                case 1:
                    SelectToolType();
                    switch (ToolType) {
                        case "Hacha":
                            herramientas.add(new herramientasMinecraft(ToolType, "Cortar", Material, "madera", 40));
                            System.out.println("Herramienta agregada a la lista");
                            break;
                        case "Pico":
                            herramientas.add(new herramientasMinecraft(ToolType, "Picar", Material, "madera", 30));
                            System.out.println("Herramienta agregada a la lista");
                            break;
                        case "Espada":
                            herramientas.add(new herramientasMinecraft(ToolType, "Cortar", Material, "madera", 100));
                            System.out.println("Herramienta agregada a la lista");
                            break;
                        case "Pala":
                            herramientas.add(new herramientasMinecraft(ToolType, "Cabar", Material, "madera", 20));
                            System.out.println("Herramienta agregada a la lista");
                            break;
                        case "Azada":
                            herramientas.add(new herramientasMinecraft(ToolType, "Picar", Material, "Madera", 50));
                            System.out.println("Herramienta agregada a la lista");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\n");
                    System.out.println("Herramientas: ");

                    for (herramientasMinecraft i : herramientas) {
                        System.out.println("");
                        System.out.println("nombre: " + i.getName());
                        System.out.println("Función: " + i.getFunction());
                        System.out.println("Material: " + i.getMaterial1() + " y " + i.getMaterial2());
                        System.out.println("Daño: " + i.getDamage());
                    }
                    break;
                case 3:
                    System.out.println("\n");
                    System.out.println("Seleccione el tipo: ");
                    System.out.println("\t1. Hacha\n\t2. Pico\n\t3. Espada\n\t4. Pala\n\t5. Azada");
                    System.out.println("Su opción: ");
                    op = in.nextInt(); in.nextLine();

                    switch (op){

                        case 1:
                            cont = 0;
                            System.out.println("\n");
                            System.out.println("Herramientas:");
                            for (herramientasMinecraft i : herramientas) {
                                if(i.getName() == "Hacha"){
                                    System.out.println("nombre: " + i.getName());
                                    System.out.println("Función: " + i.getFunction());
                                    System.out.println("Material: " + i.getMaterial1() + " y " + i.getMaterial2());
                                    System.out.println("Daño: " + i.getDamage());
                                    cont++;
                                }
                            }
                            if(cont == 0){
                                System.out.println("No existen herramientas creadas de este tipo");
                            }
                            break;
                        case 2:
                            cont = 0;
                            System.out.println("\n");
                            System.out.println("Herramientas:");
                            for (herramientasMinecraft i : herramientas) {
                                if(i.getName() == "Pico"){
                                    System.out.println("nombre: " + i.getName());
                                    System.out.println("Función: " + i.getFunction());
                                    System.out.println("Material: " + i.getMaterial1() + " y " + i.getMaterial2());
                                    System.out.println("Daño: " + i.getDamage());
                                    cont++;
                                }
                            }
                            if(cont == 0){
                                System.out.println("No existen herramientas creadas de este tipo");
                            }
                            break;
                        case 3:
                            cont = 0;
                            System.out.println("\n");
                            System.out.println("Herramientas:");
                            for (herramientasMinecraft i : herramientas) {
                                if(i.getName() == "Espada"){
                                    System.out.println("nombre: " + i.getName());
                                    System.out.println("Función: " + i.getFunction());
                                    System.out.println("Material: " + i.getMaterial1() + " y " + i.getMaterial2());
                                    System.out.println("Daño: " + i.getDamage());
                                    cont++;
                                }
                            }
                            if(cont == 0){
                                System.out.println("No existen herramientas creadas de este tipo");
                            }
                            break;
                        case 4:
                            cont = 0;
                            System.out.println("\n");
                            System.out.println("Herramientas:");
                            for (herramientasMinecraft i : herramientas) {
                                if(i.getName() == "Pala"){
                                    System.out.println("nombre: " + i.getName());
                                    System.out.println("Función: " + i.getFunction());
                                    System.out.println("Material: " + i.getMaterial1() + " y " + i.getMaterial2());
                                    System.out.println("Daño: " + i.getDamage());
                                    cont++;
                                }
                            }
                            if(cont == 0){
                                System.out.println("No existen herramientas creadas de este tipo");
                            }
                            break;
                        case 5:
                            cont = 0;
                            System.out.println("\n");
                            System.out.println("Herramientas:");
                            for (herramientasMinecraft i : herramientas) {
                                if(i.getName() == "Azada"){
                                    System.out.println("nombre: " + i.getName());
                                    System.out.println("Función: " + i.getFunction());
                                    System.out.println("Material: " + i.getMaterial1() + " y " + i.getMaterial2());
                                    System.out.println("Daño: " + i.getDamage());
                                    cont++;
                                }
                            }
                            if(cont == 0){
                                System.out.println("No existen herramientas creadas de este tipo");
                            }
                            break;
                        default: System.out.println("Opción incorrecta"); break;
                    }

                    break;
                case 4:
                    System.out.println("\n");
                    System.out.println("Que herramienta desea usar?");
                    System.out.println("\t1. Hacha\n\t2. Pico\n\t3. Espada\n\t4. Pala\n\t5. Azada");
                    System.out.println("Su opción: ");
                    op = in.nextInt(); in.nextLine();
                    switch (op) {
                        case 1:
                            cont = 0;
                            for (herramientasMinecraft i : herramientas) {
                                if (i.getName() == "Hacha") {
                                    System.out.println("\n");
                                    i.useTool();
                                    cont++;
                                }
                            }
                            if (cont == 0) {
                                System.out.println("No existen herramientas creadas de este tipo");
                            }
                            break;
                        case 2:
                            cont = 0;
                            for (herramientasMinecraft i : herramientas) {
                                System.out.println("");
                                if (i.getName() == "Pico") {
                                    System.out.println("\n");
                                    i.useTool();
                                    cont++;
                                }
                            }
                            if (cont == 0) {
                                System.out.println("No existen herramientas creadas de este tipo");
                            }
                            break;
                        case 3:
                            cont = 0;
                            for (herramientasMinecraft i : herramientas) {
                                if (i.getName() == "Espada") {
                                    System.out.println("\n");
                                    i.useTool();
                                    cont++;
                                }
                            }
                            if (cont == 0) {
                                System.out.println("No existen herramientas creadas de este tipo");
                            }
                            break;
                        case 4:
                            cont = 0;
                            for (herramientasMinecraft i : herramientas) {
                                if (i.getName() == "Pala") {
                                    System.out.println("\n");
                                    i.useTool();
                                    cont++;
                                }
                            }
                            if (cont == 0) {
                                System.out.println("No existen herramientas creadas de este tipo");
                            }
                            break;
                        case 5:
                            cont = 0;
                            for (herramientasMinecraft i : herramientas) {
                                if (i.getName() == "Azada") {
                                    System.out.println("\n");
                                    i.useTool();
                                    cont++;
                                }
                            }
                            if (cont == 0) {
                                System.out.println("No existen herramientas creadas de este tipo");
                            }
                            break;
                        default:
                            System.out.println("Opción inválida");
                    }
                    break;
                case 5:
                    System.out.println("\n");
                    System.out.println("Que herramientas quiere reparar?");
                    System.out.println("\t1. Hacha\n\t2. Pico\n\t3. Espada\n\t4. Pala\n\t5. Azada");
                    System.out.println("Su opción: ");
                    op = in.nextInt(); in.nextLine();
                    switch (op){
                        case 1:
                            cont = 0;
                            for (herramientasMinecraft i : herramientas) {
                                if(i.getName() == "Hacha"){
                                    System.out.println("\n");
                                    i.repairTool();
                                    cont++;
                                }
                            }
                            if(cont == 0){
                                System.out.println("No existen herramientas creadas de este tipo");
                            }
                            break;
                        case 2:
                            cont = 0;
                            for (herramientasMinecraft i : herramientas) {
                                if(i.getName() == "Pico"){
                                    System.out.println("\n");
                                    i.repairTool();
                                    cont++;
                                }
                            }
                            if(cont == 0){
                                System.out.println("No existen herramientas creadas de este tipo");
                            }
                            break;
                        case 3:
                            cont = 0;
                            for (herramientasMinecraft i : herramientas) {
                                if(i.getName() == "Espada"){
                                    System.out.println("\n");
                                    i.repairTool();
                                    cont++;
                                }
                            }
                            if(cont == 0){
                                System.out.println("No existen herramientas creadas de este tipo");
                            }
                            break;
                        case 4:
                            cont = 0;
                            for (herramientasMinecraft i : herramientas) {
                                if(i.getName() == "Pala"){
                                    System.out.println("\n");
                                    i.repairTool();
                                    cont++;
                                }
                            }
                            if(cont == 0){
                                System.out.println("No existen herramientas creadas de este tipo");
                            }
                            break;
                        case 5:
                            cont = 0;
                            for (herramientasMinecraft i : herramientas) {
                                if(i.getName() == "Azada"){
                                    System.out.println("\n");
                                    i.repairTool();
                                    cont++;
                                }
                            }
                            if(cont == 0){
                                System.out.println("No existen herramientas creadas de este tipo");
                            }
                            break;
                        default: System.out.println("Opción inválida");
                    }
                    break;
                case 6: menu = false;
                    break;
                default: System.out.println("Opción inválida");
            }
        }while (menu);
    }

    public static void SelectToolType(){
        int op = 0;
        System.out.println("");
        System.out.println("Seleccione el tipo de herramienta: ");
        System.out.println("\t1. Hacha\n\t2. Pico\n\t3. Espada\n\t4. Pala\n\t5. Azada");
        System.out.print("Su opción: ");
        op = in.nextInt(); in.nextLine();

        switch (op){
            case 1: ToolType = "Hacha"; SelectMaterial();
                break;
            case 2: ToolType = "Pico"; SelectMaterial();
                break;
            case 3: ToolType = "Espada"; SelectMaterial();
                break;
            case 4: ToolType = "Pala"; SelectMaterial();
                break;
            case 5: ToolType = "Azada"; SelectMaterial();
                break;
        }

    }

    public static void SelectMaterial(){
        int op = 0;
        System.out.println("");
        System.out.println("Seleccione el material de su herramienta: ");
        System.out.println("\t1. Piedra/Madera\n\t2.Metal/Madera\n\t3.Oro/Madera\n\t4. Diamante/Madera");
        System.out.print("Su opción: ");
        op = in.nextInt(); in.nextLine();

            switch (op){
                case 1: Material = "Piedra";
                    break;
                case 2: Material = "Metal";
                    break;
                case 3: Material = "Oro";
                    break;
                case 4: Material = "Diamante";
                    break;
            }

    }
}