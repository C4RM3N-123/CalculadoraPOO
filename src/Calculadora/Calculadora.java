package Calculadora;

public class Calculadora extends javax.swing.JFrame {

    public float num1;
    public float num2;
    public String operador;
        
    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Ventana = new javax.swing.JLabel();
        casillaC = new javax.swing.JToggleButton();
        casdivi = new javax.swing.JToggleButton();
        casmul = new javax.swing.JToggleButton();
        casres = new javax.swing.JToggleButton();
        casilla7 = new javax.swing.JToggleButton();
        casilla8 = new javax.swing.JToggleButton();
        casilla9 = new javax.swing.JToggleButton();
        cassum = new javax.swing.JToggleButton();
        casilla4 = new javax.swing.JToggleButton();
        casilla5 = new javax.swing.JToggleButton();
        casila6 = new javax.swing.JToggleButton();
        casilla1 = new javax.swing.JToggleButton();
        casilla2 = new javax.swing.JToggleButton();
        casilla3 = new javax.swing.JToggleButton();
        casigu = new javax.swing.JToggleButton();
        casilla0 = new javax.swing.JToggleButton();
        caspunt = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        Ventana.setBackground(new java.awt.Color(153, 153, 153));
        Ventana.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Ventana.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        casillaC.setBackground(new java.awt.Color(153, 153, 153));
        casillaC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        casillaC.setText("C");
        casillaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casillaCActionPerformed(evt);
            }
        });

        casdivi.setBackground(new java.awt.Color(153, 153, 153));
        casdivi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        casdivi.setText("/");
        casdivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casdiviActionPerformed(evt);
            }
        });

        casmul.setBackground(new java.awt.Color(153, 153, 153));
        casmul.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        casmul.setText("*");
        casmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casmulActionPerformed(evt);
            }
        });

        casres.setBackground(new java.awt.Color(153, 153, 153));
        casres.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        casres.setText("-");
        casres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casresActionPerformed(evt);
            }
        });

        casilla7.setBackground(new java.awt.Color(102, 102, 102));
        casilla7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        casilla7.setText("7");
        casilla7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla7ActionPerformed(evt);
            }
        });

        casilla8.setBackground(new java.awt.Color(102, 102, 102));
        casilla8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        casilla8.setText("8");
        casilla8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla8ActionPerformed(evt);
            }
        });

        casilla9.setBackground(new java.awt.Color(102, 102, 102));
        casilla9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        casilla9.setText("9");
        casilla9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla9ActionPerformed(evt);
            }
        });

        cassum.setBackground(new java.awt.Color(153, 153, 153));
        cassum.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cassum.setText("+");
        cassum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cassumActionPerformed(evt);
            }
        });

        casilla4.setBackground(new java.awt.Color(102, 102, 102));
        casilla4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        casilla4.setText("4");
        casilla4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla4ActionPerformed(evt);
            }
        });

        casilla5.setBackground(new java.awt.Color(102, 102, 102));
        casilla5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        casilla5.setText("5");
        casilla5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla5ActionPerformed(evt);
            }
        });

        casila6.setBackground(new java.awt.Color(102, 102, 102));
        casila6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        casila6.setText("6");
        casila6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casila6ActionPerformed(evt);
            }
        });

        casilla1.setBackground(new java.awt.Color(102, 102, 102));
        casilla1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        casilla1.setText("1");
        casilla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla1ActionPerformed(evt);
            }
        });

        casilla2.setBackground(new java.awt.Color(102, 102, 102));
        casilla2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        casilla2.setText("2");
        casilla2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla2ActionPerformed(evt);
            }
        });

        casilla3.setBackground(new java.awt.Color(102, 102, 102));
        casilla3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        casilla3.setText("3");
        casilla3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla3ActionPerformed(evt);
            }
        });

        casigu.setBackground(new java.awt.Color(153, 153, 153));
        casigu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        casigu.setText("=");
        casigu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casiguActionPerformed(evt);
            }
        });

        casilla0.setBackground(new java.awt.Color(102, 102, 102));
        casilla0.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        casilla0.setText("0");
        casilla0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla0ActionPerformed(evt);
            }
        });

        caspunt.setBackground(new java.awt.Color(153, 153, 153));
        caspunt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        caspunt.setText(".");
        caspunt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caspuntActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(casillaC, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(casdivi, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(casmul, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(casres, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(casilla7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(casilla8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(casilla9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(casilla4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(casilla5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(casila6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cassum, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(casilla1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(casilla2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(casilla3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(casilla0, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(caspunt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(casigu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ventana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Ventana, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(casillaC, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casdivi, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casmul, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casres, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(casilla7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(casilla4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casila6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cassum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(casilla1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casilla3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(casilla0, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caspunt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(casigu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void casillaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casillaCActionPerformed
       this.Ventana.setText("");
    }//GEN-LAST:event_casillaCActionPerformed

    private void casdiviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casdiviActionPerformed
        this.num1=Float.parseFloat(this.Ventana.getText());
        this.operador="/";
        this.Ventana.setText("");
    }//GEN-LAST:event_casdiviActionPerformed

    private void casmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casmulActionPerformed
        this.num1=Float.parseFloat(this.Ventana.getText());
        this.operador="*";
        this.Ventana.setText("");
    }//GEN-LAST:event_casmulActionPerformed

    private void casresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casresActionPerformed
        this.num1=Float.parseFloat(this.Ventana.getText());
        this.operador="-";
        this.Ventana.setText("");
    }//GEN-LAST:event_casresActionPerformed

    private void casilla7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla7ActionPerformed
        this.Ventana.setText(this.Ventana.getText()+"7");
    }//GEN-LAST:event_casilla7ActionPerformed

    private void casilla8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla8ActionPerformed
       this.Ventana.setText(this.Ventana.getText()+"8");
    }//GEN-LAST:event_casilla8ActionPerformed

    private void casilla9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla9ActionPerformed
        this.Ventana.setText(this.Ventana.getText()+"9");
    }//GEN-LAST:event_casilla9ActionPerformed

    private void cassumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cassumActionPerformed
        this.num1=Float.parseFloat(this.Ventana.getText());
        this.operador="+";
        this.Ventana.setText("");
    }//GEN-LAST:event_cassumActionPerformed

    private void casilla4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla4ActionPerformed
       this.Ventana.setText(this.Ventana.getText()+"4");
    }//GEN-LAST:event_casilla4ActionPerformed

    private void casilla5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla5ActionPerformed
       this.Ventana.setText(this.Ventana.getText()+"5");
    }//GEN-LAST:event_casilla5ActionPerformed

    private void casila6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casila6ActionPerformed
        this.Ventana.setText(this.Ventana.getText()+"6");
    }//GEN-LAST:event_casila6ActionPerformed

    private void casilla1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla1ActionPerformed
        this.Ventana.setText(this.Ventana.getText()+"1");
    }//GEN-LAST:event_casilla1ActionPerformed

    private void casilla2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla2ActionPerformed
        this.Ventana.setText(this.Ventana.getText()+"2");
    }//GEN-LAST:event_casilla2ActionPerformed

    private void casilla3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla3ActionPerformed
        this.Ventana.setText(this.Ventana.getText()+"3");
    }//GEN-LAST:event_casilla3ActionPerformed

    private void casiguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casiguActionPerformed
        this.num2=Float.parseFloat(this.Ventana.getText());
        
        switch(this.operador){
            case "+":this.Ventana.setText(sincero(this.num1+this.num2));break;
            case "-":this.Ventana.setText(sincero(this.num1-this.num2));break;
            case "*":this.Ventana.setText(sincero(this.num1*this.num2));break;
            case "/":if(this.num2==0){
                this.Ventana.setText("Error");                
            }
            else {
                this.Ventana.setText(sincero(this.num1/this.num2));}
            break;
        }
    }//GEN-LAST:event_casiguActionPerformed

    private void casilla0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla0ActionPerformed
       this.Ventana.setText(this.Ventana.getText()+"0");
    }//GEN-LAST:event_casilla0ActionPerformed

    private void caspuntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caspuntActionPerformed
        if (!(this.Ventana.getText().contains("."))){
            this.Ventana.setText(this.Ventana.getText()+".");
        }
    }//GEN-LAST:event_caspuntActionPerformed
    public String sincero(float resultado){
        String retorno="";
        retorno = Float.toString(resultado);
        
        if(resultado%1==0){
            retorno=retorno.substring(0, retorno.length()-2);
        }
        return retorno;
    }
    
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
    private javax.swing.JLabel Ventana;
    private javax.swing.JToggleButton casdivi;
    private javax.swing.JToggleButton casigu;
    private javax.swing.JToggleButton casila6;
    private javax.swing.JToggleButton casilla0;
    private javax.swing.JToggleButton casilla1;
    private javax.swing.JToggleButton casilla2;
    private javax.swing.JToggleButton casilla3;
    private javax.swing.JToggleButton casilla4;
    private javax.swing.JToggleButton casilla5;
    private javax.swing.JToggleButton casilla7;
    private javax.swing.JToggleButton casilla8;
    private javax.swing.JToggleButton casilla9;
    private javax.swing.JToggleButton casillaC;
    private javax.swing.JToggleButton casmul;
    private javax.swing.JToggleButton caspunt;
    private javax.swing.JToggleButton casres;
    private javax.swing.JToggleButton cassum;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
