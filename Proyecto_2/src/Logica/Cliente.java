
package Logica;

import GUI.ChinoTico;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Cliente {
    private int id;
    private String cédula;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String teléfono;
    private String correo;
    private ChinoTico tico;
    
    public Cliente(ChinoTico tico){
        this.tico = tico;
    }
    public Cliente(int id,String cédula,String nombre, String primerApellido,String segundoApellido,String teléfono,String correo){
        this.id= id;
        this.cédula= cédula;
        this.nombre= nombre;
        this.primerApellido= primerApellido;
        this.segundoApellido= segundoApellido;
        this.teléfono= teléfono;
        this.correo = correo;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getCédula() {
        return cédula;
    }

   
    public void setCédula(String cédula) {
        this.cédula = cédula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

  
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correoElectrónico to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    // Method to save a customer in the customers JSON file
    public void guardarCliente() {
    try {
        // Check if the JSON file exists, if not, create a new one
        File archivoJSON = new File("cliente.json");
        if (!archivoJSON.exists()) {
            archivoJSON.createNewFile();
            JSONArray clientesArrayVacio = new JSONArray();
            FileWriter fileWriter = new FileWriter(archivoJSON);
            fileWriter.write(clientesArrayVacio.toJSONString());
            fileWriter.flush();
            fileWriter.close();
        }
        // Read the JSON file from clients
        JSONParser parser = new JSONParser();
        JSONArray clientesArray = (JSONArray) parser.parse(new FileReader(archivoJSON));
        // Check if the customer with the same ID already exists in the file
        for (Object obj : clientesArray) {
            JSONObject clienteJSON = (JSONObject) obj;
            String cedulaCliente = clienteJSON.get("cedula").toString();
            if (cedulaCliente.equals(cédula)) {
                System.out.println("Ya existe un cliente con la cédula " + cédula);
                return; // Exit the method without adding the duplicate customer
            }
        }
        
        // Create the JSON object of the new customer
        JSONObject clienteJSON = new JSONObject();
        clienteJSON.put("id", id);
        clienteJSON.put("cedula", cédula);
        clienteJSON.put("nombre", nombre);
        clienteJSON.put("primer_apellido", primerApellido);
        clienteJSON.put("segundo_apellido", segundoApellido);
        clienteJSON.put("telefono", teléfono);
        clienteJSON.put("correo", correo);
        // Add the new customer to the customers array
        clientesArray.add(clienteJSON);
        // Write the updated array of clients to the clients JSON file
        FileWriter fileWriter = new FileWriter("cliente.json");
        fileWriter.write(clientesArray.toJSONString());
        fileWriter.flush();
        fileWriter.close();
        tico.actualizarTablaCliente();
        // Exception handling in case of error reading the JSON file or parsing its content.
    } catch (IOException | ParseException e) {
        e.printStackTrace();// Print the exception trace for debugging.
    }
    }
    
    public void actualizarTabla(DefaultTableModel modeloTabla) {
        try {
            // Read the JSON file from clients
            JSONParser parser = new JSONParser();
            JSONArray clientesArray = (JSONArray) parser.parse(new FileReader("cliente.json"));
            // Clear the table before adding the new data
            modeloTabla.setRowCount(0);
            
            // Add the customers to the table model
            for (Object obj : clientesArray) {
                JSONObject clienteJSON = (JSONObject) obj;
                int Id = Integer.parseInt(clienteJSON.get("id").toString());
                String Cedula = clienteJSON.get("cedula") != null ? clienteJSON.get("cedula").toString() : "";
                String Nombre = clienteJSON.get("nombre") != null ? clienteJSON.get("nombre").toString() : "";   
                String Primer_apellido = clienteJSON.get("primer_apellido") != null ? clienteJSON.get("primer_apellido").toString() : "";   
                String Segundo_apellido = clienteJSON.get("segundo_apellido") != null ? clienteJSON.get("segundo_apellido").toString() : "";   
                String Telefono = clienteJSON.get("telefono") != null ? clienteJSON.get("telefono").toString() : "";   
                String Correo = clienteJSON.get("correo") != null ? clienteJSON.get("correo").toString() : "";    
                modeloTabla.addRow(new Object[]{Id, Cedula, Nombre, Primer_apellido, Segundo_apellido, Telefono, Correo});
            }
            // Exception handling in case of error reading the JSON file or parsing its content
        } catch (IOException | ParseException e) {
            e.printStackTrace();// Print the exception trace for debugging.
        }
    }
    
    public void actualizar_cliente(int id, String cedula, String nombre, String primer_apellido, String segundo_apellido, String telefono, String correo) {
        try {
            // Leer el archivo JSON de clientes
            JSONParser parser = new JSONParser();
            JSONArray clientesArray = (JSONArray) parser.parse(new FileReader("Cliente.json"));
            // Buscar el cliente con el ID especificado
            boolean clienteEncontrado = false;
            for (Object obj : clientesArray) {
                JSONObject clienteJSON = (JSONObject) obj;
                int clienteId = Integer.parseInt(clienteJSON.get("id").toString());
                if (clienteId == id) {
                    // Actualizar la información del cliente si los campos de texto no están en blanco
                    if (!cedula.isEmpty()) {
                        clienteJSON.put("cedula", cedula);
                    }
                    if (!nombre.isEmpty()) {
                        clienteJSON.put("nombre", nombre);
                    }
                    if (!primer_apellido.isEmpty()) {
                        clienteJSON.put("primer_apellido", primer_apellido);
                    }
                    if (!segundo_apellido.isEmpty()) {
                        clienteJSON.put("segundo_apellido", segundo_apellido);
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
                FileWriter fileWriter = new FileWriter("Cliente.json");
                fileWriter.write(clientesArray.toJSONString());
                fileWriter.flush();
                fileWriter.close();
                System.out.println("Cliente actualizado exitosamente.");
            } else {
                System.out.println("No se encontró un cliente con el ID " + id);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}

