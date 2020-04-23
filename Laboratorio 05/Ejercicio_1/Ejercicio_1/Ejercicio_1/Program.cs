using System;

namespace Ejercicio_1
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            int a = 0;
            int b = 1;
            int c = 0;

            Console.WriteLine("**********************");
            Console.WriteLine("   SERIE FIBONACCI");
            Console.WriteLine("**********************");

            Console.Write("Ingrese la cantidad de números que desea mostrar: "); // SOLICITAMOS AL USUARIO LA CANTIDAD DE NUMEROS FIBONACCI QUE DESEA VER
            int n = Convert.ToInt32(Console.ReadLine()); // GUADAMOS EL NUMERO QUE EL USUARIO A INGRESADO

            Console.WriteLine("Esta es tu serie:");

            for (int i = 0; i < n; i++)
            {
                // OPERACION FIBONACCI
                Console.Write(a + ", ");
                c = a + b;
                a = b;
                b = c;
            }
        }
    }
}