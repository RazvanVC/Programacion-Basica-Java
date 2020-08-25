/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphic_Interface;

import static Graphic_Interface.Inicio.Productos;
import static Graphic_Interface.Inicio.RutaProductos;
import static Graphic_Interface.Inicio.RutaUsuarios;
import static Graphic_Interface.Inicio.Usuarios;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javapop.Cliente;
import javapop.ClienteProfesional;
import javapop.JavaPoP;
import javapop.Producto;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel González González - GISI
 */
public class ConsultarUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarUsuario
     */
    public ConsultarUsuarios() {
        initComponents();
        //editable(false);
        cargarUsuarios();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnG_ID = new javax.swing.ButtonGroup();
        tf_ID = new javax.swing.JTextField();
        lbl_Tarjeta = new javax.swing.JLabel();
        tf_Correo = new javax.swing.JTextField();
        tf_Tarjeta = new javax.swing.JTextField();
        lbl_Correo = new javax.swing.JLabel();
        lbl_CCV = new javax.swing.JLabel();
        tf_Contrasena = new javax.swing.JTextField();
        tf_CCV = new javax.swing.JTextField();
        lbl_Contrasena = new javax.swing.JLabel();
        lbl_Contrasena1 = new javax.swing.JLabel();
        tf_Contrasena1 = new javax.swing.JTextField();
        lbl_Ciudad = new javax.swing.JLabel();
        tf_Ciudad = new javax.swing.JTextField();
        lbl_Nombre = new javax.swing.JLabel();
        tf_CP = new javax.swing.JTextField();
        lbl_CP = new javax.swing.JLabel();
        tf_Nombre = new javax.swing.JTextField();
        lbl_Logo = new javax.swing.JLabel();
        cb_Usuario = new javax.swing.JComboBox<>();
        lbl_CP1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_Descripcion = new javax.swing.JTextArea();
        lbl_Telefono = new javax.swing.JLabel();
        lbl_Descripción = new javax.swing.JLabel();
        tf_Telefono = new javax.swing.JTextField();
        lbl_Web = new javax.swing.JLabel();
        tf_Horario = new javax.swing.JTextField();
        tf_Web = new javax.swing.JTextField();
        btn_Volver = new javax.swing.JButton();
        btn_Baja = new javax.swing.JButton();
        lbl_ID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("JavaPOP - Consulta de usuarios");

        tf_ID.setEditable(false);

        lbl_Tarjeta.setText("Número Tarjeta:");

        tf_Correo.setEditable(false);

        tf_Tarjeta.setEditable(false);

        lbl_Correo.setText("Correo Electrónico:");

        lbl_CCV.setText("CCV");

        tf_Contrasena.setEditable(false);

        tf_CCV.setEditable(false);

        lbl_Contrasena.setText("Contraseña:");

        lbl_Contrasena1.setText("Repita contraseña:");

        tf_Contrasena1.setEditable(false);

        lbl_Ciudad.setText("Ciudad:");

        tf_Ciudad.setEditable(false);

        lbl_Nombre.setText("Nombre:");

        tf_CP.setEditable(false);

        lbl_CP.setText("Código Postal:");

        tf_Nombre.setEditable(false);

        lbl_Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/JavaPOP_Logo.png"))); // NOI18N

        cb_Usuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Usuario..." }));
        cb_Usuario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_UsuarioItemStateChanged(evt);
            }
        });

        lbl_CP1.setText("Horario:");

        ta_Descripcion.setEditable(false);
        ta_Descripcion.setColumns(20);
        ta_Descripcion.setRows(5);
        jScrollPane1.setViewportView(ta_Descripcion);

        lbl_Telefono.setText("Teléfono:");

        lbl_Descripción.setText("Descripción:");

        tf_Telefono.setEditable(false);

        lbl_Web.setText("Web:");

        tf_Horario.setEditable(false);

        tf_Web.setEditable(false);

        btn_Volver.setText("Volver");
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });

        btn_Baja.setText("Dar de Baja");
        btn_Baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BajaActionPerformed(evt);
            }
        });

        lbl_ID.setText("Identificación");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_Usuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_Descripción, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_CCV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_Tarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_CP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_Ciudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_Contrasena1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_Contrasena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_Telefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_Web, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_Horario, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_Telefono, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_ID)
                                    .addComponent(tf_CCV)
                                    .addComponent(tf_Tarjeta)
                                    .addComponent(tf_CP)
                                    .addComponent(tf_Ciudad)
                                    .addComponent(tf_Contrasena1)
                                    .addComponent(tf_Contrasena)
                                    .addComponent(tf_Correo)
                                    .addComponent(tf_Web, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btn_Baja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lbl_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_CP1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(cb_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Nombre)
                    .addComponent(tf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ID))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Correo)
                    .addComponent(tf_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Contrasena)
                    .addComponent(tf_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Contrasena1)
                    .addComponent(tf_Contrasena1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Ciudad)
                    .addComponent(tf_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_CP)
                    .addComponent(tf_CP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Tarjeta)
                    .addComponent(tf_Tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_CCV)
                    .addComponent(tf_CCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Descripción))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_CP1)
                    .addComponent(tf_Horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Telefono)
                    .addComponent(tf_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Web)
                    .addComponent(tf_Web, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Volver)
                    .addComponent(btn_Baja))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Este método (botón) borra al usuario seleccionado junto con sus productos asociados
     * @param evt 
     */
    private void btn_BajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BajaActionPerformed
        // TODO add your handling code here:
        // Dar una vuelta
        if (cb_Usuario.getSelectedIndex() == 0) {
            return;
        }
        Cliente user = Usuarios.get(cb_Usuario.getSelectedIndex() - 1);
        int aux = 0;
        while (aux < Productos.size()) {
            if (Productos.get(aux).propietario.DNI.equals(user.DNI)) {
                Productos.remove(aux);
            }
            aux++;
        }
        guardarProductos();
        Usuarios.remove(user);
        guardarUsuario();
        Productos = readProducts();
        JOptionPane.showMessageDialog(rootPane, "Usuario dado de baja con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);
    }//GEN-LAST:event_btn_BajaActionPerformed

    /**
     * Este método (combo box) llama al método limpiar (que vacía el texto), seleccionamos un usuario de la lista y llama al método cambiarTexto (que nos muestra el usuario)
     * @param evt 
     */
    private void cb_UsuarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_UsuarioItemStateChanged
        // TODO add your handling code here:
        limpiar();
        if (cb_Usuario.getSelectedIndex() == 0) {
            return;
        }
        cambiarTexto();
    }//GEN-LAST:event_cb_UsuarioItemStateChanged

    /**
     * Este método (botón) vuelve a la ventana anterior
     * @param evt 
     */
    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btn_VolverActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnG_ID;
    private javax.swing.JButton btn_Baja;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JComboBox<String> cb_Usuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_CCV;
    private javax.swing.JLabel lbl_CP;
    private javax.swing.JLabel lbl_CP1;
    private javax.swing.JLabel lbl_Ciudad;
    private javax.swing.JLabel lbl_Contrasena;
    private javax.swing.JLabel lbl_Contrasena1;
    private javax.swing.JLabel lbl_Correo;
    private javax.swing.JLabel lbl_Descripción;
    private javax.swing.JLabel lbl_ID;
    private javax.swing.JLabel lbl_Logo;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_Tarjeta;
    private javax.swing.JLabel lbl_Telefono;
    private javax.swing.JLabel lbl_Web;
    private javax.swing.JTextArea ta_Descripcion;
    private javax.swing.JTextField tf_CCV;
    private javax.swing.JTextField tf_CP;
    private javax.swing.JTextField tf_Ciudad;
    private javax.swing.JTextField tf_Contrasena;
    private javax.swing.JTextField tf_Contrasena1;
    private javax.swing.JTextField tf_Correo;
    private javax.swing.JTextField tf_Horario;
    private javax.swing.JTextField tf_ID;
    private javax.swing.JTextField tf_Nombre;
    private javax.swing.JTextField tf_Tarjeta;
    private javax.swing.JTextField tf_Telefono;
    private javax.swing.JTextField tf_Web;
    // End of variables declaration//GEN-END:variables

    /**
     * Este método carga los usuarios a la combo box para poder seleccionarlos
     */
    private void cargarUsuarios() {
        int aux = 0;
        while (aux < Usuarios.size()) {
            cb_Usuario.addItem(Usuarios.get(aux).nombre);
            aux++;
        }
    }

    /**
     * Este método vacía el texto de las cajas de texto
     */
    private void limpiar() {
        tf_CCV.setText("");
        tf_CP.setText("");
        tf_Ciudad.setText("");
        tf_Contrasena.setText("");
        tf_Contrasena1.setText("");
        tf_Correo.setText("");
        tf_ID.setText("");
        tf_Nombre.setText("");
        tf_Tarjeta.setText("");
        ta_Descripcion.setText("");
        tf_Horario.setText("");
        tf_Telefono.setText("");
        tf_Web.setText("");
    }

    /**
     * Este método muestra la información del usuario seleccionado cambiando el texto de las cajas de texto
     */
    private void cambiarTexto() {
        tf_CCV.setText((Usuarios.get(cb_Usuario.getSelectedIndex() - 1).CCV));
        tf_CP.setText((Usuarios.get(cb_Usuario.getSelectedIndex() - 1).cod_postal));
        tf_Ciudad.setText((Usuarios.get(cb_Usuario.getSelectedIndex() - 1).ciudad));
        tf_Contrasena.setText((Usuarios.get(cb_Usuario.getSelectedIndex() - 1).clave));
        tf_Contrasena1.setText((Usuarios.get(cb_Usuario.getSelectedIndex() - 1).clave));
        tf_Correo.setText((Usuarios.get(cb_Usuario.getSelectedIndex() - 1).correo));
        tf_ID.setText((Usuarios.get(cb_Usuario.getSelectedIndex() - 1).DNI));
        tf_Nombre.setText((Usuarios.get(cb_Usuario.getSelectedIndex() - 1).nombre));
        tf_Tarjeta.setText((Usuarios.get(cb_Usuario.getSelectedIndex() - 1).tjt_credito));
        if (Usuarios.get(cb_Usuario.getSelectedIndex() - 1) instanceof ClienteProfesional) { //Si es premium, muestra también su infromación adicional
            ClienteProfesional cliente = (ClienteProfesional) Usuarios.get(cb_Usuario.getSelectedIndex() - 1);
            ta_Descripcion.setText(cliente.descripcion);
            tf_Horario.setText(cliente.horario);
            tf_Telefono.setText(cliente.telefono);
            tf_Web.setText(cliente.web);
        }
    }

    /**
     * Este método guarda los usuarios restantes una vez se ha dado de baja algún usuario
     */
    private void guardarUsuario() {
        try {
            int i = 0;
            //Menú de la app JavaPoP
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(RutaUsuarios));
            while (i < Usuarios.size()) {
                oos.writeObject(Usuarios.get(i));
                i++;
            }
        } catch (IOException ex) {
            Logger.getLogger(JavaPoP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Este método guarda los productos restantes una vez se ha dado de baja algún usuario
     */
    private void guardarProductos() {
        try {
            int i = 0;
            //Menú de la app JavaPoP
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(RutaProductos));
            while (i < Productos.size()){
                oos.writeObject(Productos.get(i));
                i++;
            }
        } catch (IOException ex) {
            Logger.getLogger(JavaPoP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Este método lee los productos que hay en la ruta determinada para poder actualizarlos
     * @return Devuelve un array list de los productos
     */
    public static ArrayList<Producto> readProducts() {
        ArrayList<Producto> al = new ArrayList();
        boolean cont = true;
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(RutaProductos));
            while (cont != false) {
                Producto obj = null;
                try {
                    obj = (Producto) ois.readObject();
                } catch (IOException | ClassNotFoundException e) {

                }
                if (obj != null) {
                    al.add(obj);
                } else {
                    cont = false;
                }
            }
        } catch (IOException e) {
        }
        return al;
    }
}
