/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Vehiculo;
import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class GestorMantenimiento {
    private ArrayList <Vehiculo> lista;

    public GestorMantenimiento(ArrayList<Vehiculo> lista) {
        this.lista = new ArrayList<>();
    }
    
    public void agregar (Vehiculo vehiculo){
        lista.add(vehiculo);
    }

    public ArrayList<Vehiculo> Lista() {
        return lista;
    }
   
}
