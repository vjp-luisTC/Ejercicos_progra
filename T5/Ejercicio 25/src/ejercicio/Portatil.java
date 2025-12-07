/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author danielcoello
 */
public class Portatil extends Ordenador {

    private String marca;
    private double tamanoPantalla;
    private double peso;

  public Portatil() {
    super(); 
    this.marca = "";
    this.tamanoPantalla = 0;
    this.peso = 0;
}
        
        // Constructor  parámetrizado
  public Portatil(int memoriaRAM, int discoDuro, String procesador, String tarjetaGrafica, double precio,
                String marca, double tamanoPantalla, double peso) {
    super(memoriaRAM, discoDuro, procesador, tarjetaGrafica, precio); // inicializa atributos de superclse
    this.marca = marca;
    this.tamanoPantalla = tamanoPantalla;
    this.peso = peso;
}

    public String getMarca() {
        return marca;
    }

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    @Override
    public int getDiscoDuro() {
        return discoDuro;
    }

    @Override
    public String getProcesador() {
        return procesador;
    }

    @Override
    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
    
    
    
    //Setter

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
 
 

    @Override
    public String toString() {
        return "Portatil{" + "marca=" + marca + ", tamanoPantalla=" + tamanoPantalla + ", peso=" + peso + '}';
    }
}
   