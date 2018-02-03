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
        List<ComboBoxItem> lista = new List<ComboBoxItem>();
        Usuario usuario;
        public MainWindow()
        {
            InitializeComponent();

            ConvertidorMasculino convertidorMasculino = new ConvertidorMasculino();
            ConvertidorFemenino convertidorFemenino = new ConvertidorFemenino();

            crearLista(lista);

            for (int i = 0; i < lista.Count; i++)
            {
                comboBox1.Items.Add(lista[i]);
            }
        }

        public List<ComboBoxItem> crearLista(List<ComboBoxItem> lista)
        {
            lista.Clear();
            ComboBoxItem spain = new ComboBoxItem();
            spain.Name = "España";
            spain.Content = "España";
            lista.Add(spain);
            ComboBoxItem argentina = new ComboBoxItem();
            argentina.Name = "Argentina";
            argentina.Content = "Argentina";
            lista.Add(argentina);
            ComboBoxItem colombia = new ComboBoxItem();
            colombia.Name = "Colombia";
            colombia.Content = "Colombia";
            lista.Add(colombia);
            ComboBoxItem andorra = new ComboBoxItem();
            andorra.Name = "Andorra";
            andorra.Content = "Andorra";
            lista.Add(andorra);
            return lista;
        }

        public MainWindow(Usuario user)
        {

            InitializeComponent();

            usuario = user;
            this.DataContext = user;

            crearLista(lista);

            for (int i = 0; i < lista.Count; i++)
            {
                comboBox1.Items.Add(lista[i]);
            }

        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            bool sexo;

            if ((string.IsNullOrEmpty(textBox1.Text)) || (string.IsNullOrEmpty(textBox2.Text)))
            {
                MessageBox.Show("debes rellenar todos los campos");
            }
            else
            {
                if (radioButton1.IsChecked == true)
                {
                    sexo = true;
                }
                else
                {
                    sexo = false;
                }
                usuario = new Usuario(textBox1.Text, textBox2.Text, sexo, comboBox1.Text);
                DialogResult = true;
            }
        }

        public Usuario Respuesta()
        {

            return usuario;
        }

    }
}
