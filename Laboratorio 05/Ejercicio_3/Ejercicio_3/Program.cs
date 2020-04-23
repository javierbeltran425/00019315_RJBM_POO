using System;

namespace Ejercicio_3
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Console.Write("Digite un entero: ");
            var number = Convert.ToInt32(Console.ReadLine());
            rec(number, 1, false);
        }
        
        public static void rec(int n, int aux, Boolean ret){
            if(aux == 1 && ret){
                Console.Write(aux);
            }else if(aux < n && !ret){
                Console.Write(aux);
                aux++;
                rec(n, aux, ret);
            }else if(aux == n && !ret){
                Console.Write(aux);
                aux--;
                rec(n, aux, true);
            }else if(aux < n){
                Console.Write(aux);
                aux--;
                rec(n, aux, ret);
            }
        }
    }
}