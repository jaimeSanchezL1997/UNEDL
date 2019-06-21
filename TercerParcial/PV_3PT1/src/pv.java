import java.util.*;

public class pv {




    public static void main(String[] arg){
        int numero,cont,rotacion,aux;
        Scanner intput = new Scanner(System.in);

        System.out.println("dame el numeor del arreglo");
        numero = intput.nextInt();

        int  arreglo[] = new int [numero];
        for(int x = 0 ; x <arreglo.length;x++) {
            System.out.println("dame el  valor" + x +" para el arreglo");
        arreglo[x]= intput.nextInt();

        }
        System.out.println("cuantas rotaciones quiere?");
    rotacion = intput.nextInt();

    for(int x = 0 ;x<arreglo.length;x++){
        arreglo[x]=arreglo[x+rotacion];
        System.out.println(arreglo[x]);
    }



        }



}
