package GUI;

import Logica.*;

public class ProductoPanel extends javax.swing.JPanel {

    private Producto productos;
    private int cantidad;
    private double precioTotal;
    private Usuario parent;

    public ProductoPanel(Producto producto, Usuario parent) {
        try {
            initComponents();
            this.productos = productos;
            lblNombre.setText(producto.getNombre());
            lblPeso.setText(producto.getPeso());
            lblPrecio.setText("₡ " + producto.getPrecio());
            lblImgen.setIcon(new javax.swing.ImageIcon(getClass().getResource(producto.getImagen())));

        } catch (Exception e) {
            System.out.println(producto.getImagen());
        }
        this.parent = parent;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        lblImgen = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        btnComprar = new javax.swing.JButton();
        spnCantidad = new javax.swing.JSpinner();

        setBackground(new java.awt.Color(255, 255, 255));

        lblImgen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bebidas/7up 3000ml.jpg"))); // NOI18N

        lblNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblNombre.setText("Nombre");

        lblPeso.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblPeso.setText("Peso");

        lblPrecio.setBackground(new java.awt.Color(0, 0, 0));
        lblPrecio.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblPrecio.setText("Precio");

        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spnCantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        spnCantidad.setMaximumSize(new java.awt.Dimension(40, 35));
        spnCantidad.setMinimumSize(new java.awt.Dimension(40, 45));
        spnCantidad.setPreferredSize(new java.awt.Dimension(40, 35));
        spnCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCantidadStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblImgen)
                            .addComponent(lblPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnComprar)
                                .addGap(18, 18, 18)
                                .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 47, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImgen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComprar)
                    .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        if (parent != null) {
            cantidad = (int) spnCantidad.getValue();
            precioTotal = productos.getPrecio() * cantidad;
            parent.agregarProducto(productos, cantidad, precioTotal);
        }

    }//GEN-LAST:event_btnComprarActionPerformed

    private void spnCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCantidadStateChanged
        cantidad = (int) spnCantidad.getValue();
        precioTotal = productos.getPrecio() * cantidad;
    }//GEN-LAST:event_spnCantidadStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblImgen;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JSpinner spnCantidad;
    // End of variables declaration//GEN-END:variables
}
