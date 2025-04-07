/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego01;

/**
 *
 * @author Josbel
 */
public class juegoAdivinaImpar extends juegoAdivinaNumero {

    public juegoAdivinaImpar(int nroVidas) {
        super(nroVidas);
    }

    @Override
    public boolean validaNumero(int numero) {
        if (numero >= 0 && numero <= 10) {
            if (numero % 2 != 0) {
                return true;
            } else {
                System.out.println("Error: El número no es impar.");
                return false;
            }
        }
        System.out.println("Error: Número fuera del rango permitido (0-10).");
        return false;
    }
}
