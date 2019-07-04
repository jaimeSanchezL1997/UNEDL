package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println(" tamaño del arreglo: ");
        int tamaño = scanner.nextInt();
        System.out.println("numero de operaciones: ");
        int opera = scanner.nextInt();

        long[] arreglo = new long[tamaño];
        long mayor = 0;
        int a= 0 ;
        int b = 0;
        long sum = 0;

        for (int i = 0; i < opera; i++){
            System.out.println("1: ");
            a=scanner.nextInt();
            System.out.println("2: ");
            b=scanner.nextInt();
            System.out.println("3: ");
            sum=scanner.nextInt();
            arreglo[a-1] += sum;
            if(b < tamaño){
                arreglo[b]-=sum;
            }
        }
        for (int i = 0; i < arreglo.length; i++){
            if(arreglo[i] > mayor){
                mayor = arreglo[i];
            }
        }
        System.out.println("Resultado: " + mayor);
    }
}
