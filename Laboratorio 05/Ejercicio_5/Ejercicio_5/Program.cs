using System;
using System.Collections.Generic;

namespace Ejercicio_5
{
    internal class Program
    {
        static List<char>myList = new List<char>();
        
        public static void Main(string[] args)
        {
            String characters;
            Boolean cont = true;
            
            do {
                myList.Clear();
                Console.WriteLine("**************************************");
                Console.WriteLine("ALMACENAMIENTO DE VOCALES EN UNA LISTA");
                Console.WriteLine("**************************************");

                Console.Write("Digite los caracteres: ");
                characters = Console.ReadLine();

                register(characters);

                Console.WriteLine("\nMostrar caracteres almacenados? s/n");
                Console.Write("\tSu opción: ");
                char option = Convert.ToChar(Console.ReadLine());

                if (option == 's' || option == 'S') {
                    reading();
                }

                Console.WriteLine("Desea ingresar una nueva cadena de caracteres? s/n");
                Console.Write("\tSu opción: ");
                option = Convert.ToChar(Console.ReadLine());

                if(option == 'n' || option == 'N'){
                    cont = false;
                }
            }while(cont);
        }
        
        public static void register(String characters){
            Console.Write("Procesando datos...");

            for(int i = 0; i < characters.Length; i++){
                if(characters.Substring(i, 1)=="a" || characters.Substring(i,1)=="A"  || characters.Substring(i, 1)=="e"  || characters.Substring(i, 1)=="E" ||
                   characters.Substring(i,1)=="i"  || characters.Substring(i,1)=="I" || characters.Substring(i,1)=="o" || characters.Substring(i,1)=="O" ||
                   characters.Substring(i,1)=="o" || characters.Substring(i,1)=="U"){

                    myList.Add(Convert.ToChar(characters.Substring(i,1)));
                }
            }
        }
        
        public static void reading(){
            Console.WriteLine("\nImprimiendo datos...");

            for (int i = 0; i < myList.Count; i++) {
                Console.WriteLine(myList[i]);
            }
        }
    }
}