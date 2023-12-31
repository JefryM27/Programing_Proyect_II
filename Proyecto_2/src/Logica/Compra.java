/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import GUI.*;
import java.io.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import org.json.simple.*;
import org.json.simple.parser.*;

/**
 *
 * @author Bravo
 */
public class Compra {

    private int idCompra;
    private String fecha;
    private double montoTotal;
    private int id_cliente;
    private int id_detalleCompra;
    private Usuario tico2;
    private Administrador tico;

    public Compra(Usuario tico2) {
        this.tico2 = tico2;
    }

    public Compra(Administrador tico) {
        this.tico = tico;
    }

    public Compra(int id, String fecha, double montoTotal, int id_cliente, int id_detalleCompra) {
        this.idCompra = id;
        this.fecha = fecha;
        this.montoTotal = montoTotal;
        this.id_cliente = id_cliente;
        this.id_detalleCompra = id_detalleCompra;
    }

    /**
     * @return the id
     */
    public int getId() {
        return idCompra;
    }

    /**
     * @param idCompra the id to set
     */
    public void setId(int idCompra) {
        this.idCompra = idCompra;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the montoTotal
     */
    public double getMontoTotal() {
        return montoTotal;
    }

    /**
     * @param montoTotal the montoTotal to set
     */
    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    /**
     * @return the id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * @return the id_detalleCompra
     */
    public int getId_detalleCompra() {
        return id_detalleCompra;
    }

    /**
     * @param id_detalleCompra the id_detalleCompra to set
     */
    public void setId_detalleCompra(int id_detalleCompra) {
        this.id_detalleCompra = id_detalleCompra;
    }

    // Method to save a purchase in the purchases JSON file
    public void guardarCompra(Compra nuevaCompra) {
        try {
            // Leer el archivo JSON de compras
            JSONParser parser = new JSONParser();
            JSONArray comprasArray = (JSONArray) parser.parse(new FileReader("compra.json"));

            // Crear el objeto JSON de la nueva compra
            JSONObject compraJSON = new JSONObject();
            compraJSON.put("id", nuevaCompra.getId());
            compraJSON.put("fecha", nuevaCompra.getFecha());
            compraJSON.put("montoTotal", nuevaCompra.getMontoTotal());
            compraJSON.put("id_cliente", nuevaCompra.getId_cliente());
            compraJSON.put("id_detallecompra", nuevaCompra.getId_detalleCompra());

            // Agregar la nueva compra al array de compras
            comprasArray.add(compraJSON);

            // Escribir el array actualizado de compras en el archivo JSON de compras
            FileWriter fileWriter = new FileWriter("compra.json");
            fileWriter.write(comprasArray.toJSONString());
            fileWriter.flush();
            fileWriter.close();
            // Manejo de excepciones en caso de error al leer el archivo JSON o analizar su contenido.
        } catch (IOException | ParseException e) {
            e.printStackTrace(); // Imprimir la traza de la excepción para depuración.
        }
    }

    public void actualizarTabla(DefaultTableModel modeloTabla) {
        try {
            // Leer el archivo JSON de compras
            JSONParser parser = new JSONParser();
            JSONArray comprasArray = (JSONArray) parser.parse(new FileReader("compra.json"));

            // Limpiar la tabla antes de agregar los nuevos datos
            modeloTabla.setRowCount(0);

            // Agregar las compras a la tabla
            for (Object obj : comprasArray) {
                JSONObject compraJSON = (JSONObject) obj;
                int IdCompra = Integer.parseInt(compraJSON.get("id").toString());
                if (IdCompra != 0) {
                    String Fecha = compraJSON.getOrDefault("fecha", "").toString();
                    double MontoTotal = Double.parseDouble(compraJSON.get("montoTotal").toString());
                    int IdCliente = Integer.parseInt(compraJSON.get("id_cliente").toString());
                    int IdDetalleCompra = Integer.parseInt(compraJSON.get("id_detallecompra").toString());
                    modeloTabla.addRow(new Object[]{IdCompra, Fecha, MontoTotal, IdCliente, IdDetalleCompra});
                }
            }
            // Manejo de excepciones en caso de error al leer el archivo JSON o analizar su contenido.
        } catch (IOException | ParseException e) {
            e.printStackTrace(); // Imprimir la traza de la excepción para depuración.
        }
    }

    public void editarCompra(int idCompra, String fecha, double montoTotal, int idCliente, int idDetalleCompra) {
        try {
            JSONParser parser = new JSONParser();
            JSONArray comprasArray = (JSONArray) parser.parse(new FileReader("compra.json"));

            for (Object obj : comprasArray) {
                JSONObject compraJSON = (JSONObject) obj;
                int compraId = Integer.parseInt(compraJSON.get("id").toString());
                if (compraId == idCompra) {
                    if (!fecha.isEmpty()) {
                        compraJSON.put("fecha", fecha);
                    }
                    if (montoTotal >= 0) {
                        compraJSON.put("montoTotal", montoTotal);
                    }
                    if (idCliente != 0) {
                        compraJSON.put("id_cliente", idCliente);
                    }
                    if (idDetalleCompra != 0) {
                        compraJSON.put("id_detallecompra", idDetalleCompra);
                    }
                    break;
                }
            }

            FileWriter fileWriter = new FileWriter("compra.json");
            fileWriter.write(comprasArray.toJSONString());
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    // Método para eliminar una compra del archivo JSON de compras
    public void eliminarCompra(int idCompra) {
        try {
            JSONParser parser = new JSONParser();
            JSONArray comprasArray = (JSONArray) parser.parse(new FileReader("compra.json"));

            List<Integer> indicesAEliminar = new ArrayList<>();
            boolean compraEncontrada = false;
            for (int i = 0; i < comprasArray.size(); i++) {
                JSONObject compraJSON = (JSONObject) comprasArray.get(i);
                int compraId = Integer.parseInt(compraJSON.get("id").toString());
                if (compraId == idCompra) {
                    indicesAEliminar.add(i);
                    compraEncontrada = true;
                }
            }

            if (compraEncontrada) {
                for (int i : indicesAEliminar) {
                    comprasArray.remove(i);
                }

                FileWriter fileWriter = new FileWriter("compra.json");
                fileWriter.write(comprasArray.toJSONString());
                fileWriter.flush();
                fileWriter.close();
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
