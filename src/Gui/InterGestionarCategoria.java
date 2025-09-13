package Gui;

import Persistencia.CtrlCategoria;
import Logica.Categoria;
import Persistencia.Conexion_BD;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.security.interfaces.RSAKey;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.management.modelmbean.ModelMBean;
import javax.swing.JOptionPane;

/**
 *
 * @author alana
 */
public class InterGestionarCategoria extends javax.swing.JInternalFrame {

    private int idCategoria;

    public InterGestionarCategoria() {
        initComponents();
        this.setSize(new Dimension(600, 400));
        this.setTitle("Gestionar Categoria");

        this.CargarTablaCategoria();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCategoria = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        BtnActualizar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TxtDescripcion = new javax.swing.JTextField();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrar Categorias");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableCategoria.setBackground(new java.awt.Color(255, 255, 255));
        jTableCategoria.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableCategoria);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 330, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 350, 250));

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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 130, 80));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Descripcion:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        TxtDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        TxtDescripcion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        TxtDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(TxtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 170, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 190, 80));

        jLabel_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Recurso Imagenes del Sistema/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
        if (!TxtDescripcion.getText().isEmpty()) {
            Categoria categoria = new Categoria();
            CtrlCategoria controlCategoria = new CtrlCategoria();

            categoria.setDescripcion(TxtDescripcion.getText().trim());
            if (controlCategoria.Actualizar(categoria, idCategoria)) {
                JOptionPane.showMessageDialog(null, "Categoria actualizada.");
                TxtDescripcion.setText("");
                this.CargarTablaCategoria();

            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar categoria.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Seleciona una categoria.");
        }
    }//GEN-LAST:event_BtnActualizarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
if (idCategoria > 0 && !TxtDescripcion.getText().isEmpty()) {
           
            CtrlCategoria controlCategoria = new CtrlCategoria();

            
            if (controlCategoria.Eliminar(idCategoria)) {
                JOptionPane.showMessageDialog(null, "Categoria eliminada.");
                TxtDescripcion.setText("");
                this.CargarTablaCategoria();

            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar categoria.");
            }

        } else {
              JOptionPane.showMessageDialog(null, "Selecciona una categoría válida.");
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JTextField TxtDescripcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTableCategoria;
    // End of variables declaration//GEN-END:variables

    /*
    metodo para mostrar todas las categorias registradas
    
    
     */
    private void CargarTablaCategoria() {
        java.sql.Connection conexion = Conexion_BD.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "Select idCategoria, Descripcion, Estado from tb_categoria";

        try (PreparedStatement ps = conexion.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();

            model.addColumn("idCategoria");
            model.addColumn("Descripcion");
            model.addColumn("Estado");

            while (rs.next()) {
                Object fila[] = new Object[3];
                for (int i = 0; i < 3; i++) {
                    fila[i] = rs.getObject(i + 1);

                }
                model.addRow(fila);
                jTableCategoria.setModel(model);
                jTableCategoria.getTableHeader().setReorderingAllowed(false); // No permite mover columnas
                jTableCategoria.setRowHeight(25); // Altura de filas
            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla categoria" + e);
        }

        //Enviar Descripcion de la categoria seleccionada 
        jTableCategoria.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                int FilaPoint = jTableCategoria.rowAtPoint(e.getPoint());
                int ColumnaPoint = 0;

                if (FilaPoint > -1) {
                    DefaultTableModel model = (DefaultTableModel) jTableCategoria.getModel();
                    idCategoria = (int) model.getValueAt(FilaPoint, ColumnaPoint);
                    EnviarDatosCategoriaSeleccionada(idCategoria);
                }

            }

        });

    }

    private void EnviarDatosCategoriaSeleccionada(int idCategoria) {
        java.sql.Connection conexion = Conexion_BD.conectar();

        String sql = "select * from tb_categoria where idCategoria = ?";

        try (PreparedStatement st = conexion.prepareStatement(sql)) {
            st.setInt(1, idCategoria);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                TxtDescripcion.setText(rs.getString("Descripcion"));
            }
            conexion.close();

        } catch (Exception e) {
        }

    }

}
