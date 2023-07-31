
package Logica;
import Logica.*;

public class Producto {
  private int  idProducto;
  private String nombre;
  private  double precio;
  private String precentecion;
  private int idProveedor;
  private int idCategoria;
  private int idMarca;

    public Producto(int idProducto, String nombre, double precio, String precentecion, int idProveedor, int idCategoria, int idMarca) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.precentecion = precentecion;
        this.idProveedor = idProveedor;
        this.idCategoria = idCategoria;
        this.idMarca = idMarca;
    }

    /**
     * @return the idProducto
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
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
     * @return the precentecion
     */
    public String getPrecentecion() {
        return precentecion;
    }

    /**
     * @param precentecion the precentecion to set
     */
    public void setPrecentecion(String precentecion) {
        this.precentecion = precentecion;
    }

    /**
     * @return the idProveedor
     */
    public int getIdProveedor() {
        return idProveedor;
    }

    /**
     * @param idProveedor the idProveedor to set
     */
    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    /**
     * @return the idCategoria
     */
    public int getIdCategoria() {
        return idCategoria;
    }

    /**
     * @param idCategoria the idCategoria to set
     */
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    /**
     * @return the idMarca
     */
    public int getIdMarca() {
        return idMarca;
    }

    /**
     * @param idMarca the idMarca to set
     */
    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }
  
        
    
}
