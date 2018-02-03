using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;

namespace Ej2Avanzados
{
    /// <summary>
    /// Lógica de interacción para Window1.xaml
    /// </summary>
    public partial class Window1 : Window
    {
        Usuario usuario;

        MainWindow ventana = new MainWindow();
        MainWindow ventana2 = new MainWindow();
        public Window1()
        {
            InitializeComponent();
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
           

            if (ventana.ShowDialog() == true)
            {
                
                if(ventana.genero.IsChecked==true){
                    Boolean sexop = true;
                    usuario = new Usuario(ventana.nombre.Text, ventana.password.Text, sexop, ventana.comboBox1.Text);
                }
                else
                {
                    Boolean sexop = false;
                    usuario = new Usuario(ventana.nombre.Text, ventana.password.Text, sexop, ventana.comboBox1.Text);
                }


                
                Boolean sexoPasar = usuario.getSexo();
                label1.Content = usuario.ToString();
                botonEditar.IsEnabled = true;
            }
        }

        private void botonEditar_Click(object sender, RoutedEventArgs e)
        {
            String nombrePasar = usuario.getNombre();
            String contrasennaPasar = usuario.getContrasenna();

            Boolean sexoPasar = usuario.getSexo();


            String paisPasar = usuario.getPais();


            ventana2.nombre.Text = nombrePasar;
            ventana2.password.Text = contrasennaPasar;

            if (sexoPasar){
                ventana2.genero.IsChecked = true;
            }
            else
            {
                ventana2.genero1.IsChecked = true;
            }

            ventana2.comboBox1.SelectedItem = paisPasar;




            if (ventana2.ShowDialog() == true)
            {

                

            }
            
        }
        
    }
}
