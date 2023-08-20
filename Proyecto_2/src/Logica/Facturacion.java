package Logica;

import GUI.*;
import javax.swing.*;
import javax.swing.table.*;

public class Facturacion {

    private String nombre;
    private String peso;
    private int cantidad;
    private double precio;
    private double subTotal;
    private StringBuilder FacturaProducto = new StringBuilder();
    private Usuario usuario;

    public Facturacion(Usuario usuario) {
        this.usuario = usuario;
    }

    public Facturacion(String nombre, String peso, int cantidad, double precio, double subTotal) {
        this.nombre = nombre;
        this.peso = peso;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subTotal = subTotal;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the peso
     */
    public String getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(String peso) {
        this.peso = peso;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the subTotal
     */
    public double getSubTotal() {
        return subTotal;
    }

    /**
     * @param subTotal the subTotal to set
     */
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    /**
     * @return the FacturaProducto
     */
    public StringBuilder getFacturaProducto() {
        return FacturaProducto;
    }

    /**
     * @param FacturaProducto the FacturaProducto to set
     */
    public void setFacturaProducto(StringBuilder FacturaProducto) {
        this.FacturaProducto = FacturaProducto;
    }

    public void Facturar(JTable tabla, JTextArea Area) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        this.TituloFactura(Area);
        int filas = modelo.getRowCount();
        for (int i = 0; i < filas; i++) {
            nombre = (String) modelo.getValueAt(i, 0);
            peso = (String) modelo.getValueAt(i, 1);
            cantidad = (int) modelo.getValueAt(i, 2);
            precio = (double) modelo.getValueAt(i, 3);
            subTotal += +precio;
            this.AñadirStringB();
        }
        this.Calculos();
        Area.append(FacturaProducto.toString());

    }

    public void AñadirStringB() {
        FacturaProducto.append(nombre).append("\t  ");
        FacturaProducto.append("Peso:" + peso).append("\t\t");
        FacturaProducto.append("Cant:" + cantidad).append("\t");
        FacturaProducto.append(precio).append("\n");
    }

    public void TituloFactura(JTextArea Area) {
        String Mostrar = "";
        Mostrar = "Factura:\n"
                + "Nombre Cliente:\n"
                + "____________________________________________________________________________________________________________\n"
                + "Articulo\t\t \n"
                + "____________________________________________________________________________________________________________\n";
        Area.append(Mostrar);
    }

    public void Calculos() {
        FacturaProducto.append("_________________________________________________________________________________________________________________\n");
        FacturaProducto.append("                                                                                     Subtotal\t").append(subTotal).append("\n");
        FacturaProducto.append("                                                                                     Impuesto\t").append(subTotal / 15).append("\n");
        FacturaProducto.append("                                                                                     Total\t").append(subTotal + (subTotal / 15));
    }

}
