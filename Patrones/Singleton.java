/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patrones;

/**
 *
 * @author Student
 */
public class Singleton {

    private static Singleton instancia;
    
    //Aquí irán las listas.
    public Singleton() {
        //this. = new HashSet;
        //...
    }

    private static synchronized Singleton obtenerInstancia() {
        if(instancia == null){
         instancia = new Singleton();
        }
        return null;
    }
    
    //Métodos en los que se utilizará el Singleton.
    
    
}
