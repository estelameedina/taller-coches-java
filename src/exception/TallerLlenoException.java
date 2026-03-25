// Archivo: TallerLlenoException.java
// Indica que el taller ha alcanzado su capacidad máxima y no puede recibir más coches
public class TallerLlenoException extends Exception {
    public TallerLlenoException(String mensaje) {
        super(mensaje);
    }
}

