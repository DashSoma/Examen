/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class VehiculoList {

    private ArrayList<Vehiculo> lista;

    public VehiculoList(ArrayList<Vehiculo> lista) {
        this.lista = new ArrayList<>();
    }

    public VehiculoList() {
    }

    public void insertar(int matricula, String nombre, int telefono) {
        for (Vehiculo v : lista) {
            if (v.getMatricula() == matricula) {
                lista.add(v);
            }
        }
    }

    public void eliminar(Vehiculo vehiculo) {
        this.lista.remove(vehiculo);
    }

    public ArrayList<Vehiculo> guardarLista() {
        return lista;
    }
}
