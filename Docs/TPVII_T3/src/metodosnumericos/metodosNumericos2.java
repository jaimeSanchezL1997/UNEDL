 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metodosnumericos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;

public class metodosNumericos2 implements Funcion {
 
   private double a;
   private double b;
   private int iteraciones;
   private double error;
    int cont=0;
    int deci, estimado = 0, i = 0, es = 0, op = 0, grado;
    double x,x1 = 0, er = 0, porce = 0;
    double f1, f2, f3, aux=0, aux1=0;
    double pm,valor1,valor2,num7 = 0, num6 = 0, num5 = 0, num4 = 0, num3 = 0, num2 = 0, num1 = 0;
 
   public static void main(String[] args) {
 
      // Instanciacion y configuracion de nuestro ejercicio
      metodosNumericos2 biseccion = new metodosNumericos2();
      biseccion.datos();
      biseccion.intevalo();
      biseccion.Error();
      biseccion.solucion();
 
   }
 
   public void datos(){
    grado = Integer.parseInt(JOptionPane.showInputDialog("dime hasta que grado quieres?"));
            if (grado < 0) {
                JOptionPane.showMessageDialog(null, "su numero es negativo, no se puede proceder");
            }
            if (grado >= 0) {
                JOptionPane.showMessageDialog(null, "porfacor llena con cero cuando no sea deseado ese esapacio");
                switch (grado) {
                    case 1:
                        num1 = Double.parseDouble(JOptionPane.showInputDialog("dame el valor del numero de la constante?"));
                        num2 = Double.parseDouble(JOptionPane.showInputDialog("dame el valor del numero a la x?"));

                        break;
                    case 2:
                        num1 = Double.parseDouble(JOptionPane.showInputDialog("dame el valor del numero de la constante?"));
                        num2 = Double.parseDouble(JOptionPane.showInputDialog("dame el valor del numero a la x?"));
                        num3 = Double.parseDouble(JOptionPane.showInputDialog("dame el valor del numero a la x^2?"));
                        break;
                    case 3:
                        num1 = Double.parseDouble(JOptionPane.showInputDialog("dame el valor del numero de la constante?"));
                        num2 = Double.parseDouble(JOptionPane.showInputDialog("dame el valor del numero a la x?"));
                        num3 = Double.parseDouble(JOptionPane.showInputDialog("dame el valor del numero a la x^2?"));
                        num4 = Double.parseDouble(JOptionPane.showInputDialog("dame el valor del numero a la x^3?"));
                        break;
                    case 4:
                        num1 = Double.parseDouble(JOptionPane.showInputDialog("dame el valor del numero de la constante?"));
                        num2 = Double.parseDouble(JOptionPane.showInputDialog("dame el valor del numero a la x?"));
                        num3 = Double.parseDouble(JOptionPane.showInputDialog("dame el valor del numero a la x^2?"));
                        num4 = Double.parseDouble(JOptionPane.showInputDialog("dame el valor del numero a la x^3?"));
                        num5 = Double.parseDouble(JOptionPane.showInputDialog("dame el valor del numero a la x^4?"));
                        break;
                    case 5:
                        num1 = Double.parseDouble(JOptionPane.showInputDialog("dame el valor del numero de la constante?"));
                        num2 = Double.parseDouble(JOptionPane.showInputDialog("dame el valor del numero a la x?"));
                        num3 = Double.parseDouble(JOptionPane.showInputDialog("dame el valor del numero a la x^2?"));
                        num4 = Double.parseDouble(JOptionPane.showInputDialog("dame el valor del numero a la x^3?"));
                        num5 = Double.parseDouble(JOptionPane.showInputDialog("dame el valor del numero a la x^4?"));
                        num6 = Double.parseDouble(JOptionPane.showInputDialog("dame el valor del numero a la x^5?"));
                        break;
                    case 6:
                        num1 = Double.parseDouble(JOptionPane.showInputDialog("dame el valor del numero de la constante?"));
                        num2 = Double.parseDouble(JOptionPane.showInputDialog("dame el valor del numero a la x?"));
                        num3 = Double.parseDouble(JOptionPane.showInputDialog("dame el valor del numero a la x^2?"));
                        num4 = Double.parseDouble(JOptionPane.showInputDialog("dame el valor del numero a la x^3?"));
                        num5 = Double.parseDouble(JOptionPane.showInputDialog("dame el valor del numero a la x^4?"));
                        num6 = Double.parseDouble(JOptionPane.showInputDialog("dame el valor del numero a la x^5?"));
                        num7 = Double.parseDouble(JOptionPane.showInputDialog("dame el valor del numero a la x^6?"));
                        break;
                }}
   
   
   }
   public void intevalo(){
    a = Integer.parseInt(JOptionPane.showInputDialog("dame el valor menor del parametro?"));
        b = Integer.parseInt(JOptionPane.showInputDialog("dame el valor mayor del parametro?"));
   }
   @Override
   
   
   public double funcion(double x) {
      double resultado = ((num7 * (Math.pow(valor1, 6))) + ((num6) * (Math.pow(valor1, 5))) + ((num5) * (Math.pow(valor1, 4))) + ((num4) * (Math.pow(valor1, 3))) + ((num3) * (Math.pow(valor1, 2))) + ((num2) * (Math.pow(valor1, 1))) + num1);
      return resultado;
   }
   public void Error(){
   deci = Integer.parseInt(JOptionPane.showInputDialog("dame la cantidad de decimales?"));
                if (deci < 0) {
                    JOptionPane.showMessageDialog(null, "no hay decimales negativos");
                }
                if (deci >= 10) {
                    JOptionPane.showMessageDialog(null, "su valor debe ser menor a 10");
                }
                if (deci >= 0 && deci <= 9) {
                    do {
                        porce = Double.parseDouble(JOptionPane.showInputDialog("dame el porcentaje de error?"));
                        if(porce==0){
                            JOptionPane.showMessageDialog(null,"dame algo mayor a 0 ");
                        }
                        if (porce <= 0) {
                            JOptionPane.showMessageDialog(null, "no puede ser ni menor ni igual a cero ");
                        }
                    } while (porce <= 0);
                }
   }
   
 
   /**
    * Solucion del Metodo de Biseccion
    */
   public void solucion() {
      System.out.println("Intervalo : [" + a + ", " + b + "]");
      System.out.println("Error : " + porce);
       System.out.println("decimales : "+ deci);
      System.out.println("Iteraciones : " + iteraciones);
      System.out
            .println("------------------------------------------------ \n");
 
      double c = 0;
      double fa = 0;
      double fb = 0;
      double fc = 0;
      int iteracion = 1;
      
      do {
         // Aqui esta la magia
         c = (a + b) / 2; 
         System.out.println("Iteracion (" + iteracion + ") : " + c);
         fa = funcion(a);
         fb = funcion(b);
         fc = funcion(c);
         if (fa * fc == 0) {
                if (fa == 0) {
                     JOptionPane.showMessageDialog(null, "Felicidades la raÃ­z es: "+a);
                    System.out.println(a);
                     System.exit(0);
                } else {
                     JOptionPane.showMessageDialog(null, "Felicidades la raÃ­z es: "+c);
                    System.out.println(c);
                     System.exit(0);
                }}
         
         if (fc * fa < 0) {
            b = c;
            fa = funcion(a);
            fb = funcion(b);
            c = (a+b) / 2;
           
            x=c;
            fc = funcion(c);
         } else {
            a = c;
            fa = funcion(a);
            fb = funcion(b);
            c = (a+b) / 2;
           
            x=c;
            fc = funcion(c);
         }
         iteracion++;
         // Itera mientras se cumpla la cantidad de iteraciones establecidas
         // y la funcion se mantenga dentro del margen de error
         
         er = Math.abs(((c - x) / c)* 100);
                BigDecimal bd = new BigDecimal(aux1);
                bd = bd.setScale(deci, RoundingMode.HALF_UP);
                BigDecimal bdpm = new BigDecimal(pm);
                bdpm = bdpm.setScale(deci, RoundingMode.HALF_UP);
                cont++;
                fc=c ;
                JOptionPane.showMessageDialog(null, "conteos: " + cont + " Pm: " + bd.doubleValue() + " Funcion: " + bdpm.doubleValue() + " Error: " + er +"%"+ "\n");
            } while (er <=porce);
      
 
   }
 
   /**
    * Definicion del intervalo
    *
    * @param a
    * @param b
    */
   public void setIntervalo(double a, double b) {
      this.a = a;
      this.b = b;
   }
 
   /**
    * Definicion de las iteraciones
    *
    * @param iteraciones
    */
   public void setIteraciones(int iteraciones) {
      this.iteraciones = iteraciones;
   }
 
   /**
    * Definicion del margen de error
    *
    * @param error
    */
   public void setError(double error) {
      this.error = error;
   }
 
}