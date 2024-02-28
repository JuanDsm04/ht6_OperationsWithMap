import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @autor Diego Flores y Juan Solís
 * @description Clase que lee el archivo con las cartas
 * @version 1.0
 * @date 28/02/2024
 */
public class Reader {

    private File file;

    /**
     * @description Constructor de la clase
     * @param fileName
     */
    public Reader(String fileName){
        file = new File(fileName);
    }

     /** 
     * @description Método que se encarga de leer el archivo con las cartas
     * @return ArrayList<Jugador>
     * @throws Exception
     */
    public ArrayList<Carta> read() throws Exception{
        ArrayList<Carta> cartasAlmacenadas = new ArrayList<>();
        BufferedReader bufer = new BufferedReader(new FileReader(file));
        String linea = bufer.readLine();
        while(linea != null){
            List<String> items = Stream.of(linea.split("\\|")).toList();
            cartasAlmacenadas.add(new Carta(items.get(0), items.get(1), 0));
            linea = bufer.readLine();
        }
        bufer.close();
        return cartasAlmacenadas;
    }  
}
