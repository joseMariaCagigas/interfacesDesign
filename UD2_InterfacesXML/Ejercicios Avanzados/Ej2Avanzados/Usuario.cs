using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ej2Avanzados
{
    public class Usuario
    {
        public string nombre {get; set;}
        public string contrasena { get; set; }
        public bool sexo { get; set; }
        public string pais { get; set; }
        public string sexoenstring { get; set; }


        public Usuario(string n, string c, bool s, string p)
        {
            this.nombre = n; this.contrasena = c; this.sexo = s; this.pais = p;
        }



        public override string ToString()
        {

            if (sexo){
                sexoenstring = "Masculino";
            }
            else
            {
                sexoenstring = "Femenino";
            }

            return "nombre: " + nombre.ToString() + " contrasena: " + contrasena.ToString() + " sexo: " + sexoenstring + " pais: " + pais.ToString();
        }
    }
}
