/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.FileReader;
import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Bravo
 */
public class Categoria {

    private int id_categoria;
    private String nombre;
    private String descripcion;

    public Categoria(int id_categoria, String nombre, String descripcion) {
        this.id_categoria = id_categoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    /**
     * @return the id_categoria
     */
    public int getId_categoria() {
        return id_categoria;
    }

    /**
     * @param id_categoria the id_categoria to set
     */
    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //este metodo pronto se borrará
    public static void AsignarIdCategoriaPorProducto() {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("C:/Users/Bravo/Documents/Programing_Proyect_II/Proyecto_2/productos.json"));
            JSONObject jsonObject = (JSONObject) obj;
            for (Object categoriaKey : jsonObject.keySet()) {
                JSONArray productosArray = (JSONArray) jsonObject.get(categoriaKey);
                String idCategoria = obtenerIdCategoriaPorProducto((String) categoriaKey);
                for (int j = 0; j < productosArray.size(); j++) {
                    JSONObject producto = (JSONObject) productosArray.get(j);
                    producto.put("id_categoria", idCategoria);
                }
            }
            FileWriter fileWriter = new FileWriter("C:/Users/Bravo/Documents/Programing_Proyect_II/Proyecto_2/productos.json");
            JSONValue.writeJSONString(jsonObject, fileWriter);
            fileWriter.close();
            System.out.println("id_categoria actualizados y guardados en el archivo.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String obtenerIdCategoriaPorProducto(String categoria) {
        JSONObject categoriaMappings = new JSONObject();
        categoriaMappings.put("Cervezas", "1");
        categoriaMappings.put("Licores", "1");
        categoriaMappings.put("Vinos", "1");
        categoriaMappings.put("Jugos", "1");
        categoriaMappings.put("Gaseosas", "1");
        categoriaMappings.put("Energizantes", "1");
        categoriaMappings.put("Granos y Pastas", "2");
        categoriaMappings.put("Aceites_Grasas", "2");
        categoriaMappings.put("Botanas", "2");
        categoriaMappings.put("Enlatados", "2");
        categoriaMappings.put("Detergentes", "3");
        categoriaMappings.put("Lava platos", "3");
        categoriaMappings.put("Desifectante y limpiadores", "3");
        categoriaMappings.put("Accesorios", "3");
        categoriaMappings.put("Alimentos_Mascotas", "4");
        categoriaMappings.put("Accesorios_Mascotas", "4");
        categoriaMappings.put("Limpieza_Mascotas", "4");
        categoriaMappings.put("Pollo", "6");
        categoriaMappings.put("Cerdo", "6");
        categoriaMappings.put("Res", "6");
        categoriaMappings.put("Mariscos", "6");
        categoriaMappings.put("Frutas", "6");
        categoriaMappings.put("Verduras", "6");
        categoriaMappings.put("Embutidos", "6");
        //falta agregar las sub categorias de cuidado personal con valor 5
        return (String) categoriaMappings.get(categoria);
    }
}
