package com.RJBM.x00019315;

import javax.swing.*;

public class Elixir extends HealthItem {
    private int amount;
    private int time;

    // Constructor
    public Elixir(String name, int weight, String description, int reuseTime, String level, String type, int amount, int time) {
        super(name, weight, description, reuseTime, level, type);
        this.amount = amount;
        this.time = time;
    }

    // Método
    @Override
    public void drink() {
        JOptionPane.showInternalMessageDialog(null, "Bebiendo");
    }

    //toString

    @Override
    public String toString() {
        return  "ID: " + id +
                "\nNombre: " + name +
                "\nPeso: " + weight +
                "\nDescripción: " + description +
                "\nTiempo re-uso: " + reuseTime +
                "\nNivel: " + level +
                "\nTipo: " + type +
                "\nCantidad: " + amount +
                "\nTiempo: " + time;
    }
}
