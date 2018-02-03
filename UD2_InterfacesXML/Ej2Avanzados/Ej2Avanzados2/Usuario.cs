using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ej2Avanzados
{
    public class Usuario
    {
        public string nombre;
        public string contrasena;
        public bool sexo;
        public string pais;

        public Usuario(string n, string c, bool s, string p)
        {
            this.nombre = n; this.contrasena = c; this.sexo = s; this.pais = p;
        }
        public override string ToString()
        {
            return base.ToString();
        }
    }
}
