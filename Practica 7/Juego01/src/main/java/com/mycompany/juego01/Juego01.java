/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.juego01;

/**
 *
 * @author Josbel
 */
public class Juego01 {

    public static void main(String[] args) {
        System.out.println("Juego adivina el numero");
        juegoAdivinaNumero game = new juegoAdivinaNumero(3);
        game.juega();
        
        System.out.println("\nJuego adivina el número PAR:");
        juegoAdivinaPar juegoPar = new juegoAdivinaPar(3);
        juegoPar.juega();

        System.out.println("\nJuego adivina el número IMPAR:");
        juegoAdivinaImpar juegoImpar = new juegoAdivinaImpar(3);
        juegoImpar.juega();
    }
}



