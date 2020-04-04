package com.RJBM.x00019315;

import javax.swing.*;

public class Ammo extends ReusableItem {
    private boolean equipped;

    // Constructor
    public Ammo(String name, int weight, String description, int remainingUses, boolean equipped) {
        super(name, weight, description, remainingUses);
        this.equipped = equipped;
    }

    // Método
    public void equip(){
        JOptionPane.showInternalMessageDialog(null, "Equipado");
    }

    //toString

    @Override
    public String toString() {
        return
                "ID: " + id +
                "\nNombre: " + name +
                "\nPeso: " + weight +
                "\nDescripción: " + description +
                "\nUsos restantes: " + remainingUses +
                "\nEquipado: " + equipped;
    }
}
