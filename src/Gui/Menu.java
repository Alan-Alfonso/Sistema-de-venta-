
package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.Dimension;
import javax.swing.JDesktopPane;


/**
 *
 * @author alana
 */
public class Menu extends javax.swing.JFrame {
    
     private InterGestionarProducto ventanaGestionarProducto;
    private InterProducto ventanaRegistrarProducto;
    
private JDesktopPane JDesktopPane_menu;

    public Menu() {
        initComponents();
        this.setSize(new Dimension(1200, 700));
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("|Menu - Burbujitas|");

        this.setLayout(new BorderLayout());

        // Inicializar el escritorio
        JDesktopPane_menu = new JDesktopPane();
        JDesktopPane_menu.setBackground(new Color(255, 182, 170));
        this.setContentPane(JDesktopPane_menu);
        this.setJMenuBar(jMenuBar1);

        // Abrir ventana de gestión usando Singleton
        ventanaGestionarProducto = InterGestionarProducto.getInstancia();
        if (!ventanaGestionarProducto.isVisible()) {
            JDesktopPane_menu.add(ventanaGestionarProducto);
            centrarVentana(ventanaGestionarProducto);
            ventanaGestionarProducto.setVisible(true);
        } else {
            ventanaGestionarProducto.toFront();
        }
    }

    // Método para abrir la ventana de registro
    public void abrirVentanaRegistrarProducto() {
        if (ventanaRegistrarProducto == null || ventanaRegistrarProducto.isClosed()) {
            ventanaRegistrarProducto = new InterProducto(ventanaGestionarProducto);
            JDesktopPane_menu.add(ventanaRegistrarProducto);
           
            ventanaRegistrarProducto.setVisible(true);
        } else {
            ventanaRegistrarProducto.toFront();
        }
    }

    // Método reutilizable para centrar ventanas
    private void centrarVentana(JInternalFrame ventana) {
      ventana.setVisible(true); // Asegura que el tamaño esté calculado
    ventana.setSize(ventana.getPreferredSize()); // Opcional si no usás pack()

    Dimension desktopSize = JDesktopPane_menu.getSize();
    Dimension frameSize = ventana.getSize();

    ventana.setLocation(
        (desktopSize.width - frameSize.width) / 2,
        (desktopSize.height - frameSize.height) / 2
    );
    }

   

    
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuUsuario = new javax.swing.JMenu();
        jMenuItemNuevoUsuario = new javax.swing.JMenuItem();
        jMenuItemGestionarUsuarios = new javax.swing.JMenuItem();
        jMenuProductos = new javax.swing.JMenu();
        jMenuItemNuevoProducto = new javax.swing.JMenuItem();
        jMenuItemGestionProducto = new javax.swing.JMenuItem();
        jMenuItemActualizarProducto = new javax.swing.JMenuItem();
        jMenuVenta = new javax.swing.JMenu();
        jMenuItemVentas = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItemAgregarVendedor = new javax.swing.JMenuItem();
        jMenuItemEliminarVendedor = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItemNuevaCategoria = new javax.swing.JMenuItem();
        jMenuItemGestionarCategorias = new javax.swing.JMenuItem();
        jMenuDeudores = new javax.swing.JMenu();
        jMenuItemNuevoDeudor = new javax.swing.JMenuItem();
        jMenuItemGestionDeudor = new javax.swing.JMenuItem();
        jMenuHistorial = new javax.swing.JMenu();
        jMenuItemVerHistorial = new javax.swing.JMenuItem();
        jMenuItemEstadistica = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItemCerrarSesion = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Recurso Imagenes del Sistema/usuario.png"))); // NOI18N
        jMenuUsuario.setText("Usuario");
        jMenuUsuario.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jMenuUsuario.setPreferredSize(new java.awt.Dimension(150, 30));

        jMenuItemNuevoUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItemNuevoUsuario.setText("Nuevo Usuario");
        jMenuItemNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevoUsuarioActionPerformed(evt);
            }
        });
        jMenuUsuario.add(jMenuItemNuevoUsuario);

        jMenuItemGestionarUsuarios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItemGestionarUsuarios.setText("Gestionar Usuarios");
        jMenuUsuario.add(jMenuItemGestionarUsuarios);

        jMenuBar1.add(jMenuUsuario);

        jMenuProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Recurso Imagenes del Sistema/producto.png"))); // NOI18N
        jMenuProductos.setText("Productos");
        jMenuProductos.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jMenuProductos.setPreferredSize(new java.awt.Dimension(150, 30));

        jMenuItemNuevoProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItemNuevoProducto.setText("Nuevo Producto");
        jMenuItemNuevoProducto.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItemNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevoProductoActionPerformed(evt);
            }
        });
        jMenuProductos.add(jMenuItemNuevoProducto);

        jMenuItemGestionProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItemGestionProducto.setText("Gestionar Productos");
        jMenuItemGestionProducto.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItemGestionProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGestionProductoActionPerformed(evt);
            }
        });
        jMenuProductos.add(jMenuItemGestionProducto);

        jMenuItemActualizarProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItemActualizarProducto.setText("Actualizar Stock");
        jMenuItemActualizarProducto.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItemActualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemActualizarProductoActionPerformed(evt);
            }
        });
        jMenuProductos.add(jMenuItemActualizarProducto);

        jMenuBar1.add(jMenuProductos);

        jMenuVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Recurso Imagenes del Sistema/carrito.png"))); // NOI18N
        jMenuVenta.setText("Venta");
        jMenuVenta.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jMenuVenta.setPreferredSize(new java.awt.Dimension(150, 30));

        jMenuItemVentas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItemVentas.setText("Vender");
        jMenuItemVentas.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuVenta.add(jMenuItemVentas);

        jMenu7.setText("Vendedor");
        jMenu7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu7.setPreferredSize(new java.awt.Dimension(150, 30));

        jMenuItemAgregarVendedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItemAgregarVendedor.setText("Agregar Vendedor");
        jMenuItemAgregarVendedor.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItemAgregarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgregarVendedorActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItemAgregarVendedor);

        jMenuItemEliminarVendedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItemEliminarVendedor.setText("Eliminar Vendedor");
        jMenuItemEliminarVendedor.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItemEliminarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEliminarVendedorActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItemEliminarVendedor);

        jMenuVenta.add(jMenu7);

        jMenuBar1.add(jMenuVenta);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Recurso Imagenes del Sistema/categorias.png"))); // NOI18N
        jMenu6.setText("Categoria");
        jMenu6.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(150, 30));

        jMenuItemNuevaCategoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItemNuevaCategoria.setText("Nueva Categoria");
        jMenuItemNuevaCategoria.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItemNuevaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevaCategoriaActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItemNuevaCategoria);

        jMenuItemGestionarCategorias.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItemGestionarCategorias.setText("Gestionar Categorias");
        jMenuItemGestionarCategorias.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItemGestionarCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGestionarCategoriasActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItemGestionarCategorias);

        jMenuBar1.add(jMenu6);

        jMenuDeudores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Recurso Imagenes del Sistema/reportes.png"))); // NOI18N
        jMenuDeudores.setText("Deudores :(");
        jMenuDeudores.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jMenuDeudores.setPreferredSize(new java.awt.Dimension(150, 30));

        jMenuItemNuevoDeudor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItemNuevoDeudor.setText("Nuevo Deudor");
        jMenuItemNuevoDeudor.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuDeudores.add(jMenuItemNuevoDeudor);

        jMenuItemGestionDeudor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItemGestionDeudor.setText("Gestionar Deudor");
        jMenuItemGestionDeudor.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuDeudores.add(jMenuItemGestionDeudor);

        jMenuBar1.add(jMenuDeudores);

        jMenuHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Recurso Imagenes del Sistema/historial1.png"))); // NOI18N
        jMenuHistorial.setText("Historial");
        jMenuHistorial.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jMenuHistorial.setPreferredSize(new java.awt.Dimension(150, 30));

        jMenuItemVerHistorial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItemVerHistorial.setText("Ver Historial");
        jMenuItemVerHistorial.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuHistorial.add(jMenuItemVerHistorial);

        jMenuItemEstadistica.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItemEstadistica.setText("Estadistica");
        jMenuItemEstadistica.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuHistorial.add(jMenuItemEstadistica);

        jMenuBar1.add(jMenuHistorial);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Recurso Imagenes del Sistema/cerrar-sesion.png"))); // NOI18N
        jMenu5.setText("Cerrar Sesion");
        jMenu5.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(150, 30));

        jMenuItemCerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItemCerrarSesion.setText("Cerrar Sesion");
        jMenuItemCerrarSesion.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenu5.add(jMenuItemCerrarSesion);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemNuevoUsuarioActionPerformed

    private void jMenuItemActualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemActualizarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemActualizarProductoActionPerformed

    private void jMenuItemEliminarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEliminarVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemEliminarVendedorActionPerformed

    private void jMenuItemAgregarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgregarVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemAgregarVendedorActionPerformed

    private void jMenuItemNuevaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevaCategoriaActionPerformed
            InterCategoria intercategoria = new InterCategoria();
            JDesktopPane_menu.add(intercategoria);
            intercategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItemNuevaCategoriaActionPerformed

    private void jMenuItemGestionarCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGestionarCategoriasActionPerformed
        InterGestionarCategoria interGestionarCategoria = new  InterGestionarCategoria();
        JDesktopPane_menu.add(interGestionarCategoria);
        interGestionarCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItemGestionarCategoriasActionPerformed

    private void jMenuItemNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevoProductoActionPerformed
              InterProducto interProducto = new  InterProducto(ventanaGestionarProducto);
        JDesktopPane_menu.add(interProducto);
        interProducto.setVisible(true);
    }//GEN-LAST:event_jMenuItemNuevoProductoActionPerformed

    private void jMenuItemGestionProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGestionProductoActionPerformed
        InterGestionarProducto interGestionarProducto = new  InterGestionarProducto();
        JDesktopPane_menu.add(interGestionarProducto);
        interGestionarProducto.setVisible(true);
    }//GEN-LAST:event_jMenuItemGestionProductoActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuDeudores;
    private javax.swing.JMenu jMenuHistorial;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemActualizarProducto;
    private javax.swing.JMenuItem jMenuItemAgregarVendedor;
    private javax.swing.JMenuItem jMenuItemCerrarSesion;
    private javax.swing.JMenuItem jMenuItemEliminarVendedor;
    private javax.swing.JMenuItem jMenuItemEstadistica;
    private javax.swing.JMenuItem jMenuItemGestionDeudor;
    private javax.swing.JMenuItem jMenuItemGestionProducto;
    private javax.swing.JMenuItem jMenuItemGestionarCategorias;
    private javax.swing.JMenuItem jMenuItemGestionarUsuarios;
    private javax.swing.JMenuItem jMenuItemNuevaCategoria;
    private javax.swing.JMenuItem jMenuItemNuevoDeudor;
    private javax.swing.JMenuItem jMenuItemNuevoProducto;
    private javax.swing.JMenuItem jMenuItemNuevoUsuario;
    private javax.swing.JMenuItem jMenuItemVentas;
    private javax.swing.JMenuItem jMenuItemVerHistorial;
    private javax.swing.JMenu jMenuProductos;
    private javax.swing.JMenu jMenuUsuario;
    private javax.swing.JMenu jMenuVenta;
    // End of variables declaration//GEN-END:variables
}
