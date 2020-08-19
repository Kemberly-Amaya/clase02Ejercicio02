
package com.unab.clase02.clase02ejercicio02;


public class ClaseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Profesor profe = new Profesor("Kemberly","Cerrón Grande","27/09/99","F",20,"Bachiller","Estudiante");
        System.out.println(profe.toString());
        
        Estudiante est = new Estudiante("Jenny", "Chalate","14/11/94", "F", 28, 1500, "Ing.Sistemas y Computación");
        System.err.println(est.toString());
    
  
    }
}
