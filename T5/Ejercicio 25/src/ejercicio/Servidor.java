/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author danielcoello
 */
public class Servidor extends Ordenador{
    
    //Atributo
    private double tamanoMonitor;
    private String modeloTeclado;
    private String modeloRaton;
    
    
     // Constructor por defecto
    public Servidor() {
    this.tamanoMonitor=0;
    this.modeloTeclado="";
    this.modeloRaton="";
    }

    // Constructor con parámetros
    public Servidor(int memoriaRAM, int discoDuro, String procesador, String tarjetaGrafica, double precio,
                    double tamanoMonitor, String modeloTeclado, String modeloRaton) {
        super(memoriaRAM, discoDuro, procesador, tarjetaGrafica, precio);
        this.tamanoMonitor = tamanoMonitor;
        this.modeloTeclado = modeloTeclado;
        this.modeloRaton = modeloRaton;
    }

    public double getTamanoMonitor() {
        return tamanoMonitor;
    }

    public void setTamanoMonitor(double tamanoMonitor) {
        this.tamanoMonitor = tamanoMonitor;
    }

    public String getModeloTeclado() {
        return modeloTeclado;
    }

    public void setModeloTeclado(String modeloTeclado) {
        this.modeloTeclado = modeloTeclado;
    }

    public String getModeloRaton() {
        return modeloRaton;
    }

    public void setModeloRaton(String modeloRaton) {
        this.modeloRaton = modeloRaton;
    }

    @Override
    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    @Override
    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    public int getDiscoDuro() {
        return discoDuro;
    }

    @Override
    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }

    @Override
    public String getProcesador() {
        return procesador;
    }

    @Override
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    @Override
    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Servidor{" + "tamanoMonitor=" + tamanoMonitor + ", modeloTeclado=" + modeloTeclado + ", modeloRaton=" + modeloRaton + '}';
    }
}