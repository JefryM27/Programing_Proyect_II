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
                return false; // The Id must have exactly 10 digits.
            }
            for (char c : txtCedulaCliente.toCharArray()) {
                if (!Character.isDigit(c)) {
                    return false; // The Id must be composed only of digits.
                }
            }

            return true; // If it passes the above validations, the Id is valid.
        }

        public static boolean validartxtTelefonoCliente(String txtTelefonoCliente) {
            String cleanedNumber = txtTelefonoCliente.replaceAll("[\\s\\-()]", "");

            // Check if the phone number contains only digits and has a valid length.
            if (cleanedNumber.matches("\\d{8}") || cleanedNumber.matches("\\d{11}")) {
                return true; // The phone number is valid.
            } else {
                return false; // The phone number is invalid
            }
        }

        public static boolean validartxtNombreCliente(String txtNombreCliente) {
            // Check if the text contains only uppercase or lowercase letters and spaces.
            if (txtNombreCliente.matches("^[a-zA-Z\\s]+$")) {
                return true; // The name is valid.
            } else {
                return false; //The name contains invalid characters.
            }
        }

        public static boolean validartxt1ApellidoCliente(String txt1ApellidoCliente) {
            // Check if the text contains only uppercase or lowercase letters.
            if (txt1ApellidoCliente.matches("^[a-zA-Z]+$")) {
                return true; // The last name is valid 
            } else {
                return false; //The last name contains invalid characters.
            }
        }

        public static boolean validartxt2ApellidoCliente(String txt2ApellidoCliente) {
            // Check if the text contains only uppercase or lowercase letters.
            if (txt2ApellidoCliente.matches("^[a-zA-Z]+$")) {
                return true; //The last name is valid.
            } else {
                return false; // The last name contains invalid characters.
            }
        }

        public static boolean validartxtTelefono(String txtTelefono) {
            //Check if the text contains only numbers
            if (txtTelefono.matches("\\d+")) {
                return true; // The phone number is valid.
            } else {
                return false; // The phone number contains invalid characters.
            }
        }

        public static boolean validartxtCorreoCliente(String txtCorreoCliente) {
        //Regular expression pattern to validate the email format String 
            String correoPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
            Pattern pattern = Pattern.compile(correoPattern);
            Matcher matcher = pattern.matcher(txtCorreoCliente);

            return matcher.matches(); // returns true if the email is valid, false otherwise.
        }

        public static class ValidacionProveedor {

            public static boolean validartxtCedulaProveedor(String txtCedulaProveedor) {
                if (txtCedulaProveedor.length() != 10) {
                    return false; // The Id must have exactly 10 digits.
                }

                for (char c : txtCedulaProveedor.toCharArray()) {
                    if (!Character.isDigit(c)) {
                        return false; // The Id must be composed only of digits.
                    }
                }

                return true; // If it passes the above validations, the Id is valid.
            }

            public static boolean validartxtTelefonoProveedor(String txtTelefonoProveedor) {
                String cleanedNumber = txtTelefonoProveedor.replaceAll("[\\s\\-()]", "");

                // Check if the phone number contains only digits and has a valid length.
                if (cleanedNumber.matches("\\d{8}") || cleanedNumber.matches("\\d{11}")) {
                    return true; //The phone number is valid.
                } else {
                    return false; // The phone number is invalid.
                }
            }

            public static boolean validartxtNombreProveedor(String txtNombreProveedor) {
                // Check if the text contains only uppercase or lowercase letters and spaces.
                if (txtNombreProveedor.matches("^[a-zA-Z\\s]+$")) {
                    return true; // The name is valid.
                } else {
                    return false; // The name is invalid.
                }
            }

            public static boolean validartxtCorreoProveedor(String txtCorreoProveedor) {
                //Regular expression pattern to validate the email format String 
                String correoPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
                Pattern pattern = Pattern.compile(correoPattern);
                Matcher matcher = pattern.matcher(txtCorreoProveedor);

                return matcher.matches(); // returns true if the email is valid, false otherwise.
            }
        }
    }
}
