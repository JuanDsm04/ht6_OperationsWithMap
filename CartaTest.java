import org.junit.Assert;
import org.junit.Test;
/**
 * @autor Diego Flores y Juan Solís
 * @description Clase en la que se llevan a cabo los tests de la clase Carta
 * @version 1.0
 * @date 02/03/2024
 */
public class CartaTest {
    /**
     * @description Test que verifica que el método getNombre() de la clase Carta funcione bien
     * (Test hecho para no fallar)
     */
    @Test
    public void testGetNombreCorrect() {
        Carta carta = new Carta("Carta1", "Tipo1", 0);
        Assert.assertEquals("Carta1", carta.getNombre());
    }

    /**
     * @description Test que verifica que el método getTipo() de la clase Carta funcione bien
     * (Test hecho para no fallar)
     */
    @Test
    public void testGetTipoCorrect() {
        Carta carta = new Carta("Carta1", "Tipo1", 0);
        Assert.assertEquals("Tipo1", carta.getTipo());
    }

    /**
     * @description Test que verifica que el método getCantidad() de la clase Carta funcione bien
     * (Test hecho para no fallar)
     */
    @Test
    public void testGetCantidadCorrect() {
        Carta carta = new Carta("Carta1", "Tipo1", 0);
        Assert.assertEquals(0, carta.getCantidad());
    }

    /**
     * @description Test que verifica que el método setNombre() de la clase Carta funcione bien, fallando a propósito
     * (Test hecho para fallar)
     */
    @Test
    public void testSetNombreIncorrect() {
        Carta carta = new Carta("Carta1", "Tipo1", 0);
        carta.setNombre("Carta1Modificada");
        Assert.assertEquals("Carta1", carta.getNombre());
    }
}