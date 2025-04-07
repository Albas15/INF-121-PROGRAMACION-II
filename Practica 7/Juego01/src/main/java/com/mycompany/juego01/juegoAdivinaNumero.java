/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego01;
import java.util.Scanner;

/**
 *
 * @author Josbel
 */
public class juegoAdivinaNumero extends Juego {
    Scanner te = new Scanner(System.in);
    private int nroAdivinar;

    public juegoAdivinaNumero(int nroVidas) {
        super(nroVidas);
        this.nroAdivinar = (int)(Math.random() * 11);
    }

    public void juega() {
        super.reiniciarPartida();
        this.nroAdivinar = (int)(Math.random() * 11);

        while (this.quitaVida()) {
            System.out.print("Ingresa un numero del 0 al 10: ");
            int numero = te.nextInt();

            if (!validaNumero(numero)) {
                System.out.println("Número inválido. Intenta de nuevo.");
                continue;
            }

            if (this.nroAdivinar == numero) {
                System.out.println("Acertaste! (Record = " + this.record + ")");
                // this.nroAdivinar = (int)(Math.random() * 11);
                return;
            } else {
                if (numero > this.nroAdivinar) {
                    System.out.println("el numero a adivinar es menor, vidas restantes: " + this.nroVidas);
                } else {
                    System.out.println("el numero a adivinar es mayor, vidas restantes: " + this.nroVidas);
                }
                this.nroVidas = this.nroVidas - 1;
                this.record = this.record - 1;
            }
        }
        System.out.println("---------------------------");
        System.out.println("Juego Terminado \n record: " + this.record);
    }

    public int getNroAdivinar() {
        return nroAdivinar;
    }

    public void setNro(int x) {
        this.nroAdivinar = x;
    }

    public boolean validaNumero(int numero) {
        return numero >= 0 && numero <= 10;
    }
}

