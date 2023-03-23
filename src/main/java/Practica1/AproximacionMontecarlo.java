package Practica1;

public class AproximacionMontecarlo {
    public double aproximarPorMontecarlo(int n) {
        double x, y, pi;
        int i, contador = 0;
        for (i = 0; i < n; i++) {
            x = Math.random();
            y = Math.random();
            if (x * x + y * y <= 1) {
                contador++;
            }
        }
        pi = 4.0 * contador / n;
        return pi;
    }
}
