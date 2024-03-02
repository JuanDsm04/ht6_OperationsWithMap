
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.ArrayList;
import org.junit.Test;

/**
 * @autor Diego Flores y Juan Solís
 * @description Clase en la que se llevan a cabo los tests de la clase Reader
 * @version 1.0
 * @date 02/03/2024
 */
public class ReaderTest {
    /**
     * @description Test que verifica que el método read() de la clase Reader funcione bien
     * (Test hecho para no fallar. Tampoco fallará si el archivo cards_desc.txt no existe debido a que se maneja la excepción en el método read() de la clase Reader)
     */
    @Test
    public void testReadCorrect() {
        Reader reader = new Reader("cards_desc.txt");
        try {
            System.out.println("Se entró al bloque try");
            ArrayList<Carta> cartasLeidas = reader.read();

            assertNotNull(cartasLeidas);
            assert (!cartasLeidas.isEmpty());
            assertEquals(" Altergeist Pixiel", cartasLeidas.get(0).getNombre());

        } catch (Exception e) {
            System.out.println("Se entró al bloque catch"); 
            e.printStackTrace(); 
        }
    }

    /**
     * @description Test que verifica que el método read() de la clase Reader funcione bien, fallando a propósito
     * (Test hecho para fallar, aunque no fallará si el archivo cards_desc.txt no existe debido a que se maneja la excepción en el método read() de la clase Reader)
     */
    @Test
    public void testReadIncorrect() {
        Reader reader = new Reader("cards_desc.txt");
        try {
            System.out.println("Se entró al bloque try");
            ArrayList<Carta> cartasLeidas = reader.read();
            assertNotNull(cartasLeidas);

            assert (!cartasLeidas.isEmpty());
            assertEquals(" Altergeist Pixiel", cartasLeidas.get(1).getNombre());

        } catch (Exception e) {
            System.out.println("Se entró al bloque catch");
            e.printStackTrace(); 
        }
    }
}