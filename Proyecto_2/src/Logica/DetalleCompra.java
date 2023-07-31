
package Logica;
import Logica.*;


public class DetalleCompra {
    private int Id_DetalleCompra;
    private int cantidad;
    private double monto;

    public DetalleCompra(int Id_DetalleCompra, int cantidad, double monto) {
        this.Id_DetalleCompra = Id_DetalleCompra;
        this.cantidad = cantidad;
        this.monto = monto;
    }

    public int getId_DetalleCompra() {
        return Id_DetalleCompra;
    }

    public void setId_DetalleCompra(int Id_DetalleCompra) {
        this.Id_DetalleCompra = Id_DetalleCompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
}
