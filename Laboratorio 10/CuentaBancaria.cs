using System;
using System.Collections.Generic;
using System.Text;

namespace Laboratorio_10
{
    class CuentaBancaria
    {
        private string NombrePropietario;
        private double SaldoActual;
        public CuentaBancaria()
        {
        }

        public string nombrePropietario {
            get => NombrePropietario;
            set => NombrePropietario = value;
        }

        public double saldoActual
        {
            get => SaldoActual;
            set => SaldoActual = value;
        }
    }
}
