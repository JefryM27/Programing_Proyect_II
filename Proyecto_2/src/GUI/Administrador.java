package GUI;

import Logica.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author jefry
 */
public class Administrador extends javax.swing.JFrame {

    private Cliente cliente = new Cliente(this);
    private Proveedor proveedor = new Proveedor(this);

    public Administrador() {
        initComponents();

    }

    // Method to check if the fields are empty
    private boolean camposVacios(String... campos) {
        for (String campo : campos) {
            if (campo.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private int generarID(String fileName) {
        try {
            File archivoJSON = new File(fileName);
            JSONParser parser = new JSONParser();
            JSONArray array = (JSONArray) parser.parse(new FileReader(archivoJSON));
            int lastIndex = array.size() - 1;
            JSONObject ultimo_cliente = (JSONObject) array.get(lastIndex);
            //accesses the attributes of the last data in the table
            Long id = (Long) ultimo_cliente.get("id");
            return id.intValue();
        } catch (IOException | ParseException e) {
            return 1000;
        }
    }

    ;
    
    private void limpiarCampos() {
        this.txtCedulaCliente.setText("");
        this.txtNombreCliente.setText("");
        this.txt1ApellidoCliente.setText("");
        this.txt2ApellidoCliente.setText("");
        this.txtTelefonoCliente.setText("");
        this.txtCorreoCliente.setText("");
        this.txtCedulaProveedor.setText("");
        this.txtNombreProveedor.setText("");
        this.txtTelefonoProveedor.setText("");
        this.txtCorreoProveedor.setText("");
    }

    public void actualizarTablaCliente() {
        cliente.actualizarTabla((DefaultTableModel) tblClientes.getModel());
    }

    public void actualizarTablaProveedor() {
        proveedor.actualizarTabla((DefaultTableModel) tblProveedores.getModel());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTabMain = new javax.swing.JTabbedPane();
        JpInicio = new javax.swing.JPanel();
        JPLinea = new javax.swing.JPanel();
        lblLema = new javax.swing.JLabel();
        lblNombreEmpresa = new javax.swing.JLabel();
        lblImejenInicio = new javax.swing.JLabel();
        JpClientes = new javax.swing.JPanel();
        scrollClientes = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCedulaCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txt1ApellidoCliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt2ApellidoCliente = new javax.swing.JTextField();
        txtTelefonoCliente = new javax.swing.JTextField();
        txtCorreoCliente = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnEditarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        btnGuardarCliente = new javax.swing.JButton();
        lblImajen1 = new javax.swing.JLabel();
        lblImajen2 = new javax.swing.JLabel();
        lblImajen3 = new javax.swing.JLabel();
        lblImajen4 = new javax.swing.JLabel();
        lblImajen5 = new javax.swing.JLabel();
        lblImajen6 = new javax.swing.JLabel();
        JpProveedores = new javax.swing.JPanel();
        scrollProveedores = new javax.swing.JScrollPane();
        tblProveedores = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtCedulaProveedor = new javax.swing.JTextField();
        txtNombreProveedor = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtTelefonoProveedor = new javax.swing.JTextField();
        txtCorreoProveedor = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        btnEditarProveedor = new javax.swing.JButton();
        btnEliminarProveedor = new javax.swing.JButton();
        btnGuardarProveedor = new javax.swing.JButton();
        lblImajenProveedor = new javax.swing.JLabel();
        lblImajenProveedor2 = new javax.swing.JLabel();
        lblImajenProveedor3 = new javax.swing.JLabel();
        lblImajenProveedor4 = new javax.swing.JLabel();
        lblImajenProveedor5 = new javax.swing.JLabel();
        lblImajenProveedor7 = new javax.swing.JLabel();
        JpFactura = new javax.swing.JPanel();
        JpMostrarFactura = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        JpFacturaProductos = new javax.swing.JPanel();
        scrollFacturaProductos = new javax.swing.JScrollPane();
        tblCarritoCompras = new javax.swing.JTable();
        btnEliminarFacturacion = new javax.swing.JButton();
        btnActulizarFacturazion = new javax.swing.JButton();
        jPanel50 = new javax.swing.JPanel();
        btnFinalizarCompra = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtEnvio = new javax.swing.JTextField();
        jPanel51 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        JPCompra = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCompra = new javax.swing.JTable();
        btnActualizarCompra = new javax.swing.JButton();
        btnEliminarCompra = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        JPMarca = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMarca = new javax.swing.JTable();
        btnActualizarMarca = new javax.swing.JButton();
        btnEliminarMarca = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCategoria = new javax.swing.JTable();
        btnActualizarMarca1 = new javax.swing.JButton();
        btnEliminarMarca1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblProducto = new javax.swing.JTable();
        btnActualizarMarca2 = new javax.swing.JButton();
        btnEliminarMarca2 = new javax.swing.JButton();
        cbxCategorias = new javax.swing.JComboBox<>();
        cbxSubcategorias = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1960, 1054));
        setResizable(false);

        JTabMain.setBackground(new java.awt.Color(0, 204, 0));
        JTabMain.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JTabMain.setOpaque(true);

        JpInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPLinea.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout JPLineaLayout = new javax.swing.GroupLayout(JPLinea);
        JPLinea.setLayout(JPLineaLayout);
        JPLineaLayout.setHorizontalGroup(
            JPLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        JPLineaLayout.setVerticalGroup(
            JPLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        JpInicio.add(JPLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 530, 10));

        lblLema.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLema.setForeground(new java.awt.Color(0, 0, 204));
        lblLema.setText("\"China y Costa Rica unidos por el bien de nuestros clientes\"");
        JpInicio.add(lblLema, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 490, -1));

        lblNombreEmpresa.setBackground(new java.awt.Color(0, 0, 0));
        lblNombreEmpresa.setFont(new java.awt.Font("Segoe UI Emoji", 0, 48)); // NOI18N
        lblNombreEmpresa.setText("Bienvenidos a ChinoTico");
        JpInicio.add(lblNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 520, -1));

        lblImejenInicio.setForeground(new java.awt.Color(0, 0, 153));
        lblImejenInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondos/Retail-de-supermercado.png"))); // NOI18N
        JpInicio.add(lblImejenInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 0, 1800, 810));

        JTabMain.addTab("Inicio", JpInicio);

        JpClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Cedula", "Nombre", "Primer Apellido", "Segundo Apellido", "Teléfono", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollClientes.setViewportView(tblClientes);

        JpClientes.add(scrollClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 1040, 230));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel10.setText("Cedula:");

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel11.setText("Nombre:");

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel12.setText("Primer Apellido:");

        txtCedulaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaClienteActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel13.setText("Segundo Apellido:");

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel14.setText("Telefono:");

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel15.setText("Correo:");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnEditarCliente.setBackground(new java.awt.Color(0, 102, 102));
        btnEditarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarCliente.setText("Editar");
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        btnEliminarCliente.setBackground(new java.awt.Color(153, 0, 0));
        btnEliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCliente.setText("Eliminar");
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        btnGuardarCliente.setBackground(new java.awt.Color(0, 153, 51));
        btnGuardarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCliente.setText("Guardar");
        btnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(btnEditarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnGuardarCliente)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt1ApellidoCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCedulaCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(309, 309, 309)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(txt2ApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(txt2ApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtCedulaCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(2, 2, 2))
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(txt1ApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel15))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        JpClientes.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 1040, 190));

        lblImajen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondos/9ecda51d8c2bad23237e6e63159df01b.jpg"))); // NOI18N
        JpClientes.add(lblImajen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 740, 420));

        lblImajen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondos/9ecda51d8c2bad23237e6e63159df01b.jpg"))); // NOI18N
        JpClientes.add(lblImajen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, -10, 730, 420));

        lblImajen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondos/9ecda51d8c2bad23237e6e63159df01b.jpg"))); // NOI18N
        JpClientes.add(lblImajen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, -10, 460, 430));

        lblImajen4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondos/9ecda51d8c2bad23237e6e63159df01b.jpg"))); // NOI18N
        JpClientes.add(lblImajen4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, 410));

        lblImajen5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondos/9ecda51d8c2bad23237e6e63159df01b.jpg"))); // NOI18N
        JpClientes.add(lblImajen5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 410, 450, 410));

        lblImajen6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondos/9ecda51d8c2bad23237e6e63159df01b.jpg"))); // NOI18N
        JpClientes.add(lblImajen6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, 550, 400));

        JTabMain.addTab("Clientes", JpClientes);

        JpProveedores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Cedula", "Nombre", "Teléfono", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollProveedores.setViewportView(tblProveedores);

        JpProveedores.add(scrollProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 1040, 230));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Proveedores"));

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel22.setText("Cedula:");

        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel23.setText("Nombre:");

        jLabel26.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel26.setText("Telefono:");

        jLabel27.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel27.setText("Correo:");

        txtCorreoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoProveedorActionPerformed(evt);
            }
        });

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnEditarProveedor.setBackground(new java.awt.Color(0, 102, 102));
        btnEditarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarProveedor.setText("Editar");
        btnEditarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProveedorActionPerformed(evt);
            }
        });

        btnEliminarProveedor.setBackground(new java.awt.Color(153, 0, 0));
        btnEliminarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProveedor.setText("Eliminar");
        btnEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProveedorActionPerformed(evt);
            }
        });

        btnGuardarProveedor.setBackground(new java.awt.Color(0, 153, 51));
        btnGuardarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarProveedor.setText("Guardar");
        btnGuardarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(btnEditarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEditarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnGuardarProveedor)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(txtCedulaProveedor))
                .addGap(242, 242, 242)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCorreoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCedulaProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel26)
                            .addComponent(txtTelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(txtCorreoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        JpProveedores.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 1030, 190));

        lblImajenProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondos/mercadona-proveedores.jpg"))); // NOI18N
        JpProveedores.add(lblImajenProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 450, 590));

        lblImajenProveedor2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondos/mercadona-proveedores.jpg"))); // NOI18N
        JpProveedores.add(lblImajenProveedor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, -1));

        lblImajenProveedor3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondos/mercadona-proveedores.jpg"))); // NOI18N
        JpProveedores.add(lblImajenProveedor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 570, -1));

        lblImajenProveedor4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondos/mercadona-proveedores.jpg"))); // NOI18N
        JpProveedores.add(lblImajenProveedor4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, 260, -1));

        lblImajenProveedor5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondos/mercadona-proveedores.jpg"))); // NOI18N
        JpProveedores.add(lblImajenProveedor5, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 210, 320, 600));

        lblImajenProveedor7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondos/mercadona-proveedores.jpg"))); // NOI18N
        JpProveedores.add(lblImajenProveedor7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 570, 590));

        JTabMain.addTab("Proveedor", JpProveedores);

        JpMostrarFactura.setBackground(new java.awt.Color(255, 255, 255));
        JpMostrarFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Factura"));

        jLabel32.setBackground(new java.awt.Color(0, 0, 0));
        jLabel32.setFont(new java.awt.Font("Segoe UI Light", 2, 36)); // NOI18N
        jLabel32.setText("Carrito de Compras");

        JpFacturaProductos.setBackground(new java.awt.Color(204, 204, 204));
        JpFacturaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Productos"));

        tblCarritoCompras.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollFacturaProductos.setViewportView(tblCarritoCompras);

        btnEliminarFacturacion.setBackground(new java.awt.Color(153, 0, 0));
        btnEliminarFacturacion.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarFacturacion.setText("Eliminar");
        btnEliminarFacturacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnActulizarFacturazion.setBackground(new java.awt.Color(0, 102, 102));
        btnActulizarFacturazion.setForeground(new java.awt.Color(255, 255, 255));
        btnActulizarFacturazion.setText("Actualizar");
        btnActulizarFacturazion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout JpFacturaProductosLayout = new javax.swing.GroupLayout(JpFacturaProductos);
        JpFacturaProductos.setLayout(JpFacturaProductosLayout);
        JpFacturaProductosLayout.setHorizontalGroup(
            JpFacturaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpFacturaProductosLayout.createSequentialGroup()
                .addGroup(JpFacturaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(JpFacturaProductosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActulizarFacturazion, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnEliminarFacturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JpFacturaProductosLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(scrollFacturaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        JpFacturaProductosLayout.setVerticalGroup(
            JpFacturaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpFacturaProductosLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(scrollFacturaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JpFacturaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActulizarFacturazion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarFacturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel50.setBackground(new java.awt.Color(204, 204, 204));
        jPanel50.setBorder(javax.swing.BorderFactory.createTitledBorder("Facturacion"));

        btnFinalizarCompra.setBackground(new java.awt.Color(0, 153, 51));
        btnFinalizarCompra.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnFinalizarCompra.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizarCompra.setText("Finalizar Compra");
        btnFinalizarCompra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel38.setFont(new java.awt.Font("Segoe UI Emoji", 2, 24)); // NOI18N
        jLabel38.setText("Total:");

        jLabel42.setFont(new java.awt.Font("Segoe UI Emoji", 2, 24)); // NOI18N
        jLabel42.setText("Envio:");

        jPanel51.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel43.setFont(new java.awt.Font("SimSun-ExtB", 2, 36)); // NOI18N
        jLabel43.setText("Chino Tico");

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel43)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jLabel44.setFont(new java.awt.Font("Segoe UI Emoji", 2, 24)); // NOI18N
        jLabel44.setText("Sub-Total");

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel50Layout.createSequentialGroup()
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFinalizarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEnvio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel50Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSubTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addGap(18, 18, 18)
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btnFinalizarCompra)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout JpMostrarFacturaLayout = new javax.swing.GroupLayout(JpMostrarFactura);
        JpMostrarFactura.setLayout(JpMostrarFacturaLayout);
        JpMostrarFacturaLayout.setHorizontalGroup(
            JpMostrarFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpMostrarFacturaLayout.createSequentialGroup()
                .addGroup(JpMostrarFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpMostrarFacturaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JpFacturaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JpMostrarFacturaLayout.createSequentialGroup()
                        .addGap(624, 624, 624)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JpMostrarFacturaLayout.setVerticalGroup(
            JpMostrarFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpMostrarFacturaLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(JpMostrarFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JpFacturaProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JpFacturaLayout = new javax.swing.GroupLayout(JpFactura);
        JpFactura.setLayout(JpFacturaLayout);
        JpFacturaLayout.setHorizontalGroup(
            JpFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpFacturaLayout.createSequentialGroup()
                .addComponent(JpMostrarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        JpFacturaLayout.setVerticalGroup(
            JpFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpMostrarFactura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        JTabMain.addTab("Detalle Compra", JpFactura);

        JPCompra.setBackground(new java.awt.Color(255, 255, 255));

        tblCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "FECHA", "MONTO", "ID  CLIENTE", "ID DETALLE DE COMPRA"
            }
        ));
        jScrollPane1.setViewportView(tblCompra);
        if (tblCompra.getColumnModel().getColumnCount() > 0) {
            tblCompra.getColumnModel().getColumn(1).setHeaderValue("FECHA");
            tblCompra.getColumnModel().getColumn(2).setHeaderValue("MONTO");
            tblCompra.getColumnModel().getColumn(3).setHeaderValue("ID  CLIENTE");
            tblCompra.getColumnModel().getColumn(4).setHeaderValue("ID DETALLE DE COMPRA");
        }

        btnActualizarCompra.setText("ACTUALIZAR");

        btnEliminarCompra.setText("ELIMINAR");

        javax.swing.GroupLayout JPCompraLayout = new javax.swing.GroupLayout(JPCompra);
        JPCompra.setLayout(JPCompraLayout);
        JPCompraLayout.setHorizontalGroup(
            JPCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPCompraLayout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addGroup(JPCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPCompraLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnActualizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(299, 299, 299)
                        .addComponent(btnEliminarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        JPCompraLayout.setVerticalGroup(
            JPCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPCompraLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(JPCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnActualizarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(btnEliminarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(189, Short.MAX_VALUE))
        );

        JTabMain.addTab("Compra", JPCompra);

        JPMarca.setBackground(new java.awt.Color(255, 255, 255));

        tblMarca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "NOMBRE"
            }
        ));
        jScrollPane2.setViewportView(tblMarca);

        btnActualizarMarca.setText("ACTUALIZAR");

        btnEliminarMarca.setText("ELIMINAR");

        javax.swing.GroupLayout JPMarcaLayout = new javax.swing.GroupLayout(JPMarca);
        JPMarca.setLayout(JPMarcaLayout);
        JPMarcaLayout.setHorizontalGroup(
            JPMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPMarcaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(JPMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JPMarcaLayout.createSequentialGroup()
                        .addComponent(btnActualizarMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        JPMarcaLayout.setVerticalGroup(
            JPMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPMarcaLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(JPMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(200, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(JPMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        JTabMain.addTab("Marca", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tblCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "NOMBRE"
            }
        ));
        jScrollPane3.setViewportView(tblCategoria);

        btnActualizarMarca1.setText("ACTUALIZAR");

        btnEliminarMarca1.setText("ELIMINAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnActualizarMarca1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarMarca1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarMarca1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarMarca1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(267, Short.MAX_VALUE))
        );

        JTabMain.addTab("Categoria", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tblProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "PRECIO", "PESO", "ID PROVEEDOR", "ID CATEGORIA", "ID MARCA"
            }
        ));
        jScrollPane4.setViewportView(tblProducto);

        btnActualizarMarca2.setText("ACTUALIZAR");

        btnEliminarMarca2.setText("ELIMINAR");

        cbxCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbxSubcategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnActualizarMarca2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(607, 607, 607)
                        .addComponent(btnEliminarMarca2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(cbxCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(190, 190, 190)
                            .addComponent(cbxSubcategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 188, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxSubcategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizarMarca2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarMarca2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        JTabMain.addTab("Producto", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTabMain, javax.swing.GroupLayout.PREFERRED_SIZE, 1181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JTabMain, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProveedorActionPerformed
        // Get the data entered in the text fields
        String cedula = txtCedulaProveedor.getText();
        String nombre = txtNombreProveedor.getText();
        String telefono = txtTelefonoProveedor.getText();
        String correo = txtCorreoProveedor.getText();
        // Check that the fields are not empty
        if (camposVacios(cedula, nombre, telefono, correo)) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Proveedor nuevoProveedor = new Proveedor(this);
        nuevoProveedor.setId(this.generarID("proveedor.json") + 1);
        nuevoProveedor.setCedulaJuridica(cedula);
        nuevoProveedor.setNombre(nombre);
        nuevoProveedor.setTelefono(telefono);
        nuevoProveedor.setCorreo(correo);
        nuevoProveedor.guardarProveedor();
        actualizarTablaProveedor();
        limpiarCampos();
        //activarPaneles();
    }//GEN-LAST:event_btnGuardarProveedorActionPerformed

    private void btnEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProveedorActionPerformed
        int selectedRow = tblProveedores.getSelectedRow();

        if (selectedRow >= 0) {
            DefaultTableModel model = (DefaultTableModel) tblProveedores.getModel();
            model.removeRow(selectedRow);
            String cedula = txtCedulaCliente.getText();
            String nombre = txtNombreCliente.getText();
            String primerA = txt1ApellidoCliente.getText();
            String segundoA = txt2ApellidoCliente.getText();
            String telefono = txtTelefonoCliente.getText();
            String correo = txtCorreoCliente.getText();
            this.cliente.actualizar_tblProveedores(selectedRow - 1, cedula, nombre, primerA, segundoA, telefono, correo);
            JOptionPane.showMessageDialog(this, "El provedor fue eliminado correctamente");
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un provedor para eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarProveedorActionPerformed

    private void btnEditarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProveedorActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblProveedores.getSelectedRow();
        if (selectedRow >= 0) {
            String cedula = txtCedulaProveedor.getText();
            String nombre = txtNombreProveedor.getText();
            String telefono = txtTelefonoProveedor.getText();
            String correo = txtCorreoProveedor.getText();
            this.proveedor.editar_Proveedor(selectedRow, cedula, nombre, telefono, correo);
            this.actualizarTablaProveedor();
            this.limpiarCampos();
            JOptionPane.showMessageDialog(null, "Se actualizo el proveedor");
        } else {
            JOptionPane.showMessageDialog(null, "Seleciona un Proveedor en la tabla");
        }
    }//GEN-LAST:event_btnEditarProveedorActionPerformed

    private void txtCorreoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoProveedorActionPerformed

    private void btnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClienteActionPerformed

        // Get the data entered in the text fields
        String cédula = txtCedulaCliente.getText();
        String nombre = txtNombreCliente.getText();
        String primerApellido = txt1ApellidoCliente.getText();
        String segundoApellido = txt2ApellidoCliente.getText();
        String teléfono = txtTelefonoCliente.getText();
        String correo = txtCorreoCliente.getText();
        // Check that the fields are not empty
        if (camposVacios(cédula, nombre, primerApellido, segundoApellido, teléfono, correo)) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Cliente nuevoCliente = new Cliente(this);
        nuevoCliente.setId(this.generarID("cliente.json") + 1);
        nuevoCliente.setCédula(cédula);
        nuevoCliente.setNombre(nombre);
        nuevoCliente.setPrimerApellido(primerApellido);
        nuevoCliente.setSegundoApellido(segundoApellido);
        nuevoCliente.setTeléfono(teléfono);
        nuevoCliente.setCorreo(correo);
        nuevoCliente.guardarCliente();
        actualizarTablaCliente();
        limpiarCampos();
        //activarPaneles();
    }//GEN-LAST:event_btnGuardarClienteActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        int selectedRow = tblClientes.getSelectedRow();

        if (selectedRow >= 0) {
            DefaultTableModel model = (DefaultTableModel) tblClientes.getModel();
            model.removeRow(selectedRow);
            String cedula = txtCedulaCliente.getText();
            String nombre = txtNombreCliente.getText();
            String primerA = txt1ApellidoCliente.getText();
            String segundoA = txt2ApellidoCliente.getText();
            String telefono = txtTelefonoCliente.getText();
            String correo = txtCorreoCliente.getText();
            this.cliente.actualizar_tblProveedores(selectedRow - 1, cedula, nombre, primerA, segundoA, telefono, correo);
            JOptionPane.showMessageDialog(this, "El cliente fue eliminado correctamente");
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un cliente para eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed

        int selectedRow = tblClientes.getSelectedRow();
        if (selectedRow >= 0) {
            String cedula = txtCedulaCliente.getText();
            String nombre = txtNombreCliente.getText();
            String primerA = txt1ApellidoCliente.getText();
            String segundoA = txt2ApellidoCliente.getText();
            String telefono = txtTelefonoCliente.getText();
            String correo = txtCorreoCliente.getText();
            this.cliente.editar_cliente(selectedRow - 1, cedula, nombre, primerA, segundoA, telefono, correo);
            actualizarTablaCliente();
            limpiarCampos();
            JOptionPane.showMessageDialog(null, "Se actualizo el cliente");
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona un Cliente en la tabla");
        }
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void txtCedulaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaClienteActionPerformed
        String cedula = txtCedulaCliente.getText(); // Get the value of the text field

        if (cedula.matches("\\d{9}")) {
            System.out.println("Cédula normal válida");
        } else if (cedula.matches("\\d{10}")) {
            System.out.println("Cédula jurídica válida");
        } else {
            System.out.println("Cédula no válida");
        }
    }//GEN-LAST:event_txtCedulaClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPCompra;
    private javax.swing.JPanel JPLinea;
    private javax.swing.JPanel JPMarca;
    private javax.swing.JTabbedPane JTabMain;
    private javax.swing.JPanel JpClientes;
    private javax.swing.JPanel JpFactura;
    private javax.swing.JPanel JpFacturaProductos;
    private javax.swing.JPanel JpInicio;
    private javax.swing.JPanel JpMostrarFactura;
    private javax.swing.JPanel JpProveedores;
    private javax.swing.JButton btnActualizarCompra;
    private javax.swing.JButton btnActualizarMarca;
    private javax.swing.JButton btnActualizarMarca1;
    private javax.swing.JButton btnActualizarMarca2;
    private javax.swing.JButton btnActulizarFacturazion;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEditarProveedor;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEliminarCompra;
    private javax.swing.JButton btnEliminarFacturacion;
    private javax.swing.JButton btnEliminarMarca;
    private javax.swing.JButton btnEliminarMarca1;
    private javax.swing.JButton btnEliminarMarca2;
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnFinalizarCompra;
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JButton btnGuardarProveedor;
    private javax.swing.JComboBox<String> cbxCategorias;
    private javax.swing.JComboBox<String> cbxSubcategorias;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblImajen1;
    private javax.swing.JLabel lblImajen2;
    private javax.swing.JLabel lblImajen3;
    private javax.swing.JLabel lblImajen4;
    private javax.swing.JLabel lblImajen5;
    private javax.swing.JLabel lblImajen6;
    private javax.swing.JLabel lblImajenProveedor;
    private javax.swing.JLabel lblImajenProveedor2;
    private javax.swing.JLabel lblImajenProveedor3;
    private javax.swing.JLabel lblImajenProveedor4;
    private javax.swing.JLabel lblImajenProveedor5;
    private javax.swing.JLabel lblImajenProveedor7;
    private javax.swing.JLabel lblImejenInicio;
    private javax.swing.JLabel lblLema;
    private javax.swing.JLabel lblNombreEmpresa;
    private javax.swing.JScrollPane scrollClientes;
    private javax.swing.JScrollPane scrollFacturaProductos;
    private javax.swing.JScrollPane scrollProveedores;
    private javax.swing.JTable tblCarritoCompras;
    private javax.swing.JTable tblCategoria;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTable tblCompra;
    private javax.swing.JTable tblMarca;
    private javax.swing.JTable tblProducto;
    private javax.swing.JTable tblProveedores;
    private javax.swing.JTextField txt1ApellidoCliente;
    private javax.swing.JTextField txt2ApellidoCliente;
    private javax.swing.JTextField txtCedulaCliente;
    private javax.swing.JTextField txtCedulaProveedor;
    private javax.swing.JTextField txtCorreoCliente;
    private javax.swing.JTextField txtCorreoProveedor;
    private javax.swing.JTextField txtEnvio;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTelefonoCliente;
    private javax.swing.JTextField txtTelefonoProveedor;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}