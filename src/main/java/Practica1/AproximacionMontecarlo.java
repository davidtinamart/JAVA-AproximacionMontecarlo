package Practica1;
import java.util.Random;


public class AproximacionMontecarlo {
    public double aproximarPorMontecarlo(int puntosTotales) {
        double areaCuadrado=4, x, y, pi;
        int i, aciertos = 0;
        for (i = 0; i < puntosTotales; i++) {
            x = Math.random();
            y = Math.random();
            if (x * x + y * y <= 1) {
                aciertos++;
            }
        }
        pi = areaCuadrado * aciertos / puntosTotales;
        return pi; //OUTPUT
    }
}
