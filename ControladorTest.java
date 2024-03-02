import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * @autor Diego Flores y Juan Solís
 * @description Clase en la que se llevan a cabo los tests de la clase Controlador
 * @version 1.0
 * @date 02/03/2024
 */
public class ControladorTest {
    /**
     * @description Test que verifica que el método agregarCartaAColeccion() de la clase Controlador funcione correctamente
     * (Test hecho para no fallar)
     */
    @Test
    public void testAgregarCartaAColeccionCorrect() {
        Controlador controlador = new Controlador();

        String nombreCartaExistente = "CartaExistente";

        Map<String, Carta> coleccion = new HashMap<>();

        Carta cartaEnColeccion = new Carta(nombreCartaExistente, "TipoExistente", 2);
        coleccion.put(nombreCartaExistente, cartaEnColeccion);

        controlador.setColeccion(coleccion);

        controlador.agregarCartaAColeccion(nombreCartaExistente);
        assertEquals(2, controlador.getColeccion().get(nombreCartaExistente).getCantidad());
    }

    /**
     * @description Test que verifica que el método agregarCartaAColeccion() de la clase Controlador funcione correctamente, fallando a propósito
     * (Test hecho para fallar)
     */
    @Test
    public void testAgregarCartaAColeccionInCorrect() {
        Controlador controlador = new Controlador();

        String nombreCartaExistente = "CartaExistente";

        Map<String, Carta> coleccion = new HashMap<>();

        Carta cartaEnColeccion = new Carta(nombreCartaExistente, "TipoExistente", 2);
        coleccion.put(nombreCartaExistente, cartaEnColeccion);
        
        controlador.setColeccion(coleccion);

        controlador.agregarCartaAColeccion(nombreCartaExistente);
        assertEquals(3, controlador.getColeccion().get(nombreCartaExistente).getCantidad());
    }
}