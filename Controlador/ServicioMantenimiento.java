/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Vehiculo;

/**
 *
 * @author Student
 */
public class ServicioMantenimiento {
    private Vehiculo reparacion;
    private String cambioAceite;

    public Vehiculo getReparacion() {
        return reparacion;
    }

    public void setReparacion(Vehiculo reparacion) {
        this.reparacion = reparacion;
    }

    public String getCambioAceite() {
        return cambioAceite;
    }

    public void setCambioAceite(String cambioAceite) {
        this.cambioAceite = cambioAceite;
    }

    public ServicioMantenimiento(Vehiculo reparacion, String cambioAceite) {
        this.reparacion = reparacion;
        this.cambioAceite = cambioAceite;
        
    }

    public ServicioMantenimiento() {
        this(null,"");
    }
   
    
    public static void Actualizar() {
    
}
    
  
    
}
