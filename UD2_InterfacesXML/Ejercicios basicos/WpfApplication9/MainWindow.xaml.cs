using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;


namespace WpfApplication8
{
    public partial class MainWindow : Window
    {
        List<int> lista;
        public MainWindow()
        {
            InitializeComponent();
            rellenarFor();
        }

        public void rellenarFor()
        {
            lista = new List<int>();
            for(int i=0;i<256;i++){
                lista.Add(i);
                
            }
            comboBox1.ItemsSource = lista;
            comboBox2.ItemsSource = lista;
            comboBox3.ItemsSource = lista;

            comboBox1.SelectedIndex = 0;
            comboBox2.SelectedIndex = 0;
            comboBox3.SelectedIndex = 0;

            comboBox1.IsEditable = true;
            comboBox2.IsEditable = true;
            comboBox3.IsEditable = true;
        }

        private void button1_Click(object sender, RoutedEventArgs e)
        {
            int color1 = comboBox1.SelectedIndex;
            int color2 = comboBox2.SelectedIndex;
            int color3 = comboBox3.SelectedIndex;

            Color c = Color.FromRgb((byte)color1,(byte)color2,(byte)color3);

            button1.Background = new SolidColorBrush(c);
        }

        private void escuchador(object sender, RoutedEventArgs e)
        {
            int color1 = comboBox1.SelectedIndex;
            int color2 = comboBox2.SelectedIndex;
            int color3 = comboBox3.SelectedIndex;

            Color c = Color.FromRgb((byte)color1, (byte)color2, (byte)color3);

            button1.Background = new SolidColorBrush(c);
        }
    }
}
