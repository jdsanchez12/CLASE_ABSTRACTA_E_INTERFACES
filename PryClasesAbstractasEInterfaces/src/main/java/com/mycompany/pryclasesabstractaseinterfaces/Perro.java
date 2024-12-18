/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pryclasesabstractaseinterfaces;

/**
 *
 * @author HP
 */
public class Perro extends Animal implements Mascota{
    //CONSTRUCTOR
     public Perro(String nombre, int edad) {
        super(nombre, edad);
    }
//SOBREESCRITURA DE METODOS

    @Override
    public void comer() {
       System.out.println(nombre + " esta comiendo croquetas.");   
    }

    @Override
    public void dormir() {
         System.out.println(nombre + " esta durmiendo en su cama.");
    }

    @Override
    public void jugar() {
         System.out.println(nombre + " esta jugando con una pelota.");
    }

    @Override
    public void mostrarCarino() {
       System.out.println(nombre + " esta dando carino al dueno.");
    }
 
    
}
