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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public StringBuilder getFacturaProducto() {
        return FacturaProducto;
    }

    public void setFacturaProducto(StringBuilder FacturaProducto) {
        this.FacturaProducto = FacturaProducto;
    }

    /*we call the InvoiceTitle method to create add a title to the invoice, we get the number of rows and start the for loop
    to run through the table and get the required values*/
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
//Add product information to StrinBuilder 

    public void AñadirStringB() {
        FacturaProducto.append(nombre).append("\t  ");
        FacturaProducto.append("Peso:" + peso).append("\t\t");
        FacturaProducto.append("Cant:" + cantidad).append("\t");
        FacturaProducto.append(precio).append("\n");
    }
// we design the invoice format 

    public void TituloFactura(JTextArea Area) {
        String Mostrar = "";
        Mostrar = "Factura:\n"
                + "Nombre Cliente:\n"
                + "____________________________________________________________________________________________________________\n"
                + "Articulo\t\t \n"
                + "____________________________________________________________________________________________________________\n";
        Area.append(Mostrar);
    }
//Part of the design to invoide

    public void Calculos() {
        FacturaProducto.append("_________________________________________________________________________________________________________________\n");
        FacturaProducto.append("                                                                                     Subtotal\t").append(subTotal).append("\n");
        FacturaProducto.append("                                                                                     Impuesto\t").append(subTotal / 15).append("\n");
        FacturaProducto.append("                                                                                     Total\t").append(subTotal + (subTotal / 15));
    }

    //we select the row and with the opcion "remove" we can delete anything inside
    public void eliminarFila(JTable tabla) {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        int eliminar = tabla.getSelectedRow();
        model.removeRow(eliminar);
    }

}
