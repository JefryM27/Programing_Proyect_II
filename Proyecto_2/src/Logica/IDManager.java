/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Bravo
 */
public class IDManager {
    private static final String FILENAME = "Ultimo_id.txt";
    private static int lastId = 0;

    static {
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            if ((line = br.readLine()) != null) {
                lastId = Integer.parseInt(line);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
    public static int getNextId() {
        lastId = Math.max(lastId + 1, 607);
        saveLastIdToFile();
        return lastId;
    }

    private static void saveLastIdToFile() {
        try (FileWriter fw = new FileWriter(FILENAME)) {
            fw.write(String.valueOf(lastId));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public int generarID(String fileName) {
        try {
            File archivoJSON = new File(fileName);
            JSONParser parser = new JSONParser();
            JSONArray array = (JSONArray) parser.parse(new FileReader(archivoJSON));
            int lastIndex = array.size() - 1;
            JSONObject ultimo_cliente = (JSONObject) array.get(lastIndex);
            //accesses the attributes of the last data in the table
            Long id = (Long) ultimo_cliente.get("id");
            return id.intValue();
        } catch (IOException | ParseException e) {
            return 1000;
        }
    }
}

