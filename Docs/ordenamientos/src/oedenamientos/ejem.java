/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oedenamientos;

/**
 *
 * @author jaime
 */
public class ejem {
    
public class Ordenamientos extends javax.swing.JFrame {
    
    private String cadena;
    private String[] arrayNumeros;
    private int[] arrayAcomodar;
    
    public Ordenamientos() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtIngresarDatos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        btHeap = new javax.swing.JButton();
        BtMerge = new javax.swing.JButton();
        btQuick = new javax.swing.JButton();
        btBubble = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(121, 33, 103));
        jPanel1.setLayout(null);

        txtIngresarDatos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIngresarDatosKeyTyped(evt);
            }
        });
        jPanel1.add(txtIngresarDatos);
        txtIngresarDatos.setBounds(190, 60, 410, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Ingrese Serie de Números");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(280, 30, 210, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Lista Ordenada");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(310, 310, 130, 14);

        txtResultado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtResultado.setEnabled(false);
        jPanel1.add(txtResultado);
        txtResultado.setBounds(180, 340, 390, 40);

        btHeap.setText("Heap");
        btHeap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHeapActionPerformed(evt);
            }
        });
        jPanel1.add(btHeap);
        btHeap.setBounds(370, 210, 90, 40);

        BtMerge.setText("Merge");
        BtMerge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtMergeActionPerformed(evt);
            }
        });
        jPanel1.add(BtMerge);
        BtMerge.setBounds(260, 210, 90, 40);

        btQuick.setText("Quick");
        btQuick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuickActionPerformed(evt);
            }
        });
        jPanel1.add(btQuick);
        btQuick.setBounds(480, 210, 90, 40);

        btBubble.setText("Bubble ");
        btBubble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBubbleActionPerformed(evt);
            }
        });
        jPanel1.add(btBubble);
        btBubble.setBounds(160, 210, 80, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Tipos de Ordenamiento");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(260, 140, 260, 29);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void mergesort(int[] input) {
        mergesort(input, 0, input.length - 1);
    }
    private static void mergesort(int[] input, int start, int end) {
        int mid = (start + end) / 2;
        if (start < end) {
            mergesort(input, start, mid);
            mergesort(input, mid + 1, end);
        }
        int i = 0, first = start, last = mid + 1;
        int[] tmp = new int[end - start + 1];
        while (first <= mid && last <= end) {
            tmp[i++] = input[first] < input[last] ? input[first++] : input[last++];
        }
        while (first <= mid) {
            tmp[i++] = input[first++];
        }
        while (last <= end) {
            tmp[i++] = input[last++];
        }
        i = 0;
        while (start <= end) {
            input[start++] = tmp[i++];
        }
    }
    

    private void BtMergeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtMergeActionPerformed
        cadena = String.valueOf(txtIngresarDatos.getText());
        int index = cadena.length();
        arrayNumeros = new String[index];
        arrayNumeros = cadena.split(" ");
        arrayAcomodar = new int[arrayNumeros.length];
        for (int i = 0; i < arrayNumeros.length; i++) {
            arrayAcomodar[i] = Integer.parseInt(arrayNumeros[i]);
            System.out.println(arrayAcomodar);
        }
        mergesort(arrayAcomodar);
        
        String[] aux = new String[arrayAcomodar.length];
        String s = "";
        for (int i = 0; i < arrayAcomodar.length; i++) {
            aux[i] = Integer.toString(arrayAcomodar[i]);
            s = s + "" + aux[i];
        }
        txtResultado.setText(s);

    }//GEN-LAST:event_BtMergeActionPerformed

    private void txtIngresarDatosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIngresarDatosKeyTyped
        
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 47) || (c >= 58 && c <= 253)) {
            evt.consume();
            
        } else {
            
        }
    }//GEN-LAST:event_txtIngresarDatosKeyTyped

    private void btBubbleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBubbleActionPerformed
        cadena = String.valueOf(txtIngresarDatos.getText());
        int index = cadena.length();
        arrayNumeros = new String[index];
        arrayNumeros = cadena.split(" ");
        arrayAcomodar = new int[arrayNumeros.length];
        for (int i = 0; i < arrayNumeros.length; i++) {
            arrayAcomodar[i] = Integer.parseInt(arrayNumeros[i]);
        }
        int re;
        int n = arrayAcomodar.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arrayAcomodar[j] > arrayAcomodar[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arrayAcomodar[j];
                    arrayAcomodar[j] = arrayAcomodar[j + 1];
                    arrayAcomodar[j + 1] = temp;
                    
                }
            }
        }
        
        String[] aux = new String[arrayAcomodar.length];
        String s = "";
        for (int i = 0; i < arrayAcomodar.length; i++) {
            aux[i] = Integer.toString(arrayAcomodar[i]);
            s = s + "" + aux[i];
        }
        txtResultado.setText(s);

    }//GEN-LAST:event_btBubbleActionPerformed
    public void sort(int arr[]) {        
        int n = arr.length;

        // Build heap (rearrange array) 
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // One by one extract an element from heap 
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end 
            int temp = arr[0];            
            arr[0] = arr[i];            
            arr[i] = temp;

            // call max heapify on the reduced heap 
            heapify(arr, i, 0);            
        }        
    }

    // To heapify a subtree rooted with node i which is 
    // an index in arr[]. n is size of heap 
    void heapify(int arr[], int n, int i) {        
        int largest = i;  // Initialize largest as root 
        int l = 2 * i + 1;  // left = 2*i + 1 
        int r = 2 * i + 2;  // right = 2*i + 2 

        // If left child is larger than root 
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        // If right child is larger than largest so far 
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        // If largest is not root 
        if (largest != i) {            
            int swap = arr[i];            
            arr[i] = arr[largest];            
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree 
            heapify(arr, n, largest);            
        }        
    }    
    private void btHeapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHeapActionPerformed
        cadena = String.valueOf(txtIngresarDatos.getText());
        int index = cadena.length();
        arrayNumeros = new String[index];
        arrayNumeros = cadena.split(" ");
        arrayAcomodar = new int[arrayNumeros.length];
        for (int i = 0; i < arrayNumeros.length; i++) {
            arrayAcomodar[i] = Integer.parseInt(arrayNumeros[i]);
        }
        
        sort(arrayAcomodar);
        
        String[] aux = new String[arrayAcomodar.length];
        String s = "";
        for (int i = 0; i < arrayAcomodar.length; i++) {
            aux[i] = Integer.toString(arrayAcomodar[i]);
            s = s + "" + aux[i];
        }
        txtResultado.setText(s);
    }//GEN-LAST:event_btHeapActionPerformed
public static void quicksort(int A[], int izq, int der) {

  int pivote=A[izq]; // tomamos primer elemento como pivote
  int i=izq; // i realiza la búsqueda de izquierda a derecha
  int j=der; // j realiza la búsqueda de derecha a izquierda
  int aux;
 
  while(i<j){            // mientras no se crucen las búsquedas
     while(A[i]<=pivote && i<j) i++; // busca elemento mayor que pivote
     while(A[j]>pivote) j--;         // busca elemento menor que pivote
     if (i<j) {                      // si no se han cruzado                      
         aux= A[i];                  // los intercambia
         A[i]=A[j];
         A[j]=aux;
     }
   }
   A[izq]=A[j]; // se coloca el pivote en su lugar de forma que tendremos
   A[j]=pivote; // los menores a su izquierda y los mayores a su derecha
   if(izq<j-1)
      quicksort(A,izq,j-1); // ordenamos subarray izquierdo
   if(j+1 <der)
      quicksort(A,j+1,der); // ordenamos subarray derecho
}
    private void btQuickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuickActionPerformed
         cadena = String.valueOf(txtIngresarDatos.getText());
        int index = cadena.length();
        arrayNumeros = new String[index];
        arrayNumeros = cadena.split(" ");
        arrayAcomodar = new int[arrayNumeros.length];
        for (int i = 0; i < arrayNumeros.length; i++) {
            arrayAcomodar[i] = Integer.parseInt(arrayNumeros[i]);
        }
       
        
        quicksort(arrayAcomodar, 0, arrayAcomodar.length-1);
        
        
        
        String[] aux = new String[arrayAcomodar.length];
        String s = "";
        for (int i = 0; i < arrayAcomodar.length; i++) {
            aux[i] = Integer.toString(arrayAcomodar[i]);
            s = s + "" + aux[i];
        }
        txtResultado.setText(s);
    }//GEN-LAST:event_btQuickActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                    
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ordenamientos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ordenamientos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ordenamientos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ordenamientos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ordenamientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtMerge;
    private javax.swing.JButton btBubble;
    private javax.swing.JButton btHeap;
    private javax.swing.JButton btQuick;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtIngresarDatos;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}

    
    
    
    
    
    
    
    
    
    
    
}
