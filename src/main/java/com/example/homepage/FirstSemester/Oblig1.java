package com.example.homepage.FirstSemester;

// First year, first semester

class Sirkel {

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


public class Oblig1 {
    public static void main(String [] args) {
        //  Sett en variabel lik en verdi for radius
        double arial = Sirkel.areal(23.5);
        double omkrets = Sirkel.omkrets(23.5);
        double diameter = Sirkel.diameter(23.5);


    /* Kall så de statiske metodene i sirkel-klassen for å vise følgende på
    System.out (gitt radius lik 23.5) */
        System.out.print("Omkretsen: " + omkrets + "\n"+ "Areal: " + arial + "\n" + "Diameter: "+diameter);

    /*
           Arealet av sirkelen med radius 23.5 er 1734,94
           Omkretsen av sirkelen med radius 23.5 er 147,65
           Diameteren til sirkelen er med radius 23.5 er 47,00

           Tips : String.format("%.2f",desimalverdi); for å formatere to desimaler
        */
    }
}
