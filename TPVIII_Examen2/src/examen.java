import javax.swing.*;

public class examen {

public String tf1[]= { "{[){}({()}","{(){((())}","{({()()}})","{()()}{()}"};
    public static void main(String[] arg){
examen e = new examen();
e.res();



    }

public void res(){

    //if (balanceada()) {

      //  JOptionPane.showMessageDialog(null,"Está correctamente balanceada.");

 //   } else {

      //  JOptionPane.showMessageDialog(null,"No está correctamente balanceada.");


    //}
    for(int x=0;x<tf1.length;x++){
        if (balanceada(tf1[x]) ){

            JOptionPane.showMessageDialog(null,tf1[x]+="        "+"buena");;

        } else {

            JOptionPane.showMessageDialog(null,tf1[x]+="        "+"mala");;

        }
}
    }


    public boolean balanceada(String cadena) {

            Pila pila1 = new Pila();

            for (int f = 0; f < cadena.length(); f++) {
                if (cadena.charAt(f) == '(' || cadena.charAt(f) == '[' || cadena.charAt(f) == '{') {
                    pila1.insertar(cadena.charAt(f));
                } else {
                    if (cadena.charAt(f) == ')') {
                        if (pila1.extraer() != '(') {
                            return false;
                        }
                    } else {
                        if (cadena.charAt(f) == ']') {
                            if (pila1.extraer() != '[') {
                                return false;
                            }
                        } else {
                            if (cadena.charAt(f) == '}') {
                                if (pila1.extraer() != '{') {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
    if (pila1.vacia()) {
        return true;
    } else {
        return false;
    }


}


    public class Pila {

        class Nodo {
            char simbolo;
            Nodo sig;
        }

        private Nodo raiz;

        public Pila() {
            raiz=null;
        }

        public void insertar(char x) {
            Nodo nuevo;
            nuevo = new Nodo();
            nuevo.simbolo = x;
            if (raiz==null)
            {
                nuevo.sig = null;
                raiz = nuevo;
            }
            else
            {
                nuevo.sig = raiz;
                raiz = nuevo;
            }
        }
        public char extraer ()
        {
            if (raiz!=null)
            {
                char informacion = raiz.simbolo;
                raiz = raiz.sig;
                return informacion;
            }
            else
            {
                return Character.MAX_VALUE;
            }
        }
        public boolean vacia() {
            if (raiz==null) {
                return true;
            } else {
                return false;
            }
        }
    }

}
