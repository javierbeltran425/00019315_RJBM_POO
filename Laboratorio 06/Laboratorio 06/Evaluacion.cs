using System;
using System.Collections.Generic;

namespace Laboratorio_06
{
    public class Evaluacion
    {
        protected int porcentaje;
        protected String nombre;

        public int Porcentaje => porcentaje;
        public string Nombre => nombre;

        public Evaluacion(int porcentaje, string nombre)
        {
            this.porcentaje = porcentaje;
            this.nombre = nombre;
        }
    }
}