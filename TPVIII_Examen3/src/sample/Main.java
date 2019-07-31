package sample;


import javax.swing.*;
import java.lang.reflect.Array;

public class Main{



    public static void main(String args[]) {
        int tamaño, elem, permutas=0;
         int cont=0;
        tamaño = Integer.parseInt(JOptionPane.showInputDialog("dame el tamaño del arreglo"));

        int[] arreg = new int[tamaño];
        for (int x = 0; x < tamaño; x++) {

            arreg[x] = Integer.parseInt(JOptionPane.showInputDialog("dame elemto" + x));
        }

        JOptionPane.showMessageDialog(null, "su primer elemento es: " + arreg[tamaño-1]);
        JOptionPane.showMessageDialog(null, "su  ultimo elemento es: " + arreg[0]);

        for (int x = 0; x < tamaño; x++) {

            JOptionPane.showMessageDialog(null,"elemtentos" + arreg[x]);
            System.out.println(arreg[x]);
        }

        for (int i = 0; i < arreg.length-1; i++) {
            System.out.println("///////////////////////////////////////////");
            for (int j = 0; j < arreg.length - 1; j++){
                if (arreg[j] > arreg[j + 1]) {

                    int temp = arreg[j];
                    arreg[j] = arreg[j + 1];
                    arreg[j + 1] = temp;
                    for (int y=
                         0; y<arreg.length; y++){
                        System.out.print(arreg[y] + " ");
                    System.out.print("permuta "+cont+"\n");
                }

                }
                System.out.println("//////////////////////////////");
            }

            cont++;

            System.out.println("permutas: " + cont+1);

        }
        for(int i = 0;i < arreg.length; i++)
        {
            System.out.print(arreg[i]+"\n");
        }



    }








}
