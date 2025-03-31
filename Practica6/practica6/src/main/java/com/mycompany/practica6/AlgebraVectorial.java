/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica6;
/**
 *
 * @author Josbel
 */
public class AlgebraVectorial {

    public double x, y, z;
    
    public AlgebraVectorial(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public AlgebraVectorial sumar(AlgebraVectorial otro) {
        return new AlgebraVectorial(this.x + otro.x, this.y + otro.y, this.z + otro.z);
    }

    public AlgebraVectorial restar(AlgebraVectorial otro) {
        return new AlgebraVectorial(this.x - otro.x, this.y - otro.y, this.z - otro.z);
    }

    public double productoEscalar(AlgebraVectorial otro) {
        return this.x * otro.x + this.y * otro.y + this.z * otro.z;
    }

    private double magnitud() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    private AlgebraVectorial multiplicarPorEscalar(double escalar) {
        return new AlgebraVectorial(this.x * escalar, this.y * escalar, this.z * escalar);
    }
    // a) Perpendicular. Si el vector a es ortogonal o perpendicular a b: |a + b| = |a − b|
    public boolean esPerpendicularA(AlgebraVectorial otro) {
        AlgebraVectorial suma = this.sumar(otro);
        AlgebraVectorial resta = this.restar(otro);
        return suma.magnitud() == resta.magnitud();
    }

    // b) Perpendicular. Si el vector a es mutuamente ortogonal a b: |a − b| = |b − a|
    public boolean esPerpendicularB(AlgebraVectorial otro) {
        AlgebraVectorial resta1 = this.restar(otro);
        AlgebraVectorial resta2 = otro.restar(this);
        return resta1.magnitud() == resta2.magnitud();
    }

    // c) Perpendicular. Si el vector a es ortogonal a b: a · b = 0
    public boolean esOrtogonal(AlgebraVectorial otro) {
        return this.productoEscalar(otro) == 0;
    }

    // d) Perpendicular. Si el vector a es ortogonal a b: |a + b|2 = |a|2 + |b|2
    public boolean esPerpendicularD(AlgebraVectorial otro) {
        AlgebraVectorial suma = this.sumar(otro);
        return Math.pow(suma.magnitud(), 2) == Math.pow(this.magnitud(), 2) + Math.pow(otro.magnitud(), 2);
    }

    // e) Paralela. Si el vector a es paralela a b: a = rb
    public boolean esParalela(AlgebraVectorial otro) {
        if (otro.x == 0 || otro.y == 0 || otro.z == 0) {
            return false; // Evitar división por cero
        }
        double r = this.x / otro.x;
        return this.y / otro.y == r && this.z / otro.z == r;
    }

    // f) Paralela. Si el vector a es paralela a b: a × b = 0 (en 2D, el producto cruz es un escalar)
    public boolean esParalelaF(AlgebraVectorial otro) {
        return this.x * otro.y - this.y * otro.x == 0; // Producto cruz en 2D
    }

    // g) Proyección de a sobre b. La proyección ortogonal de a sobre b: Proyba = a · b / |b|2 * b
    public AlgebraVectorial proyeccionSobre(AlgebraVectorial otro) {
        double escalar = this.productoEscalar(otro) / Math.pow(otro.magnitud(), 2);
        return otro.multiplicarPorEscalar(escalar);
    }

    // h) Componente de a en b. El componente de a en la dirección de b: Compba = a·b / |b|
    public double componenteEn(AlgebraVectorial otro) {
        return this.productoEscalar(otro) / otro.magnitud();
    }
}