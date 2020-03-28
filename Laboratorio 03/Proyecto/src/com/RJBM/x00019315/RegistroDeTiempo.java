package com.RJBM.x00019315;
import java.util.Date;
import java.time.LocalTime;

public class RegistroDeTiempo {
    //Atributos
    private Date date;
    private Date finalDate;

    private int minutes, fMinutes;
    private int hours, fHours;

    // Costructor
    public RegistroDeTiempo(Date date) {
        this.date = date;
    }

    public RegistroDeTiempo(Date date, Date finalDate) {
        this.date = date;
        this.finalDate = finalDate;
    }

    // Getters
    public Date getDate() {
        return date;
    }

    //Metodo
    public LocalTime calcularTiempo(){      // Calculo del tiempo de estadia
        this.minutes = date.getMinutes();
        this.fMinutes = finalDate.getMinutes();
        this.hours = date.getHours();
        this.fHours = finalDate.getHours();

        LocalTime finalTime = LocalTime.of(fHours, fMinutes);
        LocalTime resultTime = finalTime.minusHours(hours).minusMinutes(minutes);

        return resultTime;
    }

}
