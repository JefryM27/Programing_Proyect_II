
package GUI;

import Logica.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

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
        lblProductoArrozblancokuska = new javax.swing.JLabel();
        lblPesoArrozblancokuska = new javax.swing.JLabel();
        lblPrecioArrozblancokuska = new javax.swing.JLabel();
        txtProductoArrozblancokuska = new javax.swing.JTextField();
        txtPesoArrozblancokuska = new javax.swing.JTextField();
        txtPrecioArrozblancokuska = new javax.swing.JTextField();
        btnComprarArrozblancokuska = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCepilloProCuidado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCepilloProCuidado1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jTabbedPane9 = new javax.swing.JTabbedPane();
        jPanel42 = new javax.swing.JPanel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        txtCanto = new javax.swing.JTextField();
        txtCantoPeso = new javax.swing.JTextField();
        txtCantoPrecio = new javax.swing.JTextField();
        btnCanto = new javax.swing.JButton();
        btnExtruction = new javax.swing.JButton();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        txtExtruction = new javax.swing.JTextField();
        txtExtructionPeso = new javax.swing.JTextField();
        txtExtructionPrecio = new javax.swing.JTextField();
        btnGati = new javax.swing.JButton();
        jLabel151 = new javax.swing.JLabel();
        btnCobayes = new javax.swing.JButton();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        txtGati = new javax.swing.JTextField();
        txtGatiPeso = new javax.swing.JTextField();
        txtGatiPrecio = new javax.swing.JTextField();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        txtCobayes = new javax.swing.JTextField();
        txtCobayesPeso = new javax.swing.JTextField();
        txtCobayesPrecio = new javax.swing.JTextField();
        jLabel159 = new javax.swing.JLabel();
        txtRedKrite = new javax.swing.JTextField();
        txtRedKritePrecio = new javax.swing.JTextField();
        txtRedKritePeso = new javax.swing.JTextField();
        txtSenGatPrecio = new javax.swing.JTextField();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        txtSenGatPeso = new javax.swing.JTextField();
        txtSenGat = new javax.swing.JTextField();
        btnRedKrite = new javax.swing.JButton();
        btntSenGat = new javax.swing.JButton();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        btnTioCat6 = new javax.swing.JButton();
        jLabel167 = new javax.swing.JLabel();
        btnTioCat7 = new javax.swing.JButton();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        btnTioCat8 = new javax.swing.JButton();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        txtTioCatPeso6 = new javax.swing.JTextField();
        jLabel174 = new javax.swing.JLabel();
        txtTioCat6 = new javax.swing.JTextField();
        jLabel175 = new javax.swing.JLabel();
        txtTioCat7 = new javax.swing.JTextField();
        btnTioCat9 = new javax.swing.JButton();
        jLabel176 = new javax.swing.JLabel();
        txtTioCatPeso7 = new javax.swing.JTextField();
        btnTioCat10 = new javax.swing.JButton();
        jLabel177 = new javax.swing.JLabel();
        txtTioCatPrecio6 = new javax.swing.JTextField();
        jLabel178 = new javax.swing.JLabel();
        txtTioCat8 = new javax.swing.JTextField();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        txtTioCatPeso8 = new javax.swing.JTextField();
        jLabel181 = new javax.swing.JLabel();
        txtTioCatPrecio7 = new javax.swing.JTextField();
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        txtTioCat9 = new javax.swing.JTextField();
        jLabel184 = new javax.swing.JLabel();
        txtTioCatPeso9 = new javax.swing.JTextField();
        jLabel185 = new javax.swing.JLabel();
        txtTioCatPrecio8 = new javax.swing.JTextField();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        txtTioCat10 = new javax.swing.JTextField();
        txtTioCat11 = new javax.swing.JTextField();
        txtTioCatPrecio9 = new javax.swing.JTextField();
        txtTioCatPeso10 = new javax.swing.JTextField();
        txtTioCatPeso11 = new javax.swing.JTextField();
        txtTioCatPrecio10 = new javax.swing.JTextField();
        txtTioCatPrecio11 = new javax.swing.JTextField();
        jLabel189 = new javax.swing.JLabel();
        btnTioCat11 = new javax.swing.JButton();
        jLabel190 = new javax.swing.JLabel();
        btnTioCat12 = new javax.swing.JButton();
        jLabel191 = new javax.swing.JLabel();
        btnTioCat13 = new javax.swing.JButton();
        jLabel192 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        btnTioCat14 = new javax.swing.JButton();
        jLabel194 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        txtTioCatPeso12 = new javax.swing.JTextField();
        jLabel198 = new javax.swing.JLabel();
        txtTioCat12 = new javax.swing.JTextField();
        jLabel199 = new javax.swing.JLabel();
        txtTioCat13 = new javax.swing.JTextField();
        btnTioCat15 = new javax.swing.JButton();
        jLabel200 = new javax.swing.JLabel();
        txtTioCatPeso13 = new javax.swing.JTextField();
        btnTioCat16 = new javax.swing.JButton();
        jLabel201 = new javax.swing.JLabel();
        txtTioCatPrecio12 = new javax.swing.JTextField();
        jLabel202 = new javax.swing.JLabel();
        txtTioCat14 = new javax.swing.JTextField();
        jLabel203 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        txtTioCatPeso14 = new javax.swing.JTextField();
        jLabel205 = new javax.swing.JLabel();
        txtTioCatPrecio13 = new javax.swing.JTextField();
        jLabel206 = new javax.swing.JLabel();
        jLabel207 = new javax.swing.JLabel();
        txtTioCat15 = new javax.swing.JTextField();
        jLabel208 = new javax.swing.JLabel();
        txtTioCatPeso15 = new javax.swing.JTextField();
        jLabel209 = new javax.swing.JLabel();
        txtTioCatPrecio14 = new javax.swing.JTextField();
        jLabel210 = new javax.swing.JLabel();
        jLabel211 = new javax.swing.JLabel();
        jLabel212 = new javax.swing.JLabel();
        txtTioCat16 = new javax.swing.JTextField();
        txtTioCat17 = new javax.swing.JTextField();
        txtTioCatPrecio15 = new javax.swing.JTextField();
        txtTioCatPeso16 = new javax.swing.JTextField();
        txtTioCatPeso17 = new javax.swing.JTextField();
        txtTioCatPrecio16 = new javax.swing.JTextField();
        txtTioCatPrecio17 = new javax.swing.JTextField();
        jLabel213 = new javax.swing.JLabel();
        btnTioCat17 = new javax.swing.JButton();
        jLabel214 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        txtTioCatPrecio18 = new javax.swing.JTextField();
        jLabel215 = new javax.swing.JLabel();
        jLabel216 = new javax.swing.JLabel();
        jLabel217 = new javax.swing.JLabel();
        jLabel218 = new javax.swing.JLabel();
        jLabel219 = new javax.swing.JLabel();
        jLabel220 = new javax.swing.JLabel();
        txtTioCatPeso18 = new javax.swing.JTextField();
        txtTioCat18 = new javax.swing.JTextField();
        btnTioCat18 = new javax.swing.JButton();
        btnTioCat19 = new javax.swing.JButton();
        txtTioCat19 = new javax.swing.JTextField();
        jLabel221 = new javax.swing.JLabel();
        jLabel222 = new javax.swing.JLabel();
        jLabel223 = new javax.swing.JLabel();
        txtTioCatPeso19 = new javax.swing.JTextField();
        jLabel224 = new javax.swing.JLabel();
        txtTioCatPrecio19 = new javax.swing.JTextField();
        jLabel225 = new javax.swing.JLabel();
        jLabel226 = new javax.swing.JLabel();
        jLabel227 = new javax.swing.JLabel();
        txtTioCat20 = new javax.swing.JTextField();
        txtTioCat21 = new javax.swing.JTextField();
        btnTioCat20 = new javax.swing.JButton();
        jLabel228 = new javax.swing.JLabel();
        btnTioCat21 = new javax.swing.JButton();
        jLabel229 = new javax.swing.JLabel();
        jLabel230 = new javax.swing.JLabel();
        jLabel231 = new javax.swing.JLabel();
        jLabel232 = new javax.swing.JLabel();
        btnTioCat22 = new javax.swing.JButton();
        jLabel233 = new javax.swing.JLabel();
        jLabel234 = new javax.swing.JLabel();
        jLabel235 = new javax.swing.JLabel();
        jLabel236 = new javax.swing.JLabel();
        txtTioCatPrecio20 = new javax.swing.JTextField();
        txtTioCat22 = new javax.swing.JTextField();
        jLabel237 = new javax.swing.JLabel();
        txtTioCatPeso20 = new javax.swing.JTextField();
        txtTioCatPeso21 = new javax.swing.JTextField();
        jLabel238 = new javax.swing.JLabel();
        txtTioCatPeso22 = new javax.swing.JTextField();
        txtTioCatPrecio21 = new javax.swing.JTextField();
        txtTioCatPrecio22 = new javax.swing.JTextField();
        txtTioCatPrecio23 = new javax.swing.JTextField();
        jLabel239 = new javax.swing.JLabel();
        btnTioCat23 = new javax.swing.JButton();
        jLabel240 = new javax.swing.JLabel();
        btnTioCat24 = new javax.swing.JButton();
        btnTioCat25 = new javax.swing.JButton();
        jLabel241 = new javax.swing.JLabel();
        jLabel242 = new javax.swing.JLabel();
        txtTioCatPeso23 = new javax.swing.JTextField();
        btnTioCat26 = new javax.swing.JButton();
        jLabel243 = new javax.swing.JLabel();
        txtTioCat23 = new javax.swing.JTextField();
        jLabel244 = new javax.swing.JLabel();
        txtTioCat24 = new javax.swing.JTextField();
        btnTioCat27 = new javax.swing.JButton();
        jLabel245 = new javax.swing.JLabel();
        txtTioCatPeso24 = new javax.swing.JTextField();
        btnTioCat28 = new javax.swing.JButton();
        jLabel246 = new javax.swing.JLabel();
        btnTioCat29 = new javax.swing.JButton();
        jLabel247 = new javax.swing.JLabel();
        jLabel248 = new javax.swing.JLabel();
        jLabel249 = new javax.swing.JLabel();
        jLabel250 = new javax.swing.JLabel();
        jLabel251 = new javax.swing.JLabel();
        btnTioCat30 = new javax.swing.JButton();
        txtTioCat25 = new javax.swing.JTextField();
        jLabel252 = new javax.swing.JLabel();
        txtTioCatPeso25 = new javax.swing.JTextField();
        jLabel253 = new javax.swing.JLabel();
        txtTioCatPrecio24 = new javax.swing.JTextField();
        jLabel254 = new javax.swing.JLabel();
        jLabel255 = new javax.swing.JLabel();
        txtTioCatPeso26 = new javax.swing.JTextField();
        jLabel256 = new javax.swing.JLabel();
        txtTioCat26 = new javax.swing.JTextField();
        jLabel257 = new javax.swing.JLabel();
        txtTioCat27 = new javax.swing.JTextField();
        btnTioCat31 = new javax.swing.JButton();
        jLabel258 = new javax.swing.JLabel();
        txtTioCatPeso27 = new javax.swing.JTextField();
        btnTioCat32 = new javax.swing.JButton();
        jLabel259 = new javax.swing.JLabel();
        txtTioCatPrecio25 = new javax.swing.JTextField();
        jLabel260 = new javax.swing.JLabel();
        txtTioCat28 = new javax.swing.JTextField();
        jLabel261 = new javax.swing.JLabel();
        jLabel262 = new javax.swing.JLabel();
        txtTioCatPeso28 = new javax.swing.JTextField();
        jLabel263 = new javax.swing.JLabel();
        txtTioCatPrecio26 = new javax.swing.JTextField();
        jLabel264 = new javax.swing.JLabel();
        jLabel265 = new javax.swing.JLabel();
        txtTioCat29 = new javax.swing.JTextField();
        jLabel266 = new javax.swing.JLabel();
        txtTioCatPeso29 = new javax.swing.JTextField();
        jLabel267 = new javax.swing.JLabel();
        txtTioCatPrecio27 = new javax.swing.JTextField();
        jLabel268 = new javax.swing.JLabel();
        jLabel269 = new javax.swing.JLabel();
        jLabel270 = new javax.swing.JLabel();
        txtTioCat30 = new javax.swing.JTextField();
        txtTioCat31 = new javax.swing.JTextField();
        txtTioCatPrecio28 = new javax.swing.JTextField();
        btnTioCat33 = new javax.swing.JButton();
        txtTioCatPeso30 = new javax.swing.JTextField();
        jLabel271 = new javax.swing.JLabel();
        txtTioCatPeso31 = new javax.swing.JTextField();
        btnTioCat34 = new javax.swing.JButton();
        txtTioCatPrecio29 = new javax.swing.JTextField();
        jLabel272 = new javax.swing.JLabel();
        txtTioCatPrecio30 = new javax.swing.JTextField();
        jLabel273 = new javax.swing.JLabel();
        jLabel274 = new javax.swing.JLabel();
        jLabel275 = new javax.swing.JLabel();
        btnTioCat35 = new javax.swing.JButton();
        txtTioCat32 = new javax.swing.JTextField();
        jLabel276 = new javax.swing.JLabel();
        txtTioCatPeso32 = new javax.swing.JTextField();
        txtTioCatPrecio31 = new javax.swing.JTextField();
        jLabel277 = new javax.swing.JLabel();
        jLabel278 = new javax.swing.JLabel();
        jLabel279 = new javax.swing.JLabel();
        jLabel280 = new javax.swing.JLabel();
        txtTioCat33 = new javax.swing.JTextField();
        txtTioCatPeso33 = new javax.swing.JTextField();
        txtTioCatPrecio32 = new javax.swing.JTextField();
        jLabel281 = new javax.swing.JLabel();
        txtTioCat34 = new javax.swing.JTextField();
        txtTioCatPrecio33 = new javax.swing.JTextField();
        txtTioCatPeso34 = new javax.swing.JTextField();
        txtTioCatPrecio34 = new javax.swing.JTextField();
        txtTioCatPrecio35 = new javax.swing.JTextField();
        jLabel282 = new javax.swing.JLabel();
        jLabel283 = new javax.swing.JLabel();
        txtTioCat35 = new javax.swing.JTextField();
        jLabel284 = new javax.swing.JLabel();
        jLabel285 = new javax.swing.JLabel();
        txtTioCatPeso35 = new javax.swing.JTextField();
        jLabel286 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        txtTioCatPrecio36 = new javax.swing.JTextField();
        jLabel287 = new javax.swing.JLabel();
        jLabel288 = new javax.swing.JLabel();
        jLabel289 = new javax.swing.JLabel();
        jLabel290 = new javax.swing.JLabel();
        jLabel291 = new javax.swing.JLabel();
        jLabel292 = new javax.swing.JLabel();
        txtTioCatPeso36 = new javax.swing.JTextField();
        txtTioCat36 = new javax.swing.JTextField();
        btnTioCat36 = new javax.swing.JButton();
        btnTioCat37 = new javax.swing.JButton();
        txtTioCat37 = new javax.swing.JTextField();
        jLabel293 = new javax.swing.JLabel();
        jLabel294 = new javax.swing.JLabel();
        jLabel295 = new javax.swing.JLabel();
        txtTioCatPeso37 = new javax.swing.JTextField();
        jLabel296 = new javax.swing.JLabel();
        txtTioCatPrecio37 = new javax.swing.JTextField();
        jLabel297 = new javax.swing.JLabel();
        jLabel298 = new javax.swing.JLabel();
        jLabel299 = new javax.swing.JLabel();
        txtTioCat38 = new javax.swing.JTextField();
        txtTioCat39 = new javax.swing.JTextField();
        btnTioCat38 = new javax.swing.JButton();
        jLabel300 = new javax.swing.JLabel();
        btnTioCat39 = new javax.swing.JButton();
        jLabel301 = new javax.swing.JLabel();
        jLabel302 = new javax.swing.JLabel();
        jLabel303 = new javax.swing.JLabel();
        jLabel304 = new javax.swing.JLabel();
        btnTioCat40 = new javax.swing.JButton();
        jLabel305 = new javax.swing.JLabel();
        jLabel306 = new javax.swing.JLabel();
        jLabel307 = new javax.swing.JLabel();
        jLabel308 = new javax.swing.JLabel();
        txtTioCatPrecio38 = new javax.swing.JTextField();
        txtTioCat40 = new javax.swing.JTextField();
        jLabel309 = new javax.swing.JLabel();
        txtTioCatPeso38 = new javax.swing.JTextField();
        txtTioCatPeso39 = new javax.swing.JTextField();
        jLabel310 = new javax.swing.JLabel();
        txtTioCatPeso40 = new javax.swing.JTextField();
        txtTioCatPrecio39 = new javax.swing.JTextField();
        txtTioCatPrecio40 = new javax.swing.JTextField();
        txtTioCatPrecio41 = new javax.swing.JTextField();
        jLabel311 = new javax.swing.JLabel();
        btnTioCat41 = new javax.swing.JButton();
        jLabel312 = new javax.swing.JLabel();
        btnTioCat42 = new javax.swing.JButton();
        btnTioCat43 = new javax.swing.JButton();
        jLabel313 = new javax.swing.JLabel();
        jLabel314 = new javax.swing.JLabel();
        txtTioCatPeso41 = new javax.swing.JTextField();
        btnTioCat44 = new javax.swing.JButton();
        jLabel315 = new javax.swing.JLabel();
        txtTioCat41 = new javax.swing.JTextField();
        jLabel316 = new javax.swing.JLabel();
        txtTioCat42 = new javax.swing.JTextField();
        btnTioCat45 = new javax.swing.JButton();
        jLabel317 = new javax.swing.JLabel();
        txtTioCatPeso42 = new javax.swing.JTextField();
        btnTioCat46 = new javax.swing.JButton();
        jLabel318 = new javax.swing.JLabel();
        btnTioCat47 = new javax.swing.JButton();
        jLabel319 = new javax.swing.JLabel();
        jLabel320 = new javax.swing.JLabel();
        jLabel321 = new javax.swing.JLabel();
        jLabel322 = new javax.swing.JLabel();
        jLabel323 = new javax.swing.JLabel();
        btnTioCat48 = new javax.swing.JButton();
        txtTioCat43 = new javax.swing.JTextField();
        jLabel324 = new javax.swing.JLabel();
        txtTioCatPeso43 = new javax.swing.JTextField();
        jLabel325 = new javax.swing.JLabel();
        txtTioCatPrecio42 = new javax.swing.JTextField();
        jLabel326 = new javax.swing.JLabel();
        jLabel327 = new javax.swing.JLabel();
        txtTioCatPeso44 = new javax.swing.JTextField();
        jLabel328 = new javax.swing.JLabel();
        txtTioCat44 = new javax.swing.JTextField();
        jLabel329 = new javax.swing.JLabel();
        txtTioCat45 = new javax.swing.JTextField();
        btnTioCat49 = new javax.swing.JButton();
        jLabel330 = new javax.swing.JLabel();
        txtTioCatPeso45 = new javax.swing.JTextField();
        btnTioCat50 = new javax.swing.JButton();
        jLabel331 = new javax.swing.JLabel();
        txtTioCatPrecio43 = new javax.swing.JTextField();
        jLabel332 = new javax.swing.JLabel();
        txtTioCat46 = new javax.swing.JTextField();
        jLabel333 = new javax.swing.JLabel();
        jLabel334 = new javax.swing.JLabel();
        txtTioCatPeso46 = new javax.swing.JTextField();
        jLabel335 = new javax.swing.JLabel();
        txtTioCatPrecio44 = new javax.swing.JTextField();
        jLabel336 = new javax.swing.JLabel();
        jLabel337 = new javax.swing.JLabel();
        txtTioCat47 = new javax.swing.JTextField();
        jLabel338 = new javax.swing.JLabel();
        txtTioCatPeso47 = new javax.swing.JTextField();
        jLabel339 = new javax.swing.JLabel();
        txtTioCatPrecio45 = new javax.swing.JTextField();
        jLabel340 = new javax.swing.JLabel();
        jLabel341 = new javax.swing.JLabel();
        jLabel342 = new javax.swing.JLabel();
        txtTioCat48 = new javax.swing.JTextField();
        txtTioCat49 = new javax.swing.JTextField();
        txtTioCatPrecio46 = new javax.swing.JTextField();
        btnTioCat51 = new javax.swing.JButton();
        txtTioCatPeso48 = new javax.swing.JTextField();
        jLabel343 = new javax.swing.JLabel();
        txtTioCatPeso49 = new javax.swing.JTextField();
        btnTioCat52 = new javax.swing.JButton();
        txtTioCatPrecio47 = new javax.swing.JTextField();
        jLabel344 = new javax.swing.JLabel();
        txtTioCatPrecio48 = new javax.swing.JTextField();
        jLabel345 = new javax.swing.JLabel();
        jLabel346 = new javax.swing.JLabel();
        jLabel347 = new javax.swing.JLabel();
        btnTioCat53 = new javax.swing.JButton();
        txtTioCat50 = new javax.swing.JTextField();
        jLabel348 = new javax.swing.JLabel();
        txtTioCatPeso50 = new javax.swing.JTextField();
        txtTioCatPrecio49 = new javax.swing.JTextField();
        jLabel349 = new javax.swing.JLabel();
        jLabel350 = new javax.swing.JLabel();
        jLabel351 = new javax.swing.JLabel();
        jLabel352 = new javax.swing.JLabel();
        txtTioCat51 = new javax.swing.JTextField();
        txtTioCatPeso51 = new javax.swing.JTextField();
        txtTioCatPrecio50 = new javax.swing.JTextField();
        jLabel353 = new javax.swing.JLabel();
        txtTioCat52 = new javax.swing.JTextField();
        txtTioCatPrecio51 = new javax.swing.JTextField();
        txtTioCatPeso52 = new javax.swing.JTextField();
        txtTioCatPrecio52 = new javax.swing.JTextField();
        txtTioCatPrecio53 = new javax.swing.JTextField();
        jLabel354 = new javax.swing.JLabel();
        jLabel355 = new javax.swing.JLabel();
        txtTioCat53 = new javax.swing.JTextField();
        jLabel356 = new javax.swing.JLabel();
        jLabel357 = new javax.swing.JLabel();
        txtTioCatPeso53 = new javax.swing.JTextField();
        jLabel358 = new javax.swing.JLabel();
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
        jPInicio.add(lblImejenInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, 0, 1800, 810));

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
            .addGap(0, 748, Short.MAX_VALUE)
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
            .addGap(0, 717, Short.MAX_VALUE)
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

        lblProductoArrozblancokuska.setForeground(new java.awt.Color(255, 255, 255));
        lblProductoArrozblancokuska.setText("Producto:");

        lblPesoArrozblancokuska.setForeground(new java.awt.Color(255, 255, 255));
        lblPesoArrozblancokuska.setText("Peso:");

        lblPrecioArrozblancokuska.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecioArrozblancokuska.setText("Precio:");

        txtProductoArrozblancokuska.setText("Arroz blanco kuska");

        txtPesoArrozblancokuska.setText("3 kg");

        txtPrecioArrozblancokuska.setText("₡1.450.00");
        txtPrecioArrozblancokuska.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioArrozblancokuskaActionPerformed(evt);
            }
        });

        btnComprarArrozblancokuska.setBackground(new java.awt.Color(0, 51, 0));
        btnComprarArrozblancokuska.setForeground(new java.awt.Color(255, 255, 255));
        btnComprarArrozblancokuska.setText("Comprar");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAbarrotes/Imagenes Granos y pasta/Arroz blanco.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPgranosLayout = new javax.swing.GroupLayout(jPgranos);
        jPgranos.setLayout(jPgranosLayout);
        jPgranosLayout.setHorizontalGroup(
            jPgranosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPgranosLayout.createSequentialGroup()
                .addGroup(jPgranosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPgranosLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnComprarArrozblancokuska))
                    .addGroup(jPgranosLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPgranosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProductoArrozblancokuska)
                            .addComponent(lblPesoArrozblancokuska)
                            .addComponent(lblPrecioArrozblancokuska))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPgranosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPesoArrozblancokuska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProductoArrozblancokuska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioArrozblancokuska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPgranosLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(875, Short.MAX_VALUE))
        );
        jPgranosLayout.setVerticalGroup(
            jPgranosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPgranosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPgranosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductoArrozblancokuska)
                    .addComponent(txtProductoArrozblancokuska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPgranosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesoArrozblancokuska)
                    .addComponent(txtPesoArrozblancokuska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPgranosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecioArrozblancokuska)
                    .addComponent(txtPrecioArrozblancokuska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnComprarArrozblancokuska)
                .addContainerGap(509, Short.MAX_VALUE))
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
            .addComponent(jTabbedPane4)
        );
        jPGranosLayout.setVerticalGroup(
            jPGranosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
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
            .addComponent(jTabbedPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
        );

        jTabCategorias.addTab("Limpieza", jPanel12);

        jTabbedPane6.setBackground(new java.awt.Color(0, 102, 102));
        jTabbedPane6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTabbedPane6.setOpaque(true);

        jPanel29.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/CuidadoPersonal/Cepillo 360 Advanced LW.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Producto:");

        txtCepilloProCuidado.setBackground(new java.awt.Color(0, 0, 0));
        txtCepilloProCuidado.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        txtCepilloProCuidado.setForeground(new java.awt.Color(255, 255, 255));
        txtCepilloProCuidado.setText("Cepillo Dental Colgate procuidado");
        txtCepilloProCuidado.setBorder(null);
        txtCepilloProCuidado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCepilloProCuidadoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Peso:");

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio: ");

        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("1110 CRC");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/CuidadoPersonal/Cepillo Colgate twister medio.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Producto:");

        txtCepilloProCuidado1.setBackground(new java.awt.Color(0, 0, 0));
        txtCepilloProCuidado1.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        txtCepilloProCuidado1.setForeground(new java.awt.Color(255, 255, 255));
        txtCepilloProCuidado1.setText("Cepillo Dental Colgate twister");
        txtCepilloProCuidado1.setBorder(null);
        txtCepilloProCuidado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCepilloProCuidado1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Peso:");

        jLabel9.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Precio: ");

        jTextField3.setBackground(new java.awt.Color(0, 0, 0));
        jTextField3.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setText("1335 CRC");
        jTextField3.setBorder(null);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(209, 209, 209)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCepilloProCuidado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel29Layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel29Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel29Layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCepilloProCuidado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(493, 493, 493))))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCepilloProCuidado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCepilloProCuidado1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(561, 561, 561))))
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
            .addComponent(jTabbedPane6)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6)
        );

        jTabCategorias.addTab("Cuidado Personal", jPanel13);

        jTabbedPane9.setBackground(new java.awt.Color(0, 102, 102));
        jTabbedPane9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTabbedPane9.setOpaque(true);

        jPanel42.setBackground(new java.awt.Color(0, 0, 0));

        jLabel143.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentos/1.1.jpg"))); // NOI18N

        jLabel144.setBackground(new java.awt.Color(255, 255, 255));
        jLabel144.setForeground(new java.awt.Color(255, 255, 255));
        jLabel144.setText("Producto:");

        jLabel145.setBackground(new java.awt.Color(255, 255, 255));
        jLabel145.setForeground(new java.awt.Color(255, 255, 255));
        jLabel145.setText("Peso:");

        jLabel146.setBackground(new java.awt.Color(255, 255, 255));
        jLabel146.setForeground(new java.awt.Color(255, 255, 255));
        jLabel146.setText("Precio:");

        txtCanto.setText("Canto");
        txtCanto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantoActionPerformed(evt);
            }
        });

        txtCantoPeso.setText("13kg");
        txtCantoPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantoPesoActionPerformed(evt);
            }
        });

        txtCantoPrecio.setText("2000");

        btnCanto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        btnExtruction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel147.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentos/alimento-extrusado-para-hamsters-living-world.jpg"))); // NOI18N

        jLabel148.setBackground(new java.awt.Color(255, 255, 255));
        jLabel148.setForeground(new java.awt.Color(255, 255, 255));
        jLabel148.setText("Producto:");

        jLabel149.setBackground(new java.awt.Color(255, 255, 255));
        jLabel149.setForeground(new java.awt.Color(255, 255, 255));
        jLabel149.setText("Peso:");

        jLabel150.setBackground(new java.awt.Color(255, 255, 255));
        jLabel150.setForeground(new java.awt.Color(255, 255, 255));
        jLabel150.setText("Precio:");

        txtExtruction.setText("Extruction");
        txtExtruction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExtructionActionPerformed(evt);
            }
        });

        txtExtructionPeso.setText("13kg");
        txtExtructionPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExtructionPesoActionPerformed(evt);
            }
        });

        txtExtructionPrecio.setText("2000");

        btnGati.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel151.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentos/descarga (1).jpg"))); // NOI18N

        btnCobayes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel152.setBackground(new java.awt.Color(255, 255, 255));
        jLabel152.setForeground(new java.awt.Color(255, 255, 255));
        jLabel152.setText("Producto:");

        jLabel153.setBackground(new java.awt.Color(255, 255, 255));
        jLabel153.setForeground(new java.awt.Color(255, 255, 255));
        jLabel153.setText("Peso:");

        jLabel154.setBackground(new java.awt.Color(255, 255, 255));
        jLabel154.setForeground(new java.awt.Color(255, 255, 255));
        jLabel154.setText("Precio:");

        txtGati.setText("Gati");
        txtGati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGatiActionPerformed(evt);
            }
        });

        txtGatiPeso.setText("13kg");
        txtGatiPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGatiPesoActionPerformed(evt);
            }
        });

        txtGatiPrecio.setText("2000");

        jLabel155.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentos/alimento-para-cobayas-226-kg-hagen.jpg"))); // NOI18N

        jLabel156.setBackground(new java.awt.Color(255, 255, 255));
        jLabel156.setForeground(new java.awt.Color(255, 255, 255));
        jLabel156.setText("Producto:");

        jLabel157.setBackground(new java.awt.Color(255, 255, 255));
        jLabel157.setForeground(new java.awt.Color(255, 255, 255));
        jLabel157.setText("Peso:");

        jLabel158.setBackground(new java.awt.Color(255, 255, 255));
        jLabel158.setForeground(new java.awt.Color(255, 255, 255));
        jLabel158.setText("Precio:");

        txtCobayes.setText("Cobayes");
        txtCobayes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCobayesActionPerformed(evt);
            }
        });

        txtCobayesPeso.setText("13kg");
        txtCobayesPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCobayesPesoActionPerformed(evt);
            }
        });

        txtCobayesPrecio.setText("2000");

        jLabel159.setBackground(new java.awt.Color(255, 255, 255));
        jLabel159.setForeground(new java.awt.Color(255, 255, 255));
        jLabel159.setText("Producto:");

        txtRedKrite.setText("RedKrite");
        txtRedKrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRedKriteActionPerformed(evt);
            }
        });

        txtRedKritePrecio.setText("3000");

        txtRedKritePeso.setText("16kg");
        txtRedKritePeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRedKritePesoActionPerformed(evt);
            }
        });

        txtSenGatPrecio.setText("1500");

        jLabel160.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentos/descarga (3).jpg"))); // NOI18N

        jLabel161.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentos/descarga.jpg"))); // NOI18N

        jLabel162.setBackground(new java.awt.Color(255, 255, 255));
        jLabel162.setForeground(new java.awt.Color(255, 255, 255));
        jLabel162.setText("Precio:");

        jLabel163.setBackground(new java.awt.Color(255, 255, 255));
        jLabel163.setForeground(new java.awt.Color(255, 255, 255));
        jLabel163.setText("Precio:");

        jLabel164.setBackground(new java.awt.Color(255, 255, 255));
        jLabel164.setForeground(new java.awt.Color(255, 255, 255));
        jLabel164.setText("Peso:");

        txtSenGatPeso.setText("10kg");
        txtSenGatPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenGatPesoActionPerformed(evt);
            }
        });

        txtSenGat.setText("SenGat");
        txtSenGat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenGatActionPerformed(evt);
            }
        });

        btnRedKrite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        btntSenGat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel165.setBackground(new java.awt.Color(255, 255, 255));
        jLabel165.setForeground(new java.awt.Color(255, 255, 255));
        jLabel165.setText("Producto:");

        jLabel166.setBackground(new java.awt.Color(255, 255, 255));
        jLabel166.setForeground(new java.awt.Color(255, 255, 255));
        jLabel166.setText("Peso:");

        btnTioCat6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel167.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentos/images (10).jpg"))); // NOI18N

        btnTioCat7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel168.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentos/images (3).jpg"))); // NOI18N

        jLabel169.setBackground(new java.awt.Color(255, 255, 255));
        jLabel169.setForeground(new java.awt.Color(255, 255, 255));
        jLabel169.setText("Precio:");

        btnTioCat8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel170.setBackground(new java.awt.Color(255, 255, 255));
        jLabel170.setForeground(new java.awt.Color(255, 255, 255));
        jLabel170.setText("Precio:");

        jLabel171.setBackground(new java.awt.Color(255, 255, 255));
        jLabel171.setForeground(new java.awt.Color(255, 255, 255));
        jLabel171.setText("Producto:");

        jLabel172.setBackground(new java.awt.Color(255, 255, 255));
        jLabel172.setForeground(new java.awt.Color(255, 255, 255));
        jLabel172.setText("Peso:");

        jLabel173.setBackground(new java.awt.Color(255, 255, 255));
        jLabel173.setForeground(new java.awt.Color(255, 255, 255));
        jLabel173.setText("Peso:");

        txtTioCatPeso6.setText("13kg");
        txtTioCatPeso6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso6ActionPerformed(evt);
            }
        });

        jLabel174.setBackground(new java.awt.Color(255, 255, 255));
        jLabel174.setForeground(new java.awt.Color(255, 255, 255));
        jLabel174.setText("Precio:");

        txtTioCat6.setText("TioCat");
        txtTioCat6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat6ActionPerformed(evt);
            }
        });

        jLabel175.setBackground(new java.awt.Color(255, 255, 255));
        jLabel175.setForeground(new java.awt.Color(255, 255, 255));
        jLabel175.setText("Producto:");

        txtTioCat7.setText("TioCat");
        txtTioCat7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat7ActionPerformed(evt);
            }
        });

        btnTioCat9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel176.setBackground(new java.awt.Color(255, 255, 255));
        jLabel176.setForeground(new java.awt.Color(255, 255, 255));
        jLabel176.setText("Peso:");

        txtTioCatPeso7.setText("13kg");
        txtTioCatPeso7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso7ActionPerformed(evt);
            }
        });

        btnTioCat10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel177.setBackground(new java.awt.Color(255, 255, 255));
        jLabel177.setForeground(new java.awt.Color(255, 255, 255));
        jLabel177.setText("Precio:");

        txtTioCatPrecio6.setText("2000");

        jLabel178.setBackground(new java.awt.Color(255, 255, 255));
        jLabel178.setForeground(new java.awt.Color(255, 255, 255));
        jLabel178.setText("Producto:");

        txtTioCat8.setText("TioCat");
        txtTioCat8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat8ActionPerformed(evt);
            }
        });

        jLabel179.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentos/images (11).jpg"))); // NOI18N

        jLabel180.setBackground(new java.awt.Color(255, 255, 255));
        jLabel180.setForeground(new java.awt.Color(255, 255, 255));
        jLabel180.setText("Peso:");

        txtTioCatPeso8.setText("13kg");
        txtTioCatPeso8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso8ActionPerformed(evt);
            }
        });

        jLabel181.setBackground(new java.awt.Color(255, 255, 255));
        jLabel181.setForeground(new java.awt.Color(255, 255, 255));
        jLabel181.setText("Producto:");

        txtTioCatPrecio7.setText("2000");

        jLabel182.setBackground(new java.awt.Color(255, 255, 255));
        jLabel182.setForeground(new java.awt.Color(255, 255, 255));
        jLabel182.setText("Peso:");

        jLabel183.setBackground(new java.awt.Color(255, 255, 255));
        jLabel183.setForeground(new java.awt.Color(255, 255, 255));
        jLabel183.setText("Precio:");

        txtTioCat9.setText("TioCat");
        txtTioCat9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat9ActionPerformed(evt);
            }
        });

        jLabel184.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentos/images (1).jpg"))); // NOI18N

        txtTioCatPeso9.setText("13kg");
        txtTioCatPeso9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso9ActionPerformed(evt);
            }
        });

        jLabel185.setBackground(new java.awt.Color(255, 255, 255));
        jLabel185.setForeground(new java.awt.Color(255, 255, 255));
        jLabel185.setText("Producto:");

        txtTioCatPrecio8.setText("2000");

        jLabel186.setBackground(new java.awt.Color(255, 255, 255));
        jLabel186.setForeground(new java.awt.Color(255, 255, 255));
        jLabel186.setText("Peso:");

        jLabel187.setBackground(new java.awt.Color(255, 255, 255));
        jLabel187.setForeground(new java.awt.Color(255, 255, 255));
        jLabel187.setText("Producto:");

        jLabel188.setBackground(new java.awt.Color(255, 255, 255));
        jLabel188.setForeground(new java.awt.Color(255, 255, 255));
        jLabel188.setText("Precio:");

        txtTioCat10.setText("TioCat");
        txtTioCat10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat10ActionPerformed(evt);
            }
        });

        txtTioCat11.setText("TioCat");
        txtTioCat11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat11ActionPerformed(evt);
            }
        });

        txtTioCatPrecio9.setText("2000");

        txtTioCatPeso10.setText("13kg");
        txtTioCatPeso10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso10ActionPerformed(evt);
            }
        });

        txtTioCatPeso11.setText("13kg");
        txtTioCatPeso11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso11ActionPerformed(evt);
            }
        });

        txtTioCatPrecio10.setText("2000");

        txtTioCatPrecio11.setText("2000");

        jLabel189.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentos/images (4).jpg"))); // NOI18N

        btnTioCat11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel190.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentos/images (2).jpg"))); // NOI18N

        btnTioCat12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel191.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentos/images (7).jpg"))); // NOI18N

        btnTioCat13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel192.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentos/images (12).jpg"))); // NOI18N

        jLabel193.setBackground(new java.awt.Color(255, 255, 255));
        jLabel193.setForeground(new java.awt.Color(255, 255, 255));
        jLabel193.setText("Precio:");

        btnTioCat14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel194.setBackground(new java.awt.Color(255, 255, 255));
        jLabel194.setForeground(new java.awt.Color(255, 255, 255));
        jLabel194.setText("Precio:");

        jLabel195.setBackground(new java.awt.Color(255, 255, 255));
        jLabel195.setForeground(new java.awt.Color(255, 255, 255));
        jLabel195.setText("Producto:");

        jLabel196.setBackground(new java.awt.Color(255, 255, 255));
        jLabel196.setForeground(new java.awt.Color(255, 255, 255));
        jLabel196.setText("Peso:");

        jLabel197.setBackground(new java.awt.Color(255, 255, 255));
        jLabel197.setForeground(new java.awt.Color(255, 255, 255));
        jLabel197.setText("Peso:");

        txtTioCatPeso12.setText("13kg");
        txtTioCatPeso12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso12ActionPerformed(evt);
            }
        });

        jLabel198.setBackground(new java.awt.Color(255, 255, 255));
        jLabel198.setForeground(new java.awt.Color(255, 255, 255));
        jLabel198.setText("Precio:");

        txtTioCat12.setText("TioCat");
        txtTioCat12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat12ActionPerformed(evt);
            }
        });

        jLabel199.setBackground(new java.awt.Color(255, 255, 255));
        jLabel199.setForeground(new java.awt.Color(255, 255, 255));
        jLabel199.setText("Producto:");

        txtTioCat13.setText("TioCat");
        txtTioCat13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat13ActionPerformed(evt);
            }
        });

        btnTioCat15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel200.setBackground(new java.awt.Color(255, 255, 255));
        jLabel200.setForeground(new java.awt.Color(255, 255, 255));
        jLabel200.setText("Peso:");

        txtTioCatPeso13.setText("13kg");
        txtTioCatPeso13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso13ActionPerformed(evt);
            }
        });

        btnTioCat16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel201.setBackground(new java.awt.Color(255, 255, 255));
        jLabel201.setForeground(new java.awt.Color(255, 255, 255));
        jLabel201.setText("Precio:");

        txtTioCatPrecio12.setText("2000");

        jLabel202.setBackground(new java.awt.Color(255, 255, 255));
        jLabel202.setForeground(new java.awt.Color(255, 255, 255));
        jLabel202.setText("Producto:");

        txtTioCat14.setText("TioCat");
        txtTioCat14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat14ActionPerformed(evt);
            }
        });

        jLabel203.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentos/images (8).jpg"))); // NOI18N

        jLabel204.setBackground(new java.awt.Color(255, 255, 255));
        jLabel204.setForeground(new java.awt.Color(255, 255, 255));
        jLabel204.setText("Peso:");

        txtTioCatPeso14.setText("13kg");
        txtTioCatPeso14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso14ActionPerformed(evt);
            }
        });

        jLabel205.setBackground(new java.awt.Color(255, 255, 255));
        jLabel205.setForeground(new java.awt.Color(255, 255, 255));
        jLabel205.setText("Producto:");

        txtTioCatPrecio13.setText("2000");

        jLabel206.setBackground(new java.awt.Color(255, 255, 255));
        jLabel206.setForeground(new java.awt.Color(255, 255, 255));
        jLabel206.setText("Peso:");

        jLabel207.setBackground(new java.awt.Color(255, 255, 255));
        jLabel207.setForeground(new java.awt.Color(255, 255, 255));
        jLabel207.setText("Precio:");

        txtTioCat15.setText("TioCat");
        txtTioCat15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat15ActionPerformed(evt);
            }
        });

        jLabel208.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentos/images (6).jpg"))); // NOI18N

        txtTioCatPeso15.setText("13kg");
        txtTioCatPeso15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso15ActionPerformed(evt);
            }
        });

        jLabel209.setBackground(new java.awt.Color(255, 255, 255));
        jLabel209.setForeground(new java.awt.Color(255, 255, 255));
        jLabel209.setText("Producto:");

        txtTioCatPrecio14.setText("2000");

        jLabel210.setBackground(new java.awt.Color(255, 255, 255));
        jLabel210.setForeground(new java.awt.Color(255, 255, 255));
        jLabel210.setText("Peso:");

        jLabel211.setBackground(new java.awt.Color(255, 255, 255));
        jLabel211.setForeground(new java.awt.Color(255, 255, 255));
        jLabel211.setText("Producto:");

        jLabel212.setBackground(new java.awt.Color(255, 255, 255));
        jLabel212.setForeground(new java.awt.Color(255, 255, 255));
        jLabel212.setText("Precio:");

        txtTioCat16.setText("TioCat");
        txtTioCat16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat16ActionPerformed(evt);
            }
        });

        txtTioCat17.setText("TioCat");
        txtTioCat17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat17ActionPerformed(evt);
            }
        });

        txtTioCatPrecio15.setText("2000");

        txtTioCatPeso16.setText("13kg");
        txtTioCatPeso16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso16ActionPerformed(evt);
            }
        });

        txtTioCatPeso17.setText("13kg");
        txtTioCatPeso17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso17ActionPerformed(evt);
            }
        });

        txtTioCatPrecio16.setText("2000");

        txtTioCatPrecio17.setText("2000");

        jLabel213.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentos/images.jpg"))); // NOI18N

        btnTioCat17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel214.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentos/images (9).jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCanto)
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel146, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel144, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCantoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCanto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel143, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat7)
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel188, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel185, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel186, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel184, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnTioCat13)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel212, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel209, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel210, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso16, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTioCat17, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTioCatPrecio16, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel208, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExtruction)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel150, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel148, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel149, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtExtructionPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtExtruction, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtExtructionPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnTioCat6)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel177, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel175, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel176, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTioCat8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTioCatPrecio7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnTioCat12)
                        .addGroup(jPanel42Layout.createSequentialGroup()
                            .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel201, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel199, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(jLabel200, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTioCatPeso14, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTioCat14, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTioCatPrecio13, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel42Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jLabel191, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel147, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel167, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 59, 59)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCobayes)
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel158, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel156, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel157, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCobayesPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCobayes, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCobayesPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel155, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGati)
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel154, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel152, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel153, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGatiPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGati, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGatiPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btntSenGat)
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel162, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel165, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel166, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSenGatPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSenGat, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSenGatPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel160, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRedKrite)
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel163, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel159, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel164, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRedKritePeso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRedKrite, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRedKritePrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel161, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat8)
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel183, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel181, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel182, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel179, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat11)
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel174, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel171, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel173, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel190, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat10)
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel169, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel178, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel180, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel189, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat9)
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel170, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel187, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel172, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel168, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat14)
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel207, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel205, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel206, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso15, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat15, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio14, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel203, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat17)
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel198, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel195, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel197, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso13, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat13, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio12, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel214, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat16)
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel193, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel202, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel204, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso12, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat12, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio17, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel213, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat15)
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel194, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel211, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel196, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso17, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat16, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio15, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel192, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel161, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel159)
                            .addComponent(txtRedKrite, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRedKritePeso, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel164))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel163)
                            .addComponent(txtRedKritePrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRedKrite, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel160, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel165)
                            .addComponent(txtSenGat, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenGatPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel166))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel162)
                            .addComponent(txtSenGatPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btntSenGat, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel152)
                            .addComponent(txtGati, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGatiPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel153))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel154)
                            .addComponent(txtGatiPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGati, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel155, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel156)
                            .addComponent(txtCobayes, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCobayesPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel157))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel158)
                            .addComponent(txtCobayesPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCobayes, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel147, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel148)
                            .addComponent(txtExtruction, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtExtructionPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel149))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel150)
                            .addComponent(txtExtructionPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExtruction, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel143, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel144)
                            .addComponent(txtCanto, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCantoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel145))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel146)
                            .addComponent(txtCantoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCanto, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel168, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel187)
                            .addComponent(txtTioCat10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel172))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel170)
                            .addComponent(txtTioCatPrecio9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat9, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel189, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel178)
                            .addComponent(txtTioCat6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel180))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel169)
                            .addComponent(txtTioCatPrecio11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat10, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel190, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel171)
                            .addComponent(txtTioCat7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel173))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel174)
                            .addComponent(txtTioCatPrecio6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat11, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel179, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel181)
                            .addComponent(txtTioCat9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel182))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel183)
                            .addComponent(txtTioCatPrecio8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel167, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel175)
                            .addComponent(txtTioCat8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel176))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel177)
                            .addComponent(txtTioCatPrecio7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel184, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel185)
                            .addComponent(txtTioCat11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel186))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel188)
                            .addComponent(txtTioCatPrecio10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel192, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel211)
                            .addComponent(txtTioCat16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel196))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel194)
                            .addComponent(txtTioCatPrecio15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat15, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel213, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel202)
                            .addComponent(txtTioCat12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel204))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel193)
                            .addComponent(txtTioCatPrecio17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat16, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel214, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel195)
                            .addComponent(txtTioCat13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel197))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel198)
                            .addComponent(txtTioCatPrecio12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat17, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel203, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel205)
                            .addComponent(txtTioCat15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel206))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel207)
                            .addComponent(txtTioCatPrecio14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat14, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel191, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel199)
                            .addComponent(txtTioCat14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel200))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel201)
                            .addComponent(txtTioCatPrecio13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat12, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel208, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel209)
                            .addComponent(txtTioCat17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel210))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel212)
                            .addComponent(txtTioCatPrecio16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat13, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jTabbedPane9.addTab("Alimentos", jPanel42);

        jPanel43.setBackground(new java.awt.Color(0, 0, 0));

        txtTioCatPrecio18.setText("2000");

        jLabel215.setBackground(new java.awt.Color(255, 255, 255));
        jLabel215.setForeground(new java.awt.Color(255, 255, 255));
        jLabel215.setText("Peso:");

        jLabel216.setBackground(new java.awt.Color(255, 255, 255));
        jLabel216.setForeground(new java.awt.Color(255, 255, 255));
        jLabel216.setText("Precio:");

        jLabel218.setBackground(new java.awt.Color(255, 255, 255));
        jLabel218.setForeground(new java.awt.Color(255, 255, 255));
        jLabel218.setText("Precio:");

        jLabel219.setBackground(new java.awt.Color(255, 255, 255));
        jLabel219.setForeground(new java.awt.Color(255, 255, 255));
        jLabel219.setText("Precio:");

        jLabel220.setBackground(new java.awt.Color(255, 255, 255));
        jLabel220.setForeground(new java.awt.Color(255, 255, 255));
        jLabel220.setText("Peso:");

        txtTioCatPeso18.setText("13kg");
        txtTioCatPeso18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso18ActionPerformed(evt);
            }
        });

        txtTioCat18.setText("TioCat");
        txtTioCat18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat18ActionPerformed(evt);
            }
        });

        btnTioCat18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        btnTioCat19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        txtTioCat19.setText("TioCat");
        txtTioCat19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat19ActionPerformed(evt);
            }
        });

        jLabel221.setBackground(new java.awt.Color(255, 255, 255));
        jLabel221.setForeground(new java.awt.Color(255, 255, 255));
        jLabel221.setText("Producto:");

        jLabel223.setBackground(new java.awt.Color(255, 255, 255));
        jLabel223.setForeground(new java.awt.Color(255, 255, 255));
        jLabel223.setText("Peso:");

        txtTioCatPeso19.setText("13kg");
        txtTioCatPeso19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso19ActionPerformed(evt);
            }
        });

        jLabel224.setBackground(new java.awt.Color(255, 255, 255));
        jLabel224.setForeground(new java.awt.Color(255, 255, 255));
        jLabel224.setText("Producto:");

        txtTioCatPrecio19.setText("2000");

        jLabel225.setBackground(new java.awt.Color(255, 255, 255));
        jLabel225.setForeground(new java.awt.Color(255, 255, 255));
        jLabel225.setText("Peso:");

        jLabel226.setBackground(new java.awt.Color(255, 255, 255));
        jLabel226.setForeground(new java.awt.Color(255, 255, 255));
        jLabel226.setText("Producto:");

        jLabel227.setBackground(new java.awt.Color(255, 255, 255));
        jLabel227.setForeground(new java.awt.Color(255, 255, 255));
        jLabel227.setText("Precio:");

        txtTioCat20.setText("TioCat");
        txtTioCat20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat20ActionPerformed(evt);
            }
        });

        txtTioCat21.setText("TioCat");
        txtTioCat21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat21ActionPerformed(evt);
            }
        });

        btnTioCat20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        btnTioCat21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel231.setBackground(new java.awt.Color(255, 255, 255));
        jLabel231.setForeground(new java.awt.Color(255, 255, 255));
        jLabel231.setText("Precio:");

        jLabel232.setBackground(new java.awt.Color(255, 255, 255));
        jLabel232.setForeground(new java.awt.Color(255, 255, 255));
        jLabel232.setText("Producto:");

        btnTioCat22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel233.setBackground(new java.awt.Color(255, 255, 255));
        jLabel233.setForeground(new java.awt.Color(255, 255, 255));
        jLabel233.setText("Peso:");

        jLabel234.setBackground(new java.awt.Color(255, 255, 255));
        jLabel234.setForeground(new java.awt.Color(255, 255, 255));
        jLabel234.setText("Precio:");

        jLabel235.setBackground(new java.awt.Color(255, 255, 255));
        jLabel235.setForeground(new java.awt.Color(255, 255, 255));
        jLabel235.setText("Precio:");

        jLabel236.setBackground(new java.awt.Color(255, 255, 255));
        jLabel236.setForeground(new java.awt.Color(255, 255, 255));
        jLabel236.setText("Producto:");

        txtTioCatPrecio20.setText("2000");

        txtTioCat22.setText("TioCat");
        txtTioCat22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat22ActionPerformed(evt);
            }
        });

        jLabel237.setBackground(new java.awt.Color(255, 255, 255));
        jLabel237.setForeground(new java.awt.Color(255, 255, 255));
        jLabel237.setText("Peso:");

        txtTioCatPeso20.setText("13kg");
        txtTioCatPeso20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso20ActionPerformed(evt);
            }
        });

        txtTioCatPeso21.setText("13kg");
        txtTioCatPeso21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso21ActionPerformed(evt);
            }
        });

        jLabel238.setBackground(new java.awt.Color(255, 255, 255));
        jLabel238.setForeground(new java.awt.Color(255, 255, 255));
        jLabel238.setText("Peso:");

        txtTioCatPeso22.setText("13kg");
        txtTioCatPeso22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso22ActionPerformed(evt);
            }
        });

        txtTioCatPrecio21.setText("2000");

        txtTioCatPrecio22.setText("2000");

        txtTioCatPrecio23.setText("2000");

        btnTioCat23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        btnTioCat24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        btnTioCat25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        txtTioCatPeso23.setText("13kg");
        txtTioCatPeso23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso23ActionPerformed(evt);
            }
        });

        btnTioCat26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel243.setBackground(new java.awt.Color(255, 255, 255));
        jLabel243.setForeground(new java.awt.Color(255, 255, 255));
        jLabel243.setText("Precio:");

        txtTioCat23.setText("TioCat");
        txtTioCat23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat23ActionPerformed(evt);
            }
        });

        jLabel244.setBackground(new java.awt.Color(255, 255, 255));
        jLabel244.setForeground(new java.awt.Color(255, 255, 255));
        jLabel244.setText("Producto:");

        txtTioCat24.setText("TioCat");
        txtTioCat24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat24ActionPerformed(evt);
            }
        });

        btnTioCat27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel245.setBackground(new java.awt.Color(255, 255, 255));
        jLabel245.setForeground(new java.awt.Color(255, 255, 255));
        jLabel245.setText("Peso:");

        txtTioCatPeso24.setText("13kg");
        txtTioCatPeso24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso24ActionPerformed(evt);
            }
        });

        btnTioCat28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel246.setBackground(new java.awt.Color(255, 255, 255));
        jLabel246.setForeground(new java.awt.Color(255, 255, 255));
        jLabel246.setText("Producto:");

        btnTioCat29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel248.setBackground(new java.awt.Color(255, 255, 255));
        jLabel248.setForeground(new java.awt.Color(255, 255, 255));
        jLabel248.setText("Peso:");

        jLabel249.setBackground(new java.awt.Color(255, 255, 255));
        jLabel249.setForeground(new java.awt.Color(255, 255, 255));
        jLabel249.setText("Precio:");

        jLabel250.setBackground(new java.awt.Color(255, 255, 255));
        jLabel250.setForeground(new java.awt.Color(255, 255, 255));
        jLabel250.setText("Precio:");

        jLabel251.setBackground(new java.awt.Color(255, 255, 255));
        jLabel251.setForeground(new java.awt.Color(255, 255, 255));
        jLabel251.setText("Precio:");

        btnTioCat30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        txtTioCat25.setText("TioCat");
        txtTioCat25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat25ActionPerformed(evt);
            }
        });

        jLabel252.setBackground(new java.awt.Color(255, 255, 255));
        jLabel252.setForeground(new java.awt.Color(255, 255, 255));
        jLabel252.setText("Precio:");

        txtTioCatPeso25.setText("13kg");
        txtTioCatPeso25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso25ActionPerformed(evt);
            }
        });

        jLabel253.setBackground(new java.awt.Color(255, 255, 255));
        jLabel253.setForeground(new java.awt.Color(255, 255, 255));
        jLabel253.setText("Producto:");

        txtTioCatPrecio24.setText("2000");

        jLabel254.setBackground(new java.awt.Color(255, 255, 255));
        jLabel254.setForeground(new java.awt.Color(255, 255, 255));
        jLabel254.setText("Peso:");

        jLabel255.setBackground(new java.awt.Color(255, 255, 255));
        jLabel255.setForeground(new java.awt.Color(255, 255, 255));
        jLabel255.setText("Peso:");

        txtTioCatPeso26.setText("13kg");
        txtTioCatPeso26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso26ActionPerformed(evt);
            }
        });

        jLabel256.setBackground(new java.awt.Color(255, 255, 255));
        jLabel256.setForeground(new java.awt.Color(255, 255, 255));
        jLabel256.setText("Precio:");

        txtTioCat26.setText("TioCat");
        txtTioCat26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat26ActionPerformed(evt);
            }
        });

        jLabel257.setBackground(new java.awt.Color(255, 255, 255));
        jLabel257.setForeground(new java.awt.Color(255, 255, 255));
        jLabel257.setText("Producto:");

        txtTioCat27.setText("TioCat");
        txtTioCat27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat27ActionPerformed(evt);
            }
        });

        btnTioCat31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel258.setBackground(new java.awt.Color(255, 255, 255));
        jLabel258.setForeground(new java.awt.Color(255, 255, 255));
        jLabel258.setText("Peso:");

        txtTioCatPeso27.setText("13kg");
        txtTioCatPeso27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso27ActionPerformed(evt);
            }
        });

        btnTioCat32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel259.setBackground(new java.awt.Color(255, 255, 255));
        jLabel259.setForeground(new java.awt.Color(255, 255, 255));
        jLabel259.setText("Precio:");

        txtTioCatPrecio25.setText("2000");

        jLabel260.setBackground(new java.awt.Color(255, 255, 255));
        jLabel260.setForeground(new java.awt.Color(255, 255, 255));
        jLabel260.setText("Producto:");

        txtTioCat28.setText("TioCat");
        txtTioCat28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat28ActionPerformed(evt);
            }
        });

        jLabel262.setBackground(new java.awt.Color(255, 255, 255));
        jLabel262.setForeground(new java.awt.Color(255, 255, 255));
        jLabel262.setText("Peso:");

        txtTioCatPeso28.setText("13kg");
        txtTioCatPeso28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso28ActionPerformed(evt);
            }
        });

        jLabel263.setBackground(new java.awt.Color(255, 255, 255));
        jLabel263.setForeground(new java.awt.Color(255, 255, 255));
        jLabel263.setText("Producto:");

        txtTioCatPrecio26.setText("2000");

        jLabel264.setBackground(new java.awt.Color(255, 255, 255));
        jLabel264.setForeground(new java.awt.Color(255, 255, 255));
        jLabel264.setText("Peso:");

        jLabel265.setBackground(new java.awt.Color(255, 255, 255));
        jLabel265.setForeground(new java.awt.Color(255, 255, 255));
        jLabel265.setText("Precio:");

        txtTioCat29.setText("TioCat");
        txtTioCat29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat29ActionPerformed(evt);
            }
        });

        txtTioCatPeso29.setText("13kg");
        txtTioCatPeso29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso29ActionPerformed(evt);
            }
        });

        jLabel267.setBackground(new java.awt.Color(255, 255, 255));
        jLabel267.setForeground(new java.awt.Color(255, 255, 255));
        jLabel267.setText("Producto:");

        txtTioCatPrecio27.setText("2000");

        jLabel268.setBackground(new java.awt.Color(255, 255, 255));
        jLabel268.setForeground(new java.awt.Color(255, 255, 255));
        jLabel268.setText("Peso:");

        jLabel269.setBackground(new java.awt.Color(255, 255, 255));
        jLabel269.setForeground(new java.awt.Color(255, 255, 255));
        jLabel269.setText("Producto:");

        jLabel270.setBackground(new java.awt.Color(255, 255, 255));
        jLabel270.setForeground(new java.awt.Color(255, 255, 255));
        jLabel270.setText("Precio:");

        txtTioCat30.setText("TioCat");
        txtTioCat30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat30ActionPerformed(evt);
            }
        });

        txtTioCat31.setText("TioCat");
        txtTioCat31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat31ActionPerformed(evt);
            }
        });

        txtTioCatPrecio28.setText("2000");

        btnTioCat33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        txtTioCatPeso30.setText("13kg");
        txtTioCatPeso30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso30ActionPerformed(evt);
            }
        });

        txtTioCatPeso31.setText("13kg");
        txtTioCatPeso31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso31ActionPerformed(evt);
            }
        });

        btnTioCat34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        txtTioCatPrecio29.setText("2000");

        jLabel272.setBackground(new java.awt.Color(255, 255, 255));
        jLabel272.setForeground(new java.awt.Color(255, 255, 255));
        jLabel272.setText("Producto:");

        txtTioCatPrecio30.setText("2000");

        jLabel273.setBackground(new java.awt.Color(255, 255, 255));
        jLabel273.setForeground(new java.awt.Color(255, 255, 255));
        jLabel273.setText("Peso:");

        jLabel275.setBackground(new java.awt.Color(255, 255, 255));
        jLabel275.setForeground(new java.awt.Color(255, 255, 255));
        jLabel275.setText("Precio:");

        btnTioCat35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        txtTioCat32.setText("TioCat");
        txtTioCat32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat32ActionPerformed(evt);
            }
        });

        txtTioCatPeso32.setText("13kg");
        txtTioCatPeso32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso32ActionPerformed(evt);
            }
        });

        txtTioCatPrecio31.setText("2000");

        jLabel278.setBackground(new java.awt.Color(255, 255, 255));
        jLabel278.setForeground(new java.awt.Color(255, 255, 255));
        jLabel278.setText("Producto:");

        jLabel279.setBackground(new java.awt.Color(255, 255, 255));
        jLabel279.setForeground(new java.awt.Color(255, 255, 255));
        jLabel279.setText("Peso:");

        jLabel280.setBackground(new java.awt.Color(255, 255, 255));
        jLabel280.setForeground(new java.awt.Color(255, 255, 255));
        jLabel280.setText("Precio:");

        txtTioCat33.setText("TioCat");
        txtTioCat33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat33ActionPerformed(evt);
            }
        });

        txtTioCatPeso33.setText("13kg");
        txtTioCatPeso33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso33ActionPerformed(evt);
            }
        });

        txtTioCatPrecio32.setText("2000");

        jLabel281.setBackground(new java.awt.Color(255, 255, 255));
        jLabel281.setForeground(new java.awt.Color(255, 255, 255));
        jLabel281.setText("Producto:");

        txtTioCat34.setText("TioCat");
        txtTioCat34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat34ActionPerformed(evt);
            }
        });

        txtTioCatPrecio33.setText("2000");

        txtTioCatPeso34.setText("13kg");
        txtTioCatPeso34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso34ActionPerformed(evt);
            }
        });

        txtTioCatPrecio34.setText("2000");

        txtTioCatPrecio35.setText("2000");

        jLabel282.setBackground(new java.awt.Color(255, 255, 255));
        jLabel282.setForeground(new java.awt.Color(255, 255, 255));
        jLabel282.setText("Producto:");

        txtTioCat35.setText("TioCat");
        txtTioCat35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat35ActionPerformed(evt);
            }
        });

        jLabel285.setBackground(new java.awt.Color(255, 255, 255));
        jLabel285.setForeground(new java.awt.Color(255, 255, 255));
        jLabel285.setText("Peso:");

        txtTioCatPeso35.setText("13kg");
        txtTioCatPeso35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso35ActionPerformed(evt);
            }
        });

        jLabel286.setBackground(new java.awt.Color(255, 255, 255));
        jLabel286.setForeground(new java.awt.Color(255, 255, 255));
        jLabel286.setText("Producto:");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat26)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel235, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel232, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel233, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso21, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat22, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio21, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel230, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat25)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel251, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel246, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel248, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso25, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat25, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio24, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel242, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat34)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel280, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel278, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel279, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso33, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat33, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio32, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel277, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat33)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel275, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel272, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel273, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso32, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat32, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio31, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel271, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat19)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel218, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel221, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel223, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso18, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat18, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio35, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel283, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat18)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel219, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel281, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel220, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso34, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat34, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio33, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel217, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat21)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel227, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel224, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel225, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso20, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat21, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio22, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel222, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat20)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel249, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel244, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel245, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso35, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat35, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio18, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel228, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat22)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel216, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel286, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel215, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso19, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat19, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio19, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel284, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat23)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel243, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel236, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel238, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso24, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat24, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio34, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel240, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat29)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel231, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel282, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel285, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso23, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat23, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio23, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel239, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat27)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel234, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel226, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel237, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso22, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat20, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio20, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel229, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat28)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel270, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel267, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel268, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso30, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat31, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio29, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel266, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat24)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel259, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel257, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel258, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso28, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat28, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio26, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel241, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat30)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel265, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel263, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel264, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso29, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat29, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio27, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel261, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat35)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel256, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel253, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel255, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso27, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat27, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio25, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel276, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat32)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel250, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel260, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel262, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso26, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat26, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio30, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel274, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat31)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel252, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel269, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel254, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso31, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat30, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio28, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel247, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel217, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel281)
                            .addComponent(txtTioCat34, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso34, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel220))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel219)
                            .addComponent(txtTioCatPrecio33, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat18, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel283, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel221)
                            .addComponent(txtTioCat18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel223))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel218)
                            .addComponent(txtTioCatPrecio35, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat19, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel271, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel272)
                            .addComponent(txtTioCat32, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso32, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel273))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel275)
                            .addComponent(txtTioCatPrecio31, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat33, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel277, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel278)
                            .addComponent(txtTioCat33, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso33, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel279))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel280)
                            .addComponent(txtTioCatPrecio32, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat34, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel242, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel246)
                            .addComponent(txtTioCat25, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso25, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel248))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel251)
                            .addComponent(txtTioCatPrecio24, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat25, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel230, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel232)
                            .addComponent(txtTioCat22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel233))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel235)
                            .addComponent(txtTioCatPrecio21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat26, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel229, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel226)
                            .addComponent(txtTioCat20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel237))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel234)
                            .addComponent(txtTioCatPrecio20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat27, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel239, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel282)
                            .addComponent(txtTioCat23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel285))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel231)
                            .addComponent(txtTioCatPrecio23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat29, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel240, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel236)
                            .addComponent(txtTioCat24, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso24, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel238))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel243)
                            .addComponent(txtTioCatPrecio34, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat23, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel284, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel286)
                            .addComponent(txtTioCat19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel215))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel216)
                            .addComponent(txtTioCatPrecio19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat22, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel228, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel244)
                            .addComponent(txtTioCat35, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso35, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel245))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel249)
                            .addComponent(txtTioCatPrecio18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat20, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel222, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel224)
                            .addComponent(txtTioCat21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel225))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel227)
                            .addComponent(txtTioCatPrecio22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat21, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel247, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel269)
                            .addComponent(txtTioCat30, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso31, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel254))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel252)
                            .addComponent(txtTioCatPrecio28, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat31, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel274, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel260)
                            .addComponent(txtTioCat26, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso26, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel262))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel250)
                            .addComponent(txtTioCatPrecio30, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat32, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel276, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel253)
                            .addComponent(txtTioCat27, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso27, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel255))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel256)
                            .addComponent(txtTioCatPrecio25, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat35, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel261, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel263)
                            .addComponent(txtTioCat29, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso29, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel264))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel265)
                            .addComponent(txtTioCatPrecio27, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat30, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel241, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel257)
                            .addComponent(txtTioCat28, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso28, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel258))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel259)
                            .addComponent(txtTioCatPrecio26, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat24, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel266, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel267)
                            .addComponent(txtTioCat31, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso30, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel268))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel270)
                            .addComponent(txtTioCatPrecio29, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat28, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jTabbedPane9.addTab("Accesorios", jPanel43);

        jPanel44.setBackground(new java.awt.Color(0, 0, 0));

        txtTioCatPrecio36.setText("2000");

        jLabel287.setBackground(new java.awt.Color(255, 255, 255));
        jLabel287.setForeground(new java.awt.Color(255, 255, 255));
        jLabel287.setText("Peso:");

        jLabel288.setBackground(new java.awt.Color(255, 255, 255));
        jLabel288.setForeground(new java.awt.Color(255, 255, 255));
        jLabel288.setText("Precio:");

        jLabel290.setBackground(new java.awt.Color(255, 255, 255));
        jLabel290.setForeground(new java.awt.Color(255, 255, 255));
        jLabel290.setText("Precio:");

        jLabel291.setBackground(new java.awt.Color(255, 255, 255));
        jLabel291.setForeground(new java.awt.Color(255, 255, 255));
        jLabel291.setText("Precio:");

        jLabel292.setBackground(new java.awt.Color(255, 255, 255));
        jLabel292.setForeground(new java.awt.Color(255, 255, 255));
        jLabel292.setText("Peso:");

        txtTioCatPeso36.setText("13kg");
        txtTioCatPeso36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso36ActionPerformed(evt);
            }
        });

        txtTioCat36.setText("TioCat");
        txtTioCat36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat36ActionPerformed(evt);
            }
        });

        btnTioCat36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        btnTioCat37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        txtTioCat37.setText("TioCat");
        txtTioCat37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat37ActionPerformed(evt);
            }
        });

        jLabel293.setBackground(new java.awt.Color(255, 255, 255));
        jLabel293.setForeground(new java.awt.Color(255, 255, 255));
        jLabel293.setText("Producto:");

        jLabel295.setBackground(new java.awt.Color(255, 255, 255));
        jLabel295.setForeground(new java.awt.Color(255, 255, 255));
        jLabel295.setText("Peso:");

        txtTioCatPeso37.setText("13kg");
        txtTioCatPeso37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso37ActionPerformed(evt);
            }
        });

        jLabel296.setBackground(new java.awt.Color(255, 255, 255));
        jLabel296.setForeground(new java.awt.Color(255, 255, 255));
        jLabel296.setText("Producto:");

        txtTioCatPrecio37.setText("2000");

        jLabel297.setBackground(new java.awt.Color(255, 255, 255));
        jLabel297.setForeground(new java.awt.Color(255, 255, 255));
        jLabel297.setText("Peso:");

        jLabel298.setBackground(new java.awt.Color(255, 255, 255));
        jLabel298.setForeground(new java.awt.Color(255, 255, 255));
        jLabel298.setText("Producto:");

        jLabel299.setBackground(new java.awt.Color(255, 255, 255));
        jLabel299.setForeground(new java.awt.Color(255, 255, 255));
        jLabel299.setText("Precio:");

        txtTioCat38.setText("TioCat");
        txtTioCat38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat38ActionPerformed(evt);
            }
        });

        txtTioCat39.setText("TioCat");
        txtTioCat39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat39ActionPerformed(evt);
            }
        });

        btnTioCat38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        btnTioCat39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel303.setBackground(new java.awt.Color(255, 255, 255));
        jLabel303.setForeground(new java.awt.Color(255, 255, 255));
        jLabel303.setText("Precio:");

        jLabel304.setBackground(new java.awt.Color(255, 255, 255));
        jLabel304.setForeground(new java.awt.Color(255, 255, 255));
        jLabel304.setText("Producto:");

        btnTioCat40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel305.setBackground(new java.awt.Color(255, 255, 255));
        jLabel305.setForeground(new java.awt.Color(255, 255, 255));
        jLabel305.setText("Peso:");

        jLabel306.setBackground(new java.awt.Color(255, 255, 255));
        jLabel306.setForeground(new java.awt.Color(255, 255, 255));
        jLabel306.setText("Precio:");

        jLabel307.setBackground(new java.awt.Color(255, 255, 255));
        jLabel307.setForeground(new java.awt.Color(255, 255, 255));
        jLabel307.setText("Precio:");

        jLabel308.setBackground(new java.awt.Color(255, 255, 255));
        jLabel308.setForeground(new java.awt.Color(255, 255, 255));
        jLabel308.setText("Producto:");

        txtTioCatPrecio38.setText("2000");

        txtTioCat40.setText("TioCat");
        txtTioCat40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat40ActionPerformed(evt);
            }
        });

        jLabel309.setBackground(new java.awt.Color(255, 255, 255));
        jLabel309.setForeground(new java.awt.Color(255, 255, 255));
        jLabel309.setText("Peso:");

        txtTioCatPeso38.setText("13kg");
        txtTioCatPeso38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso38ActionPerformed(evt);
            }
        });

        txtTioCatPeso39.setText("13kg");
        txtTioCatPeso39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso39ActionPerformed(evt);
            }
        });

        jLabel310.setBackground(new java.awt.Color(255, 255, 255));
        jLabel310.setForeground(new java.awt.Color(255, 255, 255));
        jLabel310.setText("Peso:");

        txtTioCatPeso40.setText("13kg");
        txtTioCatPeso40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso40ActionPerformed(evt);
            }
        });

        txtTioCatPrecio39.setText("2000");

        txtTioCatPrecio40.setText("2000");

        txtTioCatPrecio41.setText("2000");

        btnTioCat41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        btnTioCat42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        btnTioCat43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        txtTioCatPeso41.setText("13kg");
        txtTioCatPeso41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso41ActionPerformed(evt);
            }
        });

        btnTioCat44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel315.setBackground(new java.awt.Color(255, 255, 255));
        jLabel315.setForeground(new java.awt.Color(255, 255, 255));
        jLabel315.setText("Precio:");

        txtTioCat41.setText("TioCat");
        txtTioCat41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat41ActionPerformed(evt);
            }
        });

        jLabel316.setBackground(new java.awt.Color(255, 255, 255));
        jLabel316.setForeground(new java.awt.Color(255, 255, 255));
        jLabel316.setText("Producto:");

        txtTioCat42.setText("TioCat");
        txtTioCat42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat42ActionPerformed(evt);
            }
        });

        btnTioCat45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel317.setBackground(new java.awt.Color(255, 255, 255));
        jLabel317.setForeground(new java.awt.Color(255, 255, 255));
        jLabel317.setText("Peso:");

        txtTioCatPeso42.setText("13kg");
        txtTioCatPeso42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso42ActionPerformed(evt);
            }
        });

        btnTioCat46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel318.setBackground(new java.awt.Color(255, 255, 255));
        jLabel318.setForeground(new java.awt.Color(255, 255, 255));
        jLabel318.setText("Producto:");

        btnTioCat47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel320.setBackground(new java.awt.Color(255, 255, 255));
        jLabel320.setForeground(new java.awt.Color(255, 255, 255));
        jLabel320.setText("Peso:");

        jLabel321.setBackground(new java.awt.Color(255, 255, 255));
        jLabel321.setForeground(new java.awt.Color(255, 255, 255));
        jLabel321.setText("Precio:");

        jLabel322.setBackground(new java.awt.Color(255, 255, 255));
        jLabel322.setForeground(new java.awt.Color(255, 255, 255));
        jLabel322.setText("Precio:");

        jLabel323.setBackground(new java.awt.Color(255, 255, 255));
        jLabel323.setForeground(new java.awt.Color(255, 255, 255));
        jLabel323.setText("Precio:");

        btnTioCat48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        txtTioCat43.setText("TioCat");
        txtTioCat43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat43ActionPerformed(evt);
            }
        });

        jLabel324.setBackground(new java.awt.Color(255, 255, 255));
        jLabel324.setForeground(new java.awt.Color(255, 255, 255));
        jLabel324.setText("Precio:");

        txtTioCatPeso43.setText("13kg");
        txtTioCatPeso43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso43ActionPerformed(evt);
            }
        });

        jLabel325.setBackground(new java.awt.Color(255, 255, 255));
        jLabel325.setForeground(new java.awt.Color(255, 255, 255));
        jLabel325.setText("Producto:");

        txtTioCatPrecio42.setText("2000");

        jLabel326.setBackground(new java.awt.Color(255, 255, 255));
        jLabel326.setForeground(new java.awt.Color(255, 255, 255));
        jLabel326.setText("Peso:");

        jLabel327.setBackground(new java.awt.Color(255, 255, 255));
        jLabel327.setForeground(new java.awt.Color(255, 255, 255));
        jLabel327.setText("Peso:");

        txtTioCatPeso44.setText("13kg");
        txtTioCatPeso44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso44ActionPerformed(evt);
            }
        });

        jLabel328.setBackground(new java.awt.Color(255, 255, 255));
        jLabel328.setForeground(new java.awt.Color(255, 255, 255));
        jLabel328.setText("Precio:");

        txtTioCat44.setText("TioCat");
        txtTioCat44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat44ActionPerformed(evt);
            }
        });

        jLabel329.setBackground(new java.awt.Color(255, 255, 255));
        jLabel329.setForeground(new java.awt.Color(255, 255, 255));
        jLabel329.setText("Producto:");

        txtTioCat45.setText("TioCat");
        txtTioCat45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat45ActionPerformed(evt);
            }
        });

        btnTioCat49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel330.setBackground(new java.awt.Color(255, 255, 255));
        jLabel330.setForeground(new java.awt.Color(255, 255, 255));
        jLabel330.setText("Peso:");

        txtTioCatPeso45.setText("13kg");
        txtTioCatPeso45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso45ActionPerformed(evt);
            }
        });

        btnTioCat50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        jLabel331.setBackground(new java.awt.Color(255, 255, 255));
        jLabel331.setForeground(new java.awt.Color(255, 255, 255));
        jLabel331.setText("Precio:");

        txtTioCatPrecio43.setText("2000");

        jLabel332.setBackground(new java.awt.Color(255, 255, 255));
        jLabel332.setForeground(new java.awt.Color(255, 255, 255));
        jLabel332.setText("Producto:");

        txtTioCat46.setText("TioCat");
        txtTioCat46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat46ActionPerformed(evt);
            }
        });

        jLabel334.setBackground(new java.awt.Color(255, 255, 255));
        jLabel334.setForeground(new java.awt.Color(255, 255, 255));
        jLabel334.setText("Peso:");

        txtTioCatPeso46.setText("13kg");
        txtTioCatPeso46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso46ActionPerformed(evt);
            }
        });

        jLabel335.setBackground(new java.awt.Color(255, 255, 255));
        jLabel335.setForeground(new java.awt.Color(255, 255, 255));
        jLabel335.setText("Producto:");

        txtTioCatPrecio44.setText("2000");

        jLabel336.setBackground(new java.awt.Color(255, 255, 255));
        jLabel336.setForeground(new java.awt.Color(255, 255, 255));
        jLabel336.setText("Peso:");

        jLabel337.setBackground(new java.awt.Color(255, 255, 255));
        jLabel337.setForeground(new java.awt.Color(255, 255, 255));
        jLabel337.setText("Precio:");

        txtTioCat47.setText("TioCat");
        txtTioCat47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat47ActionPerformed(evt);
            }
        });

        txtTioCatPeso47.setText("13kg");
        txtTioCatPeso47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso47ActionPerformed(evt);
            }
        });

        jLabel339.setBackground(new java.awt.Color(255, 255, 255));
        jLabel339.setForeground(new java.awt.Color(255, 255, 255));
        jLabel339.setText("Producto:");

        txtTioCatPrecio45.setText("2000");

        jLabel340.setBackground(new java.awt.Color(255, 255, 255));
        jLabel340.setForeground(new java.awt.Color(255, 255, 255));
        jLabel340.setText("Peso:");

        jLabel341.setBackground(new java.awt.Color(255, 255, 255));
        jLabel341.setForeground(new java.awt.Color(255, 255, 255));
        jLabel341.setText("Producto:");

        jLabel342.setBackground(new java.awt.Color(255, 255, 255));
        jLabel342.setForeground(new java.awt.Color(255, 255, 255));
        jLabel342.setText("Precio:");

        txtTioCat48.setText("TioCat");
        txtTioCat48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat48ActionPerformed(evt);
            }
        });

        txtTioCat49.setText("TioCat");
        txtTioCat49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat49ActionPerformed(evt);
            }
        });

        txtTioCatPrecio46.setText("2000");

        btnTioCat51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        txtTioCatPeso48.setText("13kg");
        txtTioCatPeso48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso48ActionPerformed(evt);
            }
        });

        txtTioCatPeso49.setText("13kg");
        txtTioCatPeso49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso49ActionPerformed(evt);
            }
        });

        btnTioCat52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        txtTioCatPrecio47.setText("2000");

        jLabel344.setBackground(new java.awt.Color(255, 255, 255));
        jLabel344.setForeground(new java.awt.Color(255, 255, 255));
        jLabel344.setText("Producto:");

        txtTioCatPrecio48.setText("2000");

        jLabel345.setBackground(new java.awt.Color(255, 255, 255));
        jLabel345.setForeground(new java.awt.Color(255, 255, 255));
        jLabel345.setText("Peso:");

        jLabel347.setBackground(new java.awt.Color(255, 255, 255));
        jLabel347.setForeground(new java.awt.Color(255, 255, 255));
        jLabel347.setText("Precio:");

        btnTioCat53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imajenes diseño/pin.jpg"))); // NOI18N

        txtTioCat50.setText("TioCat");
        txtTioCat50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat50ActionPerformed(evt);
            }
        });

        txtTioCatPeso50.setText("13kg");
        txtTioCatPeso50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso50ActionPerformed(evt);
            }
        });

        txtTioCatPrecio49.setText("2000");

        jLabel350.setBackground(new java.awt.Color(255, 255, 255));
        jLabel350.setForeground(new java.awt.Color(255, 255, 255));
        jLabel350.setText("Producto:");

        jLabel351.setBackground(new java.awt.Color(255, 255, 255));
        jLabel351.setForeground(new java.awt.Color(255, 255, 255));
        jLabel351.setText("Peso:");

        jLabel352.setBackground(new java.awt.Color(255, 255, 255));
        jLabel352.setForeground(new java.awt.Color(255, 255, 255));
        jLabel352.setText("Precio:");

        txtTioCat51.setText("TioCat");
        txtTioCat51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat51ActionPerformed(evt);
            }
        });

        txtTioCatPeso51.setText("13kg");
        txtTioCatPeso51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso51ActionPerformed(evt);
            }
        });

        txtTioCatPrecio50.setText("2000");

        jLabel353.setBackground(new java.awt.Color(255, 255, 255));
        jLabel353.setForeground(new java.awt.Color(255, 255, 255));
        jLabel353.setText("Producto:");

        txtTioCat52.setText("TioCat");
        txtTioCat52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat52ActionPerformed(evt);
            }
        });

        txtTioCatPrecio51.setText("2000");

        txtTioCatPeso52.setText("13kg");
        txtTioCatPeso52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso52ActionPerformed(evt);
            }
        });

        txtTioCatPrecio52.setText("2000");

        txtTioCatPrecio53.setText("2000");

        jLabel354.setBackground(new java.awt.Color(255, 255, 255));
        jLabel354.setForeground(new java.awt.Color(255, 255, 255));
        jLabel354.setText("Producto:");

        txtTioCat53.setText("TioCat");
        txtTioCat53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCat53ActionPerformed(evt);
            }
        });

        jLabel357.setBackground(new java.awt.Color(255, 255, 255));
        jLabel357.setForeground(new java.awt.Color(255, 255, 255));
        jLabel357.setText("Peso:");

        txtTioCatPeso53.setText("13kg");
        txtTioCatPeso53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTioCatPeso53ActionPerformed(evt);
            }
        });

        jLabel358.setBackground(new java.awt.Color(255, 255, 255));
        jLabel358.setForeground(new java.awt.Color(255, 255, 255));
        jLabel358.setText("Producto:");

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat44)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel307, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel304, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel305, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso39, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat40, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio39, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel302, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat43)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel323, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel318, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel320, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso43, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat43, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio42, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel314, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat52)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel352, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel350, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel351, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso51, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat51, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio50, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel349, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat51)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel347, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel344, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel345, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso50, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat50, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio49, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel343, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat37)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel290, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel293, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel295, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso36, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat36, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio53, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel355, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat36)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel291, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel353, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel292, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso52, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat52, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio51, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel289, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat39)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel299, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel296, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel297, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso38, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat39, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio40, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel294, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat38)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel321, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel316, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel317, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso53, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat53, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio36, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel300, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat40)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel288, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel358, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel287, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso37, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat37, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio37, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel356, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat41)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel315, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel308, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel310, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso42, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat42, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio52, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel312, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat47)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel303, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel354, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel357, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso41, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat41, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio41, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel311, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat45)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel306, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel298, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel309, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso40, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat38, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio38, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel301, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat46)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel342, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel339, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel340, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso48, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat49, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio47, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel338, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat42)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel331, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel329, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel330, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso46, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat46, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio44, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel313, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat48)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel337, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel335, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel336, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso47, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat47, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio45, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel333, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat53)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel328, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel325, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel327, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso45, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat45, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio43, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel348, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat50)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel322, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel332, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel334, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso44, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat44, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio48, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel346, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTioCat49)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel324, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel341, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel326, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTioCatPeso49, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCat48, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTioCatPrecio46, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel319, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel289, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel353)
                            .addComponent(txtTioCat52, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso52, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel292))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel291)
                            .addComponent(txtTioCatPrecio51, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat36, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel355, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel293)
                            .addComponent(txtTioCat36, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso36, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel295))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel290)
                            .addComponent(txtTioCatPrecio53, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat37, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel343, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel344)
                            .addComponent(txtTioCat50, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso50, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel345))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel347)
                            .addComponent(txtTioCatPrecio49, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat51, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel349, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel350)
                            .addComponent(txtTioCat51, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso51, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel351))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel352)
                            .addComponent(txtTioCatPrecio50, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat52, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel314, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel318)
                            .addComponent(txtTioCat43, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso43, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel320))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel323)
                            .addComponent(txtTioCatPrecio42, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat43, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel302, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel304)
                            .addComponent(txtTioCat40, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso39, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel305))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel307)
                            .addComponent(txtTioCatPrecio39, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat44, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel301, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel298)
                            .addComponent(txtTioCat38, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso40, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel309))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel306)
                            .addComponent(txtTioCatPrecio38, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat45, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel311, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel354)
                            .addComponent(txtTioCat41, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso41, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel357))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel303)
                            .addComponent(txtTioCatPrecio41, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat47, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel312, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel308)
                            .addComponent(txtTioCat42, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso42, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel310))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel315)
                            .addComponent(txtTioCatPrecio52, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat41, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel356, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel358)
                            .addComponent(txtTioCat37, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso37, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel287))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel288)
                            .addComponent(txtTioCatPrecio37, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat40, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel300, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel316)
                            .addComponent(txtTioCat53, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso53, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel317))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel321)
                            .addComponent(txtTioCatPrecio36, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat38, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel294, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel296)
                            .addComponent(txtTioCat39, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso38, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel297))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel299)
                            .addComponent(txtTioCatPrecio40, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat39, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel319, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel341)
                            .addComponent(txtTioCat48, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso49, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel326))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel324)
                            .addComponent(txtTioCatPrecio46, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat49, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel346, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel332)
                            .addComponent(txtTioCat44, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso44, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel334))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel322)
                            .addComponent(txtTioCatPrecio48, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat50, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel348, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel325)
                            .addComponent(txtTioCat45, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso45, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel327))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel328)
                            .addComponent(txtTioCatPrecio43, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat53, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel333, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel335)
                            .addComponent(txtTioCat47, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso47, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel336))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel337)
                            .addComponent(txtTioCatPrecio45, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat48, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel313, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel329)
                            .addComponent(txtTioCat46, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso46, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel330))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel331)
                            .addComponent(txtTioCatPrecio44, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat42, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel338, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel339)
                            .addComponent(txtTioCat49, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTioCatPeso48, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel340))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel342)
                            .addComponent(txtTioCatPrecio47, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTioCat46, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jTabbedPane9.addTab("Limpieza", jPanel44);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane9)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane9)
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
            .addComponent(jTabbedPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
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
            .addGap(0, 748, Short.MAX_VALUE)
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
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE))
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
    Cliente nuevoCliente = new Cliente(this);
    nuevoCliente.setId( this.generarID("cliente.json") + 1);
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

    private int generarID(String fileName){
        try {
        File archivoJSON = new File(fileName);
        JSONParser parser = new JSONParser();
        JSONArray array = (JSONArray) parser.parse(new FileReader(archivoJSON));
        int lastIndex = array.size()-1;        
        JSONObject ultimo_cliente = (JSONObject) array.get(lastIndex);
        //accesses the attributes of the last data in the table
        Long id = (Long) ultimo_cliente.get("id");
        return id.intValue(); 
        } catch (IOException | ParseException e) {
            return 1000;
        }
    };
    
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

    private void txtPrecioArrozblancokuskaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioArrozblancokuskaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioArrozblancokuskaActionPerformed

    private void txtCantoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantoActionPerformed

    private void txtCantoPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantoPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantoPesoActionPerformed

    private void txtExtructionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExtructionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExtructionActionPerformed

    private void txtExtructionPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExtructionPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExtructionPesoActionPerformed

    private void txtGatiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGatiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGatiActionPerformed

    private void txtGatiPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGatiPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGatiPesoActionPerformed

    private void txtCobayesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCobayesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCobayesActionPerformed

    private void txtCobayesPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCobayesPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCobayesPesoActionPerformed

    private void txtRedKriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRedKriteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRedKriteActionPerformed

    private void txtRedKritePesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRedKritePesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRedKritePesoActionPerformed

    private void txtSenGatPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenGatPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenGatPesoActionPerformed

    private void txtSenGatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenGatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenGatActionPerformed

    private void txtTioCatPeso6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso6ActionPerformed

    private void txtTioCat6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat6ActionPerformed

    private void txtTioCat7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat7ActionPerformed

    private void txtTioCatPeso7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso7ActionPerformed

    private void txtTioCat8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat8ActionPerformed

    private void txtTioCatPeso8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso8ActionPerformed

    private void txtTioCat9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat9ActionPerformed

    private void txtTioCatPeso9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso9ActionPerformed

    private void txtTioCat10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat10ActionPerformed

    private void txtTioCat11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat11ActionPerformed

    private void txtTioCatPeso10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso10ActionPerformed

    private void txtTioCatPeso11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso11ActionPerformed

    private void txtTioCatPeso12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso12ActionPerformed

    private void txtTioCat12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat12ActionPerformed

    private void txtTioCat13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat13ActionPerformed

    private void txtTioCatPeso13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso13ActionPerformed

    private void txtTioCat14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat14ActionPerformed

    private void txtTioCatPeso14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso14ActionPerformed

    private void txtTioCat15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat15ActionPerformed

    private void txtTioCatPeso15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso15ActionPerformed

    private void txtTioCat16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat16ActionPerformed

    private void txtTioCat17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat17ActionPerformed

    private void txtTioCatPeso16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso16ActionPerformed

    private void txtTioCatPeso17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso17ActionPerformed

    private void txtTioCatPeso18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso18ActionPerformed

    private void txtTioCat18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat18ActionPerformed

    private void txtTioCat19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat19ActionPerformed

    private void txtTioCatPeso19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso19ActionPerformed

    private void txtTioCat20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat20ActionPerformed

    private void txtTioCat21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat21ActionPerformed

    private void txtTioCat22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat22ActionPerformed

    private void txtTioCatPeso20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso20ActionPerformed

    private void txtTioCatPeso21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso21ActionPerformed

    private void txtTioCatPeso22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso22ActionPerformed

    private void txtTioCatPeso23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso23ActionPerformed

    private void txtTioCat23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat23ActionPerformed

    private void txtTioCat24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat24ActionPerformed

    private void txtTioCatPeso24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso24ActionPerformed

    private void txtTioCat25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat25ActionPerformed

    private void txtTioCatPeso25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso25ActionPerformed

    private void txtTioCatPeso26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso26ActionPerformed

    private void txtTioCat26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat26ActionPerformed

    private void txtTioCat27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat27ActionPerformed

    private void txtTioCatPeso27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso27ActionPerformed

    private void txtTioCat28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat28ActionPerformed

    private void txtTioCatPeso28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso28ActionPerformed

    private void txtTioCat29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat29ActionPerformed

    private void txtTioCatPeso29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso29ActionPerformed

    private void txtTioCat30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat30ActionPerformed

    private void txtTioCat31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat31ActionPerformed

    private void txtTioCatPeso30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso30ActionPerformed

    private void txtTioCatPeso31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso31ActionPerformed

    private void txtTioCat32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat32ActionPerformed

    private void txtTioCatPeso32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso32ActionPerformed

    private void txtTioCat33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat33ActionPerformed

    private void txtTioCatPeso33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso33ActionPerformed

    private void txtTioCat34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat34ActionPerformed

    private void txtTioCatPeso34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso34ActionPerformed

    private void txtTioCat35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat35ActionPerformed

    private void txtTioCatPeso35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso35ActionPerformed

    private void txtTioCatPeso36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso36ActionPerformed

    private void txtTioCat36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat36ActionPerformed

    private void txtTioCat37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat37ActionPerformed

    private void txtTioCatPeso37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso37ActionPerformed

    private void txtTioCat38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat38ActionPerformed

    private void txtTioCat39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat39ActionPerformed

    private void txtTioCat40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat40ActionPerformed

    private void txtTioCatPeso38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso38ActionPerformed

    private void txtTioCatPeso39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso39ActionPerformed

    private void txtTioCatPeso40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso40ActionPerformed

    private void txtTioCatPeso41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso41ActionPerformed

    private void txtTioCat41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat41ActionPerformed

    private void txtTioCat42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat42ActionPerformed

    private void txtTioCatPeso42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso42ActionPerformed

    private void txtTioCat43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat43ActionPerformed

    private void txtTioCatPeso43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso43ActionPerformed

    private void txtTioCatPeso44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso44ActionPerformed

    private void txtTioCat44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat44ActionPerformed

    private void txtTioCat45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat45ActionPerformed

    private void txtTioCatPeso45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso45ActionPerformed

    private void txtTioCat46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat46ActionPerformed

    private void txtTioCatPeso46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso46ActionPerformed

    private void txtTioCat47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat47ActionPerformed

    private void txtTioCatPeso47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso47ActionPerformed

    private void txtTioCat48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat48ActionPerformed

    private void txtTioCat49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat49ActionPerformed

    private void txtTioCatPeso48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso48ActionPerformed

    private void txtTioCatPeso49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso49ActionPerformed

    private void txtTioCat50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat50ActionPerformed

    private void txtTioCatPeso50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso50ActionPerformed

    private void txtTioCat51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat51ActionPerformed

    private void txtTioCatPeso51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso51ActionPerformed

    private void txtTioCat52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat52ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat52ActionPerformed

    private void txtTioCatPeso52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso52ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso52ActionPerformed

    private void txtTioCat53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCat53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCat53ActionPerformed

    private void txtTioCatPeso53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTioCatPeso53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTioCatPeso53ActionPerformed

    private void txtCepilloProCuidadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCepilloProCuidadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepilloProCuidadoActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void txtCepilloProCuidado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCepilloProCuidado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepilloProCuidado1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
    private javax.swing.JButton btnCanto;
    private javax.swing.JButton btnCobayes;
    private javax.swing.JButton btnComprarArrozblancokuska;
    private javax.swing.JButton btnEditarCarrito;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEditarProveedor;
    private javax.swing.JButton btnEliminarCarrito;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEliminarFacturacion;
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnExtruction;
    private javax.swing.JButton btnFinalizarCompra;
    private javax.swing.JButton btnGati;
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JButton btnGuardarProveedor;
    private javax.swing.JButton btnRedKrite;
    private javax.swing.JButton btnTioCat10;
    private javax.swing.JButton btnTioCat11;
    private javax.swing.JButton btnTioCat12;
    private javax.swing.JButton btnTioCat13;
    private javax.swing.JButton btnTioCat14;
    private javax.swing.JButton btnTioCat15;
    private javax.swing.JButton btnTioCat16;
    private javax.swing.JButton btnTioCat17;
    private javax.swing.JButton btnTioCat18;
    private javax.swing.JButton btnTioCat19;
    private javax.swing.JButton btnTioCat20;
    private javax.swing.JButton btnTioCat21;
    private javax.swing.JButton btnTioCat22;
    private javax.swing.JButton btnTioCat23;
    private javax.swing.JButton btnTioCat24;
    private javax.swing.JButton btnTioCat25;
    private javax.swing.JButton btnTioCat26;
    private javax.swing.JButton btnTioCat27;
    private javax.swing.JButton btnTioCat28;
    private javax.swing.JButton btnTioCat29;
    private javax.swing.JButton btnTioCat30;
    private javax.swing.JButton btnTioCat31;
    private javax.swing.JButton btnTioCat32;
    private javax.swing.JButton btnTioCat33;
    private javax.swing.JButton btnTioCat34;
    private javax.swing.JButton btnTioCat35;
    private javax.swing.JButton btnTioCat36;
    private javax.swing.JButton btnTioCat37;
    private javax.swing.JButton btnTioCat38;
    private javax.swing.JButton btnTioCat39;
    private javax.swing.JButton btnTioCat40;
    private javax.swing.JButton btnTioCat41;
    private javax.swing.JButton btnTioCat42;
    private javax.swing.JButton btnTioCat43;
    private javax.swing.JButton btnTioCat44;
    private javax.swing.JButton btnTioCat45;
    private javax.swing.JButton btnTioCat46;
    private javax.swing.JButton btnTioCat47;
    private javax.swing.JButton btnTioCat48;
    private javax.swing.JButton btnTioCat49;
    private javax.swing.JButton btnTioCat50;
    private javax.swing.JButton btnTioCat51;
    private javax.swing.JButton btnTioCat52;
    private javax.swing.JButton btnTioCat53;
    private javax.swing.JButton btnTioCat6;
    private javax.swing.JButton btnTioCat7;
    private javax.swing.JButton btnTioCat8;
    private javax.swing.JButton btnTioCat9;
    private javax.swing.JButton btntSenGat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel229;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel230;
    private javax.swing.JLabel jLabel231;
    private javax.swing.JLabel jLabel232;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel240;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel jLabel243;
    private javax.swing.JLabel jLabel244;
    private javax.swing.JLabel jLabel245;
    private javax.swing.JLabel jLabel246;
    private javax.swing.JLabel jLabel247;
    private javax.swing.JLabel jLabel248;
    private javax.swing.JLabel jLabel249;
    private javax.swing.JLabel jLabel250;
    private javax.swing.JLabel jLabel251;
    private javax.swing.JLabel jLabel252;
    private javax.swing.JLabel jLabel253;
    private javax.swing.JLabel jLabel254;
    private javax.swing.JLabel jLabel255;
    private javax.swing.JLabel jLabel256;
    private javax.swing.JLabel jLabel257;
    private javax.swing.JLabel jLabel258;
    private javax.swing.JLabel jLabel259;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel260;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel263;
    private javax.swing.JLabel jLabel264;
    private javax.swing.JLabel jLabel265;
    private javax.swing.JLabel jLabel266;
    private javax.swing.JLabel jLabel267;
    private javax.swing.JLabel jLabel268;
    private javax.swing.JLabel jLabel269;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel270;
    private javax.swing.JLabel jLabel271;
    private javax.swing.JLabel jLabel272;
    private javax.swing.JLabel jLabel273;
    private javax.swing.JLabel jLabel274;
    private javax.swing.JLabel jLabel275;
    private javax.swing.JLabel jLabel276;
    private javax.swing.JLabel jLabel277;
    private javax.swing.JLabel jLabel278;
    private javax.swing.JLabel jLabel279;
    private javax.swing.JLabel jLabel280;
    private javax.swing.JLabel jLabel281;
    private javax.swing.JLabel jLabel282;
    private javax.swing.JLabel jLabel283;
    private javax.swing.JLabel jLabel284;
    private javax.swing.JLabel jLabel285;
    private javax.swing.JLabel jLabel286;
    private javax.swing.JLabel jLabel287;
    private javax.swing.JLabel jLabel288;
    private javax.swing.JLabel jLabel289;
    private javax.swing.JLabel jLabel290;
    private javax.swing.JLabel jLabel291;
    private javax.swing.JLabel jLabel292;
    private javax.swing.JLabel jLabel293;
    private javax.swing.JLabel jLabel294;
    private javax.swing.JLabel jLabel295;
    private javax.swing.JLabel jLabel296;
    private javax.swing.JLabel jLabel297;
    private javax.swing.JLabel jLabel298;
    private javax.swing.JLabel jLabel299;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel300;
    private javax.swing.JLabel jLabel301;
    private javax.swing.JLabel jLabel302;
    private javax.swing.JLabel jLabel303;
    private javax.swing.JLabel jLabel304;
    private javax.swing.JLabel jLabel305;
    private javax.swing.JLabel jLabel306;
    private javax.swing.JLabel jLabel307;
    private javax.swing.JLabel jLabel308;
    private javax.swing.JLabel jLabel309;
    private javax.swing.JLabel jLabel310;
    private javax.swing.JLabel jLabel311;
    private javax.swing.JLabel jLabel312;
    private javax.swing.JLabel jLabel313;
    private javax.swing.JLabel jLabel314;
    private javax.swing.JLabel jLabel315;
    private javax.swing.JLabel jLabel316;
    private javax.swing.JLabel jLabel317;
    private javax.swing.JLabel jLabel318;
    private javax.swing.JLabel jLabel319;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel320;
    private javax.swing.JLabel jLabel321;
    private javax.swing.JLabel jLabel322;
    private javax.swing.JLabel jLabel323;
    private javax.swing.JLabel jLabel324;
    private javax.swing.JLabel jLabel325;
    private javax.swing.JLabel jLabel326;
    private javax.swing.JLabel jLabel327;
    private javax.swing.JLabel jLabel328;
    private javax.swing.JLabel jLabel329;
    private javax.swing.JLabel jLabel330;
    private javax.swing.JLabel jLabel331;
    private javax.swing.JLabel jLabel332;
    private javax.swing.JLabel jLabel333;
    private javax.swing.JLabel jLabel334;
    private javax.swing.JLabel jLabel335;
    private javax.swing.JLabel jLabel336;
    private javax.swing.JLabel jLabel337;
    private javax.swing.JLabel jLabel338;
    private javax.swing.JLabel jLabel339;
    private javax.swing.JLabel jLabel340;
    private javax.swing.JLabel jLabel341;
    private javax.swing.JLabel jLabel342;
    private javax.swing.JLabel jLabel343;
    private javax.swing.JLabel jLabel344;
    private javax.swing.JLabel jLabel345;
    private javax.swing.JLabel jLabel346;
    private javax.swing.JLabel jLabel347;
    private javax.swing.JLabel jLabel348;
    private javax.swing.JLabel jLabel349;
    private javax.swing.JLabel jLabel350;
    private javax.swing.JLabel jLabel351;
    private javax.swing.JLabel jLabel352;
    private javax.swing.JLabel jLabel353;
    private javax.swing.JLabel jLabel354;
    private javax.swing.JLabel jLabel355;
    private javax.swing.JLabel jLabel356;
    private javax.swing.JLabel jLabel357;
    private javax.swing.JLabel jLabel358;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
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
    private javax.swing.JLabel lblPesoArrozblancokuska;
    private javax.swing.JLabel lblPrecioArrozblancokuska;
    private javax.swing.JLabel lblProductoArrozblancokuska;
    private javax.swing.JTable tblCarrito;
    private javax.swing.JTable tblCarritoCompras;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTable tblProveedores;
    private javax.swing.JTextField txt1ApellidoCliente;
    private javax.swing.JTextField txt2ApellidoCliente;
    private javax.swing.JTextField txtCanto;
    private javax.swing.JTextField txtCantoPeso;
    private javax.swing.JTextField txtCantoPrecio;
    private javax.swing.JTextField txtCedulaCliente;
    private javax.swing.JTextField txtCedulaProveedor;
    private javax.swing.JTextField txtCepilloProCuidado;
    private javax.swing.JTextField txtCepilloProCuidado1;
    private javax.swing.JTextField txtCobayes;
    private javax.swing.JTextField txtCobayesPeso;
    private javax.swing.JTextField txtCobayesPrecio;
    private javax.swing.JTextField txtCorreoCliente;
    private javax.swing.JTextField txtCorreoProveedor;
    private javax.swing.JTextField txtEnvio;
    private javax.swing.JTextField txtExtruction;
    private javax.swing.JTextField txtExtructionPeso;
    private javax.swing.JTextField txtExtructionPrecio;
    private javax.swing.JTextField txtGati;
    private javax.swing.JTextField txtGatiPeso;
    private javax.swing.JTextField txtGatiPrecio;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtPesoArrozblancokuska;
    private javax.swing.JTextField txtPrecioArrozblancokuska;
    private javax.swing.JTextField txtProductoArrozblancokuska;
    private javax.swing.JTextField txtRedKrite;
    private javax.swing.JTextField txtRedKritePeso;
    private javax.swing.JTextField txtRedKritePrecio;
    private javax.swing.JTextField txtSenGat;
    private javax.swing.JTextField txtSenGatPeso;
    private javax.swing.JTextField txtSenGatPrecio;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTelefonoCliente;
    private javax.swing.JTextField txtTelefonoProveedor;
    private javax.swing.JTextField txtTioCat10;
    private javax.swing.JTextField txtTioCat11;
    private javax.swing.JTextField txtTioCat12;
    private javax.swing.JTextField txtTioCat13;
    private javax.swing.JTextField txtTioCat14;
    private javax.swing.JTextField txtTioCat15;
    private javax.swing.JTextField txtTioCat16;
    private javax.swing.JTextField txtTioCat17;
    private javax.swing.JTextField txtTioCat18;
    private javax.swing.JTextField txtTioCat19;
    private javax.swing.JTextField txtTioCat20;
    private javax.swing.JTextField txtTioCat21;
    private javax.swing.JTextField txtTioCat22;
    private javax.swing.JTextField txtTioCat23;
    private javax.swing.JTextField txtTioCat24;
    private javax.swing.JTextField txtTioCat25;
    private javax.swing.JTextField txtTioCat26;
    private javax.swing.JTextField txtTioCat27;
    private javax.swing.JTextField txtTioCat28;
    private javax.swing.JTextField txtTioCat29;
    private javax.swing.JTextField txtTioCat30;
    private javax.swing.JTextField txtTioCat31;
    private javax.swing.JTextField txtTioCat32;
    private javax.swing.JTextField txtTioCat33;
    private javax.swing.JTextField txtTioCat34;
    private javax.swing.JTextField txtTioCat35;
    private javax.swing.JTextField txtTioCat36;
    private javax.swing.JTextField txtTioCat37;
    private javax.swing.JTextField txtTioCat38;
    private javax.swing.JTextField txtTioCat39;
    private javax.swing.JTextField txtTioCat40;
    private javax.swing.JTextField txtTioCat41;
    private javax.swing.JTextField txtTioCat42;
    private javax.swing.JTextField txtTioCat43;
    private javax.swing.JTextField txtTioCat44;
    private javax.swing.JTextField txtTioCat45;
    private javax.swing.JTextField txtTioCat46;
    private javax.swing.JTextField txtTioCat47;
    private javax.swing.JTextField txtTioCat48;
    private javax.swing.JTextField txtTioCat49;
    private javax.swing.JTextField txtTioCat50;
    private javax.swing.JTextField txtTioCat51;
    private javax.swing.JTextField txtTioCat52;
    private javax.swing.JTextField txtTioCat53;
    private javax.swing.JTextField txtTioCat6;
    private javax.swing.JTextField txtTioCat7;
    private javax.swing.JTextField txtTioCat8;
    private javax.swing.JTextField txtTioCat9;
    private javax.swing.JTextField txtTioCatPeso10;
    private javax.swing.JTextField txtTioCatPeso11;
    private javax.swing.JTextField txtTioCatPeso12;
    private javax.swing.JTextField txtTioCatPeso13;
    private javax.swing.JTextField txtTioCatPeso14;
    private javax.swing.JTextField txtTioCatPeso15;
    private javax.swing.JTextField txtTioCatPeso16;
    private javax.swing.JTextField txtTioCatPeso17;
    private javax.swing.JTextField txtTioCatPeso18;
    private javax.swing.JTextField txtTioCatPeso19;
    private javax.swing.JTextField txtTioCatPeso20;
    private javax.swing.JTextField txtTioCatPeso21;
    private javax.swing.JTextField txtTioCatPeso22;
    private javax.swing.JTextField txtTioCatPeso23;
    private javax.swing.JTextField txtTioCatPeso24;
    private javax.swing.JTextField txtTioCatPeso25;
    private javax.swing.JTextField txtTioCatPeso26;
    private javax.swing.JTextField txtTioCatPeso27;
    private javax.swing.JTextField txtTioCatPeso28;
    private javax.swing.JTextField txtTioCatPeso29;
    private javax.swing.JTextField txtTioCatPeso30;
    private javax.swing.JTextField txtTioCatPeso31;
    private javax.swing.JTextField txtTioCatPeso32;
    private javax.swing.JTextField txtTioCatPeso33;
    private javax.swing.JTextField txtTioCatPeso34;
    private javax.swing.JTextField txtTioCatPeso35;
    private javax.swing.JTextField txtTioCatPeso36;
    private javax.swing.JTextField txtTioCatPeso37;
    private javax.swing.JTextField txtTioCatPeso38;
    private javax.swing.JTextField txtTioCatPeso39;
    private javax.swing.JTextField txtTioCatPeso40;
    private javax.swing.JTextField txtTioCatPeso41;
    private javax.swing.JTextField txtTioCatPeso42;
    private javax.swing.JTextField txtTioCatPeso43;
    private javax.swing.JTextField txtTioCatPeso44;
    private javax.swing.JTextField txtTioCatPeso45;
    private javax.swing.JTextField txtTioCatPeso46;
    private javax.swing.JTextField txtTioCatPeso47;
    private javax.swing.JTextField txtTioCatPeso48;
    private javax.swing.JTextField txtTioCatPeso49;
    private javax.swing.JTextField txtTioCatPeso50;
    private javax.swing.JTextField txtTioCatPeso51;
    private javax.swing.JTextField txtTioCatPeso52;
    private javax.swing.JTextField txtTioCatPeso53;
    private javax.swing.JTextField txtTioCatPeso6;
    private javax.swing.JTextField txtTioCatPeso7;
    private javax.swing.JTextField txtTioCatPeso8;
    private javax.swing.JTextField txtTioCatPeso9;
    private javax.swing.JTextField txtTioCatPrecio10;
    private javax.swing.JTextField txtTioCatPrecio11;
    private javax.swing.JTextField txtTioCatPrecio12;
    private javax.swing.JTextField txtTioCatPrecio13;
    private javax.swing.JTextField txtTioCatPrecio14;
    private javax.swing.JTextField txtTioCatPrecio15;
    private javax.swing.JTextField txtTioCatPrecio16;
    private javax.swing.JTextField txtTioCatPrecio17;
    private javax.swing.JTextField txtTioCatPrecio18;
    private javax.swing.JTextField txtTioCatPrecio19;
    private javax.swing.JTextField txtTioCatPrecio20;
    private javax.swing.JTextField txtTioCatPrecio21;
    private javax.swing.JTextField txtTioCatPrecio22;
    private javax.swing.JTextField txtTioCatPrecio23;
    private javax.swing.JTextField txtTioCatPrecio24;
    private javax.swing.JTextField txtTioCatPrecio25;
    private javax.swing.JTextField txtTioCatPrecio26;
    private javax.swing.JTextField txtTioCatPrecio27;
    private javax.swing.JTextField txtTioCatPrecio28;
    private javax.swing.JTextField txtTioCatPrecio29;
    private javax.swing.JTextField txtTioCatPrecio30;
    private javax.swing.JTextField txtTioCatPrecio31;
    private javax.swing.JTextField txtTioCatPrecio32;
    private javax.swing.JTextField txtTioCatPrecio33;
    private javax.swing.JTextField txtTioCatPrecio34;
    private javax.swing.JTextField txtTioCatPrecio35;
    private javax.swing.JTextField txtTioCatPrecio36;
    private javax.swing.JTextField txtTioCatPrecio37;
    private javax.swing.JTextField txtTioCatPrecio38;
    private javax.swing.JTextField txtTioCatPrecio39;
    private javax.swing.JTextField txtTioCatPrecio40;
    private javax.swing.JTextField txtTioCatPrecio41;
    private javax.swing.JTextField txtTioCatPrecio42;
    private javax.swing.JTextField txtTioCatPrecio43;
    private javax.swing.JTextField txtTioCatPrecio44;
    private javax.swing.JTextField txtTioCatPrecio45;
    private javax.swing.JTextField txtTioCatPrecio46;
    private javax.swing.JTextField txtTioCatPrecio47;
    private javax.swing.JTextField txtTioCatPrecio48;
    private javax.swing.JTextField txtTioCatPrecio49;
    private javax.swing.JTextField txtTioCatPrecio50;
    private javax.swing.JTextField txtTioCatPrecio51;
    private javax.swing.JTextField txtTioCatPrecio52;
    private javax.swing.JTextField txtTioCatPrecio53;
    private javax.swing.JTextField txtTioCatPrecio6;
    private javax.swing.JTextField txtTioCatPrecio7;
    private javax.swing.JTextField txtTioCatPrecio8;
    private javax.swing.JTextField txtTioCatPrecio9;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
