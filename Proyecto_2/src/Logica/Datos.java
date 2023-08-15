
package Logica;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class Datos {
    private String rutaProductos;
    
    
    public Datos(){
        this.rutaProductos = "productos.json";
    }
    
    public List<Producto> cargarProductos(String categoria){
        ArrayList<Producto> infoProductos = new ArrayList();
        
        JSONParser parser = new JSONParser();
        
        try (Reader reader = new FileReader(this.rutaProductos)){
            JSONObject main = (JSONObject) parser.parse(reader);
            JSONArray categoriaProductos = (JSONArray) main.get(categoria);
            
            for (Object categoriaProducto : categoriaProductos) {
                JSONObject producto = (JSONObject) categoriaProducto;
                String nombre =(String) producto.get("nombre");
                String peso =(String) producto.get("peso");
                double precio =(double) producto.get("precio");
                String imagen =(String) producto.get("imagen");
                infoProductos.add(new Producto(nombre ,precio ,peso ,imagen));
            }
            
            
            
        }catch (Exception e){
            System.out.println(e);
        }
        return infoProductos;
        
    }
}
