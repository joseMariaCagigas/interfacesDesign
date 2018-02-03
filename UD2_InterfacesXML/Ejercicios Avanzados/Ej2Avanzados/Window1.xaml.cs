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

        public Window1()
        {
            InitializeComponent();
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {

            MainWindow ventana = new MainWindow();

            if (ventana.ShowDialog() == true)
            {

                usuario = ventana.Respuesta();

                
                label1.Content = usuario.ToString();
                botonEditar.IsEnabled = true;
            }
        }

        private void botonEditar_Click(object sender, RoutedEventArgs e)
        {


            MainWindow ventana2 = new MainWindow(usuario);
            if (ventana2.ShowDialog() == true)
            {
                usuario = ventana2.Respuesta();
                label1.Content = usuario.ToString();
            }
        }

    }
}
