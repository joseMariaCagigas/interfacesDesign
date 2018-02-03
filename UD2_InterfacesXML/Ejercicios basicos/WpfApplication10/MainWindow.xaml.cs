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

namespace WpfApplication10
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

        private void escuchador(object sender, RoutedEventArgs e)
        {
            if (radioButton1.IsChecked == true)
            {
                BitmapImage bm = new BitmapImage(new Uri(@"spain.jpg", UriKind.RelativeOrAbsolute));
                image1.Source = bm;
            }
            if (radioButton2.IsChecked == true)
            {
                BitmapImage bm = new BitmapImage(new Uri(@"brazil.jpg", UriKind.RelativeOrAbsolute));
                image1.Source = bm;
            }
            if (radioButton3.IsChecked == true)
            {
                BitmapImage bm = new BitmapImage(new Uri(@"france.jpg", UriKind.RelativeOrAbsolute));
                image1.Source = bm;
            }
            if (radioButton4.IsChecked == true)
            {
                BitmapImage bm = new BitmapImage(new Uri(@"italy.jpg", UriKind.RelativeOrAbsolute));
                image1.Source = bm;
            }
            if (radioButton5.IsChecked == true)
            {
                BitmapImage bm = new BitmapImage(new Uri(@"japan.jpg", UriKind.RelativeOrAbsolute));
                image1.Source = bm;
            }
        }
    }
}
