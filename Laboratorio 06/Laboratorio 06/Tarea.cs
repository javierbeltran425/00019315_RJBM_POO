using System;

namespace Laboratorio_06
{
    public class Tarea : Evaluacion
    {
        private DateTime fechaEntrega { get; }

        public Tarea(int porcentaje, string nombre, DateTime fechaEntrega) : base(porcentaje, nombre)
        {
            this.fechaEntrega = fechaEntrega;
        }
    }
}