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
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace Ej2Avanzados
{
    /// <summary>
    /// Lógica de interacción para MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();

            String[] lista = { "España", "Argentina", "Colombia","Andorra" };
            comboBox1.ItemsSource = lista;
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            bool sexo;

            if ((string.IsNullOrEmpty(nombre.Text)) || (string.IsNullOrEmpty(password.Text)))
            {
                MessageBox.Show("debes rellenar todos los campos");
            }
            else
            {
                if (genero.IsChecked == true)
                {
                    sexo = true;
                }
                else
                {
                    sexo = false;
                }
                Usuario usuario = new Usuario(nombre.Text, password.Text, sexo, comboBox1.Text);
                MessageBox.Show(usuario.ToString());
            }
        }

        private void Button_Click_1(object sender, RoutedEventArgs e)
        {
            this.Close();
        }

    }
}
