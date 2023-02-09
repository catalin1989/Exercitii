package org.example;

public class Convertor {

    public double convertorMileinKm(double mile) {
        double km;
        km = mile * 1.6;

        return km;
    }

    public double convertorKminMile(double km) {
        double mile;
        mile = km / 1.6;

        return mile;
    }
}
