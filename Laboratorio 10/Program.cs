using System;
using System.Collections.Generic;
using System.Runtime.CompilerServices;

namespace Laboratorio_10
{
    class Program
    {
        private delegate void MyDelegate();
        static MyDelegate md;
        static List<CuentaBancaria> lista = new List<CuentaBancaria>();
        static void Main(string[] args)
        {
            bool continuar = true;

            do
            {
                switch (Menu()){
                    case 1:
                        Console.WriteLine("*******************************");
                        Console.WriteLine("Sistema de registro de clientes");
                        Console.WriteLine("*******************************");
                        CuentaBancaria cuenta = new CuentaBancaria();
                        Console.Write("Ingrese el nombre del cliente: ");
                        cuenta.nombrePropietario = Console.ReadLine();
                        Console.Write("Ingrese el saldo: ");
                        cuenta.saldoActual = Convert.ToDouble(Console.ReadLine());
                        lista.Add(cuenta);
                        Console.WriteLine();
                        break;
                    case 2:
                        Cuentas();
                        break;
                    case 3:
                        md = new MyDelegate(Cuentas);
                        md += new MyDelegate(TotalCuentas);
                        md();
                        break;
                    case 4:
                        Action MyAction;

                        MyAction = () =>
                        {
                            Console.WriteLine("*******************************");
                            Console.WriteLine("     Cuentas almacenadas");
                            Console.WriteLine("*******************************");
                            foreach (var element in lista)
                            {
                                Console.WriteLine("Nombre: " + element.nombrePropietario);
                                Console.WriteLine("Saldo actual: " + element.saldoActual);
                                Console.WriteLine();
                            }
                        };

                        MyAction += () =>
                        {
                            double suma = 0;

                            Console.WriteLine("********************");
                            Console.WriteLine("Total de las cuentas");
                            Console.WriteLine("********************");
                            foreach (var element in lista)
                            {
                                suma += element.saldoActual;
                            }
                            Console.WriteLine("$" + suma);
                            Console.WriteLine();
                        };

                        MyAction += CuentasVocal;

                        MyAction();
                        break;
                    case 5:
                        continuar = false;
                        break;
                }
            } while (continuar);
        }

        public static void CuentasVocal()
        {
            Console.WriteLine("***************************************" +
                "******************");
            Console.WriteLine("Cuentas de las personas que sus nombres" +
                " inician con vocal");
            Console.WriteLine("***************************************" +
                "******************");

            foreach (var element in lista)
            {
                if(element.nombrePropietario.ToLower().StartsWith("a") 
                    || element.nombrePropietario.ToLower().StartsWith("e")
                    || element.nombrePropietario.ToLower().StartsWith("i")
                    || element.nombrePropietario.ToLower().StartsWith("o")
                    || element.nombrePropietario.ToLower().StartsWith("u"))
                {
                    Console.WriteLine("Nombre: "+ element.nombrePropietario);
                    Console.WriteLine("Saldo actual: " + element.saldoActual);
                    Console.WriteLine();
                }
            }
            Console.WriteLine();
        }

        public static void TotalCuentas() {
            double suma = 0;

            Console.WriteLine("********************");
            Console.WriteLine("Total de las cuentas");
            Console.WriteLine("********************");
            foreach (var element in lista)
            {
                suma += element.saldoActual;
            }
            Console.WriteLine("$" + suma);
            Console.WriteLine();
        }

        public static void Cuentas()
        {
            Console.WriteLine("*******************************");
            Console.WriteLine("     Cuentas almacenadas");
            Console.WriteLine("*******************************");
            foreach (var element in lista)
            {
                Console.WriteLine("Nombre: " + element.nombrePropietario);
                Console.WriteLine("Saldo actual: " + element.saldoActual);
                Console.WriteLine();
            }
        }
        public static int Menu()
        {
            int opcion = 0;

            Console.WriteLine("**************");
            Console.WriteLine("    Menu");
            Console.WriteLine("**************");

            Console.WriteLine("1. Agregar una cuenta\n2. Ver cuentas almacenadas" +
                "\n3. Ver cuentas almacenadas y el total de las cuentas" +
                "\n4. Ver cuentas almacenadas, el total de las cuentas, y las cuentas de las personas que su nombre inicie con una vocal" +
                "\n5. Salir");
            Console.Write("Su opcion: ");
            opcion = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine();

            return opcion;
        }
    }
}
