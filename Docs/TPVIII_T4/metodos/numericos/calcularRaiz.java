/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos.numericos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author kiuub
 */
public class calcularRaiz extends javax.swing.JFrame {

    /**
     * Creates new form calcularRaiz
     */
    
    int valorIAux;
    double valorC,decimales;
    int valorInicio;
    double porError,errorRelativo,valorX,valorXAux,valorXFinal;
    String texto;
    
    public calcularRaiz() {
        initComponents();
        labelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodos/numericos/raizC.png")));
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtValorRaiz = new javax.swing.JTextField();
        txtValorInicio = new javax.swing.JTextField();
        txtDecimales = new javax.swing.JTextField();
        txtPorcentajeError = new javax.swing.JTextField();
        btnRaiz = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtResultadoRaiz = new javax.swing.JTextField();
        labelIteraciones = new javax.swing.JLabel();
        btnAbilitar = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        labelImagen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areatxtValores = new javax.swing.JTextArea();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("valor de inicio");

        jLabel2.setText("valor de c");

        jLabel3.setText("numero de decimales");

        jLabel4.setText("% de error");

        txtValorInicio.setText("1");

        btnRaiz.setText("calcular raiz");
        btnRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizActionPerformed(evt);
            }
        });

        jLabel5.setText("raiz");

        jLabel7.setText("numero de iteraciones");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txtResultadoRaiz, org.jdesktop.beansbinding.ELProperty.create("false"), txtResultadoRaiz, org.jdesktop.beansbinding.BeanProperty.create("editable"));
        bindingGroup.addBinding(binding);

        txtResultadoRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoRaizActionPerformed(evt);
            }
        });

        btnAbilitar.setText("si/no");
        btnAbilitar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnAbilitarItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(68, 68, 68)
                                                .addComponent(jLabel2))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel1)))
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(33, 33, 33)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResultadoRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(labelIteraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtDecimales, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtValorInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(txtValorRaiz, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPorcentajeError))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAbilitar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(btnRaiz)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnAbilitar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDecimales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPorcentajeError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRaiz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResultadoRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(labelIteraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 370, 270));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 150));

        areatxtValores.setColumns(20);
        areatxtValores.setRows(5);
        areatxtValores.setText("\n");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, areatxtValores, org.jdesktop.beansbinding.ELProperty.create("false"), areatxtValores, org.jdesktop.beansbinding.BeanProperty.create("editable"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(areatxtValores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 200, 310));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizActionPerformed
        // TODO add your handling code here:
        
        
         int cont=0;
         int contador=1;
        if(isADot(txtValorRaiz.getText().trim())==false||isNumber(txtValorInicio.getText().trim())==false||isNumber(txtDecimales.getText().trim())==false||isNumber(txtPorcentajeError.getText().trim())==false){
            areatxtValores.setText("ingrese solo numeros, o numeros enteros positivos");
        }
        else{
         valorC = Double.parseDouble(String.valueOf(txtValorRaiz.getText()));
         porError=Double.parseDouble(String.valueOf(txtPorcentajeError.getText()));
         decimales=Double.parseDouble(String.valueOf(txtDecimales.getText()));
         if(btnAbilitar.isSelected()==true){
             
             do{
                 valorIAux=contador*contador;
                 contador++;
             }while(valorIAux<(int)valorInicio);
             valorInicio=valorIAux;
             contador=1;
         }
         else{
             valorInicio = Integer.parseInt(String.valueOf(txtValorInicio.getText()));
            
         }
            valorXAux=valorInicio;
        
        do{
           
            valorX=.5*(valorXAux+(valorC/valorXAux));
            BigDecimal decimal = new BigDecimal(valorX);
            decimal = decimal.setScale((int)decimales, RoundingMode.HALF_UP);
            valorX=decimal.doubleValue();
            errorRelativo=Math.abs(((valorX-valorXAux)/valorX)*100);
            BigDecimal eDecimal = new BigDecimal(errorRelativo);
            eDecimal = eDecimal.setScale((int)decimales, RoundingMode.HALF_UP);
            errorRelativo=eDecimal.doubleValue();
            valorXAux=valorX;
           areatxtValores.setText("valor de x"+cont+": "+valorX+"\nError Relativo: "+errorRelativo+"\nvalor de inicio: "+valorInicio+"\n\n");
           texto+=areatxtValores.getText();
           
            cont++;
        }while(errorRelativo>porError);
        areatxtValores.setText(texto);
        
        labelIteraciones.setText(String.valueOf(cont));
        cont=0;
        
        txtResultadoRaiz.setText(String.valueOf(valorX));
        texto="";
        }
      
        
    }//GEN-LAST:event_btnRaizActionPerformed

    private void txtResultadoRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoRaizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoRaizActionPerformed

    private void btnAbilitarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnAbilitarItemStateChanged
        // TODO add your handling code here:
        if(btnAbilitar.isSelected()==true){
            txtValorInicio.setEnabled(false);
            txtValorInicio.setText(String.valueOf(valorInicio));
        }
        else{
            txtValorInicio.setEnabled(true);
        }
    }//GEN-LAST:event_btnAbilitarItemStateChanged

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
            java.util.logging.Logger.getLogger(calcularRaiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calcularRaiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calcularRaiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calcularRaiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calcularRaiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areatxtValores;
    private javax.swing.JRadioButton btnAbilitar;
    private javax.swing.JToggleButton btnRaiz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelImagen;
    private javax.swing.JLabel labelIteraciones;
    private javax.swing.JTextField txtDecimales;
    private javax.swing.JTextField txtPorcentajeError;
    private javax.swing.JTextField txtResultadoRaiz;
    private javax.swing.JTextField txtValorInicio;
    private javax.swing.JTextField txtValorRaiz;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

  public boolean isNumber(String num){
        boolean resp=false;
        for (int c : num.toCharArray()) {
            if(c>=48&&c<=57||c==46||c==0){
                resp=true;
            }
            else {
                resp=false;
                break;
            }
        }
        return resp;
    }
  public boolean isADot(String num){
        boolean resp=false;
        for (int c : num.toCharArray()) {
            if(c>=48&&c<=57){
                resp=true;
            }
            else {
                resp=false;
                break;
            }
        }
        return resp;
    }
   public boolean isAInt(String num){
        boolean resp=false;
        for (int c : num.toCharArray()) {
            if(c>=48&&c<=57||c==45){
                resp=true;
            }
            else {
                resp=false;
                break;
            }
        }
        return resp;
    }
   public boolean isLetter(String num){
        boolean resp=false;
        for (int c : num.toCharArray()) {
            if(c>=1&&c<=47||c>57){
                resp=true;
            }
            else {
                resp=false;
                break;
            }
        }
        return resp;
    }
}
