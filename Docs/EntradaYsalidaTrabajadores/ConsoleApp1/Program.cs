using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace ConsoleApp1
{
    class Program
    {

        static void Main(string[] args)
        {
            Boolean entrada = false;
            String timeStamp, hora,fechahoraentrada,fechahora;
            int res,x=0;

            string[] lines = new string[10];
            timeStamp = DateTime.Now.ToString("dd// MM // yyyy");
            hora = DateTime.Now.ToString("HH //mm // ss");
            fechahora = ("Salio a las:" + hora + "    del dia " + timeStamp);
            fechahoraentrada = ("entrada a las:" + hora + "    del dia " + timeStamp);

            do {
                Console.WriteLine("quiere 1)entrar  2)salir  0)acabar programa ");
                res = int.Parse(Console.ReadLine());

                switch (res)
                {

                    case 1:
                        if (entrada == false)
                        {
                            x = x + 1;
                            lines[x] = fechahoraentrada;                           
                            entrada = true;
                        }
                            if (entrada == true)
                            {
                                Console.WriteLine("usted ya ingreso");
                            }
                        
                        break;
                    case 2:
                        if (entrada == true)
                        {
                           x= x + 1;
                            lines[x] = fechahora;
                            entrada = false;
                            Console.WriteLine("usted salio");
                        }
                        break;
                }
                } while (res != 0 && x<9) ;

            try
            {

                StreamWriter sw = new StreamWriter("C:\\Users\\gatit\\Documents\\prueba\\Test.txt");
                for (int i = 0; i < lines.Length; i++)
                {
                    sw.WriteLine(lines[i]);
                }
                sw.Close();
            }
            catch (Exception e)
            {
                Console.WriteLine("Exception: " + e.Message);
            }
        }
    

        public static String GetTimestamp(DateTime value)
        {
            return value.ToString("yyyy//MM//dd  Hora:HH  Minutos: mm  Segundos:  ss");
          
        }
       
    }
}
