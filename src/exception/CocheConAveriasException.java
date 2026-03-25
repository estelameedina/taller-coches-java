// Archivo: CocheConAveriasException.java
// Indica que no se puede entregar un coche porque aún tiene averías
public class CocheConAveriasException extends Exception {
    public CocheConAveriasException(String mensaje) {
        super(mensaje);
    }
}
