package com.mycompany.sistematurnos.logica;


/* Hacerlo genérico:
    * Que no dependa de que sea sólo médicos, sino que puedas mostrar cualquier lista de objetos
    que tengan un getId(), un getNombre() o el atributo que necesite, por ejemplo las clases:
        - Médicos
        - Pacientes
        - Otra clase (entidad) que cree en el futuro

    * Reutilizable con cualquier clase (entidad) que implemente "Identificable" (interfaz creada).
    * Voy a poder usar el mismo método genérico para cualquier clase (entidad).
*/

public interface Identificable {
    
    // Firmas creadas mediante métodos en las clases "Medico" y "Paciente"
    Long getId();
    String getNombre();
    
    /*  - Hace que cada clase (entidad) implemente su propia descripción para listar
        - Si en el futuro quiero agregar más datos al listado de médicos y/o pacientes, solo 
        modifico su método getDescripcion(). */
    String getDescripcion();
}
