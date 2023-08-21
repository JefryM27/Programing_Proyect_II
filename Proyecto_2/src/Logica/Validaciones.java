/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.regex.*;

/**
 *
 * @author Cliente
 */
public class Validaciones {

    public boolean validarLetras(String valor) {
        //Pattern patron = Pattern.compile("[a­zA­Z]{5,10}");
        Pattern patron = Pattern.compile("^[a-zA-ZñÑáéíóúÁÉÍÓÚ]+$");
        Matcher m = patron.matcher(valor);
        return m.matches();
    }

    public boolean validarNumeros(String valor) {
        Pattern patron = Pattern.compile("[0-9]*");
        Matcher m = patron.matcher(valor);
        return m.matches();
    }

    public class ValidacionCliente {

        public static boolean validartxtCedulaCliente(String txtCedulaCliente) {
            if (txtCedulaCliente.length() != 10) {
                return false; // La cédula debe tener exactamente 10 dígitos
            }

            for (char c : txtCedulaCliente.toCharArray()) {
                if (!Character.isDigit(c)) {
                    return false; // La cédula debe estar compuesta solo por dígitos
                }
            }

            return true; // Si pasa las validaciones anteriores, la cédula es válida
        }

        public static boolean validartxtTelefonoCliente(String txtTelefonoCliente) {
            String cleanedNumber = txtTelefonoCliente.replaceAll("[\\s\\-()]", "");

            // Verificar si el número de teléfono contiene solo dígitos y tiene una longitud válida
            if (cleanedNumber.matches("\\d{8}") || cleanedNumber.matches("\\d{11}")) {
                return true; // El número de teléfono es válido
            } else {
                return false; // El número de teléfono no es válido
            }
        }

        public static boolean validartxtNombreCliente(String txtNombreCliente) {
            // Verificar si el texto contiene solo letras (mayúsculas o minúsculas) y espacios
            if (txtNombreCliente.matches("^[a-zA-Z\\s]+$")) {
                return true; // El nombre es válido
            } else {
                return false; // El nombre contiene caracteres no válidos
            }
        }

        public static boolean validartxt1ApellidoCliente(String txt1ApellidoCliente) {
            // Verificar si el texto contiene solo letras (mayúsculas o minúsculas)
            if (txt1ApellidoCliente.matches("^[a-zA-Z]+$")) {
                return true; // El apellido es válido
            } else {
                return false; // El apellido contiene caracteres no válidos
            }
        }

        public static boolean validartxt2ApellidoCliente(String txt2ApellidoCliente) {
            // Verificar si el texto contiene solo letras (mayúsculas o minúsculas)
            if (txt2ApellidoCliente.matches("^[a-zA-Z]+$")) {
                return true; // El apellido es válido
            } else {
                return false; // El apellido contiene caracteres no válidos
            }
        }

        public static boolean validartxtTelefono(String txtTelefono) {
            // Verificar si el texto contiene solo números
            if (txtTelefono.matches("\\d+")) {
                return true; // El número de teléfono es válido
            } else {
                return false; // El número de teléfono contiene caracteres no válidos
            }
        }

        public static boolean validartxtCorreoCliente(String txtCorreoCliente) {
// Patrón de expresión regular para validar el formato de correo electrónico
            String correoPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
            Pattern pattern = Pattern.compile(correoPattern);
            Matcher matcher = pattern.matcher(txtCorreoCliente);

            return matcher.matches(); // Devuelve true si el correo es válido, false en caso contrario
        }
    }
}
