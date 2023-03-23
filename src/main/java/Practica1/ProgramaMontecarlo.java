package Practica1;

public class ProgramaMontecarlo {

    public static void main(String[] args) {

    AproximacionMontecarlo objeto1 = new AproximacionMontecarlo();

    int PuntosTotales=1000000;
    System.out.println(objeto1.aproximarPorMontecarlo(PuntosTotales));


    }
}
