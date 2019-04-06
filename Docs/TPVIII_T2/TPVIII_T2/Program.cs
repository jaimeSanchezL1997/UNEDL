using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TPVIII_T2
{
    class Program
    {
        static void Main(string[] args)
        {
            int min = char.MinValue, max = char.MaxValue;
           
            Console.WriteLine("valores de un byte: [" + byte.MinValue + " , " + byte.MaxValue + "]");
            Console.WriteLine("valores de un short: [" + short.MinValue + " , " + short.MaxValue + "]");
            Console.WriteLine("valores de un int: ["+int.MinValue +" , "+int.MaxValue +"]");
            Console.WriteLine("valores de un long: [" + long.MinValue + " , " + long.MaxValue + "]");
            Console.WriteLine("valores de un float: [" + float.MinValue + " , " + float.MaxValue + "]");
            Console.WriteLine("valores de un double: [" + double.MinValue + " , " + double.MaxValue + "]");
            Console.WriteLine("valores de un decimal: [" + decimal.MinValue + " , " + decimal.MaxValue + "]");
            Console.WriteLine("valores de un char: [" + min + " , " + max + "]");
            Console.WriteLine("valores de un boolean: [" + bool.FalseString + " , " + bool.TrueString + "]");


        }
    }
}
