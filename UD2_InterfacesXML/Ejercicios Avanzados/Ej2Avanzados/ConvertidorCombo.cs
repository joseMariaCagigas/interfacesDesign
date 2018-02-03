using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Data;

namespace Ej2Avanzados
{
    public class ConvertidorCombo : IValueConverter
    {
        public object Convert(object value, Type targetType, object parameter, System.Globalization.CultureInfo culture)
        {
            switch (value.ToString())
            {
                case "España":
                    return 0;
                case "Argentina":
                    return 1;
                case "Colombia":
                    return 2;
                case "Andorra":
                    return 3;
            }
            return 0;
        }
        public object ConvertBack(object value, Type targetType, object parameter, System.Globalization.CultureInfo culture)
        {
            switch ((int)value)
            {
                case 0:
                    return "España";
                case 1:
                    return "Argentina";
                case 2:
                    return "Colombia";
                case 3:
                    return "Andorra";
            }
            return null;
        }



    }
}