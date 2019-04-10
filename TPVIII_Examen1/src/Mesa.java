import java.util.Scanner;
public class Mesa  {
public static double area,a,b,cost;
    public static void  main (String[] arg){
        calcularArea mesa;
        Scanner tecl = new Scanner(System.in);
        System.out.println("dame la altura");
        b=tecl.nextDouble();
        System.out.println("dame la bsae ");
        a=tecl.nextDouble();
        mesa = new calcularArea(b,a);
        System.out.println("dame el costo");
        cost= tecl.nextDouble();
        mesa.calculo();
        System.out.println("El costo es : " + costo.costo(cost));
    }

}
