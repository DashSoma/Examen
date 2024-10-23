/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Vehiculo;
import Modelo.VehiculoList;
import Vistas.Vista;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Student
 */
public class GestorMantenimiento implements Observer {
    Set<ObserverUb> observerSet = new HashSet<>();
    
    
    Vehiculo vehiculo;
    VehiculoList listaV;
    Vista vista;
    
    public GestorMantenimiento(VehiculoList listaV, Vista vista) {
        this.listaV = listaV;
        this.vista = vista;
    }    
    
   
    @Override
    public void addObserver(Observer o) {
       if (listaV == null) {
       vista.mostrarMensaje("La lista está vacía", "Informacion");
        }
        int id = vista.getTxtCedula();
        String nombre = vista.getTxtNombre();
        int telefono = vista.getTxtTelefono();
        VehiculoList  hilo = new VehiculoList();
        hilo.start();
        listaV.insertar(id, nombre, telefono);    }

    @Override
    public void deleteObserver(Observer o) {
        if (listaV == null) {
        vista.mostrarMensaje("La lista está vacía", "No puedes eliminar");
        }
        this.listaV.eliminar(vehiculo);    }

    @Override
    public void notifyObserver() {
        for (ObserverUb observer : observerSet){
             observer.update();
        }
    }
}
