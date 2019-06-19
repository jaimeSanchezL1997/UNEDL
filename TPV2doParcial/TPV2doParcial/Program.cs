using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace TPV2doParcial
{
    class Program
    {


        static void Main(string[] args)
        {
            Boolean entrada = false;
            String timeStamp, hora, fechahoraentrada, fechahora;
            int res, x = 0, carac;
            String cad;
            int t;
            String[] cadenas = new string[20];
                 String[] cadenas1 = new string[20];
            int[] varia = new int[20];
            string[] lines = new string[10];
            timeStamp = DateTime.Now.ToString("dd// MM // yyyy");
            hora = DateTime.Now.ToString("HH //mm // ss");
          
            fechahoraentrada = ("HORA de termino:" + hora + "    del dia " + timeStamp);

            Console.WriteLine("dame la cadena de caracteres");
            cad = Console.ReadLine();
            char[] cadena = cad.ToArray();
            fechahora = ("HORA de Inicio :" + hora + "   del dia " + timeStamp + " Su Cadena inicial es : "+ cad);

            for (x = 0; x < cadena.Length; x++) {
                carac = cadena[x];
                Console.WriteLine(carac);
                varia[x] = carac;
                
            }


            for (int i = 1; i < varia.Length; i++)
            {
                for (int j = 0; j < varia.Length - i; j++)
                {


                    if (varia[j] > varia[j + 1])
                    {
                        t = varia[j];
                        varia[j] = varia[j + 1];
                        varia[j + 1] = t;
                    }
                }
            }
            char[] caracteres = new char[20];
            for (int i = 0; i < varia.Length; i++)
            {

                Console.WriteLine(caracteres[i]);
                 cadenas1[i] = ("ordenado en enteros " + varia[i]+"");
            }
            Console.ReadLine();


            for (int i = 0; i < varia.Length; i++)
            {
                caracteres[i] = (char)varia[i];

                Console.WriteLine(varia[i]);
                 cadenas[i] = ("ordenado en caractes " + caracteres[i]);

            }
            Console.ReadLine();
            

            try
                {
                    StreamWriter sw = new StreamWriter("Prueba");
                sw.WriteLine(fechahora);

                for (int i = 0; i < caracteres.Length; i++)
                    {
                    
                    sw.WriteLine("en caracteres: "+caracteres[i]+" "+ fechahoraentrada);
                   
                    }

                for (int i = 0; i < caracteres.Length; i++) {
                    sw.WriteLine("en enteros: "+varia[i]+"   " + fechahoraentrada);
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
