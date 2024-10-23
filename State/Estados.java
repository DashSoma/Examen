/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package State;

/**
 *
 * @author Student
 */
public  class Estados {// contexto
    Estados EstadoServicio;
    
    public Estados() {
         this.EstadoServicio = new EstadoEspera(this);
    }
   
    public void setEstado( Estados EstadoServicio ) {
        this.EstadoServicio = EstadoServicio;
    }
    
    public void mostrarAviso() {
    }  
}
