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

namespace WpfApplication11
{
    /// <summary>
    /// Lógica de interacción para MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void cbTodos_CheckedChanged(object sender, RoutedEventArgs e)
        {
            if (checkBox1.IsChecked == true)
            {
                checkBox2.IsChecked = true;
                checkBox3.IsChecked = true;
                checkBox4.IsChecked = true;
            }
            else
            {
                checkBox2.IsChecked = false;
                checkBox3.IsChecked = false;
                checkBox4.IsChecked = false;
            }
        }
        private void cbIngrediente_CheckedChanged(object sender, RoutedEventArgs e)
        {
            checkBox1.IsChecked = null;
            if (checkBox2.IsChecked == true && checkBox3.IsChecked == true && checkBox4.IsChecked == true)
            {
                checkBox1.IsChecked = true;
            }
            else if (checkBox2.IsChecked == false && checkBox3.IsChecked == false && checkBox4.IsChecked == false)
            {
                checkBox1.IsChecked = false;
            }
        }

            
        }
    }

