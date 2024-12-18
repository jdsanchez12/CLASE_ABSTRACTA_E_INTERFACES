/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pryclasesabstractaseinterfaces;

/**
 *
 * @author HP
 */
public class PryClasesAbstractasEInterfaces {

    public static void main(String[] args) {
        // Crear un objeto de tipo Perro
        Perro perro = new Perro("Rex", 3);
        System.out.println("El perro " + perro.getNombre() + " de " + perro.getEdad() + " anos:");
        perro.comer();
        perro.dormir();
        perro.jugar();
        perro.mostrarCarino();

        System.out.println();

        // Crear un objeto de tipo Pez
        Pez pez = new Pez("Nemo", 1);
        System.out.println("El pez " + pez.getNombre() + " de " + pez.getEdad() + " ano:");
        pez.comer();
        pez.dormir();
    }
    }

