package com.RJBM.x00019315;

public final class IdGenerator{
    private static int counter;

    // Costructor
    private IdGenerator() {
    }

    // Método
    public static int newId(){
        counter++;
        return counter;
    }
}
