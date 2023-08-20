package GUI;

import Logica.*;
import javax.swing.table.DefaultTableModel;

public class Usuario extends javax.swing.JFrame {

    private Facturacion factura = new Facturacion(this);

    public Usuario() {
        initComponents();
        comboCategorias.addItem("Elegir...");
        comboCategorias.addItem("Bebidas");
        comboCategorias.addItem("Abarrotes");
        comboCategorias.addItem("Limpieza");
        comboCategorias.addItem("Cuidado Personal");
        comboCategorias.addItem("Mascotas");
        comboCategorias.addItem("Frescos");
        comboSubcategorias.addItem("Elegir...");
    }

    public void agregarProducto(Producto producto, int cantidad, double precioTotal) {
        DefaultTableModel model = (DefaultTableModel) tblCarrito.getModel();

        int row = producto.productoExistente(model, producto.getNombre());
        if (row != -1) {
            // El producto ya existe en el carrito
            int cantidadExistente = (int) model.getValueAt(row, 2);
            double precioTotalExistente = (double) model.getValueAt(row, 3);
            model.setValueAt(cantidadExistente + cantidad, row, 2);
            model.setValueAt(precioTotalExistente + precioTotal, row, 3);
        } else {
            // Agrega un nuevo producto al carrito
            model.addRow(new Object[]{producto.getNombre(), producto.getPeso(), cantidad, precioTotal});
        }
    }

    private void actualizarComboSubcategorias(String categoria) {
        comboSubcategorias.removeAllItems();
        comboSubcategorias.addItem("Elegir...");
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
            case "Cuidado Personal":
                agregarSubcategoriaItems("Cuidado Bucal", "Cuidado capilar", "Cuidado de piel", "Cuidado femenino", "Desodorantes");
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
        Datos datos = new Datos();
        ListaProductos listaProductos = new ListaProductos(datos.cargarProductos(subcategoria), this);
        scrollProductos.setViewportView(listaProductos);
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
        JpCategorias = new javax.swing.JPanel();
        JpCategorias1 = new javax.swing.JPanel();
        JpCarrito1 = new javax.swing.JPanel();
        btnEliminarCarrito1 = new javax.swing.JButton();
        btnEditarCarrito1 = new javax.swing.JButton();
        scrollCarrito = new javax.swing.JScrollPane();
        tblCarrito = new javax.swing.JTable();
        btnFinalizar = new javax.swing.JButton();
        comboCategorias = new javax.swing.JComboBox<>();
        scrollProductos = new javax.swing.JScrollPane();
        jPProductos = new javax.swing.JPanel();
        comboSubcategorias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFactura = new javax.swing.JTextArea();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1064));

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

        JpCategorias.setBackground(new java.awt.Color(0, 0, 0));

        JpCategorias1.setBackground(new java.awt.Color(0, 0, 0));
        JpCategorias1.setPreferredSize(new java.awt.Dimension(1630, 810));

        JpCarrito1.setBackground(new java.awt.Color(204, 204, 204));
        JpCarrito1.setBorder(javax.swing.BorderFactory.createTitledBorder("CARRITO"));
        JpCarrito1.setPreferredSize(new java.awt.Dimension(500, 804));

        btnEliminarCarrito1.setBackground(new java.awt.Color(153, 0, 0));
        btnEliminarCarrito1.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCarrito1.setText("Eliminar");
        btnEliminarCarrito1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEditarCarrito1.setBackground(new java.awt.Color(0, 102, 102));
        btnEditarCarrito1.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarCarrito1.setText("Editar");
        btnEditarCarrito1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Peso", "Cantidad", "Precio"
            }
        ));
        scrollCarrito.setViewportView(tblCarrito);

        btnFinalizar.setBackground(new java.awt.Color(51, 153, 0));
        btnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setText("Finalizar Compra");
        btnFinalizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpCarrito1Layout = new javax.swing.GroupLayout(JpCarrito1);
        JpCarrito1.setLayout(JpCarrito1Layout);
        JpCarrito1Layout.setHorizontalGroup(
            JpCarrito1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpCarrito1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(btnEliminarCarrito1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarCarrito1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(scrollCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
        );
        JpCarrito1Layout.setVerticalGroup(
            JpCarrito1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpCarrito1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(scrollCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JpCarrito1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarCarrito1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarCarrito1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        comboCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPProductosLayout = new javax.swing.GroupLayout(jPProductos);
        jPProductos.setLayout(jPProductosLayout);
        jPProductosLayout.setHorizontalGroup(
            jPProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1536, Short.MAX_VALUE)
        );
        jPProductosLayout.setVerticalGroup(
            jPProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
        );

        scrollProductos.setViewportView(jPProductos);

        comboSubcategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSubcategoriasActionPerformed(evt);
            }
        });

        txtFactura.setColumns(20);
        txtFactura.setRows(5);
        jScrollPane1.setViewportView(txtFactura);

        javax.swing.GroupLayout JpCategorias1Layout = new javax.swing.GroupLayout(JpCategorias1);
        JpCategorias1.setLayout(JpCategorias1Layout);
        JpCategorias1Layout.setHorizontalGroup(
            JpCategorias1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpCategorias1Layout.createSequentialGroup()
                .addGroup(JpCategorias1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpCategorias1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(comboCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(comboSubcategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JpCategorias1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 1047, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JpCategorias1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(JpCarrito1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        JpCategorias1Layout.setVerticalGroup(
            JpCategorias1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpCategorias1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpCategorias1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboSubcategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpCategorias1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
                    .addGroup(JpCategorias1Layout.createSequentialGroup()
                        .addComponent(JpCarrito1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );

        javax.swing.GroupLayout JpCategoriasLayout = new javax.swing.GroupLayout(JpCategorias);
        JpCategorias.setLayout(JpCategoriasLayout);
        JpCategoriasLayout.setHorizontalGroup(
            JpCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpCategoriasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JpCategorias1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        JpCategoriasLayout.setVerticalGroup(
            JpCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpCategoriasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JpCategorias1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        JTabMain.addTab("Categorias", JpCategorias);

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

        javax.swing.GroupLayout JpMostrarFacturaLayout = new javax.swing.GroupLayout(JpMostrarFactura);
        JpMostrarFactura.setLayout(JpMostrarFacturaLayout);
        JpMostrarFacturaLayout.setHorizontalGroup(
            JpMostrarFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpMostrarFacturaLayout.createSequentialGroup()
                .addGroup(JpMostrarFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpMostrarFacturaLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(JpFacturaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JpMostrarFacturaLayout.createSequentialGroup()
                        .addGap(624, 624, 624)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
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
            .addComponent(JpMostrarFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JpFacturaLayout.setVerticalGroup(
            JpFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpMostrarFactura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        JTabMain.addTab("Facturacion", JpFactura);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JTabMain, javax.swing.GroupLayout.PREFERRED_SIZE, 1563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTabMain, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoriasActionPerformed
        String categoriaSeleccionada = (String) comboCategorias.getSelectedItem();
        actualizarComboSubcategorias(categoriaSeleccionada);
        String subcategoriaSeleccionada = (String) comboSubcategorias.getSelectedItem();
        cargarProductos(subcategoriaSeleccionada);
    }//GEN-LAST:event_comboCategoriasActionPerformed

    private void comboSubcategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSubcategoriasActionPerformed
        String subcategoriaSeleccionada = (String) comboSubcategorias.getSelectedItem();
        cargarProductos(subcategoriaSeleccionada);
    }//GEN-LAST:event_comboSubcategoriasActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed

        this.factura.Facturar(tblCarrito, txtFactura);

    }//GEN-LAST:event_btnFinalizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPLinea;
    private javax.swing.JTabbedPane JTabMain;
    private javax.swing.JPanel JpCarrito1;
    private javax.swing.JPanel JpCategorias;
    private javax.swing.JPanel JpCategorias1;
    private javax.swing.JPanel JpFactura;
    private javax.swing.JPanel JpFacturaProductos;
    private javax.swing.JPanel JpInicio;
    private javax.swing.JPanel JpMostrarFactura;
    private javax.swing.JButton btnActulizarFacturazion;
    private javax.swing.JButton btnEditarCarrito1;
    private javax.swing.JButton btnEliminarCarrito1;
    private javax.swing.JButton btnEliminarFacturacion;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnFinalizarCompra;
    private javax.swing.JComboBox<String> comboCategorias;
    private javax.swing.JComboBox<String> comboSubcategorias;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JPanel jPProductos;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImejenInicio;
    private javax.swing.JLabel lblLema;
    private javax.swing.JLabel lblNombreEmpresa;
    private javax.swing.JScrollPane scrollCarrito;
    private javax.swing.JScrollPane scrollFacturaProductos;
    private javax.swing.JScrollPane scrollProductos;
    private javax.swing.JTable tblCarrito;
    private javax.swing.JTable tblCarritoCompras;
    private javax.swing.JTextField txtEnvio;
    private javax.swing.JTextArea txtFactura;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
