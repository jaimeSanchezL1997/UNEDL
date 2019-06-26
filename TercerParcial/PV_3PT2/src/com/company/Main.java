package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here




        int numero,cont,rotacion,aux;
        Scanner intput = new Scanner(System.in);

        System.out.println("dame el numero del arreglo");
        numero = intput.nextInt();
        int  arreglo[] = new int [numero];
        for(int x = 0 ; x <arreglo.length;x++) {
            System.out.println("dame el  valor" + x +" para el arreglo");


            do {
                cont= intput.nextInt();
            if(arreglo[x]<0 || arreglo[x]>1){

                System.out.println("no puedes poner mas que 1 y 0");
            }
            }while(arreglo[x]>1 || arreglo[x]<0);
            arreglo[x]= cont;
        }

            Arrays.sort(arreglo);
            System.out.println("ya acomodado"+ Arrays.toString(arreglo));
        }
}
