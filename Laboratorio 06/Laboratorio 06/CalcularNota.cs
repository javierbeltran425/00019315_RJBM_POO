using System;
using System.Collections.Generic;

namespace Laboratorio_06
{
    public static class CalcularNota
    {
        public static double Calcular(List <Evaluacion> ev)
        {
            double nota = 0.0d;
            double calculo = 0.0;
            double total = 0.0;
            
            ev.ForEach(it =>
            {
                Console.Write("Ingrese la calificación para " + it.Nombre + ": ");
                nota = Convert.ToDouble(Console.ReadLine());
                calculo = (nota * it.Porcentaje)/100;
                total += calculo;
            });
            Console.WriteLine();
            return total;
        }
    }
}