using System;

namespace Laboratorio_06
{
    public class ControlPerException : Exception
    {
        public ControlPerException(string message) : base(message)
        {
        }
    }
}