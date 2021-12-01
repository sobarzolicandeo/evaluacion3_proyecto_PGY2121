/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.Registro;
import javax.swing.JOptionPane;

/**
 *
 * @author adriana.barraza
 */
public class EliminarEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form EliminarEmpleado
     */
    public EliminarEmpleado() {
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

        jLabel1 = new javax.swing.JLabel();
        jtxt_numRut = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbtn_eliminar = new javax.swing.JButton();
        jbtn_volver = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtxt_numRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_numRutActionPerformed(evt);
            }
        });

        jLabel2.setText("Rut sin dígito verificador:");

        jbtn_eliminar.setText("Eliminar");
        jbtn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_eliminarActionPerformed(evt);
            }
        });

        jbtn_volver.setText("Volver");
        jbtn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jbtn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_numRut, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxt_numRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_eliminar)
                    .addComponent(jbtn_volver))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_numRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_numRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_numRutActionPerformed

    private void jbtn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_volverActionPerformed
        dispose();
    }//GEN-LAST:event_jbtn_volverActionPerformed

    private void jbtn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_eliminarActionPerformed
        String numRut;
        numRut = this.jtxt_numRut.getText();
        
        Registro reg = new Registro();
        
        int opcion = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar?", "Aviso", 1);
        
        if (opcion == 0 ) {
            if (reg.buscarEmpleado(reg.buscarTodos(), numRut) == true) {
                if (reg.eliminar(numRut)) {
                    JOptionPane.showMessageDialog(this, "Empleado Eliminado exitosamente", "Información",1);
                    this.jtxt_numRut.setText("");
                } else {
                  JOptionPane.showMessageDialog(this, "Error al eliminar empleado", "Información", 0);
                }
            } else {
            JOptionPane.showMessageDialog(this, "Empleado no existe", "Información", 2);
        }
        }
    }//GEN-LAST:event_jbtn_eliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbtn_eliminar;
    private javax.swing.JButton jbtn_volver;
    private javax.swing.JTextField jtxt_numRut;
    // End of variables declaration//GEN-END:variables
}
