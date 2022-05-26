package operaciones;

import java.util.Scanner;
import java.util.logging.Logger;

public class AplicacionEjecutable {

    public static void main(String... args) {
        Logger logger = Logger.getLogger("logg");
        Scanner inp = new Scanner(System.in);
        logger.info("ingrese el primer y segundo numero:");
        float num1, num2;
        num1 = inp.nextFloat();
        num2 = inp.nextFloat();
        float respuestas;
        Calculadora nuevaCalculadora = new Calculadora();
        System.out.println("Ingrese su selección: 1 para suma, 2 para Resta 3 para multiplicación y 4 para división:");
        int opcionEscogida;
        opcionEscogida = inp.nextInt();
        switch (escoger) {
            case 1:
                logger.info(nuevaCalculadora.sumar(num1, num2));

                break;
            case 2:
                logger.info(nuevaCalculadora.restar(num1, num2));
                break;
            case 3:
                logger.info(nuevaCalculadora.multiplicar(num1, num2));
                break;
            case 4:
                logger.info(nuevaCalculadora.dividir(num1, num2));
                break;
            default:
                logger.info("Elija la operacion");
        }
    }
}
