// Archivo: Main.java

public class Main {

    public static void main(String[] args) {
        // 1. Creamos una instancia del taller
        Taller taller = new Taller();

        // 2. Creamos dos coches de ejemplo
        Coche c1 = new Coche("Estela", "2025-05-18");
        Coche c2 = new Coche("Juan", "2025-05-17");  // Cambiado nombre

        // 3. Añadimos averías al primero para probar la excepción
        c1.añadirAveria("Freno trasero roto");
        c1.añadirAveria("Aceite bajo");

        // 4. Recibimos ambos coches en el taller
        System.out.println("Recibiendo coches...");
        taller.recibirCoche(c1);
        taller.recibirCoche(c2);

        // 5. Listamos todos los coches en el taller
        System.out.println("\nEstado inicial del taller:");
        taller.listarCoches();

        // 6. Intentamos entregar el coche con averías (c1)
        System.out.println("\nIntentando entregar el coche de Estela:");
        try {
            taller.entregarCoche(c1);
        } catch (CocheConAveriasException e) {
            System.out.println("No se pudo entregar: " + e.getMessage());
        }

        // 7. Reparar averías del coche de Estela
        System.out.println("\nReparando averías del coche de Estela...");
        c1.repararAverias();

        // 8. Volvemos a intentar la entrega
        System.out.println("\nReintentando entrega del coche de Estela:");
        try {
            taller.entregarCoche(c1);
        } catch (CocheConAveriasException e) {
            // Esto ya no debería ocurrir
            System.out.println("Error inesperado: " + e.getMessage());
        }

        // 9. Estado final del taller
        System.out.println("\nEstado final del taller:");
        taller.listarCoches();

        // 10. Ejemplo de uso de buscar y contar
        System.out.println("\nNúmero de coches en taller: " + taller.contarCoches());
        Coche buscado = taller.buscarCochePorDuenyo("Juan");
        if (buscado != null) {
            System.out.println("Encontrado coche de Juan: " + buscado);
        } else {
            System.out.println("No se encontró coche de Juan.");
        }
    }

}
