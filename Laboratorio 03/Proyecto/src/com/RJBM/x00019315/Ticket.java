package com.RJBM.x00019315;

public class Ticket {
    //Atributos
    private Automovil vehicle;
    private RegistroDeTiempo time;

    //Costructor
    public Ticket(Automovil vehicle, RegistroDeTiempo time) {
        this.vehicle = vehicle;
        this.time = time;
    }

    // Getters
    public Automovil getVehicle() {
        return vehicle;
    }

    public RegistroDeTiempo getTime() {
        return time;
    }

    // toString

    @Override
    public String toString() {      // Impresion del ticket
        return "Datos del vehiculo: " +
                "\n\tNúmero de placa: " + vehicle.getLicensePlate() +
                "\n\tHora de entrada: " + time.getDate().getHours() + ":" + time.getDate().getMinutes();
    }
}
