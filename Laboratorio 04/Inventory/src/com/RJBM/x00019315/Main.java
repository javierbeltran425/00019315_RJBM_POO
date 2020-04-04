package com.RJBM.x00019315;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<Item> PersonalItems = new ArrayList<>();
    static ArrayList<Item> CommonItems = new ArrayList<>();
    static int option = 0;
    static int ID = 0;
    static String type;

    public static void main(String[] args) {
        boolean cont = true;

        do {
            option = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Agregar Item\n2. Compartir Item" +
                    "\n3. Buscar Item por ID\n4. Buscar Item por tipo\n5. Borrar Item por ID\n6. Borrar Item por tipo\n7. Salir"));

            switch (option) {
                case 1: addItem();
                    break;
                case 2:
                    ID = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del Item que quieres compartir"));
                    PersonalItems.forEach(obj -> {
                        if(obj.getId() == ID){
                            CommonItems.add(obj);
                            JOptionPane.showInternalMessageDialog(null, "Item compartido");
                        }
                    });
                    break;
                case 3:
                    option  = Integer.parseInt(JOptionPane.showInputDialog(null, "En que lista desa buscar el Item?\n\t1. PersonalItems\n\t2. CommonItems"));

                    switch (option){
                        case 1:
                            ID = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del Item que quieres buscar"));
                            PersonalItems.forEach(obj -> {
                                if(obj.getId() == ID){
                                    JOptionPane.showInternalMessageDialog(null, obj.toString());
                                }
                            });
                            break;
                        case 2:
                            ID = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del Item que quieres buscar"));
                            CommonItems.forEach(obj -> {
                                if(obj.getId() == ID){
                                    JOptionPane.showInternalMessageDialog(null, obj.toString());
                                }
                            });
                            break;
                        default: JOptionPane.showInternalMessageDialog(null, "Opción inválida");
                    }
                    break;
                case 4:
                    option = Integer.parseInt(JOptionPane.showInputDialog(null, "En que lista quieres buscar?\n1. PersonalItems\n2. CommonItems"));
                    switch(option){
                        case 1:
                            type = JOptionPane.showInputDialog(null, "Digite el tipo del Item que desea buscar" + "\n(Potion, Elixir, Ammo, Weapon");

                            if(type.equalsIgnoreCase("Potion") || type.equalsIgnoreCase("potion")) {
                                PersonalItems.forEach(obj -> { if (obj instanceof Potion) { JOptionPane.showInternalMessageDialog(null, obj.toString());} });

                            }else if(type.equalsIgnoreCase("Elixir") || type.equalsIgnoreCase("elixir")) {
                                PersonalItems.forEach(obj -> { if (obj instanceof Elixir) { JOptionPane.showInternalMessageDialog(null, obj.toString());} });
                            }else if(type.equalsIgnoreCase("Ammo") || type.equalsIgnoreCase("ammo")) {
                                PersonalItems.forEach(obj -> { if (obj instanceof Ammo) { JOptionPane.showInternalMessageDialog(null, obj.toString()); } });
                            }else if(type.equalsIgnoreCase("Weapon") || type.equalsIgnoreCase("weapon")) {
                                PersonalItems.forEach(obj -> { if (obj instanceof Weapon) { JOptionPane.showInternalMessageDialog(null, obj.toString()); } });
                            }
                            break;
                        case 2:
                            type = JOptionPane.showInputDialog(null, "Digite el tipo del Item que desea buscar" + "\n(Potion, Elixir, Ammo, Weapon)");

                            if(type.equalsIgnoreCase("Potion") || type.equalsIgnoreCase("potion")) {
                                CommonItems.forEach(obj -> { if (obj instanceof Potion) { JOptionPane.showInternalMessageDialog(null, obj.toString());} });
                            }else if(type.equalsIgnoreCase("Elixir") || type.equalsIgnoreCase("elixir")) {
                                CommonItems.forEach(obj -> { if (obj instanceof Elixir) { JOptionPane.showInternalMessageDialog(null, obj.toString());} });
                            }else if(type.equalsIgnoreCase("Ammo") || type.equalsIgnoreCase("ammo")) {
                                CommonItems.forEach(obj -> { if (obj instanceof Ammo) { JOptionPane.showInternalMessageDialog(null, obj.toString()); } });
                            }else if(type.equalsIgnoreCase("Weapon") || type.equalsIgnoreCase("weapon")) {
                                CommonItems.forEach(obj -> { if (obj instanceof Weapon) { JOptionPane.showInternalMessageDialog(null, obj.toString()); } });
                            }
                            break;
                        default: JOptionPane.showInternalMessageDialog(null, "Opción inválida");
                    }
                    break;
                case 5:
                    option  = Integer.parseInt(JOptionPane.showInputDialog(null, "En que lista desa buscar el Item?\n\t1. PersonalItems\n\t2. CommonItems"));

                    switch (option){
                        case 1:
                            ID = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del Item que quieres buscar"));
                            for (Item aux: PersonalItems) {
                                if(aux.getId() == ID){ PersonalItems.remove(aux); JOptionPane.showInternalMessageDialog(null, "Item borrado"); break;} }
                            break;
                        case 2:
                            ID = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del Item que quieres buscar"));
                            for (Item aux: CommonItems) {
                                if(aux.getId() == ID){ CommonItems.remove(aux); JOptionPane.showInternalMessageDialog(null, "Item borrado"); break;} }
                            break;
                        default: JOptionPane.showInternalMessageDialog(null, "Opción inválida");
                    }
                    break;
                case 6:
                    option = Integer.parseInt(JOptionPane.showInputDialog(null, "En que lista quieres buscar?\n1. PersonalItems\n2. CommonItems"));

                    switch(option){
                        case 1:
                            type = JOptionPane.showInputDialog(null, "Digite el tipo del Item que desea buscar" + "\n(Potion, Elixir, Ammo, Weapon");

                            if(type.equalsIgnoreCase("Potion") || type.equalsIgnoreCase("potion")) {
                                for (Item aux : PersonalItems) {
                                    if (aux instanceof Potion) { PersonalItems.remove(aux); JOptionPane.showInternalMessageDialog(null, "Item borrado"); break; } }
                            }else if(type.equalsIgnoreCase("Elixir") || type.equalsIgnoreCase("elixir")){
                                for (Item aux: PersonalItems) {
                                    if(aux instanceof Elixir){ PersonalItems.remove(aux); JOptionPane.showInternalMessageDialog(null, "Item borrado");break; } }
                            }else if(type.equalsIgnoreCase("Ammo") || type.equalsIgnoreCase("ammo")){
                                for (Item aux: PersonalItems) {
                                    if(aux instanceof Ammo){ PersonalItems.remove(aux);JOptionPane.showInternalMessageDialog(null, "Item borrado"); break; } }
                            }else if(type.equalsIgnoreCase("Weapon") || type.equalsIgnoreCase("weapon")){
                                for (Item aux: PersonalItems) {
                                    if(aux instanceof Weapon){ PersonalItems.remove(aux);JOptionPane.showInternalMessageDialog(null, "Item borrado"); break; } } }
                            break;
                        case 2:
                            type = JOptionPane.showInputDialog(null, "Digite el tipo del Item que desea buscar" + "\n(Potion, Elixir, Ammo, Weapon");

                            if(type.equalsIgnoreCase("Potion") || type.equalsIgnoreCase("potion")) {
                                for (Item aux : CommonItems) {
                                    if (aux instanceof Potion) { CommonItems.remove(aux); JOptionPane.showInternalMessageDialog(null, "Item borrado"); break; } }
                            }else if(type.equalsIgnoreCase("Elixir") || type.equalsIgnoreCase("elixir")){
                                for (Item aux: CommonItems) {
                                    if(aux instanceof Elixir){ CommonItems.remove(aux); JOptionPane.showInternalMessageDialog(null, "Item borrado");break; } }
                            }else if(type.equalsIgnoreCase("Ammo") || type.equalsIgnoreCase("ammo")){
                                for (Item aux: CommonItems) {
                                    if(aux instanceof Ammo){ CommonItems.remove(aux);JOptionPane.showInternalMessageDialog(null, "Item borrado"); break; } }
                            }else if(type.equalsIgnoreCase("Weapon") || type.equalsIgnoreCase("weapon")){
                                for (Item aux: CommonItems) {
                                    if(aux instanceof Weapon){ CommonItems.remove(aux);JOptionPane.showInternalMessageDialog(null, "Item borrado"); break; } } }
                            break;
                        default: JOptionPane.showInternalMessageDialog(null, "Opción inválida");
                    }
                    break;
                case 7: cont = false;
                    break;
                default: JOptionPane.showInternalMessageDialog(null, "Opción inválida");
            }
        } while (cont == true);
        System.exit(0);
    }

    public static void addItem(){
        int option;
        String iName, iDescription, iType, level, iWieldType;
        int iWeight, iRemainingUses, iLevel, iReuseTime, iAmount, iTime;
        double iSpeed, iDamage;
        boolean cont = true;

        do {
            option = Integer.parseInt(JOptionPane.showInputDialog(null, "Eliga el tipo de Item:\n" + "1. Potion\n2. Elixir\n3. Munición\n4. Arma\n5. Salir"));
            switch (option) {
                case 1:
                    iType = "Potion";
                    iName = JOptionPane.showInputDialog(null, "Ingrese el nombre de la poción");
                    iWeight = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el peso del Item"));
                    iDescription = JOptionPane.showInputDialog(null, "Ingrese una descripción del Item");
                    iReuseTime = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tiempo para re-uso"));
                    level = JOptionPane.showInputDialog(null, "Introduzca el nivel del Item");
                    iAmount = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad"));
                    PersonalItems.add(new Potion(iName, iWeight, iDescription, iReuseTime, level, iType, iAmount));
                    break;
                case 2:
                    iType = "Elixir";
                    iName = JOptionPane.showInputDialog(null, "Ingrese el nombre del elixir");
                    iWeight = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el peso del item"));
                    iDescription = JOptionPane.showInputDialog(null, "Ingrese una descripción del Item");
                    iReuseTime = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tiempo para re-uso"));
                    level = JOptionPane.showInputDialog(null, "Introduzca el nivel del Item");
                    iAmount = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad"));
                    iTime = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tiempo"));
                    PersonalItems.add(new Elixir(iName, iWeight, iDescription, iReuseTime, level, iType, iAmount, iTime));
                    break;
                case 3:
                    iName = JOptionPane.showInputDialog(null, "Ingrese el nombre de la municiónr");
                    iWeight = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el peso del item"));
                    iDescription = JOptionPane.showInputDialog(null, "Ingrese una descripción del Item");
                    iRemainingUses = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad"));
                    PersonalItems.add(new Ammo(iName, iWeight, iDescription, iRemainingUses, true));
                    break;
                case 4:
                    iType = "Weapon";
                    iName = JOptionPane.showInputDialog(null, "Ingrese el nombre del arma");
                    iWeight = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el peso del item"));
                    iDescription = JOptionPane.showInputDialog(null, "Ingrese una descripción del Item");
                    iRemainingUses = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de usos"));
                    iSpeed = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la velocidad del armo"));
                    iDamage = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el daño"));
                    iWieldType = JOptionPane.showInputDialog(null, "Ingrese el tipo de empuñadura");
                    iLevel = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nivel"));
                    PersonalItems.add(new Weapon(iName, iWeight, iDescription, iRemainingUses, iType, iSpeed, iDamage, iWieldType, iLevel));
                    break;
                case 5:
                    cont = false;
                    break;
                default: JOptionPane.showInternalMessageDialog(null, "Opción inválida");
            }
        } while (cont == true);
    }
}
