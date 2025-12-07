/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author danielcoello
 */
public class Ordenador {
    
    //Atributos 
    protected int memoriaRAM;
    protected int discoDuro;
    protected String procesador;
    protected String tarjetaGrafica;
    protected double precio;

    // Constructor por defecto
    public Ordenador() {
        this.memoriaRAM= 0 ;
        this.discoDuro=0;
        this.procesador="";
        this.tarjetaGrafica="";
        this.precio=0;   
    }

    // Constructor con parámetros
    public Ordenador(int memoriaRAM, int discoDuro, String procesador, String tarjetaGrafica, double precio) {
        this.memoriaRAM = memoriaRAM;
        this.discoDuro = discoDuro;
        this.procesador = procesador;
        this.tarjetaGrafica = tarjetaGrafica;
        this.precio = precio;
    }

    //Getter
    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public int getDiscoDuro() {
        return discoDuro;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public double getPrecio() {
        return precio;
    }
    
    
    //Setter
    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
       
    }

    @Override
    public String toString() {
        return "Ordenador{" + "memoriaRAM=" + memoriaRAM + ", discoDuro=" + discoDuro + ", procesador=" + procesador + ", tarjetaGrafica=" + tarjetaGrafica + ", precio=" + precio + '}';
    }
}