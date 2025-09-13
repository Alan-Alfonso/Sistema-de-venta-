package Gui;

import Persistencia.CtrlCategoria;
import Logica.Categoria;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class InterCategoria extends javax.swing.JInternalFrame {

    
    public InterCategoria() {
        initComponents();
        this.setSize(new Dimension (400, 200));
        this.setTitle("Nueva Categoria");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtDescripcion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabelWallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nueva Categoria");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Descripcion Categoria");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        TxtDescripcion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        getContentPane().add(TxtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 170, -1));

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 90, 30));

        jLabelWallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Recurso Imagenes del Sistema/fondo3.jpg"))); // NOI18N
        jLabelWallpaper.setText("jLabel1");
        getContentPane().add(jLabelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtDescripcionKeyPressed(java.awt.event.KeyEvent evt) {                                      
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        jButton1.doClick(); 
    }
}

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Categoria categoria = new Categoria();
    CtrlCategoria ControlCategoria = new CtrlCategoria();

    // Validar campo vacío
    String descripcion = TxtDescripcion.getText().trim();
    if (descripcion.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Complete todos los campos");
        return; // Salimos del método si está vacío
    }

    // Verificar si la categoría ya existe
    if (ControlCategoria.ExisteCategoria(descripcion)) {
        JOptionPane.showMessageDialog(null, "La categoría ya existe");
    } else {
        // Si no existe, la guardamos
        categoria.setDescripcion(descripcion);
        categoria.setEstado(1);

        if (ControlCategoria.Guardar(categoria)) {
            JOptionPane.showMessageDialog(null, "Registro guardado");
        } else {
            JOptionPane.showMessageDialog(null, "Error al guardar");
        }
    }

    // Limpiar campo
    TxtDescripcion.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtDescripcion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelWallpaper;
    // End of variables declaration//GEN-END:variables
}
