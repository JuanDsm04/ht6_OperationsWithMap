import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @autor: Diego Flores y Juan Solís
 * @description: Controlador del programa en el que se lleva a cabo el control de las cartas
 * @version: 1.5
 * @date: 28/02/2024
 */
public class Controlador {
    private Map<String, Carta> coleccion;
    private Reader reader = new Reader("cards_desc.txt");

    public Map<String, Carta> getColeccion() {
        return coleccion;
    }

    public void setColeccion(Map<String, Carta> nuevaColeccion) {
        this.coleccion = nuevaColeccion;
    }

    /**
     * @description: Método que crea una colección de cartas con Map dependiendo de la implementación seleccionada
     * @param opcion La opción de implementación que el usuario eligió
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

    /**
     * @description: Se busca en el arhivo de cartas la carta que el usuario va a agregar a su colección
     * @param nombre El nombre de la carta que el usuario quiere agregar a su colección y se buscará entre las cartas existentes
     * en el archivo de texto
     */
    public Carta buscarCartaEnArchivo(String nombre) {
        Carta cartaEncontrada = null;
        try {
            ArrayList<Carta> todasLasCartas = reader.read();
            for (Carta carta : todasLasCartas) {
                if (carta.getNombre().equals(nombre)) {
                    cartaEncontrada = carta;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al leer el archivo de las cartas");
        }
        return cartaEncontrada;
    }

    /**
     * @description: Se agrega una carta a la colección del usuario
     * @param nombre El nombre de la carta que el usuario quiere agregar a su colección
     */
    public void agregarCartaAColeccion(String nombre) {
        Carta carta = buscarCartaEnArchivo(nombre);
        if (carta != null) {
            Carta cartaExistente = coleccion.get(carta.getNombre());

            // Verifica si la carta ya existe en la colección
            if (cartaExistente != null) {
                cartaExistente.setCantidad(cartaExistente.getCantidad() + 1);
                System.out.println("Se agregó una carta repetida, ahora hay " + cartaExistente.getCantidad() + " como esta");
            } else {
                coleccion.put(carta.getNombre(), new Carta(carta.getNombre(), carta.getTipo(), 1));
                System.out.println("Se agregó la carta a la colección");
            }

        } else {
            System.out.println("La carta que se intentó agregar no existe el archivo de cartas");
        }
    }

    /**
     * @description: Muestra el tipo de una carta específicada por el usuario
     * @param nombre El nombre de la carta de la que se quiere saber su tipo
     */
    public void mostrarTipoDeCarta(String nombre) {
        Carta carta = buscarCartaEnArchivo(nombre);
        if (carta != null) {
            System.out.println("El tipo de la carta es: " + carta.getTipo());
        } else {
            System.out.println("La carta ingresada no existe en el archivo de cartas");
        }
    }

    /**
     * @description: Muestra todas las cartas almacenadas en la colección
     * @throws Exception
     */
    public void mostrarMisCartas() throws Exception{
        for (Carta carta: reader.read()) {
            if(coleccion.get(carta.getNombre())!=null){
                System.out.println(coleccion.get(carta.getNombre()).toString());
            }
        }
    }

    /**
     * @description Muestra todas las cartas almacenadas en la colección ordenadas por tipo
     * @throws Exception
     */
    public void mostrarMisCartasPorTipo() throws Exception{
        ArrayList<Carta> cartas = reader.read();
        Collections.sort(cartas, new Comparator<Carta>() {
            @Override
            public int compare(Carta carta1, Carta carta2) {
                return carta1.getTipo().compareTo(carta2.getTipo());
            }
        });
        for (Carta carta: cartas) {
            if(coleccion.get(carta.getNombre())!=null){
                System.out.println("Tipo: "+coleccion.get(carta.getNombre()).getTipo()+" Nombre: "+coleccion.get(carta.getNombre()).getNombre()+" Cantidad: "+coleccion.get(carta.getNombre()).getCantidad());
            }
        }
    }

    /**
     * @description Muestra todas las cartas del archivo de texto
     * @throws Exception
     */
    public void mostrarTodasLasCartas() throws Exception{
        for (Carta carta: reader.read()) {
            System.out.println(carta.toString());
        }
    }

    /**
     * @description Muestra todas las cartas existentes ordenadas por tipo
     * @throws Exception
     */
    public void mostrarTodasLasCartasPorTipo() throws Exception{
        ArrayList<Carta> cartas = reader.read();
        Collections.sort(cartas, new Comparator<Carta>() {
            @Override
            public int compare(Carta carta1, Carta carta2) {
                return carta1.getTipo().compareTo(carta2.getTipo());
            }
        });
        for (Carta carta: cartas) {
            System.out.println("Tipo: "+carta.getTipo()+" Nombre: "+carta.getNombre()+" Cantidad: "+carta.getCantidad());
        }
    }

}