/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica6segundo;

/**
 *
 * @author Josbel
 */
public class AlgebraVectorial {

    private double a1, a2, a3;

    public AlgebraVectorial(double a1, double a2, double a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    // a) Suma de dos vectores
    public AlgebraVectorial sumar(AlgebraVectorial b) {
        return new AlgebraVectorial(this.a1 + b.a1, this.a2 + b.a2, this.a3 + b.a3);
    }

    // b) Multiplicación de un escalar por un vector
    public AlgebraVectorial multiplicarPorEscalar(double r) {
        return new AlgebraVectorial(r * this.a1, r * this.a2, r * this.a3);
    }

    // c) Longitud de un vector
    public double longitud() {
        return Math.sqrt(Math.pow(this.a1, 2) + Math.pow(this.a2, 2) + Math.pow(this.a3, 2));
    }

    // d) Normal de un vector
    public AlgebraVectorial normal() {
        double magnitud = this.longitud();
        return new AlgebraVectorial(this.a1 / magnitud, this.a2 / magnitud, this.a3 / magnitud);
    }

    // e) Producto escalar de dos vectores
    public double productoEscalar(AlgebraVectorial b) {
        return this.a1 * b.a1 + this.a2 * b.a2 + this.a3 * b.a3;
    }

    //  f) Producto vectorial de dos vectores
    public AlgebraVectorial productoVectorial(AlgebraVectorial b) {
        return new AlgebraVectorial(
            this.a2 * b.a3 - this.a3 * b.a2,
            this.a3 * b.a1 - this.a1 * b.a3,
            this.a1 * b.a2 - this.a2 * b.a1
        );
    }

    @Override
    public String toString() {
        return "(" + a1 + ", " + a2 + ", " + a3 + ")";
    }
}