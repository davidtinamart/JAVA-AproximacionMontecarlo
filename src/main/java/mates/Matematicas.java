package mates;
import java.util.Random;

public class Matematicas {

    public static double generarNumeroPi(long pasos) {
        long aciertos = 0;
        double x, y;
        double areaCuadrado = 4;

        Random aleatorio = new Random();

        for (long i = 0; i < pasos; i++) {
            x = aleatorio.nextDouble() * 2 - 1;
            y = aleatorio.nextDouble() * 2 - 1;
            if (Math.pow(x, 2) + Math.pow(y, 2) <= 1) {
                aciertos++;
            }
        }

        double aproximacionPi = areaCuadrado * (double)aciertos / (double)pasos;

        return aproximacionPi;
    }

}
