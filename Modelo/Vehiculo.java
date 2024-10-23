/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Student
 */
public class Vehiculo {
    private double matricula;
    private String marca;
    private String modelo;
    

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getMatricula() {
        return matricula;
    }

    public Vehiculo(String marca, String modelo, double matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    public Vehiculo() {
        this("","",0.0);
       
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + '}';
    }
    
    public void agregar(){}
    
    
}
