package com.RJBM.x00019315;

import javax.swing.*;

public class Potion extends HealthItem {
    private int amount;

    // Constructor
    public Potion(String name, int weight, String description, int reuseTime, String level, String type, int amount) {
        super(name, weight, description, reuseTime, level, type);
        this.amount = amount;
    }

    // Método
    @Override
    public void drink() {
        JOptionPane.showInternalMessageDialog(null, "Bebiendo");
    }

    //toString


    @Override
    public String toString() {
        return
                "ID: " + id +
                "\nNombre: " + name +
                "\nPeso: " + weight +
                "\nDescripción: " + description +
                "\nTiempo re-uso: " + reuseTime +
                "\nNivel: " + level +
                "\nTipo: " + type +
                "\nCantidad: " + amount;
    }
}
