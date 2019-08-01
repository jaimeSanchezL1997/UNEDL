package sample;
import java.util.*;

public class Main  {

    public static void main(String argv[]) {
        Scanner scan = new Scanner(System.in);

        int suma1 = 0;
        int suma2 = 0;
        int suma3 = 0;


        System.out.println("dame el tamaño de las pilas");
        int tama1 = scan.nextInt();
        int[] arreglo = new int[tama1];
        System.out.println("dame el tamaño de las pilas");
        int tamaño2 = scan.nextInt();
        int[] arreglo2 = new int[tamaño2];
        System.out.println("dame el tamaño de las pilas");
        int tamaño3 = scan.nextInt();
        int[] arreglo3 = new int[tamaño3];
        for (int x = 0; x < tama1; x++) {
            System.out.println("numeros en el arreglo 1: ");
            arreglo[x] = scan.nextInt();
        }
        for (int x = 0; x < tamaño2; x++) {
            System.out.println("numeros en el arreglo 2: ");
            arreglo2[x] = scan.nextInt();
        }
        for (int x = 0; x < tamaño3; x++) {
            System.out.println("numeros en el arreglo 3: ");
            arreglo3[x] = scan.nextInt();
        }


        System.out.println("Pila 1: " + Arrays.toString(arreglo));
        System.out.println("Pila 2: " + Arrays.toString(arreglo2));
        System.out.println("Pila 2: " + Arrays.toString(arreglo3));
        System.out.println("Resultado: " + alturaMaxima(arreglo, arreglo2, arreglo3, tama1, tamaño2, tamaño3));




    }
    public static int alturaMaxima(int pila1[], int pila2[], int pila3[], int tama1, int tamaño2, int tamaño3) {
        int suma1 = 0;
        int suma2 = 0;
        int suma3 = 0;

        for (int i=0; i < tama1; i++) {
            suma1 += pila1[i];
        }

        for (int i=0; i < tamaño2; i++) {
            suma2 += pila2[i];
        }

        for (int i=0; i < tamaño3; i++) {
            suma3 += pila3[i];
        }

        int altura1 =0;
        int altura2 = 0;
        int altura3 = 0;
        int resultado = 0;

        while (true) {
            if (altura1 == tama1 || altura2 == tamaño2 || altura3 == tamaño3) {
                return 0;
            }

            if (suma1 == suma2 && suma2 == suma3) {
                return suma1;
            }

            if (suma1 >= suma2 && suma1 >= suma3) {
                suma1 -= pila1[altura1++];
            } else if (suma2 >= suma3 && suma2 >= suma3) {
                suma2 -= pila2[altura2++];
            } else if (suma3 >= suma2 && suma3 >= suma1) {
                suma3 -= pila3[altura3++];
            }
        }
    }



}
