package com.RJBM.x00019315;

public abstract class ReusableItem extends Item{
    protected int remainingUses;

    // Constructor
    public ReusableItem(String name, int weight, String description, int remainingUses) {
        super(name, weight, description);
        this.remainingUses = remainingUses;
    }

    // Métodos
    public void reduceUse(){

    }

    public boolean use(){
        boolean status = true;



        return status;
    }
}
