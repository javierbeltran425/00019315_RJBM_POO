package com.RJBM.x00019315;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.LinkedList;
import java.util.Locale;

public class Main {
    static LinkedList<Ticket> tickes = new LinkedList<>();
    static double totalEarnings = 0;

    public static void main(String[] args) throws ParseException {
        boolean flag = true;
        int option;
        do{

            option = Integer.parseInt(JOptionPane.showInputDialog(null, menu()));   // Llamada al menu

            switch (option){
                case 1: newTicket();
                    break;
                case 2: exitParking();
                    break;
                case 3: checkTickets();
                    break;
                case 4: checkTotalEarnings();
                    break;
                case 5: flag = false;
                    break;
                default: JOptionPane.showInternalMessageDialog(null, "Opción inválida");
            }
        }while (flag==true);
        return;
    }

    static String menu(){   // Menu
        return  "****************************\nSistema de estacionamiento\n****************************\n1. Ingresar automovil\n2. Salir del parqueo\n3. Consultar tickets\n4. Ganancias totales\n5. Salir";
    }

    static void newTicket() throws ParseException { // Generación del nuevo ticket
        String licensePlate;
        String checkInTime;
        Date date = new Date();

        licensePlate = JOptionPane.showInputDialog(null ,"Ingrese el numero de placa"); // Captura de la placa
        checkInTime = JOptionPane.showInputDialog(null, "Hora de entrada (hh:mm) / Formato 24h");     // Captura de la hora
        // Creamos la hora con formato del api Java
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm", Locale.UK);
        date = sdf.parse(checkInTime);

        Automovil carro = new Automovil(licensePlate);      // Creación de objeto tipo Automovil
        RegistroDeTiempo dateCheckin = new RegistroDeTiempo(date);  // Creación de objeto tipo RegistroDeTiempo

        tickes.add(new Ticket(carro, dateCheckin));     // Se almacena el ticket a la lista
        return;
    }

    static void exitParking() throws ParseException {   // Salir del parqueo
        String departureTime;
        LocalTime lengthOfStay = null;
        String licensePlate;
        Date finalDate = new Date();
        Date date = new Date();

        licensePlate = JOptionPane.showInputDialog(null, "Ingrese su número de placa");     // Captura de la placa
        departureTime = JOptionPane.showInputDialog(null, "Hora de salida (hh:mm) / Formato 24h");        // Captura de la hora de salida
        // Creamos la hora con formato del api Java
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm", Locale.UK );
        finalDate = sdf2.parse(departureTime);

        for (Ticket aux: tickes) {      // Busqueda del ticket
            if(aux.getVehicle().getLicensePlate().equals(licensePlate)) {
                date = aux.getTime().getDate();
                RegistroDeTiempo dateCheckOut = new RegistroDeTiempo(date, finalDate);      // Creación de objeto tipo RegistroDeTiempo
                lengthOfStay = dateCheckOut.calcularTiempo();       // Se hace el calculo del tiempo de estadia
                amountToPay(lengthOfStay, aux);     // Llamado a la función amountToPay y se le envian el tiempo de estadia y el numero del ticket
                break;
            }
        }
        return;
    }

    static void amountToPay(LocalTime lengthOfStay, Ticket aux){    // Calculo del monto a pagar, recibe el tiempo de estadía y el número de ticket
        LocalTime firstTime = LocalTime.of(0,30);   // Primer intervalo de tiempo
        LocalTime secondTime = LocalTime.of(1, 0);  // Segundo intervalo de tiempo
        LocalTime thirdTime = LocalTime.of(2, 0);   // Tercer intervalo de tiempo
        double amount = 0.00d;
        // Validación del intervalo del tiempo
        if(lengthOfStay.isBefore(firstTime)){
            amount = 0.00d;     // Se almacena el monto
            JOptionPane.showInternalMessageDialog(null, "Tiempo utilizado: " + lengthOfStay + "\nMonto a pagar: " + "$" + amount + "\nGracias por visitarnos");
            tickes.remove(aux); // Se elimina el ticket
        }else if((lengthOfStay.isAfter(firstTime) || lengthOfStay.equals(firstTime)) && lengthOfStay.isBefore(secondTime)){
            amount = 0.50d; // Se almacena el monto
            JOptionPane.showInternalMessageDialog(null, "Tiempo utilizado: " + lengthOfStay + "\nMonto a pagar: " + "$" + amount);
            paymentMethod(amount, aux);     // Se llama a paymentMethon y se le envía el monto y el número de ticket
        }else if((lengthOfStay.isAfter(secondTime) || lengthOfStay.equals(secondTime)) && lengthOfStay.isBefore(thirdTime)){
            amount = 1.00d;     // Se almacena el monto
            JOptionPane.showInternalMessageDialog(null, "Tiempo utilizado: " + lengthOfStay + "\nMonto a pagar: " + "$" + amount);
            paymentMethod(amount, aux); // Se llama a paymentMethon y se le envía el monto y el número de ticket
        }else if(lengthOfStay.equals(thirdTime) || lengthOfStay.isAfter(thirdTime)){
            amount = 5.00d;     // Se almacena el monto
            JOptionPane.showInternalMessageDialog(null, "Tiempo utilizado: " + lengthOfStay + "\nMonto a pagar: " + "$" + amount);
            paymentMethod(amount, aux); // Se llama a paymentMethon y se le envía el monto y el número de ticket
        }
        return;
    }

    static void paymentMethod(double amount, Ticket aux){      // Método de pago, recibe el monto y el numero de ticket
        double a = amount;  // Captura del monto
        int option = 0;
        double convertion = -1;
        boolean flag = false;

        do{
            a = Math.round(a *100)/100d;    // Limitación de cifras decimales
            option = Integer.parseInt(JOptionPane.showInputDialog(null, "Saldo pendiente: $" + a +"\n\t1. 5 centavos\n\t" +
                    "2. 10 centavos\n\t3. 25 centavos\n\t4. 1 dolar"));     // Opciones de pago

            switch (option) {
                case 1:
                    Moneda fiveCents = new Moneda("Cinco centavos", 0.05d); // Creación de objeto
                    a -= fiveCents.getValue();  // Resta de la moneda al monto
                    a = Math.round(a *100)/100d;    // Limitación de cifras decimales
                    totalEarnings += fiveCents.getValue();  // Registro de ganancias
                    break;
                case 2:
                    Moneda tenCents = new Moneda("Diez centavos", 0.10d);      // Creación de objeto
                    a -= tenCents.getValue();   // Resta de la moneda al monto
                    a = Math.round(a *100)/100d;    // Limitación de cifras decimales
                    totalEarnings += tenCents.getValue();   // Registro de ganancias
                    break;
                case 3:
                    Moneda quarterDollar = new Moneda("Cora", 0.25d);   // Creación de objeto
                    a -= quarterDollar.getValue();  // Resta de la moneda al monto
                    a = Math.round(a *100)/100d;    // Limitación de cifras decimales
                    totalEarnings += quarterDollar.getValue();  // Registro de ganancias
                    break;
                case 4:
                    Moneda dollar = new Moneda("Dolar", 1.00d);     // Creación de objeto
                    a -= dollar.getValue();     // Resta de la moneda al monto
                    a = Math.round(a *100)/100d;        // Limitación de cifras decimales
                    totalEarnings += dollar.getValue();     // Registro de ganancias
                    break;
            }
            if(a == 0){     // Validación de pago completado
                JOptionPane.showInternalMessageDialog(null, "Gracias por visitarnos");
                tickes.remove(aux);
                flag = true;
            }else if (a < 0){
                JOptionPane.showInternalMessageDialog(null, "Su cambio: $" + (a = convertion * a) );
                JOptionPane.showInternalMessageDialog(null, "Gracias por visitarnos");
                tickes.remove(aux);
                totalEarnings -= a;
                flag = true;
            }
        }while (flag == false);

        return;
    }

    static void checkTickets(){     // Mostrar tickets
        String plateNumberToSearch;

        plateNumberToSearch = JOptionPane.showInputDialog(null, "Ingrese el número de placa a buscar.");    // Captura de placa
        for (Ticket aux: tickes) {  // Busqueda del ticket por medio del número de placa
            if(aux.getVehicle().getLicensePlate().equals(plateNumberToSearch)){
                JOptionPane.showInternalMessageDialog(null, aux.toString());
            }
        }
    }

    static void checkTotalEarnings(){   // Ganancias totales

        totalEarnings = Math.round(totalEarnings * 100)/100d;
        JOptionPane.showInternalMessageDialog(null, "Ganancias totales: " + totalEarnings);
    }
}