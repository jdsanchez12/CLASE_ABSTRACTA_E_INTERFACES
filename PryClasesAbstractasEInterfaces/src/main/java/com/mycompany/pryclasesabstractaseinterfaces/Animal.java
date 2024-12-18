/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pryclasesabstractaseinterfaces;

/**
 *
 * @author HP
 */
public abstract class Animal {
  //ATRIBUTOS
    protected String nombre;
    protected int edad;
    
    //CONSTRUCTORES SOLO SE DA A SUS CLASES HIJAS
    protected Animal(){
        
    }
    
    protected Animal(String nombre, int edad) {    
        this.nombre = nombre;
        this.edad = edad;
    }

    //METODOS
    public abstract void comer();
    public abstract void dormir();
    //METODO COMUN

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

  
    
}
