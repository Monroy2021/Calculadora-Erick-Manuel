package operaciones;

import java.util.Scanner;
import java.util.logging.Logger;

public class aplicacionEjecutable {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("logg"); /* Importamos la libreria logger para generar los mensajes en consola*/
        Scanner leer = new Scanner(System.in);  /* Importamos la libreria Scanner */

        logger.info("Ingrese el primer y segundo numero:"); /* Generamos el primer logger donde generamos el primer mensajes indicando el ingreso de dos valores */
        int num1, num2; /* Generamos dos variables numericas */
        num1 = leer.nextInt();
        num2 = leer.nextInt(); /* Agregamos por entrada en consola las dos variables numericas */
        int respuestas;
        System.out.println("Ingrese su selección: 1 para suma, 2 para Resta 3 para multiplicación y 4 para división:");
        int escoger;
        escoger = leer.nextInt();
        switch (escoger) {
            case 1:
                logger.info(suma(num1, num2));
                break;
            case 2:
                logger.info(resta(num1, num2));
                break;
            case 3:
                logger.info(Multiplicacion(num1, num2));
                break;
            case 4:
                logger.info(Division(num1, num2));
                break;
            default:
                logger.info("Elija la operacion");


        }


    }
}
