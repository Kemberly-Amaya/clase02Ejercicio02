

package com.unab.clase02.clase02ejercicio02;

/**
 *
 * @author kembe
 */
public class Estudiante extends Persona{
    private int Matricula;
    private String Carrera;
    
    
    public Estudiante 
    (String Nombre,String Direccion,String FechaNC,String Genero,int Edad,int Matricula,String Carrera){
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.FechaNC = FechaNC;
        this.Genero = Genero;
        this.Edad = Edad;
        this.Matricula = Matricula;
        this.Carrera = Carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" +"Nombre=" + Nombre + ", Direccion=" + Direccion + ", FechaNC=" + FechaNC + ", Genero=" + Genero + ", Edad=" + Edad +  " ,Matricula=" + Matricula + ", Carrera=" + Carrera + '}';
    }
    
}
