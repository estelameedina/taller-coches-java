// Importamos las clases necesarias
import java.util.ArrayList;

// Clase Taller: gestiona una lista de coches que entran y salen del taller
public class Taller {

    // Lista interna de coches que están actualmente en el taller
    private ArrayList<Coche> coches;

    // Constructor: inicializa la lista vacía de coches
    public Taller() {
        coches = new ArrayList<>();
    }

    /**
     * Método para recibir (añadir) un coche al taller.
     * @param c El objeto Coche que llega al taller.
     */
    public void recibirCoche(Coche c) {
        coches.add(c);  // Lo metemos en la lista
        System.out.println(">> Coche recibido: " + c.getDuenyo());
    }

    /**
     * Intenta entregar un coche al cliente.
     * Lanza excepción si el coche sigue teniendo averías.
     * @param c El Coche que se quiere entregar.
     * @throws CocheConAveriasException si c.tieneAverias() == true
     */
    public void entregarCoche(Coche c) throws CocheConAveriasException {
        // Comprobamos si tiene averías
        if (c.tieneAverias()) {
            // Si sigue teniendo averías, lanzamos excepción y no lo sacamos de la lista
            throw new CocheConAveriasException(
                    "¡Error! No se puede entregar el coche de "
                            + c.getDuenyo()
                            + " porque todavía tiene averías: "
                            + c.getAverias()
            );
        }
        // Si está limpio, lo quitamos de la lista y lo damos por entregado
        coches.remove(c);
        System.out.println(">> Coche entregado: " + c.getDuenyo());
    }

    /**
     * Muestra en consola todos los coches que están ahora mismo en taller.
     */
    public void listarCoches() {
        System.out.println("=== Coches en el taller ===");
        if (coches.isEmpty()) {
            System.out.println("No hay coches en el taller.");
            return;
        }
        for (Coche c : coches) {
            System.out.println(" - " + c);
        }
    }

    /**
     * Busca un coche por el nombre del dueño.
     * @param duenyo El nombre del dueño a buscar.
     * @return El Coche si lo encuentra, o null si no existe.
     */
    public Coche buscarCochePorDuenyo(String duenyo) {
        for (Coche c : coches) {
            if (c.getDuenyo().equalsIgnoreCase(duenyo)) {
                return c;
            }
        }
        return null;  // No encontramos ningún coche con ese dueño
    }

    /**
     * Cuenta cuántos coches hay en el taller.
     * @return El número de coches en la lista.
     */
    public int contarCoches() {
        return coches.size();
    }
}
