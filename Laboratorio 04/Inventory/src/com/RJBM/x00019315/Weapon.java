package com.RJBM.x00019315;

import javax.swing.*;

public class Weapon extends ReusableItem {
    private String type;
    private double speed;
    private double damage;
    private String wieldType;
    private int level;

    // Constructor
    public Weapon(String name, int weight, String description, int remainingUses, String type, double speed, double damage, String wieldType, int level) {
        super(name, weight, description, remainingUses);
        this.type = type;
        this.speed = speed;
        this.damage = damage;
        this.wieldType = wieldType;
        this.level = level;
    }

    // Método
    public void upgrade(){
        JOptionPane.showInternalMessageDialog(null, "Subiendo nivel");
    }

    // toString

    @Override
    public String toString() {
        return
                "ID: " + id +
                "\nNombre: " + name +
                "\nPeso: " + weight +
                "\nDescripción: " + description +
                "\nUsos restantes: " + remainingUses +
                "\nTipo: " + type +
                "\nVelocidad: " + speed +
                "\nDaño: " + damage +
                "\nTipo de empuñadura: " + wieldType +
                "\nNivel: " + level;
    }
}
