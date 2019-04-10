public  class calcularArea {
    private static double b;
    private static  double a;
    private  static  double area;

    public calcularArea() {
    }
    public calcularArea(double b, double a){
        this.b=b;
        this.a=a;
    }

    public static double getB() {
        return b;
    }

    public static void setB(double b) {
        calcularArea.b = b;
    }

    public static double getA() {
        return a;
    }

    public static void setA(double a) {
        calcularArea.a = a;
    }

    public static double getArea() {
        return area;
    }

    public static void setArea(double area) {
        calcularArea.area = area;
    }

    public static double calculo(){
        area= b*a;
        return area;
    }


}
