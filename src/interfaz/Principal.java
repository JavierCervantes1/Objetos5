/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Tareas
 */
public class Principal extends javax.swing.JFrame {

    Cuenta c;
    double saldo;
    int sw;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        cmdCrear.setEnabled(true);
        cmdIngresar.setEnabled(false);
        cmdRetirar.setEnabled(false);
        cmdActualizar.setEnabled(false);
        cmdMostrar.setEnabled(false);
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtCuenta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        txtIngresar = new javax.swing.JTextField();
        cmdIngresar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtRetirar = new javax.swing.JTextField();
        cmdRetirar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        txtIan = new javax.swing.JTextField();
        cmdActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cuenta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 70, 20));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txtCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 130, -1));

        jLabel3.setText("No. Cuenta");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 80, 20));
        jPanel2.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 130, -1));

        jLabel4.setText("No. Identificacion");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 110, 20));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 260, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 280, 140));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar Saldo"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(txtIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, -1));

        cmdIngresar.setText("Ingresar");
        cmdIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdIngresarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 110, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 280, 60));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Retirar Saldo"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(txtRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, -1));

        cmdRetirar.setText("Retirar");
        cmdRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRetirarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 120, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 290, 60));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel5.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, -1));

        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel5.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 120, -1));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel5.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 120, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 180, 190));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setEditable(false);
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 250, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 280, 130));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Interes Anual"));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(txtIan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, -1));

        cmdActualizar.setText("Actualizar Saldo");
        cmdActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdActualizarActionPerformed(evt);
            }
        });
        jPanel7.add(cmdActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 120, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 290, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        // TODO add your handling code here:
        long cuenta, id;
        sw = 1;

        if (txtCuenta.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite su numero de Cuenta", "Error", 2);
            txtCuenta.requestFocusInWindow();
            sw = 0;
        } else if (txtIdentificacion.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite su numero de Identificacion", "Error", 2);
            txtIdentificacion.requestFocusInWindow();
            sw = 0;
        } else {
            try {
                cuenta = Integer.parseInt(txtCuenta.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese su numero de cuenta correctamente", "Error", 2);
                txtCuenta.requestFocusInWindow();
                txtCuenta.selectAll();
                sw = 0;
            }
            try {
                id = Integer.parseInt(txtIdentificacion.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese su numero de identificacion correctamente", "Error", 2);
                txtIdentificacion.requestFocusInWindow();
                txtIdentificacion.selectAll();
                sw = 0;
            }
        }
        if (sw == 1) {
            cuenta = Long.parseLong(txtCuenta.getText());
            id = Long.parseLong(txtIdentificacion.getText());

            JOptionPane.showMessageDialog(this, "Cuenta creada exitosamente", "Informacion", 1);

            c = new Cuenta(cuenta, id);
            cmdCrear.setEnabled(false);
            cmdIngresar.setEnabled(true);
            cmdRetirar.setEnabled(false);
            cmdActualizar.setEnabled(false);
            cmdMostrar.setEnabled(true);
        }

    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdIngresarActionPerformed
        // TODO add your handling code here:
        sw = 1;
        if (txtIngresar.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el saldo por favor", "Error", 2);
            txtIngresar.requestFocusInWindow();
            sw = 0;
        } else {
            try {
                saldo = Integer.parseInt(txtIngresar.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese el saldo correctamente", "Error", 2);
                txtIngresar.requestFocusInWindow();
                txtIngresar.selectAll();
                sw = 0;
            }
        }
        if (sw == 1) {
            saldo = Double.parseDouble(txtIngresar.getText());
            if (saldo <= -1) {
                JOptionPane.showMessageDialog(this, "No puede ingresar un monto negativo", "Error", 2);
                txtIngresar.requestFocusInWindow();
                txtIngresar.selectAll();
            } else {
                c.ingresar(saldo);
                JOptionPane.showMessageDialog(this, "Saldo ingresado exitosamente", "Informacion", 1);
                cmdCrear.setEnabled(false);
                cmdIngresar.setEnabled(true);
                cmdRetirar.setEnabled(true);
                cmdActualizar.setEnabled(true);
                cmdMostrar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_cmdIngresarActionPerformed

    private void cmdRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRetirarActionPerformed
        // TODO add your handling code here:
        sw = 1;
        if (txtRetirar.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el saldo a retirar por favor", "Error", 2);
            txtRetirar.requestFocusInWindow();
            sw = 0;
        } else if (c.getSaldo_actual() <= -1) {
            JOptionPane.showMessageDialog(this, "No tiene suficiente monto para retirar esta cantidad", "Error", 2);
            txtRetirar.requestFocusInWindow();
            txtRetirar.selectAll();
            sw = 0;
        } else {
            try {
                saldo = Integer.parseInt(txtRetirar.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese el saldo a retirar correctamente", "Error", 2);
                txtRetirar.requestFocusInWindow();
                txtRetirar.selectAll();
                sw = 0;
            }

        }
        if (sw == 1) {

            saldo = Double.parseDouble(txtRetirar.getText());

            if (saldo <= -1) {
                JOptionPane.showMessageDialog(this, "No puede retirar un monto negativo", "Error", 2);
                txtRetirar.requestFocusInWindow();
                txtRetirar.selectAll();

            } else {
                c.retirar(saldo);
                if (c.getSaldo_actual() <= -1) {
                    JOptionPane.showMessageDialog(this, "No tiene suficiente monto para retirar esta cantidad", "Error fatal", 2);
                    cmdCrear.setEnabled(false);
                    cmdIngresar.setEnabled(false);
                    cmdRetirar.setEnabled(false);
                    cmdActualizar.setEnabled(false);
                    cmdMostrar.setEnabled(true);
                    cmdLimpiar.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Saldo retirado exitosamente", "Informacion", 1);
                    cmdCrear.setEnabled(false);
                    cmdIngresar.setEnabled(true);
                    cmdRetirar.setEnabled(true);
                    cmdActualizar.setEnabled(true);
                    cmdMostrar.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_cmdRetirarActionPerformed

    private void cmdActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdActualizarActionPerformed
        // TODO add your handling code here:
        sw = 1;
        if (txtIan.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el interés anual por favor", "Error", 2);
            txtIan.requestFocusInWindow();
            sw = 0;
        } else {
            try {
                saldo = Integer.parseInt(txtIan.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese el interés anual correctamente", "Error", 2);
                txtIan.requestFocusInWindow();
                txtIan.selectAll();
                sw = 0;
            }
        }
        if (sw == 1) {
            saldo = Double.parseDouble(txtIan.getText());
            if (saldo <= -1) {
                JOptionPane.showMessageDialog(this, "No puede ingresar interes anual negativo", "Error", 2);
                txtIan.requestFocusInWindow();
                txtIan.selectAll();
            } else {
                c.actulizarSaldo(saldo);
                JOptionPane.showMessageDialog(this, "Saldo actualizado exitosamente", "Informacion", 1);
                cmdCrear.setEnabled(false);
                cmdIngresar.setEnabled(true);
                cmdRetirar.setEnabled(true);
                cmdActualizar.setEnabled(true);
                cmdMostrar.setEnabled(true);
            }
        }

    }//GEN-LAST:event_cmdActualizarActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
        // TODO add your handling code here:
        if (c.getSaldo_actual() <= -1) {
            JOptionPane.showMessageDialog(this, "Error al intentar retirar saldo", "Error fatal", 2);
            JOptionPane.showMessageDialog(this, "Por favor reinicie el proceso", "Aviso", 2);
            txtCuenta.setText("");
            txtIdentificacion.setText("");
            txtIngresar.setText("");
            txtRetirar.setText("");
            txtIan.setText("");
            txtResultado.setText("");
            txtCuenta.requestFocusInWindow();
            cmdCrear.setEnabled(true);
            cmdIngresar.setEnabled(false);
            cmdRetirar.setEnabled(false);
            cmdActualizar.setEnabled(false);
            cmdMostrar.setEnabled(false);
        } else {
            txtResultado.setText("" + c.mostrar());

        }
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        // TODO add your handling code here:
        txtCuenta.setText("");
        txtIdentificacion.setText("");
        txtIngresar.setText("");
        txtRetirar.setText("");
        txtIan.setText("");
        txtResultado.setText("");
        txtIngresar.requestFocusInWindow();

    }//GEN-LAST:event_cmdLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdActualizar;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdIngresar;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JButton cmdRetirar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtCuenta;
    private javax.swing.JTextField txtIan;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtIngresar;
    private javax.swing.JTextArea txtResultado;
    private javax.swing.JTextField txtRetirar;
    // End of variables declaration//GEN-END:variables
}
