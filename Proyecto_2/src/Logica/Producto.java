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

    /**
     * @return the idProducto
     */
    public String getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto() {
        this.idProducto = idProducto;
    }

    /**
     * @return the idProveedor
     */
    public String getIdProveedor() {
        return idProveedor;
    }

    /**
     * @param idProveedor the idProveedor to set
     */
    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    /**
     * @return the idCategoria
     */
    public String getIdCategoria() {
        return idCategoria;
    }

    /**
     * @param idCategoria the idCategoria to set
     */
    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    /**
     * @return the idMarca
     */
    public String getIdMarca() {
        return idMarca;
    }

    /**
     * @param idMarca the idMarca to set
     */
    public void setIdMarca(String idMarca) {
        this.idMarca = idMarca;
    }

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

            // Obtener el nuevo ID usando el IdManager
            String nuevoId = String.valueOf(IDManager.getNextId());

            JSONObject productoJSON = new JSONObject();
            productoJSON.put("id", nuevoId); // Usar el nuevo ID
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

                // Eliminar los productos encontrados
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
                    break; // El producto ha sido encontrado y editado, no necesitamos seguir buscando
                }
            }

            try (FileWriter fileWriter = new FileWriter("productos.json")) {
                fileWriter.write(jsonObject.toJSONString());
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

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

    //Este metodo pronto se borrará
    public static void ActualizarID() {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("C:/Users/Bravo/Documents/Programing_Proyect_II/Proyecto_2/productos.json"));
            JSONObject jsonObject = (JSONObject) obj;
            int contadorID = 1;
            for (Object categoriaKey : jsonObject.keySet()) {
                JSONArray productosArray = (JSONArray) jsonObject.get(categoriaKey);
                for (int j = 0; j < productosArray.size(); j++) {
                    JSONObject producto = (JSONObject) productosArray.get(j);
                    producto.put("id", String.valueOf(contadorID));
                    contadorID++;
                }
            }
            FileWriter fileWriter = new FileWriter("C:/Users/Bravo/Documents/Programing_Proyect_II/Proyecto_2/productos.json");
            fileWriter.write(jsonObject.toJSONString());
            fileWriter.close();
            System.out.println("IDs actualizados y guardados en el archivo.");
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
