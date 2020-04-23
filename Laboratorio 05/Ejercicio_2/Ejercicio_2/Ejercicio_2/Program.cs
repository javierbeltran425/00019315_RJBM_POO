using System;

namespace Ejercicio_2
{
    internal class Program
    {
        public static Boolean Palindrome(String word) {
            for (int i = 0; i < word.Length; i++) {
                if (word.Substring(i, 1) != word.Substring(word.Length - i - 1, 1)) {
                    return false;
                }
            }
            return true;
        }
        
        public static void Main(string[] args)
        {
            var cont = true;

            do {
                var word = "";
                char option;

                
                Console.WriteLine("*****************");
                Console.WriteLine("   PALINDROMA");
                Console.WriteLine("*****************");

                Console.Write("Ingrese una frase: ");
                word = Console.ReadLine();

                if (Palindrome(word) == true) {
                    Console.WriteLine("La frase " + word + " es palindroma");
                } else {
                    Console.WriteLine("La frase " + word + " no es palindroma");
                }

                Console.WriteLine("Desea ingresar otra palabra? s/n: ");
                option = Convert.ToChar(Console.ReadLine());

                if(option == 'n' || option == 'N'){
                    cont = false;
                }
            } while (cont);
        }
    }
}