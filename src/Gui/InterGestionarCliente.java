package Gui;

import Logica.Cliente;
import Persistencia.Conexion_BD;
import Persistencia.CtrlCliente;

import java.awt.Dimension;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

/**
 *
 * @author alana
 */
public class InterGestionarCliente extends javax.swing.JInternalFrame {

    private int idCliente;

    private static InterGestionarCliente instancia;

    public static InterGestionarCliente getInstancia() {
        if (instancia == null || instancia.isClosed()) {
            instancia = new InterGestionarCliente();
        }
        return instancia;
    }

    public InterGestionarCliente() {

        instancia = this;

        initComponents();
        this.setSize(new Dimension(900, 500));
        this.setTitle("Gestionar Clientes");

        this.CargarTablaCliente();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
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
        TxtTelefono = new javax.swing.JTextField();
        TxtApellido = new javax.swing.JTextField();
        TxtDireccion = new javax.swing.JTextField();
        TxtDNI = new javax.swing.JTextField();
        jLabelWallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrar Cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableClientes.setBackground(new java.awt.Color(255, 255, 255));
        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableClientes);

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
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, -1));

        TxtNombre.setBackground(new java.awt.Color(255, 255, 255));
        TxtNombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        TxtNombre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 170, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Telefono:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 70, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("DNI:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 70, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Direccion:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 80, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Apellido:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 70, -1));

        TxtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        TxtTelefono.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        TxtTelefono.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(TxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 170, -1));

        TxtApellido.setBackground(new java.awt.Color(255, 255, 255));
        TxtApellido.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        TxtApellido.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(TxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 170, -1));

        TxtDireccion.setBackground(new java.awt.Color(255, 255, 255));
        TxtDireccion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        TxtDireccion.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(TxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 170, -1));

        TxtDNI.setBackground(new java.awt.Color(255, 255, 255));
        TxtDNI.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        TxtDNI.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(TxtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 170, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 870, 100));

        jLabelWallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Recurso Imagenes del Sistema/fondo3.1.jpg"))); // NOI18N
        getContentPane().add(jLabelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
CtrlCliente controlCliente = new CtrlCliente();

    // Validar campos obligatorios
    if (TxtNombre.getText().isEmpty() || TxtApellido.getText().isEmpty() || TxtDNI.getText().isEmpty()
            || TxtTelefono.getText().isEmpty() || TxtDireccion.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Complete todos los campos obligatorios");
        return;
    }

    // Validar que DNI y Teléfono sean números válidos
    try {
        Integer.parseInt(TxtDNI.getText().trim());
        Integer.parseInt(TxtTelefono.getText().trim());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "DNI y Teléfono deben ser números válidos");
        return;
    }

    try {
        // Construir objeto Cliente desde los campos del formulario
        Cliente cliente = new Cliente();
        cliente.setIdCliente(idCliente); // ✅ Este valor debe estar definido previamente
        cliente.setNombre(TxtNombre.getText().trim());
        cliente.setApellido(TxtApellido.getText().trim());
        cliente.setDni(TxtDNI.getText().trim());
        cliente.setTelefono(TxtTelefono.getText().trim());
        cliente.setDireccion(TxtDireccion.getText().trim());
        cliente.setEstado(1); // Estado activo

        // Intentar actualizar en la base de datos
        if (controlCliente.Actualizar(cliente, idCliente)) {
            JOptionPane.showMessageDialog(null, "Cliente actualizado correctamente");
            this.CargarTablaCliente();
            this.Limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Error al actualizar el cliente");
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al actualizar: " + e.getMessage());
        System.out.println("Error al actualizar: " + e.getMessage());
    }
       
    }//GEN-LAST:event_BtnActualizarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
CtrlCliente controlCliente= new CtrlCliente();
        if (idCliente == 0) {
    JOptionPane.showMessageDialog(null, "Seleccione un cliente");
} else {
    if (controlCliente.Eliminar(idCliente)) {
        JOptionPane.showMessageDialog(null, "Cliente eliminado");
        this.Limpiar();
    } else {
        JOptionPane.showMessageDialog(null, "Error al eliminar cliente");
        this.Limpiar();
    }
}

    }//GEN-LAST:event_BtnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnEliminar;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTableClientes;
    // End of variables declaration//GEN-END:variables

    //Metodo para limpiar
    private void Limpiar() {
        TxtNombre.setText("");
        TxtApellido.setText("");
        TxtDireccion.setText("");
        TxtTelefono.setText("");
        TxtDNI.setText("");

    }

    public void CargarTablaCliente() {
        java.sql.Connection conexion = Conexion_BD.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "Select * from tb_clientes;";

        try (PreparedStatement ps = conexion.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();

            model.addColumn("N°");//Id
            model.addColumn("Nombre");
            model.addColumn("Apellido");
            model.addColumn("DNI");
            model.addColumn("Telefono");
            model.addColumn("Direccion");
            model.addColumn("Estado");

            while (rs.next()) {

                Object fila[] = new Object[7];
                for (int i = 0; i < 7; i++) {
                    fila[i] = rs.getObject(i + 1);

                }
                model.addRow(fila);
            }
            jTableClientes.setModel(model);
            jTableClientes.getTableHeader().setReorderingAllowed(false);
            jTableClientes.setRowHeight(25);
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla Clientes" + e);
        }

        //Enviar Descripcion de la Producto seleccionada 
        jTableClientes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = jTableClientes.rowAtPoint(e.getPoint());
                System.out.println("Fila clickeada: " + fila);

                if (fila > -1) {
                    DefaultTableModel model = (DefaultTableModel) jTableClientes.getModel();
                    Object valorID = model.getValueAt(fila, 0); // columna 0 = ID
                    System.out.println("Valor en columna 0: " + valorID);

                    if (valorID != null) {
                        try {
                            idCliente = Integer.parseInt(valorID.toString());
                            System.out.println("ID capturado: " + idCliente);

                            // Cargar campos
                            TxtNombre.setText(model.getValueAt(fila, 1).toString());
                            TxtApellido.setText(model.getValueAt(fila, 2).toString());
                            TxtDNI.setText(model.getValueAt(fila, 3).toString());
                            TxtTelefono.setText(model.getValueAt(fila, 4).toString());
                            TxtDireccion.setText(model.getValueAt(fila, 5).toString());

                            EnviarDatosClienteSeleccionado(idCliente);

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

            private void EnviarDatosClienteSeleccionado(int idCliente) {
                java.sql.Connection conexion = Conexion_BD.conectar();

                String sql = "Select * from tb_clientes where idCliente = ? ";

                try (PreparedStatement st = conexion.prepareStatement(sql)) {
                    st.setInt(1, idCliente);
                    ResultSet rs = st.executeQuery();

                    if (rs.next()) {
                        TxtNombre.setText(rs.getString("Nombre"));
                        TxtApellido.setText(rs.getString("Apellido"));
                        TxtDNI.setText(rs.getString("DNI"));
                        TxtTelefono.setText(rs.getString("Telefono"));
                        TxtDireccion.setText(rs.getString("Direccion"));

                    }

                    conexion.close();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al cargar datos del producto: " + e.getMessage());
                }
            }
        });

    }

    private void EnviarDatosClienteSeleccionado(int idCliente) {
        java.sql.Connection conexion = Conexion_BD.conectar();
        String sql = "SELECT * FROM tb_clientes WHERE idCliente = ?";
        try (PreparedStatement st = conexion.prepareStatement(sql)) {
            st.setInt(1, idCliente);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                TxtNombre.setText(rs.getString("Nombre"));
                TxtApellido.setText(rs.getString("Apellido"));
                TxtDNI.setText(rs.getString("DNI"));
                TxtTelefono.setText(rs.getString("Telefono"));
                TxtDireccion.setText(rs.getString("Direccion"));
            }
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar datos del cliente: " + e.getMessage());
        }
    }
}
