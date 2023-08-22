package GUI;

import Logica.*;
import java.io.*;
import java.text.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.simple.*;
import org.json.simple.parser.*;

public class Usuario extends javax.swing.JFrame {

    private Facturacion factura = new Facturacion(this);
    private DetalleCompra detallecompra = new DetalleCompra(this);
    private Compra compra = new Compra(this);
    private Cliente cliente = new Cliente(this);
    private Login login;
    private double subtotal = 0.0;

    public Usuario(Login login) {
        initComponents();
        this.login = login;
        comboCategorias.addItem("Elegir...");
        comboCategorias.addItem("Bebidas");
        comboCategorias.addItem("Abarrotes");
        comboCategorias.addItem("Limpieza");
        comboCategorias.addItem("Cuidado Personal");
        comboCategorias.addItem("Mascotas");
        comboCategorias.addItem("Frescos");
        comboSubcategorias.addItem("Elegir...");
    }
    
    public void actualizarSubtotal() {
        double subtotal = 0.0;

        for (int row = 0; row < tblCarrito.getRowCount(); row++) {
           double precio = (double) tblCarrito.getValueAt(row, tblCarrito.getColumnModel().getColumnIndex("Precio"));
            subtotal += precio;
        }

        txtSubtotal.setText(String.valueOf(subtotal));
    }
    private void actualizarSubtotalResta() {
        double nuevoSubtotal = 0.0;

        for (int row = 0; row < tblCarrito.getRowCount(); row++) {
            double precio = (double) tblCarrito.getValueAt(row, tblCarrito.getColumnModel().getColumnIndex("Precio"));
            nuevoSubtotal += precio;
        }

        subtotal = nuevoSubtotal;
        txtSubtotal.setText(String.valueOf(subtotal));
    }
    
    public void eliminarProducto(int fila) {
        double precio = (double) tblCarrito.getValueAt(fila, tblCarrito.getColumnModel().getColumnIndex("Precio"));
        subtotal -= precio;
        actualizarSubtotal();
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

    private String obtenerFechaActual() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
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
        scrollCarrito = new javax.swing.JScrollPane();
        tblCarrito = new javax.swing.JTable();
        btnFinalizar = new javax.swing.JButton();
        btnGuardarCompra = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        comboCategorias = new javax.swing.JComboBox<>();
        scrollProductos = new javax.swing.JScrollPane();
        jPProductos = new javax.swing.JPanel();
        comboSubcategorias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFactura = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        JpInicio.add(lblImejenInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, -50, 1800, 810));

        JTabMain.addTab("Inicio", JpInicio);

        JpCategorias.setBackground(new java.awt.Color(0, 0, 0));

        JpCategorias1.setBackground(new java.awt.Color(204, 204, 204));
        JpCategorias1.setPreferredSize(new java.awt.Dimension(1630, 810));

        JpCarrito1.setBackground(new java.awt.Color(204, 204, 204));
        JpCarrito1.setBorder(javax.swing.BorderFactory.createTitledBorder("CARRITO"));
        JpCarrito1.setPreferredSize(new java.awt.Dimension(500, 804));

        btnEliminarCarrito1.setBackground(new java.awt.Color(153, 0, 0));
        btnEliminarCarrito1.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCarrito1.setText("Eliminar");
        btnEliminarCarrito1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminarCarrito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCarrito1ActionPerformed(evt);
            }
        });

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

        btnGuardarCompra.setBackground(new java.awt.Color(204, 0, 204));
        btnGuardarCompra.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCompra.setText("Guardar Compra");
        btnGuardarCompra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCompraActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Subtotal: ");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtSubtotal.setBackground(new java.awt.Color(255, 255, 255));
        txtSubtotal.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        txtSubtotal.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout JpCarrito1Layout = new javax.swing.GroupLayout(JpCarrito1);
        JpCarrito1.setLayout(JpCarrito1Layout);
        JpCarrito1Layout.setHorizontalGroup(
            JpCarrito1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpCarrito1Layout.createSequentialGroup()
                .addGroup(JpCarrito1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpCarrito1Layout.createSequentialGroup()
                        .addComponent(btnEliminarCarrito1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardarCompra)
                        .addGap(18, 18, 18)
                        .addComponent(btnFinalizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JpCarrito1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JpCarrito1Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jLabel3)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        JpCarrito1Layout.setVerticalGroup(
            JpCarrito1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpCarrito1Layout.createSequentialGroup()
                .addComponent(scrollCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGroup(JpCarrito1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpCarrito1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(JpCarrito1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarCarrito1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JpCarrito1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        jLabel1.setText("Sub Categorias");

        jLabel2.setText("Categorias");

        javax.swing.GroupLayout JpCategorias1Layout = new javax.swing.GroupLayout(JpCategorias1);
        JpCategorias1.setLayout(JpCategorias1Layout);
        JpCategorias1Layout.setHorizontalGroup(
            JpCategorias1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpCategorias1Layout.createSequentialGroup()
                .addGroup(JpCategorias1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpCategorias1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboSubcategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JpCategorias1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 1047, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JpCategorias1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JpCarrito1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        JpCategorias1Layout.setVerticalGroup(
            JpCategorias1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpCategorias1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpCategorias1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboSubcategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpCategorias1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
                    .addGroup(JpCategorias1Layout.createSequentialGroup()
                        .addComponent(JpCarrito1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTabMain, javax.swing.GroupLayout.PREFERRED_SIZE, 1508, Short.MAX_VALUE)
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

    private void btnEliminarCarrito1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCarrito1ActionPerformed
        this.factura.eliminarFila(tblCarrito);
        int filaSeleccionada = tblCarrito.getSelectedRow();
        if (filaSeleccionada >= -1) {
            eliminarProducto(filaSeleccionada);
        }
    }//GEN-LAST:event_btnEliminarCarrito1ActionPerformed

    private void btnGuardarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCompraActionPerformed
        String subCategoria = (String) comboSubcategorias.getSelectedItem();
        DefaultTableModel modeloTablaCarrito = (DefaultTableModel) tblCarrito.getModel();
        int rowCount = modeloTablaCarrito.getRowCount();
        IDManager idmanager = new IDManager();
        Administrador admin = new Administrador(); // Crear la instancia de Administrador

        int nuevoIdCompra = (idmanager.generarID("compra.json") + 1);
        double nuevoMontoTotal = 0.0; // Inicializar el monto total
        int idCliente = -1; // Inicializar el ID del cliente

        String nombreCliente = login.getNombreUsuario();
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader("cliente.json")) {
            JSONArray clientesArray = (JSONArray) parser.parse(reader);

            for (Object obj : clientesArray) {
                JSONObject cliente = (JSONObject) obj;
                String jsonUsername = (String) cliente.get("nombre");
                int jsonId = Integer.parseInt(cliente.get("id").toString());

                if (nombreCliente.equals(jsonUsername)) {
                    idCliente = jsonId; // Encontrado el ID del cliente
                    break; // Salir del loop una vez encontrado el cliente
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (idCliente != 0) { // Si se encontró el ID del cliente
            for (int i = 0; i < rowCount; i++) {
                int nuevoIdDetalleCompra = (idmanager.generarID("DetalleCompra.json") + 1);
                int nuevaCantidad = (int) modeloTablaCarrito.getValueAt(i, 2);
                double nuevoMonto = (double) modeloTablaCarrito.getValueAt(i, 3);
                String nombreProducto = (String) modeloTablaCarrito.getValueAt(i, 0);

                String nuevoIdProducto = null;
                try (Reader reader = new FileReader("productos.json")) {
                    JSONObject main = (JSONObject) parser.parse(reader);

                    JSONArray categoriaProductos = (JSONArray) main.get(subCategoria);

                    for (Object productoObj : categoriaProductos) {
                        JSONObject producto = (JSONObject) productoObj;
                        String nombre = (String) producto.get("nombre");
                        String idProducto = (String) producto.get("id");
                        if (nombre.equals(nombreProducto)) {
                            nuevoIdProducto = idProducto;
                            break;
                        }
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

                if (nuevoIdProducto != null) {
                    DetalleCompra nuevoDetalle = new DetalleCompra(nuevoIdDetalleCompra, nuevaCantidad, nuevoMonto, nuevoIdProducto, nuevoIdCompra);
                    detallecompra.guardarDetalleCompra(nuevoDetalle);
                    admin.actualizarTablaDetalle();
                    nuevoMontoTotal += nuevoMonto; // Sumar al monto total
                }
            }

            String fechaActual = obtenerFechaActual(); // Obtener la fecha actual
            Compra nuevaCompra = new Compra(nuevoIdCompra, fechaActual, nuevoMontoTotal, idCliente, nuevoIdCompra);
            compra.guardarCompra(nuevaCompra);
            admin.actualizarTablaCompra(); // Actualizar la tabla de detalles
            modeloTablaCarrito.getDataVector().removeAllElements();
            modeloTablaCarrito.fireTableDataChanged(); // Limpiar tabla carrito
        } else {
            JOptionPane.showMessageDialog(this, "Cliente no encontrado.");
        }
    }//GEN-LAST:event_btnGuardarCompraActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPLinea;
    private javax.swing.JTabbedPane JTabMain;
    private javax.swing.JPanel JpCarrito1;
    private javax.swing.JPanel JpCategorias;
    private javax.swing.JPanel JpCategorias1;
    private javax.swing.JPanel JpInicio;
    private javax.swing.JButton btnEliminarCarrito1;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnGuardarCompra;
    private javax.swing.JComboBox<String> comboCategorias;
    private javax.swing.JComboBox<String> comboSubcategorias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPProductos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImejenInicio;
    private javax.swing.JLabel lblLema;
    private javax.swing.JLabel lblNombreEmpresa;
    private javax.swing.JScrollPane scrollCarrito;
    private javax.swing.JScrollPane scrollProductos;
    private javax.swing.JTable tblCarrito;
    private javax.swing.JTextArea txtFactura;
    private javax.swing.JTextField txtSubtotal;
    // End of variables declaration//GEN-END:variables
}
