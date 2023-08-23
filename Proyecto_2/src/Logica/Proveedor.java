package Logica;

import GUI.Administrador;
import java.io.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import org.json.simple.*;
import org.json.simple.parser.*;


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


    public Proveedor(int id, String cedulaJuridica, String nombre, String telefono, String correo) {
        this.id = id;
        this.cedulaJuridica = cedulaJuridica;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

 
    public int getId() { 
        return id;
    }

    public void setId(int id) { 
        this.id = id;
    }

    public String getCedulaJuridica() { 
        return cedulaJuridica;
    }

    public void setCedulaJuridica(String cedulaJuridica) { 
        this.cedulaJuridica = cedulaJuridica;
    }

    public String getNombre() { 
        return nombre;
    }

    public void setNombre(String nombre) { 
        this.nombre = nombre;
    }

    public String getTelefono() { 
        return telefono;
    }

    public void setTelefono(String telefono) { 
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) { 
        this.correo = correo;
    }

    /*Using a try catch we access the json file that will allow us to save the suplier with their respective assigned values,
   then using a for we check that the card is not repeated, also an object is created where we will save the new object (suplier) created.*/
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
    
    /*This method allows us to show the new customers in the table by reading the json provided and also creates a new object
    where with the condition "?" allows us that if the condition before ? is met will be executed what follows this.*/
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
    
    /*Here what we do is a JsonArray which will read all the arrays that are in the Json file and create a boolean variable
    initialized in false to then create a for each where we go through the json array and through an if we verify that if the
    selected space is not empty it allows us to edit it and put another value to the variable*/
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
    
    /*In the suplier delete method is the same, we read the json through an array with the address of the json
    and subtract the index of the selected object and with the Arrayremove option allows us to delete both in 
    the array and in the table.*/
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
