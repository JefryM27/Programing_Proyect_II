package Logica;

import GUI.Administrador;
import java.io.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import org.json.simple.*;
import org.json.simple.parser.*;

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

    // Getters and Setters (Optional, but recommended)
    public int getId() { //returns the current value of the id attribute.
        return id;
    }

    public void setId(int id) { //Sets the value of the id attribute with the value passed as an argument.
        this.id = id;
    }

    public String getCedulaJuridica() { // returns the current value of the cedulaJuridica attribute.
        return cedulaJuridica;
    }

    public void setCedulaJuridica(String cedulaJuridica) { //Sets the value of the cedulaJuridica attribute with the value passed as an argument.
        this.cedulaJuridica = cedulaJuridica;
    }

    public String getNombre() { //returns the current value of the name attribute.
        return nombre;
    }

    public void setNombre(String nombre) { //Sets the value of the name attribute with the value passed as an argument.
        this.nombre = nombre;
    }

    public String getTelefono() { // returns the current value of the phone attribute.
        return telefono;
    }

    public void setTelefono(String telefono) { //Sets the value of the phone attribute with the value passed as an argument.
        this.telefono = telefono;
    }

    public String getCorreo() {//returns the current value of the email attribute.
        return correo;
    }

    public void setCorreo(String correo) { //Sets the value of the email attribute with the value passed as an argument.
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
            tico.actualizarTablaProveedores();
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
                if (Id != 0) {
                    String Cedula = proveedorJSON.get("cedula") != null ? proveedorJSON.get("cedula").toString() : "";
                    String Nombre = proveedorJSON.get("nombre") != null ? proveedorJSON.get("nombre").toString() : "";
                    String Telefono = proveedorJSON.get("telefono") != null ? proveedorJSON.get("telefono").toString() : "";
                    String Correo = proveedorJSON.get("correo") != null ? proveedorJSON.get("correo").toString() : "";
                    modeloTabla.addRow(new Object[]{Id, Cedula, Nombre, Telefono, Correo});
                }
            }
            // Exception handling in case of error reading the JSON file or parsing its content
        } catch (IOException | ParseException e) {
            e.printStackTrace();// Print the exception trace for debugging.
        }
    }

    public void editar_Proveedor(int id, String cedula, String nombre, String telefono, String correo) {
        try {
            JSONParser parser = new JSONParser();
            JSONArray proveedoresArray = (JSONArray) parser.parse(new FileReader("proveedor.json"));
            boolean proveedorEncontrado = false;

            for (int i = 0; i < proveedoresArray.size(); i++) {
                JSONObject proveedorJSON = (JSONObject) proveedoresArray.get(i);
                int proveedorId = Integer.parseInt(proveedorJSON.get("id").toString());

                if (proveedorId == id) {
                    if (!cedula.isEmpty()) {
                        proveedorJSON.put("cedula", cedula);
                    }
                    if (!nombre.isEmpty()) {
                        proveedorJSON.put("nombre", nombre);
                    }
                    if (!telefono.isEmpty()) {
                        proveedorJSON.put("telefono", telefono);
                    }
                    if (!correo.isEmpty()) {
                        proveedorJSON.put("correo", correo);
                    }

                    proveedorEncontrado = true;
                    break;
                }
            }

            if (proveedorEncontrado) {
                FileWriter fileWriter = new FileWriter("proveedor.json");
                fileWriter.write(proveedoresArray.toJSONString());
                fileWriter.flush();
                fileWriter.close();
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace(); // Imprime detalles de la excepción para depuración
        }
    }

    public void eliminarProveedor(int id) {
        try {
            JSONParser parser = new JSONParser();
            JSONArray proveedorArray = (JSONArray) parser.parse(new FileReader("proveedor.json"));
            List<Integer> indicesAEliminar = new ArrayList<>();
            boolean proveedorEncontrado = false;
            for (int i = 0; i < proveedorArray.size(); i++) {
                JSONObject proveedorJSON = (JSONObject) proveedorArray.get(i);
                int proveedorId = Integer.parseInt(proveedorJSON.get("id").toString());

                if (proveedorId == id) {
                    indicesAEliminar.add(i);
                    proveedorEncontrado = true;
                }
            }
            if (proveedorEncontrado) {
                for (int i : indicesAEliminar) {
                    proveedorArray.remove(i);
                }
                FileWriter fileWriter = new FileWriter("proveedor.json");
                fileWriter.write(proveedorArray.toJSONString());
                fileWriter.flush();
                fileWriter.close();
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
