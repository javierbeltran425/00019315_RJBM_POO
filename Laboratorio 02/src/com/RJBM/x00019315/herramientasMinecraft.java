package com.RJBM.x00019315;

import java.awt.datatransfer.SystemFlavorMap;

public class herramientasMinecraft {

    //Declaración de los atributos
    private String name;
    private String function;
    private String material1;
    private String material2;
    private int damage;

    //Creación del constructor

    public herramientasMinecraft(String name, String function, String material1, String material2, int damage) {
        this.name = name;
        this.function = function;
        this.material1 = material1;
        this.material2 = material2;
        this.damage = damage;
    }

    // Getters


    public String getName() {
        return name;
    }

    public String getFunction() {
        return function;
    }

    public String getMaterial1() {
        return material1;
    }

    public String getMaterial2() {
        return material2;
    }

    public int getDamage() {
        return damage;
    }

    //Metodos
    public void useTool(){    //Se hace uso de la herramienta
        System.out.println("Sacando la herramienta " + name + "...");
        System.out.println(name + "lista para ser utilizada");
        System.out.println("Usando herramienta...");
        System.out.println("Se terminó de usar la herramienta");
        System.out.println("Guardando herramienta...");
        System.out.println("Herramienta guardada");
    }

    public void repairTool(){      //Se guarda la herramienta
        System.out.println("Reparando herramienta " + name + "...");
        System.out.println("Herramienta reparada");
    }
}
