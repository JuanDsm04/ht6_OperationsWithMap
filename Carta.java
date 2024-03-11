/**
 * @autor Diego Flores y Juan Solís
 * @description Clase que representa una carta
 * @version 1.0
 * @date 28/02/2024
 */

public class Carta {
    private String nombre;
    private String tipo;
    private int cantidad;

    /**
     * @description Constructor de la clase
     * @param nombre Nombre de la carta
     * @param tipo Tipo de la carta
     * @param cantidad Cantidad de la carta
     * @return Objeto de la clase Carta
     */
    public Carta(String nombre, String tipo, int cantidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    /**
     * @description Método que devuelve el nombre de la carta
     * @return String con el nombre de la carta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @description Método que devuelve el tipo de la carta
     * @return String con el tipo de la carta
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @description Método que devuelve la cantidad repetida de esa carta
     * @return String con la cantidad repetida de esa carta
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @description Método que establece el nombre de la carta
     * @param nombre El nombre de la carta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @description Método que establece el tipo de la carta
     * @param tipo El tipo de la carta
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @description Método que establece la cantidad repetida de la carta
     * @param cantidad La cantidad repetida de la carta
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @description Método que devuelve la información de la carta
     * @return String con la información de la carta
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre + "| Tipo: " + tipo + "| Cantidad: " + cantidad;
    }
}