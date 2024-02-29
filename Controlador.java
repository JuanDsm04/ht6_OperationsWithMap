import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @autor: Diego Flores y Juan Solís
 * @description: Controlador del programa en el que se lleva a cabo el control de las cartas
 * @version: 1.0
 * @date: 28/02/2024
 */
public class Controlador {
    private Map<String, String> coleccion;
    /**
     * @description: Método que crea una colección de cartas con Map dependiendo de la implementación seleccionada
     */
    public void MapFactory(String opcion) {
        switch (opcion) {
            case "1":
                coleccion = new HashMap<>();
                break;

            case "2":
                coleccion = new TreeMap<>();
                break;

            default:
                coleccion = new LinkedHashMap<>();
                break;
        }
    }
}
