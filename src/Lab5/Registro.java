/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author dessi
 */
public class Registro extends javax.swing.JFrame {

    BaseDeDatos b = new BaseDeDatos();
    ArrayList<Usuarios> listaUsuarios = new ArrayList();

    /**
     * Creates new form Registro
     *
     */
    public Registro() {
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

        jTextField5 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1_Registro = new javax.swing.JLabel();
        jLabel2_Nombre = new javax.swing.JLabel();
        jLabel3_Usuario = new javax.swing.JLabel();
        jLabel2_Nombre2 = new javax.swing.JLabel();
        jLabel5_Personaje = new javax.swing.JLabel();
        jLabel6_Cuenta = new javax.swing.JLabel();
        jLabel4_Contraseña = new javax.swing.JLabel();
        jTextField2_Usuario = new javax.swing.JTextField();
        jTextField1_Nombre = new javax.swing.JTextField();
        jTextField4_Edad = new javax.swing.JTextField();
        jTextField5_PersonajeFav = new javax.swing.JTextField();
        jTextField6_CuentaBanc = new javax.swing.JTextField();
        jTextField3_Contraseña = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        jTextField5.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1_Registro.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel1_Registro.setText("Registro");

        jLabel2_Nombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2_Nombre.setText("Nombre:");

        jLabel3_Usuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3_Usuario.setText("Usuario:");

        jLabel2_Nombre2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2_Nombre2.setText("Edad:");

        jLabel5_Personaje.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5_Personaje.setText("Personaje Favorito:");

        jLabel6_Cuenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6_Cuenta.setText("Cuenta Bancaria:");

        jLabel4_Contraseña.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4_Contraseña.setText("Contraseña:");

        jTextField1_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_NombreActionPerformed(evt);
            }
        });

        jTextField5_PersonajeFav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5_PersonajeFavActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jRadioButton1.setText("Administrador");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jRadioButton2.setText("Comprador");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jRadioButton3.setText("Vendedor");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setText("Registrarme");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4_Contraseña)
                            .addComponent(jLabel2_Nombre)
                            .addComponent(jTextField1_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3_Usuario)
                            .addComponent(jLabel2_Nombre2)
                            .addComponent(jTextField2_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5_Personaje)
                                    .addComponent(jTextField5_PersonajeFav, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField6_CuentaBanc, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6_Cuenta))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1_Registro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1_Registro)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2_Nombre)
                    .addComponent(jLabel3_Usuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4_Contraseña)
                    .addComponent(jLabel2_Nombre2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jTextField4_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5_Personaje)
                    .addComponent(jLabel6_Cuenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5_PersonajeFav, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6_CuentaBanc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_NombreActionPerformed

    private void jTextField5_PersonajeFavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5_PersonajeFavActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5_PersonajeFavActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        String nombre;
        String nombreU;
        String contraseña;
        int edad;
        String PFav;
        float estrellas = 0;
        Random ran = new Random();
        int dinero = 0;
        boolean display = false;

        if (jRadioButton1.isSelected()) {
            nombre = jTextField1_Nombre.getText();
            nombreU = jTextField2_Usuario.getText();
            contraseña = jTextField3_Contraseña.getText();
            edad = Integer.parseInt(jTextField4_Edad.getText());

            try {
                listaUsuarios.add(new Administrador(nombre, nombreU, contraseña, edad));
                b.setListadeusuarios(listaUsuarios);
                display = true;
            } catch (ExceptionNintendo e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }

            if (display == true) {
                Admin newAdP = new Admin();
                newAdP.setVisible(true);
                this.dispose();
            }
        }

        if (jRadioButton2.isSelected()) {
            CuentaBancaria cuentab = new CuentaBancaria();
            nombre = jTextField1_Nombre.getText();
            nombreU = jTextField2_Usuario.getText();
            contraseña = jTextField3_Contraseña.getText();
            edad = Integer.parseInt(jTextField4_Edad.getText());
            dinero = ran.nextInt(10000) + 2000;

            try {
                cuentab.setSaldoDis(dinero);
            } catch (ExceptionNintendo e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }

            try {
                listaUsuarios.add(new Vendedor(estrellas, 0, contraseña, nombre, nombreU, contraseña, edad));
                b.setListadeusuarios(listaUsuarios);
                display = true;
            } catch (ExceptionNintendo e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }

            if (display == true) {
                CompradorPanel newVP = new CompradorPanel();
                newVP.setVisible(true);
                this.dispose();

            }

        }

        if (jRadioButton3.isSelected()) {
            CuentaBancaria cuentab = new CuentaBancaria();

            nombre = jTextField1_Nombre.getText();
            nombreU = jTextField2_Usuario.getText();
            contraseña = jTextField3_Contraseña.getText();
            edad = Integer.parseInt(jTextField4_Edad.getText());
            PFav = jTextField5_PersonajeFav.getText();
            dinero = ran.nextInt(800) + 100;
            cuentab.setNumCuenta(Integer.parseInt(jTextField6_CuentaBanc.getText()));

            try {
                listaUsuarios.add(new Comprador(dinero, PFav, nombre, nombreU, contraseña, edad));
                b.setListadeusuarios(listaUsuarios);
                display = true;
            } catch (ExceptionNintendo e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
            if (display == true) {
                VendedorPanel newPanelC = new VendedorPanel();
                newPanelC.setVisible(true);
                this.dispose();

            }

        }

    }//GEN-LAST:event_jButton1MouseClicked

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
                if ("Windows".equals(info.getName())) {
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1_Registro;
    private javax.swing.JLabel jLabel2_Nombre;
    private javax.swing.JLabel jLabel2_Nombre2;
    private javax.swing.JLabel jLabel3_Usuario;
    private javax.swing.JLabel jLabel4_Contraseña;
    private javax.swing.JLabel jLabel5_Personaje;
    private javax.swing.JLabel jLabel6_Cuenta;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1_Nombre;
    private javax.swing.JTextField jTextField2_Usuario;
    private javax.swing.JTextField jTextField3_Contraseña;
    private javax.swing.JTextField jTextField4_Edad;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField5_PersonajeFav;
    private javax.swing.JTextField jTextField6_CuentaBanc;
    // End of variables declaration//GEN-END:variables

}
