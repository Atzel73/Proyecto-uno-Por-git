package conectar;


import javax.swing.JOptionPane;
 import com.mysql.jdbc.PreparedStatement;
 import com.mysql.jdbc.Statement;
 import datechooser.beans.DateChooserPanel;
 import java.sql.Connection;
 import java.sql.ResultSet;
 import java.sql.SQLException;
 import java.util.Date;
 import java.util.logging.Level;
 import java.util.logging.Logger;
 import javax.image.io.IIOException;
 import javax.swing.JOptionPane;
 import javax.swing.JTextField;
 import javax.swing.table.DefaultTableModel;

public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        eti1 = new javax.swing.JLabel();
        eti2 = new javax.swing.JLabel();
        eti6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        BotonEn = new javax.swing.JButton();
        BotonFin = new javax.swing.JButton();
        eti3 = new javax.swing.JLabel();
        eti4 = new javax.swing.JLabel();
        texto2 = new javax.swing.JTextField();
        texto3 = new javax.swing.JTextField();
        texto4 = new javax.swing.JTextField();
        BotonBor = new javax.swing.JButton();
        eti7 = new javax.swing.JLabel();
        boxUn = new javax.swing.JCheckBox();
        boxDos = new javax.swing.JCheckBox();
        eti5 = new javax.swing.JLabel();
        texto5 = new javax.swing.JTextField();
        Bott2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        testo1 = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        eti1.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        eti1.setForeground(new java.awt.Color(0, 0, 204));
        eti1.setText("Nombre");

        eti2.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        eti2.setForeground(new java.awt.Color(0, 51, 153));
        eti2.setText("Apellidos");

        eti6.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        eti6.setForeground(new java.awt.Color(51, 0, 204));
        eti6.setText("Tipo de instrumento");

        jComboBox1.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Viento", "Cuerda", "Percusion", "Electrofono", "Idiofono" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        BotonEn.setBackground(new java.awt.Color(255, 255, 255));
        BotonEn.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        BotonEn.setForeground(new java.awt.Color(102, 0, 255));
        BotonEn.setText("Enviar");
        BotonEn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEnActionPerformed(evt);
            }
        });

        BotonFin.setBackground(new java.awt.Color(255, 255, 255));
        BotonFin.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        BotonFin.setForeground(new java.awt.Color(102, 0, 255));
        BotonFin.setText("Terminar");
        BotonFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFinActionPerformed(evt);
            }
        });

        eti3.setForeground(new java.awt.Color(0, 0, 204));
        eti3.setText("Correo electronico");

        eti4.setForeground(new java.awt.Color(0, 0, 204));
        eti4.setText("Numero de telefono");

        texto2.setBackground(new java.awt.Color(204, 204, 255));

        texto3.setBackground(new java.awt.Color(204, 204, 255));

        texto4.setBackground(new java.awt.Color(204, 204, 255));
        texto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto4ActionPerformed(evt);
            }
        });

        BotonBor.setBackground(new java.awt.Color(255, 255, 255));
        BotonBor.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        BotonBor.setForeground(new java.awt.Color(102, 0, 255));
        BotonBor.setText("Eliminar registros");
        BotonBor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorActionPerformed(evt);
            }
        });

        eti7.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        eti7.setForeground(new java.awt.Color(0, 51, 204));
        eti7.setText("¿Tienes experiencia con los instrumentos?");

        boxUn.setBackground(new java.awt.Color(204, 204, 255));
        boxUn.setText("Sí");
        boxUn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxUnActionPerformed(evt);
            }
        });

        boxDos.setBackground(new java.awt.Color(204, 204, 255));
        boxDos.setText("No");
        boxDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxDosActionPerformed(evt);
            }
        });

        eti5.setForeground(new java.awt.Color(0, 0, 204));
        eti5.setText("Dirección de casa");

        texto5.setBackground(new java.awt.Color(204, 204, 255));

        Bott2.setBackground(new java.awt.Color(255, 255, 255));
        Bott2.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        Bott2.setForeground(new java.awt.Color(102, 0, 255));
        Bott2.setText("Editar registro");
        Bott2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bott2ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("e:\\Users\\Propietario\\Downloads\\mioda.jfif")); // NOI18N

        testo1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(eti2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(eti1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(texto2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                            .addComponent(testo1)))
                                    .addComponent(boxUn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(eti3)
                                        .addGap(18, 18, 18)
                                        .addComponent(texto3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(eti5)
                                        .addGap(18, 18, 18)
                                        .addComponent(texto5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addComponent(eti4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(texto4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70)
                                        .addComponent(jLabel3))))
                            .addComponent(eti6)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(boxDos)
                                .addComponent(eti7, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(BotonEn)
                        .addGap(32, 32, 32)
                        .addComponent(BotonFin)
                        .addGap(18, 18, 18)
                        .addComponent(BotonBor)
                        .addGap(18, 18, 18)
                        .addComponent(Bott2)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eti1)
                            .addComponent(testo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eti2)
                            .addComponent(eti4)
                            .addComponent(texto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texto4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(eti6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(eti7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxUn)
                            .addComponent(boxDos))
                        .addGap(144, 144, 144))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eti3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(texto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eti5)
                            .addComponent(texto5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonEn)
                    .addComponent(BotonFin)
                    .addComponent(BotonBor)
                    .addComponent(Bott2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void BotonEnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEnActionPerformed
        JOptionPane.showMessageDialog(null, "Tus datos han sido guardados correctamente");
        testo1.setText("");
        texto2.setText("");
        texto3.setText("");
        texto4.setText("");
    }//GEN-LAST:event_BotonEnActionPerformed

    private void texto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto4ActionPerformed

    private void BotonBorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorActionPerformed
        testo1.setText("");
        texto2.setText("");
        texto3.setText("");
        texto4.setText("");
        texto5.setText("");
    }//GEN-LAST:event_BotonBorActionPerformed

    private void BotonFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFinActionPerformed
       System.exit(0);
    }//GEN-LAST:event_BotonFinActionPerformed

    private void boxUnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxUnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxUnActionPerformed

    private void boxDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxDosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxDosActionPerformed

    private void Bott2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bott2ActionPerformed
         edicion Bott2= new edicion();
        Bott2.setVisible(true);
    }//GEN-LAST:event_Bott2ActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }
  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBor;
    private javax.swing.JButton BotonEn;
    private javax.swing.JButton BotonFin;
    private javax.swing.JButton Bott2;
    private javax.swing.JCheckBox boxDos;
    private javax.swing.JCheckBox boxUn;
    private javax.swing.JLabel eti1;
    private javax.swing.JLabel eti2;
    private javax.swing.JLabel eti3;
    private javax.swing.JLabel eti4;
    private javax.swing.JLabel eti5;
    private javax.swing.JLabel eti6;
    private javax.swing.JLabel eti7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField testo1;
    private javax.swing.JTextField texto2;
    private javax.swing.JTextField texto3;
    private javax.swing.JTextField texto4;
    private javax.swing.JTextField texto5;
    // End of variables declaration//GEN-END:variables
}
