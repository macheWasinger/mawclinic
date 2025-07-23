package com.mycompany.sistematurnos.utilidades;

import java.util.List;

public class UtilidadesTexto {
    public static String capitalizarPalabra(String frase) {
        String[] palabras = frase.trim().split("\\s+");
        /*
            - frase.trim() elimina espacios en blanco al principio y al final.
            - .split("\\s+") divide la frase en palabras usando cualquier cantidad de espacios como separador (\\s+ = uno o más espacios).
            - Resultado: un array palabras que contiene cada palabra separada de la frase.
        */

        StringBuilder capitalizado = new StringBuilder();
        // Se usa un StringBuilder para ir armando la frase capitalizada, que es más eficiente que concatenar strings comunes dentro de un bucle.

        for (String palabra : palabras) {
            if (palabra.length() > 0) { // Chequea que la palabra no esté vacía (por si había espacios de más).

                capitalizado.append(palabra.substring(0, 1).toUpperCase())
                        .append(palabra.substring(1).toLowerCase())
                        .append(" ");
                /*
                Este bloque construye una palabra capitalizada:
                     - palabra.substring(0, 1).toUpperCase() → convierte la primera letra a mayúscula.
                     - palabra.substring(1).toLowerCase() → convierte el resto de la palabra a minúscula.
                     - .append(" ") → agrega un espacio al final para separar palabras.
                */
            }
        }
        return capitalizado.toString().trim(); // Convierte el StringBuilder a un String y le quita el espacio extra al final con .trim().
    }
    
    
    //------- VALIDACIONES CAMPOS -------
    public static boolean esNombreValido(String nombre) {
        if (nombre == null) {
            return false;
        }
        String input = nombre.trim();
        return !input.isEmpty() && input.matches("[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ ]+");
    }
    
    public static boolean esSoloTexto(String texto) {
        return texto != null && texto.matches("[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ ]+");
    }
    
    public static boolean esTelefonoValido(String telefono) {
        return telefono != null && telefono.matches("\\d{6,15}");
    }
    
    public static boolean esMatriculaValida(String matricula) {
        if (matricula == null) {
            return false;
        }
        String input = matricula.trim().toUpperCase();
        return !input.isEmpty() && input.matches("[A-Z0-9\\-]{2,20}");
    }
    
    public static boolean esEmailValido(String email) {
        return email != null && email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }
    
    /*
        Valida que el DNI tenga entre 7 y 8 dígitos numéricos.
    */
    public static boolean esDniValido(String dni) {
        if (dni == null) {
            return false;
        }
        // Eliminar espacios
        dni = dni.trim();
        
        // Validar longitud y que solo contenga dígitos
        return dni.matches("\\d{7,8}");
    }
    
    public static boolean esHorarioValido(List<String> listaHorarios) {
        return listaHorarios.stream()
            .allMatch(h -> h.matches("^([01]\\d|2[0-3]):([0-5]\\d)$"));
    }
    //-----------------------------------
}
