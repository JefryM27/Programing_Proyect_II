
package GUI;

import Logica.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ChinoTico extends javax.swing.JFrame {
    private Cliente cliente = new Cliente(this);
    private Proveedor proveedor = new Proveedor(this);

   
    public ChinoTico() {
        initComponents();
        //desactivarPaneles();
    }
    
    public void actualizarTablaCliente() {
        cliente.actualizarTabla((DefaultTableModel) tblClientes.getModel());
    }
    public void actualizarTablaProveedor() {
        proveedor.actualizarTabla((DefaultTableModel) tblProveedores.getModel());
    }

    private void limpiarCampos(){
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
    
    // Method to check if the fields are empty
    private boolean camposVacios(String... campos) {
        for (String campo : campos) {
            if (campo.isEmpty()) {
                return true;
            }
        }
        return false;
    }
    //Method to disable panels without disabling the first 2
    private void desactivarPaneles() {
        for (int i = 2; i < jTabbedPane1.getTabCount(); i++) {
            jTabbedPane1.setEnabledAt(i, false);
        }
    }
    //Method to activate panels
    private void activarPaneles() {
        for (int i = 2; i < jTabbedPane1.getTabCount(); i++) {
            jTabbedPane1.setEnabledAt(i, true);
        }
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPInicio = new javax.swing.JPanel();
        JPLinea = new javax.swing.JPanel();
        lblLema = new javax.swing.JLabel();
        lblNombreEmpresa = new javax.swing.JLabel();
        lblImejenInicio = new javax.swing.JLabel();
        jPClientes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
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
        jPProveedores = new javax.swing.JPanel();
        TablaProveedor = new javax.swing.JScrollPane();
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
        JPCtegorias = new javax.swing.JPanel();
        jTabCategorias = new javax.swing.JTabbedPane();
        JPEnergizante = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel20 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jTabbedPane10 = new javax.swing.JTabbedPane();
        jPLicores = new javax.swing.JPanel();
        jPCervezas = new javax.swing.JPanel();
        jPVino = new javax.swing.JPanel();
        jPGranos = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPgranos = new javax.swing.JPanel();
        jPEnlatados = new javax.swing.JPanel();
        jPAceites = new javax.swing.JPanel();
        jPBotanas = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jTabbedPane9 = new javax.swing.JTabbedPane();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCarrito = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        btnEditarCarrito = new javax.swing.JButton();
        btnEliminarCarrito = new javax.swing.JButton();
        jPDetalleCompra = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        DetalleCompra = new javax.swing.JTextPane();
        jPanel47 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(0, 204, 0));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTabbedPane1.setOpaque(true);

        jPInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPInicio.add(JPLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 530, 10));

        lblLema.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLema.setForeground(new java.awt.Color(0, 0, 204));
        lblLema.setText("\"China y Costa Rica unidos por el bien de nuestros clientes\"");
        jPInicio.add(lblLema, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 490, -1));

        lblNombreEmpresa.setBackground(new java.awt.Color(0, 0, 0));
        lblNombreEmpresa.setFont(new java.awt.Font("Segoe UI Emoji", 0, 48)); // NOI18N
        lblNombreEmpresa.setText("Bienvenidos a ChinoTico");
        jPInicio.add(lblNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 520, -1));

        lblImejenInicio.setForeground(new java.awt.Color(0, 0, 153));
        lblImejenInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/Retail-de-supermercado.png"))); // NOI18N
        jPInicio.add(lblImejenInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, 0, 1710, 810));

        jTabbedPane1.addTab("Inicio", jPInicio);

        jPClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane1.setViewportView(tblClientes);

        jPClientes.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 1040, 230));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel10.setText("Cedula:");

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel11.setText("Nombre:");

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel12.setText("Primer Apellido:");

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

        btnEliminarCliente.setBackground(new java.awt.Color(153, 0, 0));
        btnEliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCliente.setText("Eliminar");

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

        jPClientes.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 1040, 190));

        lblImajen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/9ecda51d8c2bad23237e6e63159df01b.jpg"))); // NOI18N
        jPClientes.add(lblImajen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 740, 420));

        lblImajen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/9ecda51d8c2bad23237e6e63159df01b.jpg"))); // NOI18N
        jPClientes.add(lblImajen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, -10, 730, 420));

        lblImajen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/9ecda51d8c2bad23237e6e63159df01b.jpg"))); // NOI18N
        jPClientes.add(lblImajen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, -10, 730, 420));

        lblImajen4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/9ecda51d8c2bad23237e6e63159df01b.jpg"))); // NOI18N
        jPClientes.add(lblImajen4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, 410));

        lblImajen5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/9ecda51d8c2bad23237e6e63159df01b.jpg"))); // NOI18N
        jPClientes.add(lblImajen5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 400, 720, 410));

        lblImajen6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/9ecda51d8c2bad23237e6e63159df01b.jpg"))); // NOI18N
        jPClientes.add(lblImajen6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, 740, 400));

        jTabbedPane1.addTab("Clientes", jPClientes);

        jPProveedores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        TablaProveedor.setViewportView(tblProveedores);

        jPProveedores.add(TablaProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 1040, 230));

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

        btnEliminarProveedor.setBackground(new java.awt.Color(153, 0, 0));
        btnEliminarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProveedor.setText("Eliminar");

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

        jPProveedores.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 1030, 190));

        lblImajenProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/mercadona-proveedores.jpg"))); // NOI18N
        jPProveedores.add(lblImajenProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 450, 590));

        lblImajenProveedor2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/mercadona-proveedores.jpg"))); // NOI18N
        jPProveedores.add(lblImajenProveedor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, -1));

        lblImajenProveedor3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/mercadona-proveedores.jpg"))); // NOI18N
        jPProveedores.add(lblImajenProveedor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 570, -1));

        lblImajenProveedor4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/mercadona-proveedores.jpg"))); // NOI18N
        jPProveedores.add(lblImajenProveedor4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, 510, -1));

        lblImajenProveedor5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/mercadona-proveedores.jpg"))); // NOI18N
        jPProveedores.add(lblImajenProveedor5, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 210, 570, 600));

        lblImajenProveedor7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/mercadona-proveedores.jpg"))); // NOI18N
        jPProveedores.add(lblImajenProveedor7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 570, 590));

        jTabbedPane1.addTab("Proveedor", jPProveedores);

        JPCtegorias.setBackground(new java.awt.Color(0, 0, 0));

        jTabCategorias.setBackground(new java.awt.Color(255, 102, 102));
        jTabCategorias.setAutoscrolls(true);
        jTabCategorias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTabCategorias.setOpaque(true);

        JPEnergizante.setBackground(new java.awt.Color(0, 0, 0));

        jTabbedPane3.setBackground(new java.awt.Color(0, 102, 102));
        jTabbedPane3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTabbedPane3.setOpaque(true);

        jPanel20.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Jugos", jPanel20);

        jPanel45.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1063, Short.MAX_VALUE)
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 742, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Gaseosas", jPanel45);

        jPanel46.setBackground(new java.awt.Color(0, 0, 0));
        jPanel46.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane3.addTab("Energizantes", jPanel46);

        jTabbedPane10.setBackground(new java.awt.Color(153, 0, 0));
        jTabbedPane10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTabbedPane10.setOpaque(true);

        jPLicores.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPLicoresLayout = new javax.swing.GroupLayout(jPLicores);
        jPLicores.setLayout(jPLicoresLayout);
        jPLicoresLayout.setHorizontalGroup(
            jPLicoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPLicoresLayout.setVerticalGroup(
            jPLicoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane10.addTab("Licores", jPLicores);

        jPCervezas.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPCervezasLayout = new javax.swing.GroupLayout(jPCervezas);
        jPCervezas.setLayout(jPCervezasLayout);
        jPCervezasLayout.setHorizontalGroup(
            jPCervezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPCervezasLayout.setVerticalGroup(
            jPCervezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane10.addTab("Cervezas", jPCervezas);

        jPVino.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPVinoLayout = new javax.swing.GroupLayout(jPVino);
        jPVino.setLayout(jPVinoLayout);
        jPVinoLayout.setHorizontalGroup(
            jPVinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1063, Short.MAX_VALUE)
        );
        jPVinoLayout.setVerticalGroup(
            jPVinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 711, Short.MAX_VALUE)
        );

        jTabbedPane10.addTab("Vino", jPVino);

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane10)
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane10)
        );

        jTabbedPane3.addTab("Alcoholicas", jPanel52);

        javax.swing.GroupLayout JPEnergizanteLayout = new javax.swing.GroupLayout(JPEnergizante);
        JPEnergizante.setLayout(JPEnergizanteLayout);
        JPEnergizanteLayout.setHorizontalGroup(
            JPEnergizanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        JPEnergizanteLayout.setVerticalGroup(
            JPEnergizanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        jTabCategorias.addTab("Bebidas", JPEnergizante);

        jTabbedPane4.setBackground(new java.awt.Color(0, 102, 102));
        jTabbedPane4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTabbedPane4.setOpaque(true);

        jPgranos.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPgranosLayout = new javax.swing.GroupLayout(jPgranos);
        jPgranos.setLayout(jPgranosLayout);
        jPgranosLayout.setHorizontalGroup(
            jPgranosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPgranosLayout.setVerticalGroup(
            jPgranosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Granos y Pastas", jPgranos);

        jPEnlatados.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPEnlatadosLayout = new javax.swing.GroupLayout(jPEnlatados);
        jPEnlatados.setLayout(jPEnlatadosLayout);
        jPEnlatadosLayout.setHorizontalGroup(
            jPEnlatadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPEnlatadosLayout.setVerticalGroup(
            jPEnlatadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Enlatados", jPEnlatados);

        jPAceites.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPAceitesLayout = new javax.swing.GroupLayout(jPAceites);
        jPAceites.setLayout(jPAceitesLayout);
        jPAceitesLayout.setHorizontalGroup(
            jPAceitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPAceitesLayout.setVerticalGroup(
            jPAceitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Aceites", jPAceites);

        jPBotanas.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPBotanasLayout = new javax.swing.GroupLayout(jPBotanas);
        jPBotanas.setLayout(jPBotanasLayout);
        jPBotanasLayout.setHorizontalGroup(
            jPBotanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPBotanasLayout.setVerticalGroup(
            jPBotanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Botanas", jPBotanas);

        javax.swing.GroupLayout jPGranosLayout = new javax.swing.GroupLayout(jPGranos);
        jPGranos.setLayout(jPGranosLayout);
        jPGranosLayout.setHorizontalGroup(
            jPGranosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1063, Short.MAX_VALUE)
        );
        jPGranosLayout.setVerticalGroup(
            jPGranosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
        );

        jTabCategorias.addTab("Abarrotes", jPGranos);

        jTabbedPane5.setBackground(new java.awt.Color(0, 102, 102));
        jTabbedPane5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTabbedPane5.setOpaque(true);

        jPanel25.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("Detergentes", jPanel25);

        jPanel26.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("Lava Platos", jPanel26);

        jPanel27.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("Desinfectantes y Limpiadores", jPanel27);

        jPanel28.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("Accesorios", jPanel28);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1063, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
        );

        jTabCategorias.addTab("Limpieza", jPanel12);

        jTabbedPane6.setBackground(new java.awt.Color(0, 102, 102));
        jTabbedPane6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTabbedPane6.setOpaque(true);

        jPanel29.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane6.addTab("Cuidado Bucal", jPanel29);

        jPanel30.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane6.addTab("Cuidado Capilar", jPanel30);

        jPanel31.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane6.addTab("Cuidado de Piel", jPanel31);

        jPanel32.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane6.addTab("Cuidado Femenino", jPanel32);

        jPanel33.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane6.addTab("Desodorantes", jPanel33);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1063, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
        );

        jTabCategorias.addTab("Cuidado Personal", jPanel13);

        jTabbedPane9.setBackground(new java.awt.Color(0, 102, 102));
        jTabbedPane9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTabbedPane9.setOpaque(true);

        jPanel42.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane9.addTab("Alimentos", jPanel42);

        jPanel43.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane9.addTab("Accesorios", jPanel43);

        jPanel44.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane9.addTab("Limpieza", jPanel44);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 1063, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
        );

        jTabCategorias.addTab("Mascotas", jPanel14);

        jTabbedPane7.setBackground(new java.awt.Color(0, 102, 102));
        jTabbedPane7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTabbedPane7.setOpaque(true);

        jPanel34.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane7.addTab("Frutas", jPanel34);

        jPanel35.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane7.addTab("Verduras", jPanel35);

        jTabbedPane8.setBackground(new java.awt.Color(153, 0, 0));
        jTabbedPane8.setOpaque(true);

        jPanel37.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane8.addTab("Res", jPanel37);

        jPanel38.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane8.addTab("Cerdo", jPanel38);

        jPanel39.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane8.addTab("Pollo", jPanel39);

        jPanel40.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane8.addTab("Mariscos", jPanel40);

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 1063, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
        );

        jTabbedPane7.addTab("Carnes", jPanel36);

        jPanel41.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1063, Short.MAX_VALUE)
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 742, Short.MAX_VALUE)
        );

        jTabbedPane7.addTab("Embutidos", jPanel41);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane7)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane7)
        );

        jTabCategorias.addTab("Frescos", jPanel15);

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("CARRITO"));

        tblCarrito.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblCarrito);

        jPanel17.setBackground(new java.awt.Color(204, 204, 204));
        jPanel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEditarCarrito.setBackground(new java.awt.Color(0, 102, 102));
        btnEditarCarrito.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarCarrito.setText("Editar");
        btnEditarCarrito.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEliminarCarrito.setBackground(new java.awt.Color(153, 0, 0));
        btnEliminarCarrito.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCarrito.setText("Eliminar");
        btnEliminarCarrito.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnEditarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPDetalleCompra.setBackground(new java.awt.Color(204, 204, 204));
        jPDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Detalle de Compra"));

        DetalleCompra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane4.setViewportView(DetalleCompra);

        javax.swing.GroupLayout jPDetalleCompraLayout = new javax.swing.GroupLayout(jPDetalleCompra);
        jPDetalleCompra.setLayout(jPDetalleCompraLayout);
        jPDetalleCompraLayout.setHorizontalGroup(
            jPDetalleCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );
        jPDetalleCompraLayout.setVerticalGroup(
            jPDetalleCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPDetalleCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPDetalleCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JPCtegoriasLayout = new javax.swing.GroupLayout(JPCtegorias);
        JPCtegorias.setLayout(JPCtegoriasLayout);
        JPCtegoriasLayout.setHorizontalGroup(
            JPCtegoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPCtegoriasLayout.createSequentialGroup()
                .addComponent(jTabCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        JPCtegoriasLayout.setVerticalGroup(
            JPCtegoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPCtegoriasLayout.createSequentialGroup()
                .addGroup(JPCtegoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabCategorias)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Categorias", JPCtegorias);

        jPanel48.setBackground(new java.awt.Color(255, 255, 255));
        jPanel48.setBorder(javax.swing.BorderFactory.createTitledBorder("Factura"));

        jLabel32.setBackground(new java.awt.Color(0, 0, 0));
        jLabel32.setFont(new java.awt.Font("Segoe UI Light", 2, 36)); // NOI18N
        jLabel32.setText("Carrito de Compras");

        jPanel49.setBackground(new java.awt.Color(204, 204, 204));
        jPanel49.setBorder(javax.swing.BorderFactory.createTitledBorder("Productos"));

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
        jScrollPane5.setViewportView(tblCarritoCompras);

        btnEliminarFacturacion.setBackground(new java.awt.Color(153, 0, 0));
        btnEliminarFacturacion.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarFacturacion.setText("Eliminar");
        btnEliminarFacturacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnActulizarFacturazion.setBackground(new java.awt.Color(0, 102, 102));
        btnActulizarFacturazion.setForeground(new java.awt.Color(255, 255, 255));
        btnActulizarFacturazion.setText("Actualizar");
        btnActulizarFacturazion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActulizarFacturazion, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnEliminarFacturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel49Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addContainerGap(71, Short.MAX_VALUE))
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
                            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addGap(624, 624, 624)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Facturacion", jPanel47);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    int idAleatorio = 0;
    Cliente nuevoCliente = new Cliente(this);
    nuevoCliente.setId(idAleatorio);
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
    int idAleatorio = 0;
    Proveedor nuevoProveedor = new Proveedor(this);
    nuevoProveedor.setId(idAleatorio);
    nuevoProveedor.setCedulaJuridica(cedula);
    nuevoProveedor.setNombre(nombre);
    nuevoProveedor.setTelefono(telefono);
    nuevoProveedor.setCorreo(correo);
    nuevoProveedor.guardarProveedor();
    actualizarTablaProveedor();
    limpiarCampos();
    //activarPaneles();
    }//GEN-LAST:event_btnGuardarProveedorActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane DetalleCompra;
    private javax.swing.JPanel JPCtegorias;
    private javax.swing.JPanel JPEnergizante;
    private javax.swing.JPanel JPLinea;
    private javax.swing.JScrollPane TablaProveedor;
    private javax.swing.JButton btnActulizarFacturazion;
    private javax.swing.JButton btnEditarCarrito;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEditarProveedor;
    private javax.swing.JButton btnEliminarCarrito;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEliminarFacturacion;
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnFinalizarCompra;
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JButton btnGuardarProveedor;
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
    private javax.swing.JPanel jPAceites;
    private javax.swing.JPanel jPBotanas;
    private javax.swing.JPanel jPCervezas;
    private javax.swing.JPanel jPClientes;
    private javax.swing.JPanel jPDetalleCompra;
    private javax.swing.JPanel jPEnlatados;
    private javax.swing.JPanel jPGranos;
    private javax.swing.JPanel jPInicio;
    private javax.swing.JPanel jPLicores;
    private javax.swing.JPanel jPProveedores;
    private javax.swing.JPanel jPVino;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPgranos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabCategorias;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane10;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTabbedPane jTabbedPane9;
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
    private javax.swing.JTable tblCarrito;
    private javax.swing.JTable tblCarritoCompras;
    private javax.swing.JTable tblClientes;
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
