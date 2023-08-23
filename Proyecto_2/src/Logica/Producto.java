package Logica;

import GUI.*;
import java.io.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import org.json.simple.*;
import org.json.simple.parser.*;

public class Producto {

    private String idProducto;
    private String nombre;
    private double precio;
    private String idProveedor;
    private String idCategoria;
    private String idMarca;
    private String peso;
    private String imagen;
    private Administrador tico;

    public Producto(Administrador tico) {
        this.tico = tico;
    }

    public Producto(String idProducto, String nombre, double precio, String idProveedor, String idCategoria, String idMarca, String peso, String imagen) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.idProveedor = idProveedor;
        this.idCategoria = idCategoria;
        this.idMarca = idMarca;
        this.peso = peso;
        this.imagen = imagen;
    }

    public Producto(String nombre, double precio, String peso, String imagen) {
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto() {
        this.idProducto = idProducto;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(String idMarca) {
        this.idMarca = idMarca;
    }
    
    /*here we need to go through the json and create an array of subcategories where if we assign null subcategories
    it will create a json object with the corresponding values and with ID manager we generate an id and assign 
    the values that the json needs.*/
    public void guardarProducto(String subcategoria, String nombre, double precio, String peso, String idProveedor, String idCategoria, String idMarca) {
        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject;

            try (FileReader reader = new FileReader("productos.json")) {
                jsonObject = (JSONObject) parser.parse(reader);
            }

            JSONArray subcategoriaArray = (JSONArray) jsonObject.get(subcategoria);
            if (subcategoriaArray == null) {
                subcategoriaArray = new JSONArray();
                jsonObject.put(subcategoria, subcategoriaArray);
            }

            // Get the new Id using the manager Id
            String nuevoId = String.valueOf(IDManager.getNextId());

            JSONObject productoJSON = new JSONObject();
            productoJSON.put("id", nuevoId); // Use the new ID
            productoJSON.put("nombre", nombre);
            productoJSON.put("precio", precio);
            productoJSON.put("peso", peso);
            productoJSON.put("id_proveedor", idProveedor);
            productoJSON.put("id_categoria", idCategoria);
            productoJSON.put("id_marca", idMarca);

            subcategoriaArray.add(productoJSON);

            try (FileWriter fileWriter = new FileWriter("productos.json")) {
                fileWriter.write(jsonObject.toJSONString());
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
    
    /*in this method we will need to open the json file, we read it through an array, we verify 
    and if it is it receives the values to update them inside the json.*/
    public void actualizarTabla(DefaultTableModel modeloTabla, String subcategoria) {
        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject;

            try (FileReader reader = new FileReader("productos.json")) {
                jsonObject = (JSONObject) parser.parse(reader);
            }

            JSONArray subcategoriaArray = (JSONArray) jsonObject.get(subcategoria);
            if (subcategoriaArray != null) {
                modeloTabla.setRowCount(0);

                for (Object obj : subcategoriaArray) {
                    JSONObject productoJSON = (JSONObject) obj;
                    String id = productoJSON.get("id").toString();
                    String Nombre = productoJSON.get("nombre").toString();
                    double Precio = Double.parseDouble(productoJSON.get("precio").toString());
                    String Peso = productoJSON.get("peso").toString();
                    String id_proveedor = productoJSON.get("id_proveedor").toString();
                    String id_categoria = productoJSON.get("id_categoria").toString();
                    String id_marca = productoJSON.get("id_marca").toString();

                    modeloTabla.addRow(new Object[]{id, Nombre, Precio, Peso, id_proveedor, id_categoria, id_marca});
                }
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
    
    /*we read the json, we make an array that will get the subcategory and if this array is different
    than null it will create a list to get the indexes, then create another variable that will get
    the id of the product and then compare them and add the deleted id, also we use the array.remove to delete the product.*/
    public void eliminarProducto(String subcategoria, String idProductoAEliminar) {
        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject;

            try (FileReader reader = new FileReader("productos.json")) {
                jsonObject = (JSONObject) parser.parse(reader);
            }

            JSONArray subcategoriaArray = (JSONArray) jsonObject.get(subcategoria);
            if (subcategoriaArray != null) {
                List<Integer> indicesAEliminar = new ArrayList<>();
                for (int i = 0; i < subcategoriaArray.size(); i++) {
                    JSONObject productoJSON = (JSONObject) subcategoriaArray.get(i);
                    String productoId = productoJSON.get("id").toString();
                    if (productoId.equals(idProductoAEliminar)) {
                        indicesAEliminar.add(i);
                    }
                }

                // Delete found products 
                for (int i : indicesAEliminar) {
                    subcategoriaArray.remove(i);
                }
                try (FileWriter fileWriter = new FileWriter("productos.json")) {
                    fileWriter.write(jsonObject.toJSONString());
                }
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
    /*to edit the product it will be necessary to read the json, create a json array that goes through it and a json object
    that stores it and obtains the id, then with an if we will verify if the product when editing is not empty with an empty
    it verifies it and if so it will put the new values in the json. */
    public void editarProducto(String subcategoria, String idProducto, String nombre, double precio, String peso, String idProveedor, String idCategoria, String idMarca) {
        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject;

            try (FileReader reader = new FileReader("productos.json")) {
                jsonObject = (JSONObject) parser.parse(reader);
            }

            JSONArray subcategoriaArray = (JSONArray) jsonObject.get(subcategoria);
            for (int i = 0; i < subcategoriaArray.size(); i++) {
                JSONObject productoJSON = (JSONObject) subcategoriaArray.get(i);
                String productoId = productoJSON.get("id").toString();
                if (productoId.equals(idProducto)) {
                    if (!nombre.isEmpty()) {
                        productoJSON.put("nombre", nombre);
                    }
                    if (precio > 0) {
                        productoJSON.put("precio", precio);
                    }
                    if (!peso.isEmpty()) {
                        productoJSON.put("peso", peso);
                    }
                    if (!idProveedor.isEmpty()) {
                        productoJSON.put("id_proveedor", idProveedor);
                    }
                    if (!idCategoria.isEmpty()) {
                        productoJSON.put("id_categoria", idCategoria);
                    }
                    if (!idMarca.isEmpty()) {
                        productoJSON.put("id_marca", idMarca);
                    }
                    break; //The product has been found and edited, we don't need to keep looking 
                }
            }
            try (FileWriter fileWriter = new FileWriter("productos.json")) {
                fileWriter.write(jsonObject.toJSONString());
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
    
    //this method will search that the product dont repeat it
    public int productoExistente(DefaultTableModel model, String nombre) {
        int rowCount = model.getRowCount();

        for (int row = 0; row < rowCount; row++) {
            String nombreExistente = (String) model.getValueAt(row, 0);
            if (nombreExistente.equals(nombre)) {
                return row;
            }
        }
        return -1;
    }
}
