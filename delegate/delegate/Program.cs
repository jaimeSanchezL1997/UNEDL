using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace delegates
{
    public delegate void valores(int x, int y);

    class delagate {
        static void Main(String[] atgs) {
            int x, y;
            x = Convert.ToInt16(Console.ReadLine());
            y = Convert.ToInt16(Console.ReadLine());
            valores val = new valores(operaciones.suma);
            val(x,y);
            val = new valores(operaciones.res);
            val(x, y);
            val = new valores(operaciones.mul);
            val(x, y);
            val = new valores(operaciones.div);
            val(x, y);
        }



        class  operaciones{
            public static void suma(int x, int y) {

               Console.WriteLine("resultado de suma es:   "+ (x + y));
            }
            public static void res(int x, int y)
            {
            
                Console.WriteLine("resultado de la resta es:   " + (x - y));
            }
            public static void mul(int x, int y)
            {

                Console.WriteLine("resultado de multipiplicacion es:    " + (x * y));
            }
            public static void div(int x, int y)
            { 
                Console.WriteLine("resultado de la division es:      " + (x / y));
            }

        }

    }




    }
