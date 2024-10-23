/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package State;

/**
 *
 * @author Student
 */
public class EstadoProceso extends Estados{
    
    public EstadoProceso( Estados EstadoServicio ) {
         this.EstadoServicio = EstadoServicio;
    }
  
    public void mostrar() {
         System.out.println("No esta en en proceso");
    }
}
