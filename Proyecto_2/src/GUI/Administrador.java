package GUI;

import Logica.*;
import java.awt.event.KeyEvent;
import java.io.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.json.simple.*;
import org.json.simple.parser.*;

/**
 *
 * @author jefry
 */
public final class Administrador extends javax.swing.JFrame {

    private final Cliente cliente = new Cliente(this);
    private final Proveedor proveedor = new Proveedor(this);
    private final Producto producto = new Producto(this);
    private final Marca marca = new Marca(this);
    private final Compra compra = new Compra(this);
    private final DetalleCompra detallecompra = new DetalleCompra(this);
    private IDManager idmanager = new IDManager();
    private Object Validar;
    private Object nuevoProvvedor;

    public Administrador() {
        initComponents();
        actualizarTablaProveedores();
        actualizarTablaClientes();
        actualizarTablaDetalle();
        actualizarTablaCompra();
        comboCategorias.addItem("Bebidas");
        comboCategorias.addItem("Abarrotes");
        comboCategorias.addItem("Limpieza");
        comboCategorias.addItem("Mascotas");
        comboCategorias.addItem("Frescos");
        
    }

    // Method to check if the fields are empty
    private boolean camposVacios(Object... campos) {
        for (Object campo : campos) {
            if (campo == null || (campo instanceof String && ((String) campo).isEmpty())) {
                return true;
            }
        }
        return false;
    }

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

    public void actualizarTablaClientes() {
        cliente.actualizarTabla((DefaultTableModel) tblClientes.getModel());
    }

    public void actualizarTablaMarcas() {
        marca.actualizarTabla((DefaultTableModel) tblMarca.getModel());
    }

    public void actualizarTablaProveedores() {
        proveedor.actualizarTabla((DefaultTableModel) tblProveedores.getModel());
    }

    public void actualizarTablaDetalle() {
        detallecompra.actualizarTabla((DefaultTableModel) tblDetalleCompra.getModel());
    }
    
    public void actualizarTablaCompra() {
        compra.actualizarTabla((DefaultTableModel) tblCompra.getModel());
    }

    private void actualizarTablaProductos(String subcategoria) {
        String subcategoriaSeleccionada = (String) comboSubcategorias.getSelectedItem();
        if (subcategoriaSeleccionada != null) {
            producto.actualizarTabla((DefaultTableModel) tblProducto.getModel(), subcategoriaSeleccionada);
        }
    }

    private void actualizarComboSubcategorias(String categoria) {
        comboSubcategorias.removeAllItems();
        switch (categoria) {
            case "Bebidas":
                agregarSubcategoriaItems("Cervezas", "Licores", "Vinos", "Jugos", "Gaseosas", "Energizantes");
                break;
            case "Abarrotes":
                agregarSubcategoriaItems("Granos y Pastas", "Aceites_Grasas", "Botanas", "Enlatados");
                break;
            case "Limpieza":
                agregarSubcategoriaItems("Detergentes", "Lava platos", "Desifectante y limpiadores", "Accesorios");
                break;
            case "Mascotas":
                agregarSubcategoriaItems("Alimentos_Mascotas", "Accesorios_Mascotas", "Limpieza_Mascotas");
                break;
            case "Frescos":
                agregarSubcategoriaItems("Pollo", "Cerdo", "Res", "Mariscos", "Frutas", "Verduras", "Embutidos");
                break;
            default:
                break;
        }
    }

    private void agregarSubcategoriaItems(String... items) {
        for (String item : items) {
            comboSubcategorias.addItem(item);
        }
    }

    private void cargarProductos(String subcategoria) {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblProducto.getModel();
        Producto productoTabla = new Producto(this);
        productoTabla.actualizarTabla(modeloTabla, subcategoria);
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
        JpFacturaProductos = new javax.swing.JPanel();
        scrollFacturaProductos = new javax.swing.JScrollPane();
        tblDetalleCompra = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtCantidadDetalle = new javax.swing.JTextField();
        txtMontoDetalle = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtIDProductoDetalle = new javax.swing.JTextField();
        txtIDCompraDetalle = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        btnEditarDetalle = new javax.swing.JButton();
        btnEliminarDetalle = new javax.swing.JButton();
        JPCompra = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCompra = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtMontoCompra = new javax.swing.JTextField();
        txtFechaCompra = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtIDcliente = new javax.swing.JTextField();
        txtIDdetallecompra = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        btnEditarCompra = new javax.swing.JButton();
        btnEliminarCompra = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        JPMarca = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMarca = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        btnEditarMarca = new javax.swing.JButton();
        btnElimMarca = new javax.swing.JButton();
        btnGuardarMarca = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCategoria = new javax.swing.JTable();
        btnActualizarMarca1 = new javax.swing.JButton();
        btnEliminarMarca1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblProducto = new javax.swing.JTable();
        comboSubcategorias = new javax.swing.JComboBox<>();
        comboCategorias = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        txtPrecioProducto = new javax.swing.JTextField();
        txtPesoProducto = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtIDProveedorProducto = new javax.swing.JTextField();
        txtIDCategoriaProducto = new javax.swing.JTextField();
        txtIDMarcaProducto = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        btnEditarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        btnGuardarProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        txtCedulaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaClienteKeyTyped(evt);
            }
        });

        txtNombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreClienteKeyTyped(evt);
            }
        });

        txt1ApellidoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1ApellidoClienteKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel13.setText("Segundo Apellido:");

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel14.setText("Telefono:");

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel15.setText("Correo:");

        txt2ApellidoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2ApellidoClienteKeyTyped(evt);
            }
        });

        txtTelefonoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoClienteKeyTyped(evt);
            }
        });

        txtCorreoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoClienteKeyTyped(evt);
            }
        });

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

        txtCedulaProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaProveedorActionPerformed(evt);
            }
        });
        txtCedulaProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaProveedorKeyTyped(evt);
            }
        });

        txtNombreProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreProveedorKeyTyped(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel26.setText("Telefono:");

        jLabel27.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel27.setText("Correo:");

        txtTelefonoProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoProveedorKeyTyped(evt);
            }
        });

        txtCorreoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoProveedorActionPerformed(evt);
            }
        });
        txtCorreoProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoProveedorKeyTyped(evt);
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

        JpFacturaProductos.setBackground(new java.awt.Color(204, 204, 204));
        JpFacturaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle Compra"));

        tblDetalleCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Cantidad", "Monto", "Id_Producto", "Id_Compra"
            }
        ));
        scrollFacturaProductos.setViewportView(tblDetalleCompra);

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));

        jLabel25.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel25.setText("Cantidad");

        jLabel28.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel28.setText("Monto");

        jLabel29.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel29.setText("ID Producto");

        jLabel30.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel30.setText("ID Compra");

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnEditarDetalle.setBackground(new java.awt.Color(0, 102, 102));
        btnEditarDetalle.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarDetalle.setText("Editar");
        btnEditarDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarDetalleActionPerformed(evt);
            }
        });

        btnEliminarDetalle.setBackground(new java.awt.Color(153, 0, 0));
        btnEliminarDetalle.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarDetalle.setText("Eliminar");
        btnEliminarDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDetalleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditarDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCantidadDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMontoDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIDCompraDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(txtIDProductoDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(txtIDProductoDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(txtCantidadDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIDCompraDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(jLabel28)
                            .addComponent(txtMontoDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JpFacturaProductosLayout = new javax.swing.GroupLayout(JpFacturaProductos);
        JpFacturaProductos.setLayout(JpFacturaProductosLayout);
        JpFacturaProductosLayout.setHorizontalGroup(
            JpFacturaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpFacturaProductosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(scrollFacturaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpFacturaProductosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JpFacturaProductosLayout.setVerticalGroup(
            JpFacturaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpFacturaProductosLayout.createSequentialGroup()
                .addComponent(scrollFacturaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JpMostrarFacturaLayout = new javax.swing.GroupLayout(JpMostrarFactura);
        JpMostrarFactura.setLayout(JpMostrarFacturaLayout);
        JpMostrarFacturaLayout.setHorizontalGroup(
            JpMostrarFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpMostrarFacturaLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(JpFacturaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(405, Short.MAX_VALUE))
        );
        JpMostrarFacturaLayout.setVerticalGroup(
            JpMostrarFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpMostrarFacturaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(JpFacturaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(286, Short.MAX_VALUE))
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
            .addGroup(JpFacturaLayout.createSequentialGroup()
                .addComponent(JpMostrarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        jLabel31.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel31.setText("Fecha");

        jLabel32.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel32.setText("Monto");

        jLabel33.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel33.setText("ID Cliente");

        jLabel34.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel34.setText("ID Detalle Compra");

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnEditarCompra.setBackground(new java.awt.Color(0, 102, 102));
        btnEditarCompra.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarCompra.setText("Editar");
        btnEditarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCompraActionPerformed(evt);
            }
        });

        btnEliminarCompra.setBackground(new java.awt.Color(153, 0, 0));
        btnEliminarCompra.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCompra.setText("Eliminar");
        btnEliminarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMontoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIDcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDdetallecompra, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(124, 124, 124)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(txtIDcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)
                            .addComponent(txtFechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIDdetallecompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34)
                            .addComponent(jLabel32)
                            .addComponent(txtMontoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JPCompraLayout = new javax.swing.GroupLayout(JPCompra);
        JPCompra.setLayout(JPCompraLayout);
        JPCompraLayout.setHorizontalGroup(
            JPCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPCompraLayout.createSequentialGroup()
                .addGroup(JPCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPCompraLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPCompraLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        JPCompraLayout.setVerticalGroup(
            JPCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPCompraLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
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

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        btnEditarMarca.setBackground(new java.awt.Color(0, 102, 102));
        btnEditarMarca.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarMarca.setText("Editar");
        btnEditarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarMarcaActionPerformed(evt);
            }
        });

        btnElimMarca.setBackground(new java.awt.Color(255, 0, 0));
        btnElimMarca.setForeground(new java.awt.Color(255, 255, 255));
        btnElimMarca.setText("Eliminar");
        btnElimMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimMarcaActionPerformed(evt);
            }
        });

        btnGuardarMarca.setBackground(new java.awt.Color(0, 204, 0));
        btnGuardarMarca.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarMarca.setText("Guardar");
        btnGuardarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarMarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardarMarca)
                    .addComponent(btnElimMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEditarMarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnElimMarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarMarca)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JPMarcaLayout = new javax.swing.GroupLayout(JPMarca);
        JPMarca.setLayout(JPMarcaLayout);
        JPMarcaLayout.setHorizontalGroup(
            JPMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPMarcaLayout.createSequentialGroup()
                .addGroup(JPMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPMarcaLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPMarcaLayout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPMarcaLayout.setVerticalGroup(
            JPMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPMarcaLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(247, Short.MAX_VALUE))
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
                .addContainerGap(612, Short.MAX_VALUE))
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
                .addContainerGap(277, Short.MAX_VALUE))
        );

        JTabMain.addTab("Categoria", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

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

        comboSubcategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSubcategoriasActionPerformed(evt);
            }
        });

        comboCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoriasActionPerformed(evt);
            }
        });

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel16.setText("Nombre");

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel17.setText("Precio");

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel18.setText("Peso");

        txtNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProductoActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel19.setText("ID Proveedor");

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel20.setText("ID categoria");

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel21.setText("ID marca");

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnEditarProducto.setBackground(new java.awt.Color(0, 102, 102));
        btnEditarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarProducto.setText("Editar");
        btnEditarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProductoActionPerformed(evt);
            }
        });

        btnEliminarProducto.setBackground(new java.awt.Color(153, 0, 0));
        btnEliminarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProducto.setText("Eliminar");
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        btnGuardarProducto.setBackground(new java.awt.Color(0, 153, 51));
        btnGuardarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarProducto.setText("Guardar");
        btnGuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEditarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardarProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEditarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnGuardarProducto)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPesoProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(309, 309, 309)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIDMarcaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIDCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(txtIDProveedorProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(txtIDProveedorProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtNombreProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(2, 2, 2))
                            .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtIDCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel20)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel18)
                                .addComponent(txtPesoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtIDMarcaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel21))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(comboCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboSubcategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSubcategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1181, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        JTabMain.addTab("Producto", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JTabMain, javax.swing.GroupLayout.PREFERRED_SIZE, 1181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTabMain, javax.swing.GroupLayout.PREFERRED_SIZE, 841, Short.MAX_VALUE))
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
        nuevoProveedor.setId(idmanager.generarID("proveedor.json") + 1);
        nuevoProveedor.setCedulaJuridica(cedula);
        nuevoProveedor.setNombre(nombre);
        nuevoProveedor.setTelefono(telefono);
        nuevoProveedor.setCorreo(correo);
        nuevoProveedor.guardarProveedor();
        actualizarTablaProveedores();
        limpiarCampos();
    }//GEN-LAST:event_btnGuardarProveedorActionPerformed

    private void btnEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProveedorActionPerformed
        int selectedRow = tblProveedores.getSelectedRow();
        if (selectedRow != -1) {
            int idProveedorAEliminar = Integer.parseInt(tblProveedores.getValueAt(selectedRow, 0).toString());
            proveedor.eliminarProveedor(idProveedorAEliminar);
            //update table after deleting customer
            actualizarTablaProveedores();
            limpiarCampos();
        }
    }//GEN-LAST:event_btnEliminarProveedorActionPerformed

    private void btnEditarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProveedorActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblProveedores.getSelectedRow();

        if (selectedRow != -1) { // Cambiado de != 0 a != -1
            String cedula = txtCedulaProveedor.getText();
            String nombre = txtNombreProveedor.getText();
            String telefono = txtTelefonoProveedor.getText();
            String correo = txtCorreoProveedor.getText();

            this.proveedor.editar_Proveedor(selectedRow + 1, cedula, nombre, telefono, correo); // Sumado 1 al índice
            this.actualizarTablaProveedores();
            this.limpiarCampos();
            JOptionPane.showMessageDialog(null, "Se actualizó el proveedor");
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona un Proveedor en la tabla");
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
        nuevoCliente.setId(idmanager.generarID("cliente.json") + 1);
        nuevoCliente.setCédula(cédula);
        nuevoCliente.setNombre(nombre);
        nuevoCliente.setPrimerApellido(primerApellido);
        nuevoCliente.setSegundoApellido(segundoApellido);
        nuevoCliente.setTeléfono(teléfono);
        nuevoCliente.setCorreo(correo);
        //Save the new client object
        nuevoCliente.guardarCliente();
        // Update the table displaying Brands
        actualizarTablaClientes();
        // Clear the input field
        limpiarCampos();
        //activarPaneles();
    }//GEN-LAST:event_btnGuardarClienteActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        int selectedRow = tblClientes.getSelectedRow();
        if (selectedRow != -1) {
            int idClienteAEliminar = Integer.parseInt(tblClientes.getValueAt(selectedRow, 0).toString());
            cliente.eliminarCliente(idClienteAEliminar);
            // Update the table after deleting customer
            actualizarTablaClientes();
            limpiarCampos();
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
            actualizarTablaClientes();
            limpiarCampos();
            JOptionPane.showMessageDialog(null, "Se actualizo el cliente");
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona un Cliente en la tabla");
        }
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void txtCedulaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaClienteActionPerformed
        String cedula = txtCedulaCliente.getText();
        boolean esValida = validarCedula(cedula);

        if (esValida) {
            System.out.println("Cédula válida");
        } else {
            System.out.println("Cédula no válida");
        }
    }//GEN-LAST:event_txtCedulaClienteActionPerformed

    private void txtCedulaProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaProveedorActionPerformed

    private void btnEditarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarMarcaActionPerformed
        int selectedRow = tblMarca.getSelectedRow();
        if (selectedRow >= 0) {
            String nombre = txtMarca.getText();
            this.marca.editar_marca(selectedRow - 1, nombre);
            this.actualizarTablaMarcas();
            this.limpiarCampos();
            JOptionPane.showMessageDialog(null, "Se actualizó la marca");
        } else {
            JOptionPane.showMessageDialog(null, "Seleciona una marca en la tabla");
        }
    }//GEN-LAST:event_btnEditarMarcaActionPerformed

    private void btnGuardarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarMarcaActionPerformed
        // Get the name entered in the text field
        String nombre = txtMarca.getText();
        // Check if the name field is empty
        if (camposVacios(nombre)) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Create a new Brand object and set its properties
        Marca nuevaMarca = new Marca(this);
        nuevaMarca.setId(idmanager.generarID("marca.json") + 1);
        nuevaMarca.setNombre(nombre);
        // Save the new Brand object
        nuevaMarca.guardarMarca();
        // Update the table displaying Brands
        actualizarTablaMarcas();
        // Clear the input field
        limpiarCampos();
    }//GEN-LAST:event_btnGuardarMarcaActionPerformed

    private void btnElimMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimMarcaActionPerformed

    }//GEN-LAST:event_btnElimMarcaActionPerformed

    private void comboSubcategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSubcategoriasActionPerformed
        String subcategoriaSeleccionada = (String) comboSubcategorias.getSelectedItem();
        cargarProductos(subcategoriaSeleccionada);
    }//GEN-LAST:event_comboSubcategoriasActionPerformed

    private void comboCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoriasActionPerformed
        String categoriaSeleccionada = (String) comboCategorias.getSelectedItem();
        actualizarComboSubcategorias(categoriaSeleccionada);
        String subcategoriaSeleccionada = (String) comboSubcategorias.getSelectedItem();
        cargarProductos(subcategoriaSeleccionada);
    }//GEN-LAST:event_comboCategoriasActionPerformed

    private void txtNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProductoActionPerformed

    private void btnEditarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProductoActionPerformed
        int selectedRow = tblProducto.getSelectedRow();
        if (selectedRow >= 0) {
            String idProducto = tblProducto.getValueAt(selectedRow, 0).toString();
            String subcategoria = (String) comboSubcategorias.getSelectedItem();
            String nombre = txtNombreProducto.getText();
            double precio = 0.0;
            String precioTexto = txtPrecioProducto.getText();
            if (!precioTexto.isEmpty()) {
                precio = Double.parseDouble(precioTexto);
            }
            String peso = txtPesoProducto.getText();
            String idProveedor = txtIDProveedorProducto.getText();
            String idCategoria = txtIDCategoriaProducto.getText();
            String idMarca = txtIDMarcaProducto.getText();
            producto.editarProducto(subcategoria, idProducto, nombre, precio, peso, idProveedor, idCategoria, idMarca);
            actualizarTablaProductos(subcategoria);
            limpiarCampos();
            JOptionPane.showMessageDialog(null, "Se actualizó el producto");
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona un producto en la tabla");
        }
    }//GEN-LAST:event_btnEditarProductoActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        int selectedRow = tblProducto.getSelectedRow();
        if (selectedRow != -1) {
            String idProductoAEliminar = tblProducto.getValueAt(selectedRow, 0).toString();
            String subcategoria = (String) comboSubcategorias.getSelectedItem();

            Producto producto = new Producto(this);
            producto.eliminarProducto(subcategoria, idProductoAEliminar);

            actualizarTablaProductos(subcategoria);
            limpiarCampos();
        }
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProductoActionPerformed
        String subcategoria = (String) comboSubcategorias.getSelectedItem();
        // Get the data entered in the text fields
        String nombre = txtNombreProducto.getText();
        double precio = Double.parseDouble(txtPrecioProducto.getText());
        String peso = txtPesoProducto.getText();
        String idProveedor = txtIDProveedorProducto.getText();
        String idCategoria = txtIDCategoriaProducto.getText();
        String idMarca = txtIDMarcaProducto.getText();

        // Create the new product
        producto.guardarProducto(subcategoria, nombre, precio, peso, idProveedor, idCategoria, idMarca);

        // Update the table and clear the fields
        actualizarTablaProductos(subcategoria);
        limpiarCampos();
    }//GEN-LAST:event_btnGuardarProductoActionPerformed

    private void btnEditarDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarDetalleActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblProveedores.getSelectedRow();

        if (selectedRow != -1) { // Cambiado de != 0 a != -1
            String cedula = txtCedulaProveedor.getText();
            String nombre = txtNombreProveedor.getText();
            String telefono = txtTelefonoProveedor.getText();
            String correo = txtCorreoProveedor.getText();

            this.proveedor.editar_Proveedor(selectedRow + 1, cedula, nombre, telefono, correo); // Sumado 1 al índice
            this.actualizarTablaProveedores();
            this.limpiarCampos();
            JOptionPane.showMessageDialog(null, "Se actualizó el proveedor");
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona un Proveedor en la tabla");
        }
    }//GEN-LAST:event_btnEditarDetalleActionPerformed

    private void btnEliminarDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDetalleActionPerformed
        int selectedRow = tblDetalleCompra.getSelectedRow();
        if (selectedRow != -1) {
            int idDetalleCompraAEliminar = Integer.parseInt(tblDetalleCompra.getValueAt(selectedRow, 0).toString());
            detallecompra.eliminarDetalleCompra(idDetalleCompraAEliminar);
            actualizarTablaDetallesCompra();
            limpiarCampos();
            JOptionPane.showMessageDialog(null, "Se eliminó el detalle de compra");
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona un detalle de compra en la tabla");
        }
    }//GEN-LAST:event_btnEliminarDetalleActionPerformed

    private void txtCedulaProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaProveedorKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si el caracter es una letra
        if (Character.isLetter(caracter)) {
            evt.consume(); // Consumir el evento para evitar que la letra sea ingresada
            JOptionPane.showMessageDialog(this, "Error en Cédula: Ingrese solo números.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtCedulaProveedorKeyTyped

    private void txtNombreProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProveedorKeyTyped
        // Obtiene el texto actual en el campo de texto
        String textoActual = txtNombreProveedor.getText();

        // Obtiene el carácter que se acaba de escribir
        char caracterIngresado = evt.getKeyChar();

        // Realiza la validación según tus criterios
        if (!Character.isLetter(caracterIngresado) && caracterIngresado != KeyEvent.VK_BACK_SPACE && caracterIngresado != KeyEvent.VK_DELETE) {
            // Si el carácter no es una letra y no es un carácter de borrado, muestra una advertencia
            JOptionPane.showMessageDialog(this, "Solo se permiten letras en este campo.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            // Consumir el evento para evitar que el carácter incorrecto se muestre en el campo de texto
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreProveedorKeyTyped

    private void txtTelefonoProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoProveedorKeyTyped
        char c = evt.getKeyChar();

        // Verificar si el carácter ingresado es un dígito
        if (!Character.isDigit(c)) {
            evt.consume();  // Consumir el evento para que el carácter no se agregue al campo de texto
            JOptionPane.showMessageDialog(this, "Solo se permiten números.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtTelefonoProveedorKeyTyped

    private void txtCorreoProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoProveedorKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si el caracter es válido (letras, números y caracteres especiales permitidos)
        if (!Character.isLetterOrDigit(caracter) && caracter != '@' && caracter != '.' && caracter != '_') {
            // Mostrar mensaje de error o advertencia, por ejemplo:
            javax.swing.JOptionPane.showMessageDialog(this, "Caracter no válido ingresado", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);

            // Consumir el evento para evitar que el caracter incorrecto se agregue al campo de texto
            evt.consume();
        }
    }//GEN-LAST:event_txtCorreoProveedorKeyTyped

    private void txtCedulaClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaClienteKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si el caracter es una letra
        if (Character.isLetter(caracter)) {
            evt.consume(); // Consumir el evento para evitar que la letra sea ingresada
            JOptionPane.showMessageDialog(this, "Error en Cédula: Ingrese solo números.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtCedulaClienteKeyTyped

    private void txtNombreClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClienteKeyTyped
        String textoActual = txtNombreCliente.getText();

        // Obtiene el carácter que se acaba de escribir
        char caracterIngresado = evt.getKeyChar();

        // Realiza la validación según tus criterios
        if (!Character.isLetter(caracterIngresado) && caracterIngresado != KeyEvent.VK_BACK_SPACE && caracterIngresado != KeyEvent.VK_DELETE) {
            // Si el carácter no es una letra y no es un carácter de borrado, muestra una advertencia
            JOptionPane.showMessageDialog(this, "Solo se permiten letras en este campo.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            // Consumir el evento para evitar que el carácter incorrecto se muestre en el campo de texto
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreClienteKeyTyped

    private void txt1ApellidoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1ApellidoClienteKeyTyped
        char c = evt.getKeyChar(); // Obtener el carácter ingresado

        // Verificar si el carácter es una letra (mayúscula o minúscula) o una tilde
        if (!Character.isLetter(c) && c != 'á' && c != 'é' && c != 'í' && c != 'ó' && c != 'ú'
                && !Character.isUpperCase(c) && !Character.isLowerCase(c)) {
            evt.consume(); // Consumir el evento para evitar que se ingrese el carácter inapropiado

            // Mostrar un mensaje de error (puedes adaptar esto a tu forma de mostrar mensajes)
            JOptionPane.showMessageDialog(this, "Solo se permiten letras, tildes, mayúsculas y minúsculas.");
        }
    }//GEN-LAST:event_txt1ApellidoClienteKeyTyped

    private void txt2ApellidoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2ApellidoClienteKeyTyped
        char c = evt.getKeyChar(); // Obtener el carácter ingresado

        // Verificar si el carácter es una letra (mayúscula o minúscula) o una tilde
        if (!Character.isLetter(c) && c != 'á' && c != 'é' && c != 'í' && c != 'ó' && c != 'ú'
                && !Character.isUpperCase(c) && !Character.isLowerCase(c)) {
            evt.consume(); // Consumir el evento para evitar que se ingrese el carácter inapropiado

            // Mostrar un mensaje de error (puedes adaptar esto a tu forma de mostrar mensajes)
            JOptionPane.showMessageDialog(this, "Solo se permiten letras, tildes, mayúsculas y minúsculas.");
        }
    }//GEN-LAST:event_txt2ApellidoClienteKeyTyped

    private void txtTelefonoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoClienteKeyTyped
        char c = evt.getKeyChar();

        // Verificar si el carácter ingresado es un dígito
        if (!Character.isDigit(c)) {
            evt.consume();  // Consumir el evento para que el carácter no se agregue al campo de texto
            JOptionPane.showMessageDialog(this, "Solo se permiten números.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtTelefonoClienteKeyTyped

    private void txtCorreoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoClienteKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si el caracter es válido (letras, números y caracteres especiales permitidos)
        if (!Character.isLetterOrDigit(caracter) && caracter != '@' && caracter != '.' && caracter != '_') {
            // Mostrar mensaje de error o advertencia, por ejemplo:
            javax.swing.JOptionPane.showMessageDialog(this, "Caracter no válido ingresado", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);

            // Consumir el evento para evitar que el caracter incorrecto se agregue al campo de texto
            evt.consume();
        }
    }//GEN-LAST:event_txtCorreoClienteKeyTyped

    private void btnEditarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarCompraActionPerformed

    private void btnEliminarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarCompraActionPerformed


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
    private javax.swing.JButton btnActualizarMarca1;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEditarCompra;
    private javax.swing.JButton btnEditarDetalle;
    private javax.swing.JButton btnEditarMarca;
    private javax.swing.JButton btnEditarProducto;
    private javax.swing.JButton btnEditarProveedor;
    private javax.swing.JButton btnElimMarca;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEliminarCompra;
    private javax.swing.JButton btnEliminarDetalle;
    private javax.swing.JButton btnEliminarMarca1;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JButton btnGuardarMarca;
    private javax.swing.JButton btnGuardarProducto;
    private javax.swing.JButton btnGuardarProveedor;
    private javax.swing.JComboBox<String> comboCategorias;
    private javax.swing.JComboBox<String> comboSubcategorias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
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
    private javax.swing.JTable tblCategoria;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTable tblCompra;
    private javax.swing.JTable tblDetalleCompra;
    private javax.swing.JTable tblMarca;
    private javax.swing.JTable tblProducto;
    private javax.swing.JTable tblProveedores;
    private javax.swing.JTextField txt1ApellidoCliente;
    private javax.swing.JTextField txt2ApellidoCliente;
    private javax.swing.JTextField txtCantidadDetalle;
    private javax.swing.JTextField txtCedulaCliente;
    private javax.swing.JTextField txtCedulaProveedor;
    private javax.swing.JTextField txtCorreoCliente;
    private javax.swing.JTextField txtCorreoProveedor;
    private javax.swing.JTextField txtFechaCompra;
    private javax.swing.JTextField txtIDCategoriaProducto;
    private javax.swing.JTextField txtIDCompraDetalle;
    private javax.swing.JTextField txtIDMarcaProducto;
    private javax.swing.JTextField txtIDProductoDetalle;
    private javax.swing.JTextField txtIDProveedorProducto;
    private javax.swing.JTextField txtIDcliente;
    private javax.swing.JTextField txtIDdetallecompra;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMontoCompra;
    private javax.swing.JTextField txtMontoDetalle;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtPesoProducto;
    private javax.swing.JTextField txtPrecioProducto;
    private javax.swing.JTextField txtTelefonoCliente;
    private javax.swing.JTextField txtTelefonoProveedor;
    // End of variables declaration//GEN-END:variables

    private void actualizarTablaDetallesCompra() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void actualizarTablaCliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void actualizartblProveedores() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void activarPaneles() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean validarCedula(String cedula) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
