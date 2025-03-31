/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica6;

/**
 *
 * @author Josbel
 */
public class Practica6 {

 
    public static void main(String[] args) {
        AlgebraVectorial vectorA = new AlgebraVectorial(1, 2, 3);
        AlgebraVectorial vectorB = new AlgebraVectorial(4, 5, 6);

        System.out.println("a) Perpendicular. Si el vector a es ortogonal o perpendicular a b: " + vectorA.esPerpendicularA(vectorB));
        System.out.println("b) Perpendicular. Si el vector a es mutuamente ortogonal a b: " + vectorA.esPerpendicularB(vectorB));
        System.out.println("c) Perpendicular. Si el vector a es ortogonal a b: " + vectorA.esOrtogonal(vectorB));
        System.out.println("d) Perpendicular. Si el vector a es ortogonal a b: " + vectorA.esPerpendicularD(vectorB));
        System.out.println("e) Paralela. Si el vector a es paralela a b: " + vectorA.esParalela(vectorB));
        System.out.println("f) Paralela. Si el vector a es paralela a b: " + vectorA.esParalelaF(vectorB));

        AlgebraVectorial proyeccion = vectorA.proyeccionSobre(vectorB);
        System.out.println("g) Proyección de a sobre b: (" + proyeccion.x + ", " + proyeccion.y + ", " + proyeccion.z + ")");

        double componente = vectorA.componenteEn(vectorB);
        System.out.println("h) Componente de a en b: " + componente);
    }
}
