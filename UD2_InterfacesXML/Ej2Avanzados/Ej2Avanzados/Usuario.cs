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
        public Boolean sexo;
        public string pais;

        public Usuario(string n, string c, Boolean s, string p)
        {
            this.nombre = n; this.contrasena = c; this.sexo = s; this.pais = p;
        }

        public String getNombre()
        {
            return this.nombre;
        }

        public String getContrasenna()
        {
            return this.contrasena;
        }

        public Boolean getSexo()
        {
            return this.sexo;
        }

        public String getPais()
        {
            return this.pais;
        }

        public override string ToString()
        {
            return "nombre: "+nombre.ToString()+ " contrasena: "+contrasena.ToString()+ "sexo: "+sexo.ToString() +"pais: "+pais.ToString();
        }
    }
}
