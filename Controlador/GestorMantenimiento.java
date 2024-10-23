/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Vehiculo;
import Modelo.VehiculoList;
import Vistas.Vista;

/**
 *
 * @author Student
 */
public class GestorMantenimiento {
    Vehiculo vehiculo;
    VehiculoList listaV;
    Vista vista;
    
    public GestorMantenimiento(VehiculoList listaV, Vista vista) {
        this.listaV = listaV;
        this.vista = vista;
    }    
    
    public void insertar() {
        if (listaV == null) {
            vista.mostrarMensaje("La lista está vacía", "Informacion");
        }
        int id = vista.getTxtCedula();
        String nombre = vista.getTxtNombre();
        int telefono = vista.getTxtTelefono();
        
        listaV.insertar(id, nombre, telefono);
    }
    
    public void eliminar() {
        if (listaV == null) {
            vista.mostrarMensaje("La lista está vacía", "No puedes eliminar");
        }
        this.listaV.eliminar(vehiculo);
    }
}
