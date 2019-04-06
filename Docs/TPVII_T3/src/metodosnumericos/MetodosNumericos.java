/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosnumericos;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.*;
import java.util.*;

/**
 *
 * @author jaime
 */
public class MetodosNumericos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int  deci,estimado=0, i=0,es=0,op,raiz;
        double x=0,x1=0,er=0,porce=0;
       
        
        Scanner teclado = new Scanner(System.in);
        
try{
   
        System.out.println("dame el valor para buscar la raiz");
        raiz = teclado.nextInt();       
        if (raiz<0) {
            System.out.println("su numero es negativo, no se puede proceder");}
        if (raiz>=0) {
            System.out.println("quieres ingresar el 1)valor inicial 2) por porcumpadora");
            op=teclado.nextInt();
            switch(op){
                case 1:
                System.out.println("dame el valor inicial");
                x=teclado.nextDouble();
                break;
            case 2:
          while(estimado<raiz){   
            i++;
            estimado = (i * i);
            if(estimado<raiz){
            es=estimado;
            x=es;
            }}
            System.out.println(es);
            
                break;
            default:
                System.out.println("no es una opcion");
                break;
            }
            
            System.out.println("dame el numero de decimales");
            deci=teclado.nextInt();
            if(deci<0){
                System.out.println("no hay decimales negativos");
            }
            if(deci>=10){
                System.out.println("porfavor digita menos decimales ");
            }
            if(deci>=0&&deci<=9){
        
           do{
            System.out.println("dame el porcentaje de error");
             porce=teclado.nextDouble();
            if(porce<=0){
                System.out.println("no puede ser ni menor ni igual a cero ");}
           }while(porce<=0);
            do{
       x1 =(.5)*(x+(raiz/x));
       DecimalFormat df = new DecimalFormat("#.0000");
       System.out.println(df.format(x1));
                System.out.println(x1);
                BigDecimal bd=new BigDecimal(x1);
                bd= bd.setScale(deci, RoundingMode.HALF_UP);
                System.out.println(bd.doubleValue());
                // System.out.format(".deci f", x1);
                 er=Math.abs(((x1-x)/x1)*100);
                 System.out.println("su error relativo es del  "+er);
                            x=x1;
            }while(er>porce);
            }  
            }
        
    }
    catch (InputMismatchException |NumberFormatException e){
    System.out.println("coloco una letra o un numero decimal ");
        System.out.println("o un numero fuera de rango(0 a 999999999)");
    }
        
        }
}



