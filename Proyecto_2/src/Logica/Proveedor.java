package Logica;

import GUI.Administrador;
import GUI.Usuario;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Cristopher Matus
 */
public class Proveedor {

    private int id;
    private String cedulaJuridica;
    private String nombre;
    private String telefono;
    private String correo;
    private Administrador tico;

    public Proveedor(Administrador tico) {
        this.tico = tico;
    }

    // Constructor
    public Proveedor(int id, String cedulaJuridica, String nombre, String telefono, String correo) {
        this.id = id;
        this.cedulaJuridica = cedulaJuridica;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    // Getters and Setters (Opcional, pero recomendado)
    public int getId() { //Devuelve el valor actual del atributo id.
        return id;
    }

    public void setId(int id) { //Establece el valor del atributo id con el valor pasado como argumento.
        this.id = id;
    }

    public String getCedulaJuridica() { // Devuelve el valor actual del atributo cedulaJuridica.
        return cedulaJuridica;
    }

    public void setCedulaJuridica(String cedulaJuridica) { //Establece el valor del atributo cedulaJuridica con el valor pasado como argumento.
        this.cedulaJuridica = cedulaJuridica;
    }

    public String getNombre() { //Devuelve el valor actual del atributo nombre
        return nombre;
    }

    public void setNombre(String nombre) { //Establece el valor del atributo nombre con el valor pasado como argumento.
        this.nombre = nombre;
    }

    public String getTelefono() { // Devuelve el valor actual del atributo telefono.
        return telefono;
    }

    public void setTelefono(String telefono) { //Establece el valor del atributo telefono con el valor pasado como argumento.
        this.telefono = telefono;
    }

    public String getCorreo() {// Devuelve el valor actual del atributo correo.
        return correo;
    }

    public void setCorreo(String correo) { //Establece el valor del atributo correo con el valor pasado como argumento.
        this.correo = correo;
    }

    // Method to save a supplier in the customers JSON file
    public void guardarProveedor() {
        try {
            // Check if the JSON file exists, if not, create a new one
            File archivoJSON = new File("proveedor.json");

            // Read the JSON file from clients
            JSONParser parser = new JSONParser();
            JSONArray proveedorArray = (JSONArray) parser.parse(new FileReader(archivoJSON));
            // Check if the supplier with the same ID already exists in the file
            for (Object obj : proveedorArray) {
                JSONObject proveedorJSON = (JSONObject) obj;
                String cedulaProveedor = proveedorJSON.get("cedula").toString();
                if (cedulaProveedor.equals(cedulaJuridica)) {
                    System.out.println("Ya existe un cliente con la cédula " + cedulaJuridica);
                    return; // Exit the method without adding the duplicate customer
                }
            }
            // Create the JSON object of the new supplier
            JSONObject proveedorJSON = new JSONObject();
            proveedorJSON.put("id", id);
            proveedorJSON.put("cedula", cedulaJuridica);
            proveedorJSON.put("nombre", nombre);
            proveedorJSON.put("telefono", telefono);
            proveedorJSON.put("correo", correo);
            // Add the new supplier to the customers array
            proveedorArray.add(proveedorJSON);
            // Write the updated array of supplier to the supplier JSON file
            FileWriter fileWriter = new FileWriter("proveedor.json");
            fileWriter.write(proveedorArray.toJSONString());
            fileWriter.flush();
            fileWriter.close();
            tico.actualizarTablaProveedor();
            // Exception handling in case of error reading the JSON file or parsing its content.
        } catch (IOException | ParseException e) {
            e.printStackTrace();// Print the exception trace for debugging.
        }
    }

    public void actualizarTabla(DefaultTableModel modeloTabla) {
        try {
            // Read the JSON file from supplier
            JSONParser parser = new JSONParser();
            JSONArray proveedorArray = (JSONArray) parser.parse(new FileReader("proveedor.json"));
            // Clear the table before adding the new data
            modeloTabla.setRowCount(0);

            // Add the supplier to the table model
            for (Object obj : proveedorArray) {
                JSONObject proveedorJSON = (JSONObject) obj;
                int Id = Integer.parseInt(proveedorJSON.get("id").toString());
                String Cedula = proveedorJSON.get("cedula") != null ? proveedorJSON.get("cedula").toString() : "";
                String Nombre = proveedorJSON.get("nombre") != null ? proveedorJSON.get("nombre").toString() : "";
                String Telefono = proveedorJSON.get("telefono") != null ? proveedorJSON.get("telefono").toString() : "";
                String Correo = proveedorJSON.get("correo") != null ? proveedorJSON.get("correo").toString() : "";
                modeloTabla.addRow(new Object[]{Id, Cedula, Nombre, Telefono, Correo});
            }
            // Exception handling in case of error reading the JSON file or parsing its content
        } catch (IOException | ParseException e) {
            e.printStackTrace();// Print the exception trace for debugging.
        }
    }

    public void editar_Proveedor(int id, String cedula, String nombre, String telefono, String correo) {
        try {
            JSONParser parser = new JSONParser();
            JSONArray clientesArray = (JSONArray) parser.parse(new FileReader("proveedor.json"));
            boolean clienteEncontrado = false;
            for (Object obj : clientesArray) {
                JSONObject clienteJSON = (JSONObject) obj;
                int clienteId = Integer.parseInt(clienteJSON.get("id").toString());
                if (clienteId == id) {
                    if (!cedula.isEmpty()) {
                        clienteJSON.put("cedula", cedula);
                    }
                    if (!nombre.isEmpty()) {
                        clienteJSON.put("nombre", nombre);
                    }

                    if (!telefono.isEmpty()) {
                        clienteJSON.put("telefono", telefono);
                    }
                    if (!correo.isEmpty()) {
                        clienteJSON.put("correo", correo);
                    }

                    clienteEncontrado = true;
                    break;
                }
            }
            if (clienteEncontrado) {
                FileWriter fileWriter = new FileWriter("proveedor.json");
                fileWriter.write(clientesArray.toJSONString());
                fileWriter.flush();
                fileWriter.close();
            }
        } catch (IOException | ParseException e) {
        }
    }

    //este metodo pronto se borrará
    public static void AsignarIdProveedorPorCategoria() {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("C:/Users/Bravo/Documents/Programing_Proyect_II/Proyecto_2/productos.json"));
            JSONObject jsonObject = (JSONObject) obj;
            for (Object categoriaKey : jsonObject.keySet()) {
                JSONArray productosArray = (JSONArray) jsonObject.get(categoriaKey);
                String idProveedor = obtenerIdProveedorPorCategoria((String) categoriaKey);
                for (int j = 0; j < productosArray.size(); j++) {
                    JSONObject producto = (JSONObject) productosArray.get(j);
                    producto.put("id_proveedor", idProveedor);
                }
            }
            FileWriter fileWriter = new FileWriter("C:/Users/Bravo/Documents/Programing_Proyect_II/Proyecto_2/productos.json");
            JSONValue.writeJSONString(jsonObject, fileWriter);
            fileWriter.close();
            System.out.println("id_proveedor actualizados y guardados en el archivo.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String obtenerIdProveedorPorCategoria(String categoria) {
        JSONObject proveedorMappings = new JSONObject();
        proveedorMappings.put("Cervezas", "1");
        proveedorMappings.put("Licores", "2");
        proveedorMappings.put("Vinos", "2");
        proveedorMappings.put("Energizantes", "3");
        proveedorMappings.put("Jugos", "3");
        proveedorMappings.put("Gaseosas", "4");
        proveedorMappings.put("Alimentos_Mascotas", "6");
        proveedorMappings.put("Accesorios_Mascotas", "7");
        proveedorMappings.put("Limpieza_Mascotas", "7");
        proveedorMappings.put("Botanas", "8");
        proveedorMappings.put("Aceites_Grasas", "9");
        proveedorMappings.put("Pollo", "10");
        proveedorMappings.put("Cerdo", "11");
        proveedorMappings.put("Res", "12");
        proveedorMappings.put("Mariscos", "13");
        proveedorMappings.put("Embutidos", "14");
        proveedorMappings.put("Frutas", "15");
        proveedorMappings.put("Verduras", "15");
        proveedorMappings.put("Accesorios", "16");
        proveedorMappings.put("Desifectante y limpiadores", "17");
        proveedorMappings.put("Detergentes", "18");
        proveedorMappings.put("Lava platos", "18");
        proveedorMappings.put("Enlatados", "19");
        proveedorMappings.put("Granos y Pastas", "20");
        proveedorMappings.put("Lacteos", "21");
        //falta agregar las marcas de las sub categorias de cuidado personal
        return (String) proveedorMappings.get(categoria);
    }
}
