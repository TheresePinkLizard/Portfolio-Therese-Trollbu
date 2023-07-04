package com.example.homepage;

class Sirkel {

    private int tall;
    private int radius;


    // Statisk metode som beregner og returnerer sirkelens diameter.
    public static double diameter (double radius){
        double radiusen = radius * 2;
        return radiusen;
    }
    // Statisk metode som beregner og returnerer sirkelens omkrets.
// Omkrets = 2*pi*r
    public static double omkrets(double radius){
        double omkrets = 2 * Math.PI * radius;
        return omkrets;
    }
    //Statisk metode som beregner og returnerer sirkelens areal.
//Areal = pi*r^2
    public static double areal(double radius){
        double arial = Math.PI * Math.pow(radius,2);
        return arial;
    }
/*
   Math.PI kan brukes for en konstant for PI
   Math.pow kan brukes for å opphøye et tall i en potens
 */

}
