package Gui;

import Logica.Cliente;
import Persistencia.CtrlCliente;
import com.mysql.cj.xdevapi.Client;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author alana
 */
public class InterCliente extends javax.swing.JInternalFrame {

    public InterCliente(InterGestionarProducto gestionarProducto) {

        initComponents();
        this.setSize(new Dimension(400, 300));
        this.setTitle("Nuevo Cliente");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        TxtApellido = new javax.swing.JTextField();
        TxtDNI = new javax.swing.JTextField();
        TxtDireccion = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JButton();
        TxtTelefono = new javax.swing.JTextField();
        jLabelWallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo Cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 110, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Apellido:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 110, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("DNI:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 110, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Telefono:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Direccion:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 110, -1));
        getContentPane().add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 170, -1));
        getContentPane().add(TxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 170, -1));
        getContentPane().add(TxtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 170, -1));
        getContentPane().add(TxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 170, -1));

        BtnGuardar.setBackground(new java.awt.Color(0, 204, 204));
        BtnGuardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 90, 30));
        getContentPane().add(TxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 170, -1));

        jLabelWallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Recurso Imagenes del Sistema/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed

        Cliente cliente = new Cliente();
        CtrlCliente controlCliente = new CtrlCliente();

        if (!TxtNombre.getText().isEmpty()
                && !TxtApellido.getText().isEmpty()
                && !TxtDNI.getText().isEmpty()
                && !TxtTelefono.getText().isEmpty()
                && !TxtDireccion.getText().isEmpty()) {

            if (!controlCliente.ExisteCliente(TxtDNI.getText().trim())) {

                cliente.setNombre(TxtNombre.getText().trim());
                cliente.setApellido(TxtApellido.getText().trim());
                cliente.setDni(TxtDNI.getText().trim());
                cliente.setTelefono(TxtTelefono.getText().trim());
                cliente.setDireccion(TxtDireccion.getText().trim());
                cliente.setEstado(0);

                if (controlCliente.Guardar(cliente)) {
                    JOptionPane.showMessageDialog(null, "Cliente guardado");
                    TxtNombre.setBackground(Color.GREEN);
                    TxtApellido.setBackground(Color.GREEN);
                    TxtDNI.setBackground(Color.GREEN);
                    TxtTelefono.setBackground(Color.GREEN);
                    TxtDireccion.setBackground(Color.GREEN);
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar");
                }

            } else {
                JOptionPane.showMessageDialog(null, "El cliente ya esta registrado en la base de datos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
            TxtNombre.setBackground(Color.red);
            TxtApellido.setBackground(Color.red);
            TxtDNI.setBackground(Color.red);
            TxtTelefono.setBackground(Color.red);
            TxtDireccion.setBackground(Color.red);
        }

        this.Limpiar();
                
                TxtNombre.setBackground(Color.white);
                TxtApellido.setBackground(Color.white);
                TxtDNI.setBackground(Color.white);
                TxtTelefono.setBackground(Color.white);
                TxtDireccion.setBackground(Color.white);

    }//GEN-LAST:event_BtnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JTextField TxtApellido;
    private javax.swing.JTextField TxtDNI;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelWallpaper;
    // End of variables declaration//GEN-END:variables

    //metodo para limpiar campos
    private void Limpiar() {
        TxtNombre.setText("");
        TxtApellido.setText("");
        TxtDNI.setText("");
        TxtTelefono.setText("");
        TxtDireccion.setText("");

    }

}
