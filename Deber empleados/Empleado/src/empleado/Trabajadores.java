/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

import java.util.ArrayList;

/**
 *
 * @author FRANCISCO
 */
public class Trabajadores {
    
    private String nombre;
    private String apellido;
    private String cargo;
    private ArrayList<Trabajadores> trabajadores;

    public Trabajadores(String nombre, String apellido, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public ArrayList<Trabajadores> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Trabajadores> trabajadores) {
        this.trabajadores = trabajadores;
    }
    
    
    
}
