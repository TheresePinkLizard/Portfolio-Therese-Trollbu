package com.example.homepage;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="resultat")
public class Kalkulering {


    @Id
    @GeneratedValue
    private int id;
    private double arial;
    private double omkrets;
    private double diameter;

    public void arial(int radius) {
        double arial = Math.PI * Math.pow(radius,2);
        this.arial = arial;
    }

    public void omkrets(int radius){
        double omkrets = 2 * Math.PI * radius;
        this.omkrets = omkrets;
    }

    public void diameter(int radius){
        double diameter = Math.PI * Math.pow(radius,2);
        this.diameter = diameter;
    }

}
