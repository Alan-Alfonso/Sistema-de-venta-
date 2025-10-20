
package Gui;

import java.awt.Dimension;


public class InterVenta extends javax.swing.JInternalFrame {

    public InterVenta() {
        initComponents();
        
        this.setSize(new Dimension(800,600));
        this.setTitle("Venta");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxProducto = new javax.swing.JComboBox<>();
        jComboBoxCliente1 = new javax.swing.JComboBox<>();
        TxtClienteBuscar = new javax.swing.JTextField();
        TxtCantidad = new javax.swing.JTextField();
        BtnBuscarCliente = new javax.swing.JButton();
        BtnAñadirProducto = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        JWallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Venta");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Cliente:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Producto:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 80, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Cantidad:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 80, -1));

        jComboBoxProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Producto:", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBoxProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 170, -1));

        jComboBoxCliente1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxCliente1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Cliente:", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBoxCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 170, 20));
        getContentPane().add(TxtClienteBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 60, -1));
        getContentPane().add(TxtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 150, -1));

        BtnBuscarCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnBuscarCliente.setText("Buscar");
        BtnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 80, -1));

        BtnAñadirProducto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnAñadirProducto.setText("Añadir Productos");
        BtnAñadirProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAñadirProductoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAñadirProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 140, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 740, 190));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 760, 210));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 380, 210));

        JWallpaper.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(JWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBuscarClienteActionPerformed

    private void BtnAñadirProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAñadirProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAñadirProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAñadirProducto;
    private javax.swing.JButton BtnBuscarCliente;
    private javax.swing.JLabel JWallpaper;
    private javax.swing.JTextField TxtCantidad;
    private javax.swing.JTextField TxtClienteBuscar;
    private javax.swing.JComboBox<String> jComboBoxCliente1;
    private javax.swing.JComboBox<String> jComboBoxProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTableProductos;
    // End of variables declaration//GEN-END:variables
}
