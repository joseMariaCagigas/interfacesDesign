using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Data;

namespace Ej2Avanzados
{
    class ConvertidorFemenino : IValueConverter
    {
        public object Convert(object value, Type targetType, object parameter, System.Globalization.CultureInfo culture)
        {
            switch ((bool)value)
            {
                case true:
                    return false;
                case false:
                    return true;
            }
            switch (value.ToString().ToLower())
            {
                case "masculino":
                    return false;
                case "femenino":
                    return true;
            }
            return true;
        }

        
        public object ConvertBack(object value, Type targetType, object parameter, System.Globalization.CultureInfo culture)
        {
            if (value is bool)
            {
                if ((bool)value == true)
                    return "Femenino";
                else
                    return "Masculino";
            }
            return "no";
        }
    }
}