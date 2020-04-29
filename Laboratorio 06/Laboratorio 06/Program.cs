using System;
using System.Collections.Generic;
using System.Data;
using System.Diagnostics;
using System.Linq;
using System.Linq.Expressions;
using System.Runtime.InteropServices.ComTypes;

namespace Laboratorio_06
{
    internal class Program
    {
        static List<Evaluacion> ev = new List<Evaluacion>();
        static int totalPor = 0;

        public static void Main(string[] args)
        {
            var conti = true;
            var option = 0;
            
            do
            {
                try
                {
                    option = Menu();

                    switch (option)
                    {
                        case 1:
                            addEv();
                            break;
                        case 2:
                            viewEv();
                            break;
                        case 3:
                            deleteEv();
                            break;
                        case 4:
                            Console.WriteLine();
                            Console.WriteLine("El promedio del estudiante es: " + CalcularNota.Calcular(ev));
                            break;
                        default:
                            Console.WriteLine("Opción inválida");
                            break;
                    }
                }
                catch (ControlEvException e)
                {
                    Console.Write(e.Message);
                }
                catch (ControlPerException e)
                {
                    Console.WriteLine(e.Message);
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            } while (conti);
        }

        public static int Menu()
        {
            var option = 0;
            Console.WriteLine();
            Console.WriteLine("*********************");
            Console.WriteLine("        Menú");
            Console.WriteLine("*********************");
            
            Console.WriteLine("1. Agregar evaluación\n2. Mostrar evaluaciones almacenadas\n3. Eliminar evaluación\n4. Terminar programa");
            Console.Write("Su opción: ");
            option = Convert.ToInt32(Console.ReadLine());

            return option;
        }

        public static void addEv()
        {
            var nombre = "";
            var porcenjate = 0;
            int porcenjateRes = 0;
            var cantPreguntas = 0;
            var tipo = "";
            DateTime fechaEntrega;
            var opcion = 0;
            
            Console.WriteLine();
            Console.WriteLine("Seleccione el tipo de evaluación: " + "\n1. Parcial\n2. Laboratorio\n3. Tarea");
            Console.Write("Su opción: ");
            opcion = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine();

            switch (opcion)
            {
                case 1:
                    Console.WriteLine("*****************************");
                    Console.WriteLine("    Adición de parciales");
                    Console.WriteLine("*****************************");
                    Console.WriteLine();
                    Console.Write("Nombre de la evaluación: ");
                    nombre = Console.ReadLine();
                    Console.Write("Porcentaje: ");
                    porcenjate = Convert.ToInt32(Console.ReadLine());
                    totalPor += porcenjate;
                    Console.Write("Cantidad de preguntas: ");
                    cantPreguntas = Convert.ToInt32(Console.ReadLine());
                    ev.ForEach(it =>
                    {
                        if (it.Nombre.Equals(nombre))
                        {
                            totalPor -= porcenjate;
                            porcenjateRes = 100 - totalPor; 
                            Console.WriteLine();
                            throw new ControlEvException("¡Esta evaluación ya existe!");
                        }
                        if(totalPor > 100){
                            totalPor -= porcenjate;
                            porcenjateRes = 100 - totalPor; 
                            Console.WriteLine();
                            throw new ControlPerException("Supera el limite del 100% en ponderación. Ponderación disponible: " + porcenjateRes + "%");
                        }
                    });
                    ev.Add(new Parcial(porcenjate, nombre, cantPreguntas));
                    Console.WriteLine();
                    Console.WriteLine("¡Evaluación agregada con exito!");
                    break;
                case 2:
                    Console.WriteLine("*****************************");
                    Console.WriteLine("   Adición de laboratorios");
                    Console.WriteLine("*****************************");
                    Console.WriteLine();
                    Console.Write("Nombre de la evaluación: ");
                    nombre = Console.ReadLine();
                    Console.Write("Porcentaje: ");
                    porcenjate = Convert.ToInt32(Console.ReadLine());
                    totalPor += porcenjate;
                    Console.Write("Tipo de laboratorio: ");
                    tipo = Console.ReadLine();
                    ev.ForEach(it =>
                    {
                        if (it.Nombre.Equals(nombre))
                        {
                            totalPor -= porcenjate;
                            porcenjateRes = 100 - totalPor; 
                            Console.WriteLine();
                            throw new ControlEvException("¡Esta evaluación ya existe!");
                        }
                        if(totalPor > 100){
                            totalPor -= porcenjate;
                            porcenjateRes = 100 - totalPor; 
                            Console.WriteLine();
                            throw new ControlPerException("Supera el limite del 100% en ponderación. Ponderación disponible: " + porcenjateRes + "%");
                        }
                    });
                    ev.Add(new Laboratorio(porcenjate, nombre, tipo));
                    Console.WriteLine();
                    Console.WriteLine("¡Evaluación agregada con exito!");
                    break;
                case 3:
                    Console.WriteLine("*****************************");
                    Console.WriteLine("      Adición de tareas");
                    Console.WriteLine("*****************************");
                    Console.WriteLine();
                    Console.Write("Nombre de la evaluación: ");
                    nombre = Console.ReadLine();
                    Console.Write("Porcentaje: ");
                    porcenjate = Convert.ToInt32(Console.ReadLine());
                    totalPor += porcenjate;
                    Console.Write("Fecha de entrega: ");
                    fechaEntrega = Convert.ToDateTime(Console.ReadLine());
                    ev.ForEach(it =>
                    {
                        if (it.Nombre.Equals(nombre))
                        {
                            totalPor -= porcenjate;
                            porcenjateRes = 100 - totalPor; 
                            Console.WriteLine();
                            throw new ControlEvException("¡Esta evaluación ya existe!");
                        }
                        if(totalPor > 100){
                            totalPor -= porcenjate;
                            porcenjateRes = 100 - totalPor; 
                            Console.WriteLine();
                            throw new ControlPerException(
                                "Supera el limite del 100% en ponderación. Ponderación disponible: " +
                                porcenjateRes + "%");
                        }
                    });
                    ev.Add(new Tarea(porcenjate, nombre, fechaEntrega));
                    Console.WriteLine();
                    Console.WriteLine("¡Evaluación agregada con exito!");
                    break;
                
            }
            
        }

        public static void viewEv()
        {
            Console.WriteLine();
            Console.WriteLine("**************************");
            Console.WriteLine(" Evaluaciones almacenadas");
            Console.WriteLine("**************************");
            Console.WriteLine();
            
            Console.WriteLine("*****************");
            Console.WriteLine("  Parciales");
            Console.WriteLine("*****************");
            foreach (var element in ev)
            {
                if (element is Parcial)
                {
                    Console.WriteLine("Nobre: " + element.Nombre + "\nPorcentaje: " + element.Porcentaje);
                }
            }

            Console.WriteLine();
            Console.WriteLine("*****************");
            Console.WriteLine("  Laboratorios");
            Console.WriteLine("*****************");
            
            foreach (var element in ev)
            {
                if (element is Laboratorio)
                {
                    Console.WriteLine("Nobre: " + element.Nombre + "\nPorcentaje: " + element.Porcentaje);
                }
            }

            Console.WriteLine();
            Console.WriteLine("*****************");
            Console.WriteLine("     Tareas");
            Console.WriteLine("*****************");
            foreach (var element in ev)
            {
                if (element is Tarea)
                {
                    Console.WriteLine("Nobre: " + element.Nombre + "\nPorcentaje: " + element.Porcentaje);
                }
            } 
        }
    

        public static void deleteEv()
        {
            var nombreEv = "";
            var por = 0;
            
            Console.WriteLine("*****************************");
            Console.WriteLine(" Eliminacion de evaluaciones");
            Console.WriteLine("*****************************");
            Console.WriteLine();
            Console.Write("Ingrese el nombre de la evaluación: ");
            nombreEv = Console.ReadLine();
            
            ev.ForEach(it =>
            {
                if (it.Nombre.Equals(nombreEv))
                {
                    por = it.Porcentaje;
                }
            });
            
            ev.RemoveAt(ev.FindIndex(eval => eval.Nombre.Equals(nombreEv)));

            totalPor -= por;
            
            Console.WriteLine();
            Console.WriteLine("¡Evaluación eliminada con éxito!");

        }
    }
}
