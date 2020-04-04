package com.RJBM.x00019315;

public abstract class HealthItem extends Item{
    protected int reuseTime;
    protected String level;
    protected String type;

    // Constructor
    public HealthItem(String name, int weight, String description, int reuseTime, String level, String type) {
        super(name, weight, description);
        this.reuseTime = reuseTime;
        this.level = level;
        this.type = type;
    }

    // Método abstracto
    public abstract void drink();

}
