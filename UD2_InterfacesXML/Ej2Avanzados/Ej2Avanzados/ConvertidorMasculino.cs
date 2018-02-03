using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Data;

namespace Ej2Avanzados
{
    class ConvertidorMasculino : IValueConverter
    {
        public object Convert(object value, Type targetType, object parameter, System.Globalization.CultureInfo culture)
        {
            switch ((bool)value)
            {
                case true:
                    return true;
                case false:
                    return false;
            }
            /*switch (value.ToString().ToLower())
            {
                case "masculino":
                    return true;
                case "femenino":
                    return false;
            }*/
            return true;
        }

        
        public object ConvertBack(object value, Type targetType, object parameter, System.Globalization.CultureInfo culture)
        {
            if (value is bool)
            {
                if ((bool)value == true)
                    return "si";
                else
                    return "no";
            }
            return "no";
        }
    }
}