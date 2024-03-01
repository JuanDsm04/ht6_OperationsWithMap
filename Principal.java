import java.util.Scanner;

/**
 * @autor: Diego Flores y Juan Solís
 * @description: Clase principal del programa en la que se lleva a cabo la ejecución de este
 * @version: 1.0
 * @date: 28/02/2024
 */
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Controlador controlador = new Controlador();
        boolean repetirMenu1 = true;

        while (repetirMenu1) {
            System.out.println("IMPLEMENTACIONES DE MAP");
            System.out.println("1. HashMap");
            System.out.println("2. TreeMap");
            System.out.println("3. LinkedHashMap");
            System.out.print("Selecciona la implementación a utilizar: ");
            String op1 = sc.nextLine();

            if (op1.equals("1") || op1.equals("2") || op1.equals("3")) {
                controlador.MapFactory(op1);
                boolean repetirMenu2 = true;

                while (repetirMenu2) {
                    System.out.println("\nREGISTRO DE CARTAS");
                    System.out.println("1. Agregar una carta a la colección");
                    System.out.println("2. Mostrar el tipo de una carta");
                    System.out.println("3. Mostrar la información de todas las cartas de tu colección");
                    System.out.println("4. Mostrar la información de todas las cartas de tu colección, ordenadas por tipo");
                    System.out.println("5. Mostrar el nombre y tipo de todas las cartas existentes");
                    System.out.println("6. Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo");
                    System.out.println("7. Salir del programa");
                    System.out.print("Selecciona la opción que desees: ");
                    String op2 = sc.nextLine();

                    switch (op2) {
                        case "1":
                            System.out.print("\nIngresa el nombre de la carta que deseas agregar a tu colección: ");
                            String nombre = sc.nextLine();
                            controlador.agregarCartaAColeccion(nombre);
                            break;

                        case "2":
                            System.out.print("\nIngrese el nombre de la carta: ");
                            String nombreBuscar = sc.nextLine();
                            controlador.mostrarTipoDeCarta(nombreBuscar);
                            break;

                        case "3":
                            System.out.println("\nMostrando la información de todas las cartas que posees\n");
                            try {
                                controlador.mostrarMisCartas();
                            } catch (Exception e) {
                                System.out.println("Ha ocurrido un error al buscar las cartas");
                            }
                            break;

                        case "4":
                            System.out.println("\nMostrando la información de todas las cartas que posees por tipo\n");
                            try {
                                controlador.mostrarMisCartasPorTipo();
                            } catch (Exception e) {
                                System.out.println("Ha ocurrido un error al buscar las cartas");
                            }
                            break;

                        case "5":
                            System.out.println("\nMostrando la información de todas las cartas existentes\n");
                            try {
                                controlador.mostrarTodasLasCartas();
                            } catch (Exception e) {
                                System.out.println("Ha ocurrido un error al buscar las cartas");
                            }
                            break;

                        case "6":
                            System.out.println("\nMostrando la información de todas las cartas existentes ordenadas por tipo\n");
                            try {
                                controlador.mostrarTodasLasCartasPorTipo();
                            } catch (Exception e) {
                                System.out.println("Ha ocurrido un error al buscar las cartas");
                            }
                            break;

                        case "7":
                            repetirMenu2 = false;
                            break;
                        default:
                            System.out.println("La opción no es válida");
                            break;
                    }
                }
                repetirMenu1 = false;
                
            } else {
                System.out.println("La opción no es válida");
            }
        }   
    }
}
