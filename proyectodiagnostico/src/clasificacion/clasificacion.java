package clasificacion;
import java.util.Scanner;
import java.io.*;

public class clasificacion extends Mamifero  {

    //recordando
    static Mamifero mamifero = new Mamifero("africa", 1,2,5, "Panthera leo");

    public clasificacion (String habitat, float altura, float largo, float peso, String nombreCientifico) {
        super(habitat, altura, largo, peso, nombreCientifico);
    }

    @Override
    public String getHabitat() {
        return super.getHabitat();
    }

    public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);
            int opcion;

            do {
                System.out.println("*****************************");
                System.out.println("*           Menu:           *");
                System.out.println("* 1. Ver lista de mamiferos *");
                System.out.println("* 2. Ingresar mamifero:     *");
                System.out.println("* 3. Salir                  *");
                System.out.println("*****************************");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        // Codigo para la opcion 1
                        System.out.print("Listado por tipo de animales");
                        switch (opcion){
                            case 1:
                                System.out.println("1. Felino");
                                System.out.println("2. Canino");
                                opcion = scanner.nextInt();
                                switch (opcion){
                                    case 1:
                                        System.out.println("1. Tigre");
                                        System.out.println("2. Leon");
                                        System.out.println("3. Guepardo");
                                        opcion = scanner.nextInt();
                                        switch (opcion){
                                            case 1:
                                                System.out.println("** DATOS DEL TIGRE  **");
                                                System.out.println("** Especie: Bengala **");
                                                break;
                                            case 2:
                                                System.out.println("** DATOS DEL LEON  **");
                                                System.out.println("** Numeros por manada de dos o hasta treinta, incluyendo de tres a cuatro machos y el resto de hembras:  **");
                                                System.out.println("** Potencia rugido: 110 decibelios recorriendo más de 8 kilómetros de distancia **");
                                                break;
                                            case 3:
                                                System.out.println("** DATOS DEL Guepardo  **");
                                                System.out.println("** Especie: Asiatico o africano **");
                                                break;
                                        }
                                        break;
                                    case 2:
                                        System.out.println("1. Lobo. ");
                                        System.out.println("2. Perro. ");
                                        opcion = scanner.nextInt();
                                        break;
                                }
                                break;
                            default:
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("*** Bienvenido al ingreso de datos de los mamiferos ***");
                        System.out.println("*** Elija el tipo de mamifero:  ***");
                        switch (opcion) {
                            case 1:
                                System.out.println("1. Felino");
                                System.out.println("2. Canino");
                                opcion = scanner.nextInt();
                                switch (opcion) {
                                    case 1:
                                        System.out.println("1. Tigre");
                                        System.out.println("2. Leon");
                                        System.out.println("3. Guepardo");
                                        opcion = scanner.nextInt();
                                        switch (opcion) {
                                            case 1:
                                                System.out.println("** DATOS DEL TIGRE  **");
                                                System.out.println("** Habitat:  **"+mamifero.getHabitat());

                                                break;
                                            case 2:
                                               /* System.out.println("** DATOS DEL LEON  **");
                                                System.out.println("** Numeros por manada de dos o hasta treinta, incluyendo de tres a cuatro machos y el resto de hembras:  **");
                                                System.out.println("** Potencia rugido: 110 decibelios recorriendo más de 8 kilómetros de distancia **");

                                                */
                                                break;
                                            case 3:
                                               /* System.out.println("** DATOS DEL Guepardo  **");
                                                System.out.println("** Especie: Asiatico o africano **");

                                                */
                                                break;
                                        }
                                        break;
                                    case 2:
                                        /*System.out.println("1. Lobo. ");
                                        System.out.println("2. Perro. ");
                                        opcion = scanner.nextInt();*/
                                        break;
                                }
                                break;
                            default:

                        }   break;
                }
            } while (opcion != 2);

    }

    @Override
    public String getNombreCientifico() {
        return super.getNombreCientifico();
    }

    @Override
    public float getAltura() {
        return super.getAltura();
    }

    @Override
    public float getLargo() {
        return super.getLargo();
    }

    @Override
    public float getPeso() {
        return super.getPeso();
    }
}
