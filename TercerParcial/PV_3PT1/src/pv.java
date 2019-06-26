import java.util.*;

public class pv {




    public static void main(String[] arg){
        int numero,cont,rotacion,aux;
        Scanner intput = new Scanner(System.in);

        System.out.println("dame el numero del arreglo");
        numero = intput.nextInt();

        int  arreglo[] = new int [numero];
        for(int x = 0 ; x <arreglo.length;x++) {
            System.out.println("dame el  valor" + x +" para el arreglo");
        arreglo[x]= intput.nextInt();

        }
        System.out.println("cuantas rotaciones quiere?");
    rotacion = intput.nextInt();

  /*  for(int x = 0 ;x<arreglo.length;x++){
        arreglo[numero-rotacion]=arreglo[x];

        arreglo[x]=arreglo[x+rotacion];
        System.out.println(arreglo[x]);
    }*/

            for(int x=1;x<=rotacion;x++) {

                int temp = arreglo[0];
                for(int i=0;i<arreglo.length-1;i++){
                    arreglo[i] = arreglo[i+1];
                }
                arreglo[arreglo.length-1] = temp;
            }





            for(int x = 0;x<arreglo.length;x++){
                System.out.print(arreglo[x]);
            }
            System.out.println();

    }



        }




