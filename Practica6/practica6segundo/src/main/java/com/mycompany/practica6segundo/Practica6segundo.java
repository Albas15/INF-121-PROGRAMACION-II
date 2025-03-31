/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica6segundo;

/**
 *
 * @author Josbel
 */
public class Practica6segundo {

    public static void main(String[] args) {
        AlgebraVectorial a = new AlgebraVectorial(1, 2, 3);
        AlgebraVectorial b = new AlgebraVectorial(4, 5, 6);

        System.out.println("Vector a: " + a);
        System.out.println("Vector b: " + b);

        System.out.println("a) Suma de dos vectores a y b: " + a.sumar(b));
        System.out.println("b) Multiplicacion de un escalar r por un vector a: " + a.multiplicarPorEscalar(2));
        System.out.println("c) Longitud de un vector a: " + a.longitud());
        System.out.println("d) Normal de un vector a: " + a.normal());
        System.out.println("e) Producto escalar de a y b: " + a.productoEscalar(b));
        System.out.println("f) Producto vectorial de a y b: " + a.productoVectorial(b));
    }
}
