/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author sebas
 */
public class Vehiculo {
    // tipo, matricula, valor
    private String tipo;
    private String matricula;
    private double valor;
   
    public Vehiculo(String t, String m){
     tipo=t;
     matricula=m;
     
    
    
}
     public void establecerTipo(String tipo) {
        this.tipo = tipo;
    }
     
     public void establecerMatricula(String matricula) {
        this.matricula = matricula;
    }
     
     
    public void establecerValor(Double v){
      
    valor=v;
    }
    
    public String obtenerTipo() {
        return tipo;
    }

   
    public String obtenerMatricula() {
        return matricula;
    }
    
    
    public double obtenerValor(){
        return valor;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("El vehiculo tipo %s\n"+
                "La matricula: %s\n"
                + "\tEl costo del Vehiculo es: %.2f", 
                tipo,
                matricula,
                obtenerValor());
        return cadena;
    }


    

    
}
