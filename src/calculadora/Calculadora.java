/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    
    //variable
    double numero1=0, numero2=0, resultado = 0;
    String valor = "";
    String historial = "";
    String signo = "";
    boolean punto = false, suma = false, resta = false, division = false, multiplicacion = false;
    
    public Calculadora() {
        setLocationRelativeTo(null);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_resultado = new javax.swing.JTextField();
        Bt_7 = new javax.swing.JButton();
        Bt_8 = new javax.swing.JButton();
        Bt_9 = new javax.swing.JButton();
        Bt_4 = new javax.swing.JButton();
        Bt_5 = new javax.swing.JButton();
        Bt_6 = new javax.swing.JButton();
        Bt_1 = new javax.swing.JButton();
        Bt_2 = new javax.swing.JButton();
        Bt_3 = new javax.swing.JButton();
        Bt_0 = new javax.swing.JButton();
        Bt_Punto = new javax.swing.JButton();
        Bt_Dividir = new javax.swing.JButton();
        Bt_Multiplicar = new javax.swing.JButton();
        Bt_Restar = new javax.swing.JButton();
        Bt_Sumar = new javax.swing.JButton();
        Bt_Igual = new javax.swing.JButton();
        Bt_C = new javax.swing.JButton();
        txt_historial = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.blue, null, null));

        txt_resultado.setEditable(false);
        txt_resultado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_resultado.setForeground(new java.awt.Color(51, 0, 153));
        txt_resultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_resultado.setText("0");
        txt_resultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Bt_7.setText("7");
        Bt_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_7ActionPerformed(evt);
            }
        });

        Bt_8.setText("8");
        Bt_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_8ActionPerformed(evt);
            }
        });

        Bt_9.setText("9");
        Bt_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_9ActionPerformed(evt);
            }
        });

        Bt_4.setText("4");
        Bt_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_4ActionPerformed(evt);
            }
        });

        Bt_5.setText("5");
        Bt_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_5ActionPerformed(evt);
            }
        });

        Bt_6.setText("6");
        Bt_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_6ActionPerformed(evt);
            }
        });

        Bt_1.setText("1");
        Bt_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_1ActionPerformed(evt);
            }
        });

        Bt_2.setText("2");
        Bt_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_2ActionPerformed(evt);
            }
        });

        Bt_3.setText("3");
        Bt_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_3ActionPerformed(evt);
            }
        });

        Bt_0.setText("0");
        Bt_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_0ActionPerformed(evt);
            }
        });

        Bt_Punto.setText(".");
        Bt_Punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_PuntoActionPerformed(evt);
            }
        });

        Bt_Dividir.setText("÷");
        Bt_Dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_DividirActionPerformed(evt);
            }
        });

        Bt_Multiplicar.setText("x");
        Bt_Multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_MultiplicarActionPerformed(evt);
            }
        });

        Bt_Restar.setText("-");
        Bt_Restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_RestarActionPerformed(evt);
            }
        });

        Bt_Sumar.setText("+");
        Bt_Sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_SumarActionPerformed(evt);
            }
        });

        Bt_Igual.setText("=");
        Bt_Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_IgualActionPerformed(evt);
            }
        });

        Bt_C.setText("C");
        Bt_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_CActionPerformed(evt);
            }
        });

        txt_historial.setEditable(false);
        txt_historial.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        txt_historial.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_historial.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_historial.setDisabledTextColor(new java.awt.Color(0, 51, 153));
        txt_historial.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_historial, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_resultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(Bt_7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(Bt_8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(Bt_4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(Bt_5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(Bt_1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(Bt_2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Bt_9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Bt_6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Bt_3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Bt_0, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Bt_Punto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Bt_C, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Bt_Sumar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Bt_Dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Bt_Multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Bt_Restar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(Bt_Igual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_historial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bt_7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bt_8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bt_9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bt_4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bt_5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bt_6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bt_1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bt_2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bt_3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Bt_Dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt_Multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt_Restar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Bt_0, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bt_Punto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Bt_Sumar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bt_C, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bt_Igual, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt_resultado.getAccessibleContext().setAccessibleName("txt_res");
        Bt_7.getAccessibleContext().setAccessibleName("Button_7");
        Bt_8.getAccessibleContext().setAccessibleName("Button_8");
        Bt_9.getAccessibleContext().setAccessibleName("Button_9");
        Bt_4.getAccessibleContext().setAccessibleName("Button_4");
        Bt_5.getAccessibleContext().setAccessibleName("Button_5");
        Bt_6.getAccessibleContext().setAccessibleName("Button_6");
        Bt_1.getAccessibleContext().setAccessibleName("Button_1");
        Bt_2.getAccessibleContext().setAccessibleName("Button_2");
        Bt_3.getAccessibleContext().setAccessibleName("Button_3");
        Bt_0.getAccessibleContext().setAccessibleName("Button_0");
        Bt_Punto.getAccessibleContext().setAccessibleName("Button_Punto");
        Bt_Dividir.getAccessibleContext().setAccessibleName("Button_Division");
        Bt_Multiplicar.getAccessibleContext().setAccessibleName("Button_Mult");
        Bt_Restar.getAccessibleContext().setAccessibleName("Button_resta");
        Bt_Sumar.getAccessibleContext().setAccessibleName("Button_suma");
        Bt_Igual.getAccessibleContext().setAccessibleName("Button_igual");
        Bt_C.getAccessibleContext().setAccessibleName("Button_C");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_9ActionPerformed
        // TODO add your handling code here:
        valor = valor + "9";
        txt_resultado.setText(valor);
        
    }//GEN-LAST:event_Bt_9ActionPerformed

    private void Bt_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_6ActionPerformed
        // TODO add your handling code here:
        valor = valor + "6";
        txt_resultado.setText(valor);
    }//GEN-LAST:event_Bt_6ActionPerformed

    private void Bt_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_3ActionPerformed
        // TODO add your handling code here:
        valor = valor + "3";
        txt_resultado.setText(valor);
    }//GEN-LAST:event_Bt_3ActionPerformed

    private void Bt_DividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_DividirActionPerformed
        // TODO add your handling code here:
        if ((!valor.equals(""))&&(!txt_historial.getText().equals(""))){
            if (suma==true)
             JOptionPane.showMessageDialog(rootPane, "Hay una suma pendiente de realizar. Presione el boton =");
            if (resta==true)
             JOptionPane.showMessageDialog(rootPane, "Hay una resta pendiente de realizar. Presione el boton =");
            if (multiplicacion==true)
             JOptionPane.showMessageDialog(rootPane, "Hay una multiplicacion pendiente de realizar. Presione el boton =");
            if (division==true)
             JOptionPane.showMessageDialog(rootPane, "Hay una division pendiente de realizar. Presione el boton =");
        }
       else{
        if ((division==false)&& (!valor.equals(""))){
            if (resultado>0){
                numero1=resultado;
            }else
            {
                numero1=Double.parseDouble(valor);
            }
            signo = "/";
                if((suma==true)||(resta==true)||(multiplicacion==true)){
                    historial = historial;
                }
                else{
                    if (resultado == 0){
                        historial = historial + valor ;
                        valor = "";
                        txt_historial.setText(historial+signo);
                    }else{
                        historial = historial + signo + valor ;
                        valor = "";
                        txt_historial.setText(historial);
                    }
                }                
            punto = false;
           // valor = "";
            //seteamos los valores nuevamente
            suma = false;
            resta = false;
            division = true;
            multiplicacion = false;
        }else if ((division==false)&& (valor.equals(""))){
            signo = "/";
            txt_historial.setText(historial+signo);
             punto = false;
           // valor = "";
            //seteamos los valores nuevamente
            suma = false;
            resta = false;
            division = true;
            multiplicacion = false;
        }
         }
        
    }//GEN-LAST:event_Bt_DividirActionPerformed

    private void Bt_MultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_MultiplicarActionPerformed
        // TODO add your handling code here:
       if ((!valor.equals(""))&&(!txt_historial.getText().equals(""))){
            if (suma==true)
             JOptionPane.showMessageDialog(rootPane, "Hay una suma pendiente de realizar. Presione el boton =");
            if (resta==true)
             JOptionPane.showMessageDialog(rootPane, "Hay una resta pendiente de realizar. Presione el boton =");
            if (multiplicacion==true)
             JOptionPane.showMessageDialog(rootPane, "Hay una multiplicacion pendiente de realizar. Presione el boton =");
            if (division==true)
             JOptionPane.showMessageDialog(rootPane, "Hay una division pendiente de realizar. Presione el boton =");
        }
       else{
        if ((multiplicacion==false)&& (!valor.equals(""))){
            if (resultado>0){
                numero1=resultado;
            }else
            {
                numero1=Double.parseDouble(valor);
            }
            signo = "*";
                if((suma==true)||(resta==true)||(division==true)){
                    historial = historial;
                }
                else{
                    if (resultado == 0){
                        historial = historial + valor ;
                        valor = "";
                        txt_historial.setText(historial+signo);
                    }else{
                        historial = historial + signo + valor ;
                        valor = "";
                        txt_historial.setText(historial);
                    }
                }                
            punto = false;
           // valor = "";
            //seteamos los valores nuevamente
            suma = false;
            resta = false;
            division = false;
            multiplicacion = true;
        }else if ((multiplicacion==false)&& (valor.equals(""))){
            signo = "*";
            txt_historial.setText(historial+signo);
             punto = false;
           // valor = "";
            //seteamos los valores nuevamente
            suma = false;
            resta = false;
            division = false;
            multiplicacion = true;
        }
         }
    
    }//GEN-LAST:event_Bt_MultiplicarActionPerformed

    private void Bt_RestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_RestarActionPerformed
        // TODO add your handling code here:
         if ((!valor.equals(""))&&(!txt_historial.getText().equals(""))){
            if (suma==true)
             JOptionPane.showMessageDialog(rootPane, "Hay una suma pendiente de realizar. Presione el boton =");
            if (resta==true)
             JOptionPane.showMessageDialog(rootPane, "Hay una resta pendiente de realizar. Presione el boton =");
            if (multiplicacion==true)
             JOptionPane.showMessageDialog(rootPane, "Hay una multiplicacion pendiente de realizar. Presione el boton =");
            if (division==true)
             JOptionPane.showMessageDialog(rootPane, "Hay una division pendiente de realizar. Presione el boton =");
        }
       else{
        if ((resta==false)&& (!valor.equals(""))){
            if (resultado>0){
                numero1=resultado;
            }else
            {
                numero1=Double.parseDouble(valor);
            }
            signo = "-";
                if((suma==true)||(multiplicacion==true)||(division==true)){
                    historial = historial;
                }
                else{
                    if (resultado == 0){
                        historial = historial + valor ;
                        valor = "";
                        txt_historial.setText(historial+signo);
                    }else{
                        historial = historial + signo + valor ;
                        valor = "";
                        txt_historial.setText(historial);
                    }
                }                
            punto = false;
           // valor = "";
            //seteamos los valores nuevamente
            suma = false;
            resta = true;
            division = false;
            multiplicacion = false;
        }else if ((resta==false)&& (valor.equals(""))){
            signo = "-";
            txt_historial.setText(historial+signo);
             punto = false;
           // valor = "";
            //seteamos los valores nuevamente
            suma = false;
            resta = true;
            division = false;
            multiplicacion = false;
        }
         }
    }//GEN-LAST:event_Bt_RestarActionPerformed

    private void Bt_SumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_SumarActionPerformed
        // TODO add your handling code here:
       //JOptionPane.showMessageDialog(rootPane, suma);
       //JOptionPane.showMessageDialog(rootPane, valor);
       //.showMessageDialog(rootPane, numero2);
       
       if ((!valor.equals(""))&&(!txt_historial.getText().equals(""))){
            if (suma==true)
             JOptionPane.showMessageDialog(rootPane, "Hay una suma pendiente de realizar. Presione el boton =");
            if (resta==true)
             JOptionPane.showMessageDialog(rootPane, "Hay una resta pendiente de realizar. Presione el boton =");
            if (multiplicacion==true)
             JOptionPane.showMessageDialog(rootPane, "Hay una multiplicacion pendiente de realizar. Presione el boton =");
            if (division==true)
             JOptionPane.showMessageDialog(rootPane, "Hay una division pendiente de realizar. Presione el boton =");
        }
       else{
        if ((suma==false)&& (!valor.equals(""))){
            if (resultado>0){
                numero1=resultado;
            }else
            {
                numero1=Double.parseDouble(valor);
            }
            signo = "+";
                if((resta==true)||(multiplicacion==true)||(division==true)){
                    historial = historial;
                }
                else{
                    if (resultado == 0){
                        historial = historial + valor ;
                        valor = "";
                        txt_historial.setText(historial+signo);
                    }else{
                        historial = historial + signo + valor ;
                        valor = "";
                        txt_historial.setText(historial);
                    }
                }                
            punto = false;
           // valor = "";
            //seteamos los valores nuevamente
            suma = true;
            resta = false;
            division = false;
            multiplicacion = false;
        }else if ((suma==false)&& (valor.equals(""))){
            signo = "+";
            txt_historial.setText(historial+signo);
             punto = false;
           // valor = "";
            //seteamos los valores nuevamente
            suma = true;
            resta = false;
            division = false;
            multiplicacion = false;
        }
       }
    }//GEN-LAST:event_Bt_SumarActionPerformed

    private void Bt_IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_IgualActionPerformed
        // TODO add your handling code here:
        if (!valor.equals("")){
            if (suma == true){
             numero2=Double.parseDouble(valor);
             resultado = numero1 + numero2;
             txt_resultado.setText(String.valueOf(resultado));
             historial = historial + signo;
            }
            else if (resta == true){
                 numero2=Double.parseDouble(valor);
                 resultado = numero1 - numero2;
                 txt_resultado.setText(String.valueOf(resultado));
                 historial = historial + signo;
            }
            else if (multiplicacion == true){
                 numero2=Double.parseDouble(valor);
                 resultado = numero1 * numero2;
                 txt_resultado.setText(String.valueOf(resultado));
                  historial = historial + signo;
            }
            else if (division == true){
                 numero2=Double.parseDouble(valor);
                 if (numero2==0){
                     JOptionPane.showMessageDialog(rootPane, "Error. Incorrecto. Division 0");
                 }
                 else{
                    resultado = numero1 / numero2;
                    txt_resultado.setText(String.valueOf(resultado));
                    historial = historial + signo;
                 }
            }
            historial = historial + valor;
            txt_historial.setText(historial);
            numero1=resultado;
            valor = "";
            suma = false;
            resta = false;
            division = false;
            multiplicacion = false;
        }
        
    }//GEN-LAST:event_Bt_IgualActionPerformed

    private void Bt_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_0ActionPerformed
        // TODO add your handling code here:
        valor = valor + "0";
        txt_resultado.setText(valor);
        
    }//GEN-LAST:event_Bt_0ActionPerformed

    private void Bt_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_1ActionPerformed
        // TODO add your handling code here:
        valor = valor + "1";
        txt_resultado.setText(valor);
    }//GEN-LAST:event_Bt_1ActionPerformed

    private void Bt_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_2ActionPerformed
        // TODO add your handling code here:
        valor = valor + "2";
        txt_resultado.setText(valor);
    }//GEN-LAST:event_Bt_2ActionPerformed

    private void Bt_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_4ActionPerformed
        // TODO add your handling code here:
        valor = valor + "4";
        txt_resultado.setText(valor);
    }//GEN-LAST:event_Bt_4ActionPerformed

    private void Bt_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_5ActionPerformed
        // TODO add your handling code here:
        valor = valor + "5";
        txt_resultado.setText(valor);
    }//GEN-LAST:event_Bt_5ActionPerformed

    private void Bt_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_7ActionPerformed
        // TODO add your handling code here:
        valor = valor + "7";
        txt_resultado.setText(valor);
    }//GEN-LAST:event_Bt_7ActionPerformed

    private void Bt_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_8ActionPerformed
        // TODO add your handling code here:
        valor = valor + "8";
        txt_resultado.setText(valor);
    }//GEN-LAST:event_Bt_8ActionPerformed

    private void Bt_PuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_PuntoActionPerformed
        // TODO add your handling code here:
        if (punto == false){
            punto = true;
            if (txt_resultado.getText().equals("0")){
                valor = "0.";
            }
            else{
                valor = valor + ".";
            }
            txt_resultado.setText(valor);
        }
    }//GEN-LAST:event_Bt_PuntoActionPerformed

    private void Bt_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_CActionPerformed
        // TODO add your handling code here:
        //reiniciar variables
        valor = "";
        historial = "";
        txt_resultado.setText("0");
        txt_historial.setText("");
        punto = false;
        numero1 = 0;
        numero2 = 0;
        resultado = 0;
        suma = false;
        resta = false;
        division = false;
        multiplicacion = false;
    }//GEN-LAST:event_Bt_CActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_0;
    private javax.swing.JButton Bt_1;
    private javax.swing.JButton Bt_2;
    private javax.swing.JButton Bt_3;
    private javax.swing.JButton Bt_4;
    private javax.swing.JButton Bt_5;
    private javax.swing.JButton Bt_6;
    private javax.swing.JButton Bt_7;
    private javax.swing.JButton Bt_8;
    private javax.swing.JButton Bt_9;
    private javax.swing.JButton Bt_C;
    private javax.swing.JButton Bt_Dividir;
    private javax.swing.JButton Bt_Igual;
    private javax.swing.JButton Bt_Multiplicar;
    private javax.swing.JButton Bt_Punto;
    private javax.swing.JButton Bt_Restar;
    private javax.swing.JButton Bt_Sumar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_historial;
    private javax.swing.JTextField txt_resultado;
    // End of variables declaration//GEN-END:variables
}
