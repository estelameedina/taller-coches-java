// Importamos la clase ArrayList para poder usar listas dinámicas
import java.util.ArrayList;

// Esta es la clase Coche: representa un coche que entra al taller
public class Coche {

    // Atributo que guarda el nombre del dueño del coche
    private String duenyo;

    // Atributo que guarda la fecha de entrada al taller
    private String fechaEntrada;

    // Lista de averías que tiene el coche (puede estar vacía o tener varias)
    private ArrayList<String> averias;

    // Constructor: se ejecuta al crear un nuevo coche
    public Coche(String duenyo, String fechaEntrada) {
        this.duenyo = duenyo; // Guardamos el nombre del dueño
        this.fechaEntrada = fechaEntrada; // Guardamos la fecha
        this.averias = new ArrayList<>(); // Creamos la lista vacía de averías
    }

    // Getter: devuelve el nombre del dueño
    public String getDuenyo() {
        return duenyo;
    }

    // Getter: devuelve la fecha de entrada al taller
    public String getFechaEntrada() {
        return fechaEntrada;
    }

    // Getter: devuelve la lista completa de averías
    public ArrayList<String> getAverias() {
        return averias;
    }

    // Añade una nueva avería a la lista
    public void añadirAveria(String averia) {
        averias.add(averia);
    }

    // Elimina todas las averías (como si el coche se hubiese reparado)
    public void repararAverias() {
        averias.clear();
    }

    // Devuelve true si el coche tiene alguna avería, false si está limpio
    public boolean tieneAverias() {
        return !averias.isEmpty();
    }

    // Devuelve un texto bonito con la info del coche
    @Override
    public String toString() {
        return "Coche de " + duenyo + " (Entrada: " + fechaEntrada + ") - Averías: " + averias;
    }
}

