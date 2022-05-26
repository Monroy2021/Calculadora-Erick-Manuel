package operaciones;

import java.util.Scanner;
import java.util.logging.Logger;

public class aplicacionEjecutable {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("logg");
        Scanner inp = new Scanner(System.in);

        logger.info("ingrese el primer y segundo numero:");
        int num1, num2;
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        int respuestas;
        System.out.println("Ingrese su selección: 1 para suma, 2 para Resta 3 para multiplicación y 4 para división:");
        int escoger;
        escoger = inp.nextInt();
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
