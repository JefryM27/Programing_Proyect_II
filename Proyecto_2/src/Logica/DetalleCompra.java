package Logica;

import GUI.*;
import java.io.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import org.json.simple.*;
import org.json.simple.parser.*;

public class DetalleCompra {

    private int Id_DetalleCompra;
    private int cantidad;
    private double monto;
    private String idProducto;
    private int idCompra;
    private Administrador tico;
    private Usuario tico2;

    public DetalleCompra(Administrador tico) {
        this.tico = tico;
    }

    public DetalleCompra(Usuario tico2) {
        this.tico2 = tico2;
    }

    public DetalleCompra(int Id_DetalleCompra, int cantidad, double monto, String idProducto, int idCompra) {
        this.Id_DetalleCompra = Id_DetalleCompra;
        this.cantidad = cantidad;
        this.monto = monto;
        this.idProducto = idProducto;
        this.idCompra = idCompra;
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

    /**
     * @return the idProducto
     */
    public String getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * @return the idCompra
     */
    public int getIdCompra() {
        return idCompra;
    }

    /**
     * @param idCompra the idCompra to set
     */
    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    // Method to save a detail purchase in the detail purchases JSON file
    public void guardarDetalleCompra(DetalleCompra nuevoDetalle) {
        try {
            // Check if the JSON file exists, if not, create a new one
            File archivoJSON = new File("DetalleCompra.json");

            // Read the JSON file for detail purchases
            JSONParser parser = new JSONParser();
            JSONArray detalleCompraArray = (JSONArray) parser.parse(new FileReader(archivoJSON));

            // Create the JSON object of the new detail purchase
            JSONObject detalleCompraJSON = new JSONObject();
            detalleCompraJSON.put("id", nuevoDetalle.getId_DetalleCompra());
            detalleCompraJSON.put("cantidad", nuevoDetalle.getCantidad());
            detalleCompraJSON.put("monto", nuevoDetalle.getMonto());
            detalleCompraJSON.put("idProducto", nuevoDetalle.getIdProducto());
            detalleCompraJSON.put("idCompra", nuevoDetalle.getIdCompra());

            // Add the new detail purchase to the detail purchases array
            detalleCompraArray.add(detalleCompraJSON);

            // Write the updated array of detail purchases to the detail purchases JSON file
            FileWriter fileWriter = new FileWriter("DetalleCompra.json");
            fileWriter.write(detalleCompraArray.toJSONString());
            fileWriter.flush();
            fileWriter.close();
            // Exception handling in case of error reading the JSON file or parsing its content.
        } catch (IOException | ParseException e) {
            e.printStackTrace(); // Print the exception trace for debugging.
        }
    }

    public void actualizarTabla(DefaultTableModel modeloTabla) {
        try {
            // Read the JSON file for detail purchases
            JSONParser parser = new JSONParser();
            JSONArray detalleCompraArray = (JSONArray) parser.parse(new FileReader("DetalleCompra.json"));

            // Clear the table before adding the new data
            modeloTabla.setRowCount(0);

            // Add the detail purchases to the table model
            for (Object obj : detalleCompraArray) {
                JSONObject detalleCompraJSON = (JSONObject) obj;
                int IdDetalleCompra = Integer.parseInt(detalleCompraJSON.get("id").toString());
                if (IdDetalleCompra != 0) {
                    int Cantidad = Integer.parseInt(detalleCompraJSON.get("cantidad").toString());
                    double Monto = Double.parseDouble(detalleCompraJSON.get("monto").toString());
                    String IdProducto = detalleCompraJSON.getOrDefault("idProducto", "").toString();
                    int IdCompra = Integer.parseInt(detalleCompraJSON.get("idCompra").toString());
                    modeloTabla.addRow(new Object[]{IdDetalleCompra, Cantidad, Monto, IdProducto, IdCompra});
                }
            }
            // Exception handling in case of error reading the JSON file or parsing its content
        } catch (IOException | ParseException e) {
            e.printStackTrace(); // Print the exception trace for debugging.
        }
    }

    public void editarDetalleCompra(int idDetalleCompra, int cantidad, double monto, String idProducto, int idCompra) {
        try {
            JSONParser parser = new JSONParser();
            JSONArray detalleCompraArray = (JSONArray) parser.parse(new FileReader("detalleCompra.json"));

            boolean detalleEncontrado = false;
            for (Object obj : detalleCompraArray) {
                JSONObject detalleCompraJSON = (JSONObject) obj;
                int detalleId = Integer.parseInt(detalleCompraJSON.get("Id_DetalleCompra").toString());
                if (detalleId == idDetalleCompra) {
                    if (cantidad >= 0) {
                        detalleCompraJSON.put("cantidad", cantidad);
                    }
                    if (monto >= 0) {
                        detalleCompraJSON.put("monto", monto);
                    }
                    if (idProducto != null) {
                        detalleCompraJSON.put("idProducto", idProducto);
                    }
                    if (idCompra >= 0) {
                        detalleCompraJSON.put("idCompra", idCompra);
                    }
                    detalleEncontrado = true;
                    break;
                }
            }

            if (detalleEncontrado) {
                FileWriter fileWriter = new FileWriter("DetalleCompra.json");
                fileWriter.write(detalleCompraArray.toJSONString());
                fileWriter.flush();
                fileWriter.close();
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    public void eliminarDetalleCompra(int idDetalleCompra) {
        try {
            JSONParser parser = new JSONParser();
            JSONArray detalleCompraArray = (JSONArray) parser.parse(new FileReader("DetalleCompra.json"));

            List<Integer> indicesAEliminar = new ArrayList<>();
            boolean detalleEncontrado = false;
            for (int i = 0; i < detalleCompraArray.size(); i++) {
                JSONObject detalleCompraJSON = (JSONObject) detalleCompraArray.get(i);
                int detalleId = Integer.parseInt(detalleCompraJSON.get("Id_DetalleCompra").toString());
                if (detalleId == idDetalleCompra) {
                    indicesAEliminar.add(i);
                    detalleEncontrado = true;
                }
            }

            if (detalleEncontrado) {
                for (int i : indicesAEliminar) {
                    detalleCompraArray.remove(i);
                }

                FileWriter fileWriter = new FileWriter("DetalleCompra.json");
                fileWriter.write(detalleCompraArray.toJSONString());
                fileWriter.flush();
                fileWriter.close();
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
