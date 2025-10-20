package Gui;

import Persistencia.CtrlCategoria;
import Logica.Categoria;
import Logica.Producto;
import Persistencia.Conexion_BD;
import Persistencia.CtrlProducto;
import java.awt.Color;

import java.sql.Connection;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.security.interfaces.RSAKey;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import javax.swing.JOptionPane;

/**
 *
 * @author alana
 */
public class InterGestionarProducto extends javax.swing.JInternalFrame {

    private int idCategoria;
    private int idProducto;
    int obtenerIdCategoriaCombo = 0;

    private static InterGestionarProducto instancia;

    public static InterGestionarProducto getInstancia() {
        if (instancia == null || instancia.isClosed()) {
            instancia = new InterGestionarProducto();
        }
        return instancia;
    }

    public InterGestionarProducto() {

        instancia = this;

        initComponents();
        this.setSize(new Dimension(900, 500));
        this.setTitle("Gestionar Productos");

        this.CargarTablaProducto();
        


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        BtnActualizar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        TxtCantidad = new javax.swing.JTextField();
        TxtPrecio = new javax.swing.JTextField();
        TxtDescripcion = new javax.swing.JTextField();
        jLabelWallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrar Productos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableProductos.setBackground(new java.awt.Color(255, 255, 255));
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 710, 250));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 730, 270));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnActualizar.setBackground(new java.awt.Color(51, 204, 0));
        BtnActualizar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BtnActualizar.setForeground(new java.awt.Color(0, 0, 0));
        BtnActualizar.setText("Actualizar");
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        BtnEliminar.setBackground(new java.awt.Color(255, 51, 51));
        BtnEliminar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 90, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 130, 270));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, -1));

        TxtNombre.setBackground(new java.awt.Color(255, 255, 255));
        TxtNombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        TxtNombre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 170, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Cantidad:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Precio:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 70, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Descipcion:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 80, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Categoria:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 80, -1));

        jComboBoxCategoria.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jComboBoxCategoria.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione caetgoria:" }));
        jComboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoriaActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBoxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 170, -1));

        TxtCantidad.setBackground(new java.awt.Color(255, 255, 255));
        TxtCantidad.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        TxtCantidad.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(TxtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 170, -1));

        TxtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        TxtPrecio.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        TxtPrecio.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(TxtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 170, -1));

        TxtDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        TxtDescripcion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        TxtDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(TxtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 170, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 870, 100));

        jLabelWallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Recurso Imagenes del Sistema/fondo3.1.jpg"))); // NOI18N
        getContentPane().add(jLabelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
        CtrlProducto controlProducto = new CtrlProducto();

        // Validar campos obligatorios
        if (TxtNombre.getText().isEmpty() || TxtCantidad.getText().isEmpty() || TxtPrecio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos obligatorios");
            return;
        }

        // Validar que cantidad y precio sean números válidos
        try {
            Integer.parseInt(TxtCantidad.getText().trim());
            Integer.parseInt(TxtPrecio.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Cantidad y Precio deben ser números válidos");
            return;
        }

        try {
            int idCat = idCategoria();
            if (idCat <= 0) {
                JOptionPane.showMessageDialog(null, "Seleccione una categoría válida");
                return;
            }
        } catch (Exception e) {
        }
        try {
            // Construir objeto Producto desde los campos del formulario
            Producto producto = new Producto();
            producto.setIdProducto(idProducto); // Este valor debe estar definido previamente
            producto.setNombre(TxtNombre.getText().trim());
            producto.setCantidad(Integer.parseInt(TxtCantidad.getText().trim()));
            producto.setDescripcion(TxtDescripcion.getText().trim());
            producto.setPrecio(Integer.parseInt(TxtPrecio.getText().trim()));

            // Obtener ID de categoría desde el combo
            producto.setIdCategoria(idCategoria());
            producto.setEstado(1); // Estado activo

            // Intentar actualizar en la base de datos
            if (controlProducto.Actualizar(producto, idProducto)) {
                JOptionPane.showMessageDialog(null, "Producto actualizado correctamente");

                // Refrescar tabla y limpiar formulario
                this.CargarTablaProducto();
                this.jComboBoxCategoria.setSelectedItem("");
                this.Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar el producto");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar: " + e.getMessage());
            System.out.println("Error al actualizar: " + e.getMessage());
        }

    }//GEN-LAST:event_BtnActualizarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        CtrlProducto controlProducto = new CtrlProducto();
        if (idProducto > 0) {
            CtrlProducto control = new CtrlProducto();
            boolean eliminado = control.Eliminar(idProducto);

            System.out.println("¿Se eliminó? " + eliminado); // 👈 debug

            if (eliminado) {
                JOptionPane.showMessageDialog(null, "Producto eliminado.");
                CargarTablaProducto();
                Limpiar();
                idProducto = 0;
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar producto.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un producto válido.");
        }


    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void jComboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCategoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnEliminar;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTableProductos;
    // End of variables declaration//GEN-END:variables

    //Metodo para limpiar
    private void Limpiar() {
        TxtNombre.setText("");
        TxtPrecio.setText("");
        TxtDescripcion.setText("");
        TxtCantidad.setText("");
        jComboBoxCategoria.setSelectedIndex(0);

        jComboBoxCategoria.setSelectedItem("Seleccione Categoria");

    }

    //Metodo para cargar las categorias del jcombo
    private void CargarComboProducto() {

        String sql = "select * from tb_categoria";
        try (java.sql.Connection cn = Conexion_BD.conectar()) {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            jComboBoxCategoria.removeAllItems();
            jComboBoxCategoria.addItem("Seleccione categoria");

            while (rs.next()) {
                jComboBoxCategoria.addItem(rs.getString("descripcion"));

            }

        } catch (SQLException e) {
            System.out.println("Error al cargar categoria");
        }

    }

    /*
    metodo para mostrar todas los productos registrados
    
    
     */
    String descripcioncategoria = "";
    int Precio = 0;

    public void CargarTablaProducto() {
        java.sql.Connection conexion = Conexion_BD.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "SELECT p.idproducto, p.Nombre, p.Cantidad, p.Precio, p.Descripcion, c.Descripcion, p.Estado\n"
                + "FROM tb_producto AS p\n"
                + "JOIN tb_categoria AS c ON p.idCategoria = c.idCategoria;";

        try (PreparedStatement ps = conexion.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();

            model.addColumn("N°");//Id
            model.addColumn("Nombre");
            model.addColumn("Cantidad");
            model.addColumn("Precio");
            model.addColumn("Descripcion");
            model.addColumn("Categoria");
            model.addColumn("Estado");

            while (rs.next()) {

                Precio = rs.getInt("Precio");

                Object fila[] = new Object[7];
                for (int i = 0; i < 7; i++) {
                    fila[i] = rs.getObject(i + 1);

                }
                model.addRow(fila);
                jTableProductos.setModel(model);
                jTableProductos.getTableHeader().setReorderingAllowed(false); // No permite mover columnas
                jTableProductos.setRowHeight(25); // Altura de filas
            }
            jTableProductos.setModel(model);
            jTableProductos.getTableHeader().setReorderingAllowed(false);
            jTableProductos.setRowHeight(25);
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla Producto" + e);
        }

        //Enviar Descripcion de la Producto seleccionada 
        jTableProductos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = jTableProductos.rowAtPoint(e.getPoint());
                System.out.println("Fila clickeada: " + fila);

                if (fila > -1) {
                    DefaultTableModel model = (DefaultTableModel) jTableProductos.getModel();
                    Object valorID = model.getValueAt(fila, 0); // columna 0 = ID
                    System.out.println("Valor en columna 0: " + valorID);

                    if (valorID != null) {
                        try {
                            idProducto = Integer.parseInt(valorID.toString());
                            System.out.println("ID capturado: " + idProducto);

                            // Cargar campos
                            TxtNombre.setText(model.getValueAt(fila, 1).toString());
                            TxtCantidad.setText(model.getValueAt(fila, 2).toString());
                            TxtPrecio.setText(model.getValueAt(fila, 3).toString());
                            TxtDescripcion.setText(model.getValueAt(fila, 4).toString());
                            jComboBoxCategoria.setSelectedItem(model.getValueAt(fila, 5).toString());

                            EnviarDatosProductoSeleccionado(idProducto);

                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Error al obtener el ID: " + ex.getMessage());
                            ex.printStackTrace();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo obtener el ID del producto.");
                    }
                } else {
                    System.out.println("No se detectó ninguna fila.");
                }
                System.out.println("Tabla actualizada desde InterProducto");
            }

        });

    }

    private void EnviarDatosProductoSeleccionado(int idProducto) {
        java.sql.Connection conexion = Conexion_BD.conectar();

        String sql = "SELECT p.Nombre, p.Cantidad, p.Precio, p.Descripcion, c.Descripcion AS Categoria, p.Estado "
                + "FROM tb_producto p "
                + "JOIN tb_categoria c ON p.idCategoria = c.idCategoria "
                + "WHERE p.idProducto = ?";

        try (PreparedStatement st = conexion.prepareStatement(sql)) {
            st.setInt(1, idProducto);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                TxtNombre.setText(rs.getString("Nombre"));
                TxtCantidad.setText(String.valueOf(rs.getInt("Cantidad")));
                TxtPrecio.setText(String.valueOf(rs.getInt("Precio")));
                TxtDescripcion.setText(rs.getString("Descripcion"));
                jComboBoxCategoria.setSelectedItem(rs.getString("Categoria"));

            }

            conexion.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar datos del producto: " + e.getMessage());
        }
    }

    private int idCategoria() {
        int idCategoria = -1;
        String sql = "SELECT idCategoria FROM tb_categoria WHERE descripcion = ?";

        try (java.sql.Connection conexion = Conexion_BD.conectar(); PreparedStatement ps = conexion.prepareStatement(sql)) {

            String descripcionSeleccionada = jComboBoxCategoria.getSelectedItem().toString();

            // Evitar usar la opción por defecto
            if (!descripcionSeleccionada.equals("Seleccione categoria")) {
                ps.setString(1, descripcionSeleccionada);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    idCategoria = rs.getInt("idCategoria");
                }
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener idCategoria: " + e.getMessage());
        }
        return idCategoria;

    }

}
