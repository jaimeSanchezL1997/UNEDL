using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace excepcion
{
    class Program
    {
        static Exception miExcepcion = new Exception("no te hagas pato no se puede dividir entre 0");

        static void Main(string[] args)
        {
            float num1,num2,num3;
            try
            {
                Console.WriteLine("dame numeros a dividir");
                Console.WriteLine("dame numero 1");
                num1 = int.Parse(Console.ReadLine());
                Console.WriteLine("dame numero 2");
                num2 = int.Parse(Console.ReadLine());
                MiMetodo();
     
            }
            catch (Exception ex) {
                Console.WriteLine("Algo salio mal: {0} ", ex.Message);

            }

        }

        private static void MiMetodo(){
            throw miExcepcion;
         }

       
    }
   /*ublic class excepciones : ApplicationException
    {
        private Double num1, num2, num3;
      


        public override string Message {
        }


    }*/
}
