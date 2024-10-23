/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controlador;

/**
 *
 * @author Student
 */
public interface Observer {
    
    void addObserver(Observer o);
    
    void deleteObserver(Observer o);
    
    void notifyObserver();
    
}
