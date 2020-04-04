package com.RJBM.x00019315;

public abstract class Item {
    protected int id = IdGenerator.newId();
    protected String name;
    protected int weight;
    protected String description;

    // Constructores
    public Item() {
    }

    public Item(String name, int weight, String description) {
        this.name = name;
        this.weight = weight;
        this.description = description;
    }

    // Getter
    public int getId() {
        return id;
    }
}
