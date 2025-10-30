
package Gui;

import Persistencia.Conexion_BD;
import com.sun.jdi.connect.spi.Connection;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class InterVenta extends javax.swing.JInternalFrame {

  //modelos de datos
    private DefaultTableModel modeloDatosProductos;
    private int cantidad = 0;
    private int subTotal=0;
    private int descuento=0;
    private int totalPagar=0;
    
    
    public InterVenta() {
        initComponents();
        this.CargarClientes();
        this.CargarComboProductos();
        this.inicializarTablaProducto();
        
        
        this.setSize(new Dimension(800,600));
        this.setTitle("Venta");
        
        this.CargarClientes();
        this.CargarComboProductos();
        
        
        
    }
    
    //metodo para inicializar tabla de productos
    
    private void inicializarTablaProducto(){
    
        modeloDatosProductos = new DefaultTableModel();
        //añadir columnas
        modeloDatosProductos.addColumn("N°");
        modeloDatosProductos.addColumn("Nombre");
        modeloDatosProductos.addColumn("Cantidad");
        modeloDatosProductos.addColumn("P Unitario");
        modeloDatosProductos.addColumn("SubTotal");
        modeloDatosProductos.addColumn("Descuento");
        modeloDatosProductos.addColumn("Total Pagar");
        modeloDatosProductos.addColumn("Accion");
        
        //agregar datos a los modelos
        
        this.jTableProductos.setModel(modeloDatosProductos);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxProducto = new javax.swing.JComboBox<>();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        TxtCantidad = new javax.swing.JTextField();
        TxtClienteBuscar = new javax.swing.JTextField();
        BtnBuscarCliente = new javax.swing.JButton();
        BtnAñadirProducto = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TxtSubtotal = new javax.swing.JTextField();
        TxtDescuento = new javax.swing.JTextField();
        TxtTotalaPagar = new javax.swing.JTextField();
        TxtEfectivo = new javax.swing.JTextField();
        TxtCambio = new javax.swing.JTextField();
        BtnCalcularCambio = new javax.swing.JButton();
        BtnRegistrarVenta = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
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
        jComboBoxProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProductoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 170, -1));

        jComboBoxCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Cliente:", "Item 2", "Item 3", "Item 4" }));
        jComboBoxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 170, 20));

        TxtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCantidadActionPerformed(evt);
            }
        });
        getContentPane().add(TxtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 120, -1));
        getContentPane().add(TxtClienteBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 150, -1));

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
        getContentPane().add(BtnAñadirProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 140, -1));

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
        jTableProductos.setEnabled(false);
        jScrollPane1.setViewportView(jTableProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 740, 190));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 760, 210));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("SubTotal:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Desacuento:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Efectivo");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Total a pagar:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Cambio");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        TxtSubtotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TxtSubtotal.setEnabled(false);
        jPanel2.add(TxtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 120, -1));

        TxtDescuento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TxtDescuento.setEnabled(false);
        jPanel2.add(TxtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 120, -1));

        TxtTotalaPagar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TxtTotalaPagar.setEnabled(false);
        jPanel2.add(TxtTotalaPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 120, -1));

        TxtEfectivo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(TxtEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 120, -1));

        TxtCambio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TxtCambio.setEnabled(false);
        jPanel2.add(TxtCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 120, -1));

        BtnCalcularCambio.setBackground(new java.awt.Color(51, 255, 255));
        BtnCalcularCambio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnCalcularCambio.setText("Calcular Cambio");
        jPanel2.add(BtnCalcularCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 130, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 380, 210));

        BtnRegistrarVenta.setBackground(new java.awt.Color(51, 255, 255));
        BtnRegistrarVenta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnRegistrarVenta.setText("Registrar Venta");
        BtnRegistrarVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnRegistrarVenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(BtnRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 170, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarClienteActionPerformed
            
        String clienteBuscar = TxtClienteBuscar.getText().trim();
        java.sql.Connection conexion = Conexion_BD.conectar();
       String sql = "Select nombre, apellido from tb_clientes where dni = '" + clienteBuscar  + "'";
       
       Statement st; 
       
        try(PreparedStatement ps = conexion.prepareStatement(sql)) {
          ResultSet rs = ps.executeQuery();            
            
          
            
            if (rs.next()) {
                jComboBoxCliente.setSelectedItem(rs.getString("nombre") + " " + rs.getString("apellido"));
                
            } else {
                jComboBoxCliente.setSelectedItem("Seleccione Cliente:");
                JOptionPane.showMessageDialog(null, "DNI incorrecto o no encontrada");
                
            }
    TxtClienteBuscar.setText("Seleccione Cliente:");
                
            
          
          
        } catch (SQLException e) {
            System.out.println("Error al buscar Cliente, " + e);
        }
        
        
    }//GEN-LAST:event_BtnBuscarClienteActionPerformed

    private void BtnAñadirProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAñadirProductoActionPerformed

        String combo = this.jComboBoxProducto.getSelectedItem().toString();
        //validar la seleccion de producto
        
        if (combo.equalsIgnoreCase("Seleccione producto:")) {
            JOptionPane.showMessageDialog(null, "Seleccione un Producto valido");
        } else {
            //validara la cantidad
            
            if (!TxtCantidad.getText().isEmpty()) {
                boolean validacion = validar(TxtCantidad.getText());
                 if (validacion == true) {
                      //validar cantidad sea mayor a cero
                      
                      if (Integer.parseInt(TxtCantidad.getText()) > 0 ) {
                         
                     } else{
                      JOptionPane.showMessageDialog(null, "La cantidad no puede ser cero(0) , ni menor");
                      }
                      
                    
                } else {
                     JOptionPane.showMessageDialog(null, "En la Cantidad nose Admiten Caracteres no numericos");
                }
                
            } else {
                
                 JOptionPane.showMessageDialog(null, "Ingrese una Cantidad valida");
            }
            
            
        }
        
        
    }//GEN-LAST:event_BtnAñadirProductoActionPerformed

    private void jComboBoxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxClienteActionPerformed

    private void TxtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCantidadActionPerformed

    private void jComboBoxProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAñadirProducto;
    private javax.swing.JButton BtnBuscarCliente;
    private javax.swing.JButton BtnCalcularCambio;
    private javax.swing.JButton BtnRegistrarVenta;
    private javax.swing.JTextField TxtCambio;
    private javax.swing.JTextField TxtCantidad;
    private javax.swing.JTextField TxtClienteBuscar;
    private javax.swing.JTextField TxtDescuento;
    private javax.swing.JTextField TxtEfectivo;
    private javax.swing.JTextField TxtSubtotal;
    private javax.swing.JTextField TxtTotalaPagar;
    private javax.swing.JComboBox<String> jComboBoxCliente;
    private javax.swing.JComboBox<String> jComboBoxProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTableProductos;
    // End of variables declaration//GEN-END:variables

    

    // Cargar Cliente en el JComboBox
    
    private void CargarClientes (){
    
       java.sql.Connection conexion = Conexion_BD.conectar();
       String sql = "Select * from tb_clientes";
       
       Statement st; 
       
        try(PreparedStatement ps = conexion.prepareStatement(sql)) {
          ResultSet rs = ps.executeQuery();            
            
          jComboBoxCliente.removeAllItems();
          jComboBoxCliente.addItem("Seleccione un Cliente:");
            while (rs.next()) {
                jComboBoxCliente.addItem(rs.getString("nombre") + " " + rs.getString("Apellido"));
                
            }
          
          
        } catch (SQLException e) {
            System.out.println("Error al cargar Clientes, " + e);
        }
        
    }
    
    
    //Cargar los productos del BomboBox
    
    private void CargarComboProductos(){
        
    java.sql.Connection conexion = Conexion_BD.conectar();
       String sql = "Select * from tb_producto";
       
       Statement st; 
       
        try(PreparedStatement ps = conexion.prepareStatement(sql)) {
          ResultSet rs = ps.executeQuery();            
            
          jComboBoxProducto.removeAllItems();
          jComboBoxProducto.addItem("Seleccione un Producto:");
            while (rs.next()) {
                jComboBoxProducto.addItem(rs.getString("nombre"));
                
            }
          
          
        } catch (SQLException e) {
            System.out.println("Error al cargar Producto, " + e);
        }
    }


    //metodo para validar caracteres no numericos
    
    private boolean validar(String valor ){
    
        try {
            int num= Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
        
    }
    
    

}
