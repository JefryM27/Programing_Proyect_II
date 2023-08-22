/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import GUI.*;
import java.io.*;
import javax.swing.table.DefaultTableModel;
import org.json.simple.*;
import org.json.simple.parser.*;

/**
 *
 * @author Johana
 */
public class Marca {

    private int id;
    private String nombre;
    private Administrador tico;

    public Marca(Administrador tico) {
        this.tico = tico;
    }

    public Marca(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;

    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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

    // Method to save a brand in the brands JSON file
    public void guardarMarca() {
        try {
            // Check if the JSON file exists, if not, create a new one
            File archivoJSON = new File("marca.json");
            if (!archivoJSON.exists()) {
                archivoJSON.createNewFile();
                JSONArray marcasArrayVacio = new JSONArray();
                FileWriter fileWriter = new FileWriter(archivoJSON);
                fileWriter.write(marcasArrayVacio.toJSONString());
                fileWriter.flush();
                fileWriter.close();
            }
            // Read the JSON file from brands
            JSONParser parser = new JSONParser();
            JSONArray marcasArray = (JSONArray) parser.parse(new FileReader(archivoJSON));
            // Check if the brand with the same ID already exists in the file
            for (Object obj : marcasArray) {
                JSONObject marcaJSON = (JSONObject) obj;
                String nombreMarca = marcaJSON.get("nombre").toString();
                if (nombreMarca.equals(nombre)) {
                    System.out.println("Ya existe una marca con el nombre " + nombre);
                    return; // Exit the method without adding the duplicate brand 
                }
            }
            // Create the JSON object of the new brand
            JSONObject marcaJSON = new JSONObject();
            marcaJSON.put(id, id);
            marcaJSON.put("nombre", nombre);
            // Add the new brand to the brands array
            marcasArray.add(marcaJSON);
            // Write the updated array of brands to the brands JSON file
            FileWriter fileWriter = new FileWriter("marca.json");
            fileWriter.write(marcasArray.toJSONString());
            fileWriter.flush();
            fileWriter.close();
            tico.actualizarTablaMarcas();
        } catch (IOException | ParseException e) {
            e.printStackTrace();// Print the exception trace for debugging.
        }
    }

    public void actualizarTabla(DefaultTableModel modeloTabla) {
        try {
            //Read the JSON file from brands
            JSONParser parser = new JSONParser();
            JSONArray marcasArray = (JSONArray) parser.parse(new FileReader("marca.json"));
            // Clear the table before adding the new data
            modeloTabla.setRowCount(0);
            // Add the brands to the table model
            for (Object obj : marcasArray) {
                JSONObject marcaJSON = (JSONObject) obj;
                int Id = Integer.parseInt(marcaJSON.get("id").toString());
                String Nombre = marcaJSON.get("nombre") != null ? marcaJSON.get("nombre").toString() : "";
                modeloTabla.addRow(new Object[]{Id, Nombre});
            }
            // Exception handling in case of error reading the JSON file or parsing its content
        } catch (IOException | ParseException e) {
            e.printStackTrace();// Print the exception trace for debugging.
        }
    }

    public void editar_marca(int id, String nombre) {
        try {
            JSONParser parser = new JSONParser();
            JSONArray marcasArray = (JSONArray) parser.parse(new FileReader("marca.json"));
            boolean marcaEncontrada = false;
            for (Object obj : marcasArray) {
                JSONObject marcaJSON = (JSONObject) obj;
                int marcaId = Integer.parseInt(marcaJSON.get("id").toString());
                if (marcaId == id) {
                    if (!nombre.isEmpty()) {
                        marcaJSON.put("nombre", nombre);
                    }
                    marcaEncontrada = true;
                    break;
                }
            }
            if (marcaEncontrada) {
                FileWriter fileWriter = new FileWriter("marca.json");
                fileWriter.write(marcasArray.toJSONString());
                fileWriter.flush();
                fileWriter.close();
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
