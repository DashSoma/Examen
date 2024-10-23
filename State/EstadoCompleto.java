/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package State;

/**
 *
 * @author Student
 */
public class EstadoCompleto extends Estados {
    public EstadoCompleto(Estados EstadoServicio) {
        this.EstadoServicio = EstadoServicio;
    }

    public void mostrar() {
        System.out.println("Estado Completo");
    }
}
