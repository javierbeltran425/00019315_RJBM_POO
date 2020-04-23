using System;

namespace Ejercicio_4
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            var cont = true;
            char op;

            
            Console.WriteLine("*********************************************");
            Console.WriteLine("Sustitucion de caracteres a por caracteres b");
            Console.WriteLine("*********************************************");

            do{
                Console.Write("Digite una palabra: ");   // Se le solicita al usuario que digite la palabra a modificar
                String word = Console.ReadLine();                //Se guarda la palabra en la variable word

                convertion(word);                           // Llamado a la función

                Console.WriteLine("\nDesea ingresar otra palabra? s/n");   //Se pregunta al usuario si desea ingresar una nueva palabra
                Console.Write("Su opción: ");
                op = Convert.ToChar(Console.ReadLine());                    // Guardamos su opción en la variable op

                if(op == 'n' || op == 'N'){         // Validamos la opción escogida por el usuario por medio de una condicional if
                    cont = false;
                }
            }while(cont);
        }
        
        public static void convertion(String word){

            word = word.Replace('a', 'b').Replace('A', 'B');    // Utilizamos el método replace(char oldChar, char newChar) para realizar la sustitucion de los caracteres

            Console.WriteLine("Sustituyendo caracteres...");
            Console.Write("Palabra modificada: " + word);        // Mostramos la palabra con la modificación realizada
        }
    }
}