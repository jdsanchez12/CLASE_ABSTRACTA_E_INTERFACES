/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pryclasesabstractaseinterfaces;

/**
 *
 * @author HP
 */
public class Pez extends Animal {
 // Constructor
    public Pez(String nombre, int edad) {
        super(nombre, edad);
    }
    @Override
    public void comer() {
       System.out.println(nombre + " esta comiendo alimento para peces.");
    }

    @Override
    public void dormir() {
        System.out.println(nombre + " esta descansando en el agua.");
    }


    
}
