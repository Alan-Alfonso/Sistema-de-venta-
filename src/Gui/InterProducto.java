package Gui;

import Logica.Producto;
import java.sql.ResultSet;
import java.sql.Connection;
import Persistencia.Conexion_BD;
import Persistencia.CtrlProducto;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author alana
 */
public class InterProducto extends javax.swing.JInternalFrame {

    int objetoIdCatedoriaCombo = 0;

    public InterProducto() {
        initComponents();

        this.setSize(new Dimension(400, 300));
        this.setTitle("Nuevo Producto");

        this.CargarComboCategoria();
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
        TxtCantidad = new javax.swing.JTextField();
        TxtPrecio = new javax.swing.JTextField();
        TxtDescripcion = new javax.swing.JTextField();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        BtnGuardar = new javax.swing.JButton();
        jLabelWallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo Producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 110, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Cantidad:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 110, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Precio:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 110, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Descripcion:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Categoria");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 110, -1));
        getContentPane().add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 170, -1));
        getContentPane().add(TxtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 170, -1));
        getContentPane().add(TxtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 170, -1));
        getContentPane().add(TxtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 170, -1));

        jComboBoxCategoria.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jComboBoxCategoria.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione caetgoria:" }));
        jComboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 170, -1));

        BtnGuardar.setBackground(new java.awt.Color(0, 204, 204));
        BtnGuardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 90, 30));

        jLabelWallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Recurso Imagenes del Sistema/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCategoriaActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed

        Producto producto = new Producto();
        CtrlProducto controlProducto = new CtrlProducto();

     

        //validar campos
        if (TxtNombre.getText().equals("") || TxtCantidad.getText().equals("") || TxtPrecio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
            TxtNombre.setBackground(Color.red);
            TxtCantidad.setBackground(Color.red);
            TxtPrecio.setBackground(Color.red);

        } else {
            // consulta para ver si el producto ya existe
            if (!controlProducto.ExisteProducto(TxtNombre.getText().trim())) {

                try {
                    producto.setNombre(TxtNombre.getText().trim());
                    producto.setCantidad(Integer.parseInt(TxtCantidad.getText().trim()));
                     producto.setDescripcion(TxtDescripcion.getText().trim());
                      producto.setPrecio(Integer.parseInt(TxtPrecio.getText().trim()));

                    //id categoria
                    this.idCategoria();
                    producto.setIdCategoria(objetoIdCatedoriaCombo);
                    producto.setEstado(1);
                    
                    if (controlProducto.Guardar(producto)) {
                        JOptionPane.showMessageDialog(null, "Registro Guardado");
                        TxtNombre.setBackground(Color.GREEN);
            TxtCantidad.setBackground(Color.GREEN);
            TxtPrecio.setBackground(Color.GREEN);
            TxtDescripcion.setBackground(Color.GREEN);
            
            
            this.jComboBoxCategoria.setSelectedItem("");
            this.Limpiar();
                        
                    } else {
                         JOptionPane.showMessageDialog(null, "Error al  Guardado");
                    }

                } catch (Exception e) {
System.out.println("El producto ya existe en la base de datos");    
                }

            }
            
        }


    }//GEN-LAST:event_BtnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JTextField TxtCantidad;
    private javax.swing.JTextField TxtDescripcion;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtPrecio;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelWallpaper;
    // End of variables declaration//GEN-END:variables

    
    
    
    //metodo para limpiar campos
    private void Limpiar(){
    TxtNombre.setText("");
    TxtCantidad.setText("");
    TxtPrecio.setText("");
    TxtDescripcion.setText("");
        
    }
    
    
    
    
//Metodos para cargar las categorias 
    private void CargarComboCategoria() {

        String sql = "Select * from tb_categoria";

        try (Connection cn = Conexion_BD.conectar()) {
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            jComboBoxCategoria.removeAllItems();
            jComboBoxCategoria.addItem("Seleccione categoria:");
            while (rs.next()) {
                jComboBoxCategoria.addItem(rs.getString("Descripcion"));

            }

        } catch (Exception e) {
            System.out.println("Error al cargar categoria");
        }
    }

    //Obtener id categoria
    private int idCategoria() {
        String sql = "select * from tb_categoria where descripcion = '" + this.jComboBoxCategoria.getSelectedItem() + "'";
        java.sql.Connection conexion = Conexion_BD.conectar();

        try (PreparedStatement ps = conexion.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                objetoIdCatedoriaCombo = rs.getInt("idCategoria");
            }

        } catch (Exception e) {
            System.out.println("Error al obtenes id categoria");
        }
        return objetoIdCatedoriaCombo;

    }
}
