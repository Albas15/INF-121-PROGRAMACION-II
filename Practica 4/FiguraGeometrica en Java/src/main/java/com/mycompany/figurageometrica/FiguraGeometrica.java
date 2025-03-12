package com.mycompany.figurageometrica;

/**
 * @author Josbel
 */
public class FiguraGeometrica {
    double area(double radio){
        return Math.PI * radio * radio;//circulo
    }
    double area(double base, double altura){
        return base * altura;//rectangulo
    }
    double area(int base, int altura){
        return (base * altura)/2.0;//triangulo
    }
    double area(double base1, double base2, double altura) {
        return ((base1 + base2) * altura) / 2.0; // Trapecio
    } 
    double area(double lado, int apotema) {
        return (5.0 * lado * apotema) / 2.0; // Pentágono
    }

    public static void main(String[] args) {
        FiguraGeometrica f1=new FiguraGeometrica();
        FiguraGeometrica f2=new FiguraGeometrica();
        FiguraGeometrica f3=new FiguraGeometrica();
        FiguraGeometrica f4=new FiguraGeometrica();
        FiguraGeometrica f5=new FiguraGeometrica();
        System.out.println("Circulo: "+f1.area(1));
        System.out.println("Rectangulo: "+f2.area(5.0,8.0));
        System.out.println("Triangulo: "+f3.area(5,8));
        System.out.println("Trapecio: " + f4.area(6, 4, 5));
        System.out.println("Pentágono: " + f5.area(5.0, 7));
    }
}
