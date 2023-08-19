
package GUI;

import Logica.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

public class ChinoTico extends javax.swing.JFrame {


   
    public ChinoTico() {
        initComponents();
        Datos datos = new Datos();
        ListaProductos cervezas = new ListaProductos(datos.cargarProductos("Cervezas"),this);
        scrollCervezas.setViewportView(new ListaProductos(datos.cargarProductos("Cervezas"),this));
        scrollLicores.setViewportView(new ListaProductos(datos.cargarProductos("Licores"), this));
        scrollVino.setViewportView(new ListaProductos(datos.cargarProductos("Vinos"), this));
        scrollEnergizantes.setViewportView(new ListaProductos(datos.cargarProductos("Energizantes"), this));
        scrollGaseosas.setViewportView(new ListaProductos(datos.cargarProductos("Gaseosas"), this));
        scrollJugos.setViewportView(new ListaProductos(datos.cargarProductos("Jugos"), this));
        scrollAccesoriosMascotas.setViewportView(new ListaProductos(datos.cargarProductos("Accesorios_Mascotas"), this));
        scrollAlimentos.setViewportView(new ListaProductos(datos.cargarProductos("Alimentos_Mascotas"), this));
        scrollHigineMascotas.setViewportView(new ListaProductos(datos.cargarProductos("Limpieza_Mascotas"), this));
        scrollBotanas.setViewportView(new ListaProductos(datos.cargarProductos("Botanas"), this));
        scrollAceite.setViewportView(new ListaProductos(datos.cargarProductos("Aceites_Grasas"), this));
        scrollPollo.setViewportView(new ListaProductos(datos.cargarProductos("Pollo"), this));
        scrollRes.setViewportView(new ListaProductos(datos.cargarProductos("Res"), this));
        scrollMariscos.setViewportView(new ListaProductos(datos.cargarProductos("Mariscos"), this));
        scrollCerdo.setViewportView(new ListaProductos(datos.cargarProductos("Cerdo"), this));
        scrollFrutas.setViewportView(new ListaProductos(datos.cargarProductos("Frutas"), this));
        scrollVerduras.setViewportView(new ListaProductos(datos.cargarProductos("Verduras"), this));
        scrollEmbutidos.setViewportView(new ListaProductos(datos.cargarProductos("Embutidos"), this));
        scrollAccesorios.setViewportView(new ListaProductos(datos.cargarProductos("Accesorios"), this));
        scrollDesinfectantes.setViewportView(new ListaProductos(datos.cargarProductos("Desifectante y limpiadores"), this));
        scrollLavaPlatos.setViewportView(new ListaProductos(datos.cargarProductos("Lava platos"), this));
        scrollDetergentes.setViewportView(new ListaProductos(datos.cargarProductos("Detergentes"), this));
        scrollEnlatados.setViewportView(new ListaProductos(datos.cargarProductos("Enlatados"), this));
        scrollGranos.setViewportView(new ListaProductos(datos.cargarProductos("Granos y Pastas"), this));
        //scrollLacteos.setViewportView(new ListaProductos(datos.cargarProductos("Granos y Pastas"), this));
    }
    
    

    
    
    
   
    //Method to disable panels without disabling the first 2
    private void desactivarPaneles() {
        for (int i = 2; i < JTabMain.getTabCount(); i++) {
            JTabMain.setEnabledAt(i, false);
        }
    }
    //Method to activate panels
    private void activarPaneles() {
        for (int i = 2; i < JTabMain.getTabCount(); i++) {
            JTabMain.setEnabledAt(i, true);
        }
    }
    
    public void agregarProducto(Producto producto){
        
       ((DefaultTableModel) tblCarrito.getModel()).addRow(new Object[]{producto.getNombre(), producto.getPeso(), producto.getPrecio()});
    }

 /*private void activarBotones(){
        btnGuardarCliente.setEnabled(true);
        btnGuardarProveedor.setEnabled(true);
        btnEditarCliente.setEnabled(true);   
        btnEliminarProveedor.setEnabled(true);
        btnEliminarCliente.setEnabled(true);
 }
    
    private void desactivarBotones(){
        btnGuardarCliente.setEnabled(false);
        btnGuardarProveedor.setEnabled(false);
        btnEditarCliente.setEnabled(false); 
        btnEliminarProveedor.setEnabled(false);
        btnEliminarCliente.setEnabled(false);
    }*/

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
        jTabCategorias = new javax.swing.JTabbedPane();
        JpBebidas = new javax.swing.JPanel();
        JTabSubCategoriasBebidas = new javax.swing.JTabbedPane();
        JpAlcoholicas = new javax.swing.JPanel();
        jTabSubsubcategoriasBebidas = new javax.swing.JTabbedPane();
        scrollCervezas = new javax.swing.JScrollPane();
        JpCervezas = new javax.swing.JPanel();
        scrollVino = new javax.swing.JScrollPane();
        JpVinos = new javax.swing.JPanel();
        scrollLicores = new javax.swing.JScrollPane();
        JpLicores = new javax.swing.JPanel();
        scrollJugos = new javax.swing.JScrollPane();
        JpJugos = new javax.swing.JPanel();
        scrollGaseosas = new javax.swing.JScrollPane();
        JpGaseosas = new javax.swing.JPanel();
        scrollEnergizantes = new javax.swing.JScrollPane();
        JpEnergizantes = new javax.swing.JPanel();
        JpAbarrotes = new javax.swing.JPanel();
        JTabSubCategoriasAbarrotes = new javax.swing.JTabbedPane();
        scrollGranos = new javax.swing.JScrollPane();
        JpGranos = new javax.swing.JPanel();
        scrollAceite = new javax.swing.JScrollPane();
        JpAceite = new javax.swing.JPanel();
        scrollBotanas = new javax.swing.JScrollPane();
        JpBotanas = new javax.swing.JPanel();
        scrollLacteos = new javax.swing.JScrollBar();
        scrollEnlatados = new javax.swing.JScrollPane();
        JpEnlatados = new javax.swing.JPanel();
        JpLimpieza = new javax.swing.JPanel();
        JTabSubCategoriasLimpieza = new javax.swing.JTabbedPane();
        scrollDetergentes = new javax.swing.JScrollPane();
        JpDetergentes = new javax.swing.JPanel();
        scrollLavaPlatos = new javax.swing.JScrollPane();
        JpLavaPlatos = new javax.swing.JPanel();
        scrollDesinfectantes = new javax.swing.JScrollPane();
        JpDesinfectantes = new javax.swing.JPanel();
        scrollAccesorios = new javax.swing.JScrollPane();
        JpAccesorios = new javax.swing.JPanel();
        JpCuidadoPersonal = new javax.swing.JPanel();
        JTabSubCategoriasCuidadoPersonal = new javax.swing.JTabbedPane();
        scrollCuidadoBucal = new javax.swing.JScrollPane();
        JpCuidadoBucal = new javax.swing.JPanel();
        scrollCuidadoCapilar = new javax.swing.JScrollPane();
        JpCuidadoCapilar = new javax.swing.JPanel();
        scrollCuidadoDePiel = new javax.swing.JScrollPane();
        JpCuidadoDePiel = new javax.swing.JPanel();
        scrollCuidadoFemenino = new javax.swing.JScrollPane();
        JpCuidadoFemenino = new javax.swing.JPanel();
        scrollDesodorantes = new javax.swing.JScrollPane();
        JpDesodorantes = new javax.swing.JPanel();
        JpMacotas = new javax.swing.JPanel();
        JTabSubCategoriasMascotas = new javax.swing.JTabbedPane();
        scrollAlimentos = new javax.swing.JScrollPane();
        JpAlimentos = new javax.swing.JPanel();
        scrollAccesoriosMascotas = new javax.swing.JScrollPane();
        JpAccesoriosMascotas = new javax.swing.JPanel();
        scrollHigineMascotas = new javax.swing.JScrollPane();
        JpHigieneMascotas = new javax.swing.JPanel();
        JpFrescos = new javax.swing.JPanel();
        JTabSubCategoriasFrescos = new javax.swing.JTabbedPane();
        JpCarnes = new javax.swing.JPanel();
        JTabSubSubCategoriasFrescos = new javax.swing.JTabbedPane();
        scrollRes = new javax.swing.JScrollPane();
        JpRes = new javax.swing.JPanel();
        scrollCerdo = new javax.swing.JScrollPane();
        JpCerdo = new javax.swing.JPanel();
        scrollPollo = new javax.swing.JScrollPane();
        JpPollo = new javax.swing.JPanel();
        scrollMariscos = new javax.swing.JScrollPane();
        JpMariscos = new javax.swing.JPanel();
        scrollFrutas = new javax.swing.JScrollPane();
        JpFrutas = new javax.swing.JPanel();
        scrollVerduras = new javax.swing.JScrollPane();
        JpVerduras = new javax.swing.JPanel();
        scrollEmbutidos = new javax.swing.JScrollPane();
        JpEmbutidos = new javax.swing.JPanel();
        JpCarrito = new javax.swing.JPanel();
        scrollCarrito = new javax.swing.JScrollPane();
        tblCarrito = new javax.swing.JTable();
        JpAccionesCarrito = new javax.swing.JPanel();
        btnEditarCarrito = new javax.swing.JButton();
        btnEliminarCarrito = new javax.swing.JButton();
        JpDetalleCompra = new javax.swing.JPanel();
        scrollDetalleCompra = new javax.swing.JScrollPane();
        DetalleCompra = new javax.swing.JTextPane();
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

        jTabCategorias.setBackground(new java.awt.Color(255, 102, 102));
        jTabCategorias.setAutoscrolls(true);
        jTabCategorias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTabCategorias.setOpaque(true);

        JpBebidas.setBackground(new java.awt.Color(0, 0, 0));

        JTabSubCategoriasBebidas.setBackground(new java.awt.Color(0, 102, 102));
        JTabSubCategoriasBebidas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JTabSubCategoriasBebidas.setOpaque(true);

        jTabSubsubcategoriasBebidas.setBackground(new java.awt.Color(153, 0, 0));
        jTabSubsubcategoriasBebidas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTabSubsubcategoriasBebidas.setOpaque(true);

        javax.swing.GroupLayout JpCervezasLayout = new javax.swing.GroupLayout(JpCervezas);
        JpCervezas.setLayout(JpCervezasLayout);
        JpCervezasLayout.setHorizontalGroup(
            JpCervezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        JpCervezasLayout.setVerticalGroup(
            JpCervezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );

        scrollCervezas.setViewportView(JpCervezas);

        jTabSubsubcategoriasBebidas.addTab("Cervezas", scrollCervezas);

        javax.swing.GroupLayout JpVinosLayout = new javax.swing.GroupLayout(JpVinos);
        JpVinos.setLayout(JpVinosLayout);
        JpVinosLayout.setHorizontalGroup(
            JpVinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        JpVinosLayout.setVerticalGroup(
            JpVinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );

        scrollVino.setViewportView(JpVinos);

        jTabSubsubcategoriasBebidas.addTab("Vinos", scrollVino);

        javax.swing.GroupLayout JpLicoresLayout = new javax.swing.GroupLayout(JpLicores);
        JpLicores.setLayout(JpLicoresLayout);
        JpLicoresLayout.setHorizontalGroup(
            JpLicoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        JpLicoresLayout.setVerticalGroup(
            JpLicoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );

        scrollLicores.setViewportView(JpLicores);

        jTabSubsubcategoriasBebidas.addTab("Licores", scrollLicores);

        javax.swing.GroupLayout JpAlcoholicasLayout = new javax.swing.GroupLayout(JpAlcoholicas);
        JpAlcoholicas.setLayout(JpAlcoholicasLayout);
        JpAlcoholicasLayout.setHorizontalGroup(
            JpAlcoholicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabSubsubcategoriasBebidas)
        );
        JpAlcoholicasLayout.setVerticalGroup(
            JpAlcoholicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabSubsubcategoriasBebidas, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
        );

        JTabSubCategoriasBebidas.addTab("Alcoholicas", JpAlcoholicas);

        javax.swing.GroupLayout JpJugosLayout = new javax.swing.GroupLayout(JpJugos);
        JpJugos.setLayout(JpJugosLayout);
        JpJugosLayout.setHorizontalGroup(
            JpJugosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        JpJugosLayout.setVerticalGroup(
            JpJugosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );

        scrollJugos.setViewportView(JpJugos);

        JTabSubCategoriasBebidas.addTab("Jugos", scrollJugos);

        javax.swing.GroupLayout JpGaseosasLayout = new javax.swing.GroupLayout(JpGaseosas);
        JpGaseosas.setLayout(JpGaseosasLayout);
        JpGaseosasLayout.setHorizontalGroup(
            JpGaseosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        JpGaseosasLayout.setVerticalGroup(
            JpGaseosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );

        scrollGaseosas.setViewportView(JpGaseosas);

        JTabSubCategoriasBebidas.addTab("Gaseosas", scrollGaseosas);

        javax.swing.GroupLayout JpEnergizantesLayout = new javax.swing.GroupLayout(JpEnergizantes);
        JpEnergizantes.setLayout(JpEnergizantesLayout);
        JpEnergizantesLayout.setHorizontalGroup(
            JpEnergizantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        JpEnergizantesLayout.setVerticalGroup(
            JpEnergizantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );

        scrollEnergizantes.setViewportView(JpEnergizantes);

        JTabSubCategoriasBebidas.addTab("Energizantes", scrollEnergizantes);

        javax.swing.GroupLayout JpBebidasLayout = new javax.swing.GroupLayout(JpBebidas);
        JpBebidas.setLayout(JpBebidasLayout);
        JpBebidasLayout.setHorizontalGroup(
            JpBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTabSubCategoriasBebidas)
        );
        JpBebidasLayout.setVerticalGroup(
            JpBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTabSubCategoriasBebidas, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
        );

        jTabCategorias.addTab("Bebidas", JpBebidas);

        JTabSubCategoriasAbarrotes.setBackground(new java.awt.Color(0, 102, 102));
        JTabSubCategoriasAbarrotes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JTabSubCategoriasAbarrotes.setOpaque(true);

        javax.swing.GroupLayout JpGranosLayout = new javax.swing.GroupLayout(JpGranos);
        JpGranos.setLayout(JpGranosLayout);
        JpGranosLayout.setHorizontalGroup(
            JpGranosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        JpGranosLayout.setVerticalGroup(
            JpGranosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );

        scrollGranos.setViewportView(JpGranos);

        JTabSubCategoriasAbarrotes.addTab("Granos y Pastas", scrollGranos);

        javax.swing.GroupLayout JpAceiteLayout = new javax.swing.GroupLayout(JpAceite);
        JpAceite.setLayout(JpAceiteLayout);
        JpAceiteLayout.setHorizontalGroup(
            JpAceiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        JpAceiteLayout.setVerticalGroup(
            JpAceiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );

        scrollAceite.setViewportView(JpAceite);

        JTabSubCategoriasAbarrotes.addTab("Aceites", scrollAceite);

        javax.swing.GroupLayout JpBotanasLayout = new javax.swing.GroupLayout(JpBotanas);
        JpBotanas.setLayout(JpBotanasLayout);
        JpBotanasLayout.setHorizontalGroup(
            JpBotanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        JpBotanasLayout.setVerticalGroup(
            JpBotanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );

        scrollBotanas.setViewportView(JpBotanas);

        JTabSubCategoriasAbarrotes.addTab("Botanas", scrollBotanas);

        scrollLacteos.setPreferredSize(new java.awt.Dimension(1061, 806));
        JTabSubCategoriasAbarrotes.addTab("Lacteos", scrollLacteos);

        javax.swing.GroupLayout JpEnlatadosLayout = new javax.swing.GroupLayout(JpEnlatados);
        JpEnlatados.setLayout(JpEnlatadosLayout);
        JpEnlatadosLayout.setHorizontalGroup(
            JpEnlatadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        JpEnlatadosLayout.setVerticalGroup(
            JpEnlatadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );

        scrollEnlatados.setViewportView(JpEnlatados);

        JTabSubCategoriasAbarrotes.addTab("Enlatados", scrollEnlatados);

        javax.swing.GroupLayout JpAbarrotesLayout = new javax.swing.GroupLayout(JpAbarrotes);
        JpAbarrotes.setLayout(JpAbarrotesLayout);
        JpAbarrotesLayout.setHorizontalGroup(
            JpAbarrotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTabSubCategoriasAbarrotes)
        );
        JpAbarrotesLayout.setVerticalGroup(
            JpAbarrotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTabSubCategoriasAbarrotes, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
        );

        jTabCategorias.addTab("Abarrotes", JpAbarrotes);

        JTabSubCategoriasLimpieza.setBackground(new java.awt.Color(0, 102, 102));
        JTabSubCategoriasLimpieza.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JTabSubCategoriasLimpieza.setOpaque(true);

        javax.swing.GroupLayout JpDetergentesLayout = new javax.swing.GroupLayout(JpDetergentes);
        JpDetergentes.setLayout(JpDetergentesLayout);
        JpDetergentesLayout.setHorizontalGroup(
            JpDetergentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        JpDetergentesLayout.setVerticalGroup(
            JpDetergentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );

        scrollDetergentes.setViewportView(JpDetergentes);

        JTabSubCategoriasLimpieza.addTab("Detergentes", scrollDetergentes);

        javax.swing.GroupLayout JpLavaPlatosLayout = new javax.swing.GroupLayout(JpLavaPlatos);
        JpLavaPlatos.setLayout(JpLavaPlatosLayout);
        JpLavaPlatosLayout.setHorizontalGroup(
            JpLavaPlatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        JpLavaPlatosLayout.setVerticalGroup(
            JpLavaPlatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );

        scrollLavaPlatos.setViewportView(JpLavaPlatos);

        JTabSubCategoriasLimpieza.addTab("Lava Platos", scrollLavaPlatos);

        javax.swing.GroupLayout JpDesinfectantesLayout = new javax.swing.GroupLayout(JpDesinfectantes);
        JpDesinfectantes.setLayout(JpDesinfectantesLayout);
        JpDesinfectantesLayout.setHorizontalGroup(
            JpDesinfectantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        JpDesinfectantesLayout.setVerticalGroup(
            JpDesinfectantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );

        scrollDesinfectantes.setViewportView(JpDesinfectantes);

        JTabSubCategoriasLimpieza.addTab("Desinfectantes y Limpiadores", scrollDesinfectantes);

        javax.swing.GroupLayout JpAccesoriosLayout = new javax.swing.GroupLayout(JpAccesorios);
        JpAccesorios.setLayout(JpAccesoriosLayout);
        JpAccesoriosLayout.setHorizontalGroup(
            JpAccesoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        JpAccesoriosLayout.setVerticalGroup(
            JpAccesoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );

        scrollAccesorios.setViewportView(JpAccesorios);

        JTabSubCategoriasLimpieza.addTab("Accesorios", scrollAccesorios);

        javax.swing.GroupLayout JpLimpiezaLayout = new javax.swing.GroupLayout(JpLimpieza);
        JpLimpieza.setLayout(JpLimpiezaLayout);
        JpLimpiezaLayout.setHorizontalGroup(
            JpLimpiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTabSubCategoriasLimpieza)
        );
        JpLimpiezaLayout.setVerticalGroup(
            JpLimpiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTabSubCategoriasLimpieza, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
        );

        jTabCategorias.addTab("Limpieza", JpLimpieza);

        JTabSubCategoriasCuidadoPersonal.setBackground(new java.awt.Color(0, 102, 102));
        JTabSubCategoriasCuidadoPersonal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JTabSubCategoriasCuidadoPersonal.setOpaque(true);

        javax.swing.GroupLayout JpCuidadoBucalLayout = new javax.swing.GroupLayout(JpCuidadoBucal);
        JpCuidadoBucal.setLayout(JpCuidadoBucalLayout);
        JpCuidadoBucalLayout.setHorizontalGroup(
            JpCuidadoBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        JpCuidadoBucalLayout.setVerticalGroup(
            JpCuidadoBucalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );

        scrollCuidadoBucal.setViewportView(JpCuidadoBucal);

        JTabSubCategoriasCuidadoPersonal.addTab("Cuidado Bucal", scrollCuidadoBucal);

        javax.swing.GroupLayout JpCuidadoCapilarLayout = new javax.swing.GroupLayout(JpCuidadoCapilar);
        JpCuidadoCapilar.setLayout(JpCuidadoCapilarLayout);
        JpCuidadoCapilarLayout.setHorizontalGroup(
            JpCuidadoCapilarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        JpCuidadoCapilarLayout.setVerticalGroup(
            JpCuidadoCapilarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );

        scrollCuidadoCapilar.setViewportView(JpCuidadoCapilar);

        JTabSubCategoriasCuidadoPersonal.addTab("Cuidado Capilar", scrollCuidadoCapilar);

        javax.swing.GroupLayout JpCuidadoDePielLayout = new javax.swing.GroupLayout(JpCuidadoDePiel);
        JpCuidadoDePiel.setLayout(JpCuidadoDePielLayout);
        JpCuidadoDePielLayout.setHorizontalGroup(
            JpCuidadoDePielLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        JpCuidadoDePielLayout.setVerticalGroup(
            JpCuidadoDePielLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );

        scrollCuidadoDePiel.setViewportView(JpCuidadoDePiel);

        JTabSubCategoriasCuidadoPersonal.addTab("Cuidado de Piel", scrollCuidadoDePiel);

        javax.swing.GroupLayout JpCuidadoFemeninoLayout = new javax.swing.GroupLayout(JpCuidadoFemenino);
        JpCuidadoFemenino.setLayout(JpCuidadoFemeninoLayout);
        JpCuidadoFemeninoLayout.setHorizontalGroup(
            JpCuidadoFemeninoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        JpCuidadoFemeninoLayout.setVerticalGroup(
            JpCuidadoFemeninoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );

        scrollCuidadoFemenino.setViewportView(JpCuidadoFemenino);

        JTabSubCategoriasCuidadoPersonal.addTab("Cuidado Femenino", scrollCuidadoFemenino);

        javax.swing.GroupLayout JpDesodorantesLayout = new javax.swing.GroupLayout(JpDesodorantes);
        JpDesodorantes.setLayout(JpDesodorantesLayout);
        JpDesodorantesLayout.setHorizontalGroup(
            JpDesodorantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        JpDesodorantesLayout.setVerticalGroup(
            JpDesodorantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );

        scrollDesodorantes.setViewportView(JpDesodorantes);

        JTabSubCategoriasCuidadoPersonal.addTab("Desodorantes", scrollDesodorantes);

        javax.swing.GroupLayout JpCuidadoPersonalLayout = new javax.swing.GroupLayout(JpCuidadoPersonal);
        JpCuidadoPersonal.setLayout(JpCuidadoPersonalLayout);
        JpCuidadoPersonalLayout.setHorizontalGroup(
            JpCuidadoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTabSubCategoriasCuidadoPersonal)
        );
        JpCuidadoPersonalLayout.setVerticalGroup(
            JpCuidadoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTabSubCategoriasCuidadoPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
        );

        jTabCategorias.addTab("Cuidado Personal", JpCuidadoPersonal);

        JTabSubCategoriasMascotas.setBackground(new java.awt.Color(0, 102, 102));
        JTabSubCategoriasMascotas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JTabSubCategoriasMascotas.setOpaque(true);

        javax.swing.GroupLayout JpAlimentosLayout = new javax.swing.GroupLayout(JpAlimentos);
        JpAlimentos.setLayout(JpAlimentosLayout);
        JpAlimentosLayout.setHorizontalGroup(
            JpAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        JpAlimentosLayout.setVerticalGroup(
            JpAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );

        scrollAlimentos.setViewportView(JpAlimentos);

        JTabSubCategoriasMascotas.addTab("Alimentos", scrollAlimentos);

        javax.swing.GroupLayout JpAccesoriosMascotasLayout = new javax.swing.GroupLayout(JpAccesoriosMascotas);
        JpAccesoriosMascotas.setLayout(JpAccesoriosMascotasLayout);
        JpAccesoriosMascotasLayout.setHorizontalGroup(
            JpAccesoriosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        JpAccesoriosMascotasLayout.setVerticalGroup(
            JpAccesoriosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );

        scrollAccesoriosMascotas.setViewportView(JpAccesoriosMascotas);

        JTabSubCategoriasMascotas.addTab("Accesorios", scrollAccesoriosMascotas);

        javax.swing.GroupLayout JpHigieneMascotasLayout = new javax.swing.GroupLayout(JpHigieneMascotas);
        JpHigieneMascotas.setLayout(JpHigieneMascotasLayout);
        JpHigieneMascotasLayout.setHorizontalGroup(
            JpHigieneMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        JpHigieneMascotasLayout.setVerticalGroup(
            JpHigieneMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );

        scrollHigineMascotas.setViewportView(JpHigieneMascotas);

        JTabSubCategoriasMascotas.addTab("Higiene y Cuidado", scrollHigineMascotas);

        javax.swing.GroupLayout JpMacotasLayout = new javax.swing.GroupLayout(JpMacotas);
        JpMacotas.setLayout(JpMacotasLayout);
        JpMacotasLayout.setHorizontalGroup(
            JpMacotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTabSubCategoriasMascotas)
        );
        JpMacotasLayout.setVerticalGroup(
            JpMacotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTabSubCategoriasMascotas, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
        );

        jTabCategorias.addTab("Mascotas", JpMacotas);

        JTabSubCategoriasFrescos.setBackground(new java.awt.Color(0, 102, 102));
        JTabSubCategoriasFrescos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JTabSubCategoriasFrescos.setOpaque(true);

        JTabSubSubCategoriasFrescos.setBackground(new java.awt.Color(153, 0, 0));
        JTabSubSubCategoriasFrescos.setOpaque(true);

        javax.swing.GroupLayout JpResLayout = new javax.swing.GroupLayout(JpRes);
        JpRes.setLayout(JpResLayout);
        JpResLayout.setHorizontalGroup(
            JpResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        JpResLayout.setVerticalGroup(
            JpResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );

        scrollRes.setViewportView(JpRes);

        JTabSubSubCategoriasFrescos.addTab("Res", scrollRes);

        javax.swing.GroupLayout JpCerdoLayout = new javax.swing.GroupLayout(JpCerdo);
        JpCerdo.setLayout(JpCerdoLayout);
        JpCerdoLayout.setHorizontalGroup(
            JpCerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        JpCerdoLayout.setVerticalGroup(
            JpCerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );

        scrollCerdo.setViewportView(JpCerdo);

        JTabSubSubCategoriasFrescos.addTab("Cerdo", scrollCerdo);

        javax.swing.GroupLayout JpPolloLayout = new javax.swing.GroupLayout(JpPollo);
        JpPollo.setLayout(JpPolloLayout);
        JpPolloLayout.setHorizontalGroup(
            JpPolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        JpPolloLayout.setVerticalGroup(
            JpPolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );

        scrollPollo.setViewportView(JpPollo);

        JTabSubSubCategoriasFrescos.addTab("Pollo", scrollPollo);

        javax.swing.GroupLayout JpMariscosLayout = new javax.swing.GroupLayout(JpMariscos);
        JpMariscos.setLayout(JpMariscosLayout);
        JpMariscosLayout.setHorizontalGroup(
            JpMariscosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        JpMariscosLayout.setVerticalGroup(
            JpMariscosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );

        scrollMariscos.setViewportView(JpMariscos);

        JTabSubSubCategoriasFrescos.addTab("Mariscos", scrollMariscos);

        javax.swing.GroupLayout JpCarnesLayout = new javax.swing.GroupLayout(JpCarnes);
        JpCarnes.setLayout(JpCarnesLayout);
        JpCarnesLayout.setHorizontalGroup(
            JpCarnesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTabSubSubCategoriasFrescos)
        );
        JpCarnesLayout.setVerticalGroup(
            JpCarnesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTabSubSubCategoriasFrescos, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
        );

        JTabSubCategoriasFrescos.addTab("Carnes", JpCarnes);

        javax.swing.GroupLayout JpFrutasLayout = new javax.swing.GroupLayout(JpFrutas);
        JpFrutas.setLayout(JpFrutasLayout);
        JpFrutasLayout.setHorizontalGroup(
            JpFrutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        JpFrutasLayout.setVerticalGroup(
            JpFrutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );

        scrollFrutas.setViewportView(JpFrutas);

        JTabSubCategoriasFrescos.addTab("Frutas", scrollFrutas);

        javax.swing.GroupLayout JpVerdurasLayout = new javax.swing.GroupLayout(JpVerduras);
        JpVerduras.setLayout(JpVerdurasLayout);
        JpVerdurasLayout.setHorizontalGroup(
            JpVerdurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        JpVerdurasLayout.setVerticalGroup(
            JpVerdurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );

        scrollVerduras.setViewportView(JpVerduras);

        JTabSubCategoriasFrescos.addTab("Verduras", scrollVerduras);

        javax.swing.GroupLayout JpEmbutidosLayout = new javax.swing.GroupLayout(JpEmbutidos);
        JpEmbutidos.setLayout(JpEmbutidosLayout);
        JpEmbutidosLayout.setHorizontalGroup(
            JpEmbutidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        JpEmbutidosLayout.setVerticalGroup(
            JpEmbutidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );

        scrollEmbutidos.setViewportView(JpEmbutidos);

        JTabSubCategoriasFrescos.addTab("Embutidos", scrollEmbutidos);

        javax.swing.GroupLayout JpFrescosLayout = new javax.swing.GroupLayout(JpFrescos);
        JpFrescos.setLayout(JpFrescosLayout);
        JpFrescosLayout.setHorizontalGroup(
            JpFrescosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTabSubCategoriasFrescos)
        );
        JpFrescosLayout.setVerticalGroup(
            JpFrescosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTabSubCategoriasFrescos, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
        );

        jTabCategorias.addTab("Frescos", JpFrescos);

        JpCarrito.setBackground(new java.awt.Color(204, 204, 204));
        JpCarrito.setBorder(javax.swing.BorderFactory.createTitledBorder("CARRITO"));

        tblCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Peso", "Precio"
            }
        ));
        scrollCarrito.setViewportView(tblCarrito);

        JpAccionesCarrito.setBackground(new java.awt.Color(204, 204, 204));
        JpAccionesCarrito.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEditarCarrito.setBackground(new java.awt.Color(0, 102, 102));
        btnEditarCarrito.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarCarrito.setText("Editar");
        btnEditarCarrito.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEliminarCarrito.setBackground(new java.awt.Color(153, 0, 0));
        btnEliminarCarrito.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCarrito.setText("Eliminar");
        btnEliminarCarrito.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout JpAccionesCarritoLayout = new javax.swing.GroupLayout(JpAccionesCarrito);
        JpAccionesCarrito.setLayout(JpAccionesCarritoLayout);
        JpAccionesCarritoLayout.setHorizontalGroup(
            JpAccionesCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpAccionesCarritoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnEditarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        JpAccionesCarritoLayout.setVerticalGroup(
            JpAccionesCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpAccionesCarritoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(JpAccionesCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        JpDetalleCompra.setBackground(new java.awt.Color(204, 204, 204));
        JpDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Detalle de Compra"));

        DetalleCompra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        scrollDetalleCompra.setViewportView(DetalleCompra);

        javax.swing.GroupLayout JpDetalleCompraLayout = new javax.swing.GroupLayout(JpDetalleCompra);
        JpDetalleCompra.setLayout(JpDetalleCompraLayout);
        JpDetalleCompraLayout.setHorizontalGroup(
            JpDetalleCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollDetalleCompra)
        );
        JpDetalleCompraLayout.setVerticalGroup(
            JpDetalleCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollDetalleCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JpCarritoLayout = new javax.swing.GroupLayout(JpCarrito);
        JpCarrito.setLayout(JpCarritoLayout);
        JpCarritoLayout.setHorizontalGroup(
            JpCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpCarritoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                    .addComponent(JpAccionesCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JpDetalleCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        JpCarritoLayout.setVerticalGroup(
            JpCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpCarritoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(scrollCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JpAccionesCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JpDetalleCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JpCategoriasLayout = new javax.swing.GroupLayout(JpCategorias);
        JpCategorias.setLayout(JpCategoriasLayout);
        JpCategoriasLayout.setHorizontalGroup(
            JpCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpCategoriasLayout.createSequentialGroup()
                .addComponent(jTabCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        JpCategoriasLayout.setVerticalGroup(
            JpCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpCategoriasLayout.createSequentialGroup()
                .addGroup(JpCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JpCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE))
                .addContainerGap())
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
                .addContainerGap(177, Short.MAX_VALUE))
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
            .addComponent(JTabMain)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JTabMain, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
   
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane DetalleCompra;
    private javax.swing.JPanel JPLinea;
    private javax.swing.JTabbedPane JTabMain;
    private javax.swing.JTabbedPane JTabSubCategoriasAbarrotes;
    private javax.swing.JTabbedPane JTabSubCategoriasBebidas;
    private javax.swing.JTabbedPane JTabSubCategoriasCuidadoPersonal;
    private javax.swing.JTabbedPane JTabSubCategoriasFrescos;
    private javax.swing.JTabbedPane JTabSubCategoriasLimpieza;
    private javax.swing.JTabbedPane JTabSubCategoriasMascotas;
    private javax.swing.JTabbedPane JTabSubSubCategoriasFrescos;
    private javax.swing.JPanel JpAbarrotes;
    private javax.swing.JPanel JpAccesorios;
    private javax.swing.JPanel JpAccesoriosMascotas;
    private javax.swing.JPanel JpAccionesCarrito;
    private javax.swing.JPanel JpAceite;
    private javax.swing.JPanel JpAlcoholicas;
    private javax.swing.JPanel JpAlimentos;
    private javax.swing.JPanel JpBebidas;
    private javax.swing.JPanel JpBotanas;
    private javax.swing.JPanel JpCarnes;
    private javax.swing.JPanel JpCarrito;
    private javax.swing.JPanel JpCategorias;
    private javax.swing.JPanel JpCerdo;
    private javax.swing.JPanel JpCervezas;
    private javax.swing.JPanel JpCuidadoBucal;
    private javax.swing.JPanel JpCuidadoCapilar;
    private javax.swing.JPanel JpCuidadoDePiel;
    private javax.swing.JPanel JpCuidadoFemenino;
    private javax.swing.JPanel JpCuidadoPersonal;
    private javax.swing.JPanel JpDesinfectantes;
    private javax.swing.JPanel JpDesodorantes;
    private javax.swing.JPanel JpDetalleCompra;
    private javax.swing.JPanel JpDetergentes;
    private javax.swing.JPanel JpEmbutidos;
    private javax.swing.JPanel JpEnergizantes;
    private javax.swing.JPanel JpEnlatados;
    private javax.swing.JPanel JpFactura;
    private javax.swing.JPanel JpFacturaProductos;
    private javax.swing.JPanel JpFrescos;
    private javax.swing.JPanel JpFrutas;
    private javax.swing.JPanel JpGaseosas;
    private javax.swing.JPanel JpGranos;
    private javax.swing.JPanel JpHigieneMascotas;
    private javax.swing.JPanel JpInicio;
    private javax.swing.JPanel JpJugos;
    private javax.swing.JPanel JpLavaPlatos;
    private javax.swing.JPanel JpLicores;
    private javax.swing.JPanel JpLimpieza;
    private javax.swing.JPanel JpMacotas;
    private javax.swing.JPanel JpMariscos;
    private javax.swing.JPanel JpMostrarFactura;
    private javax.swing.JPanel JpPollo;
    private javax.swing.JPanel JpRes;
    private javax.swing.JPanel JpVerduras;
    private javax.swing.JPanel JpVinos;
    private javax.swing.JButton btnActulizarFacturazion;
    private javax.swing.JButton btnEditarCarrito;
    private javax.swing.JButton btnEliminarCarrito;
    private javax.swing.JButton btnEliminarFacturacion;
    private javax.swing.JButton btnFinalizarCompra;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JTabbedPane jTabCategorias;
    private javax.swing.JTabbedPane jTabSubsubcategoriasBebidas;
    private javax.swing.JLabel lblImejenInicio;
    private javax.swing.JLabel lblLema;
    private javax.swing.JLabel lblNombreEmpresa;
    private javax.swing.JScrollPane scrollAccesorios;
    private javax.swing.JScrollPane scrollAccesoriosMascotas;
    private javax.swing.JScrollPane scrollAceite;
    private javax.swing.JScrollPane scrollAlimentos;
    private javax.swing.JScrollPane scrollBotanas;
    private javax.swing.JScrollPane scrollCarrito;
    private javax.swing.JScrollPane scrollCerdo;
    private javax.swing.JScrollPane scrollCervezas;
    private javax.swing.JScrollPane scrollCuidadoBucal;
    private javax.swing.JScrollPane scrollCuidadoCapilar;
    private javax.swing.JScrollPane scrollCuidadoDePiel;
    private javax.swing.JScrollPane scrollCuidadoFemenino;
    private javax.swing.JScrollPane scrollDesinfectantes;
    private javax.swing.JScrollPane scrollDesodorantes;
    private javax.swing.JScrollPane scrollDetalleCompra;
    private javax.swing.JScrollPane scrollDetergentes;
    private javax.swing.JScrollPane scrollEmbutidos;
    private javax.swing.JScrollPane scrollEnergizantes;
    private javax.swing.JScrollPane scrollEnlatados;
    private javax.swing.JScrollPane scrollFacturaProductos;
    private javax.swing.JScrollPane scrollFrutas;
    private javax.swing.JScrollPane scrollGaseosas;
    private javax.swing.JScrollPane scrollGranos;
    private javax.swing.JScrollPane scrollHigineMascotas;
    private javax.swing.JScrollPane scrollJugos;
    private javax.swing.JScrollBar scrollLacteos;
    private javax.swing.JScrollPane scrollLavaPlatos;
    private javax.swing.JScrollPane scrollLicores;
    private javax.swing.JScrollPane scrollMariscos;
    private javax.swing.JScrollPane scrollPollo;
    private javax.swing.JScrollPane scrollRes;
    private javax.swing.JScrollPane scrollVerduras;
    private javax.swing.JScrollPane scrollVino;
    private javax.swing.JTable tblCarrito;
    private javax.swing.JTable tblCarritoCompras;
    private javax.swing.JTextField txtEnvio;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
