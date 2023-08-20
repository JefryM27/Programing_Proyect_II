/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.*;

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
}

