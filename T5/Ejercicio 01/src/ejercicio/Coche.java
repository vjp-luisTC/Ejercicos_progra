/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author danielcoello
 */
public class Coche {
    
    
    //Atributo de la clase coche 
    private String marca ; 
    private String modelo ;
    private String color;
    private  int   velocidad;
    private boolean  motorEncendido = false;
    
    //Metodos 
    
     public void establecerMarca(){
         System.out.println("Establece una marca  de coches :");
     }
    
     public void establecerModelo(){
          System.out.println("Establece un modelo  de coches :");
     }
     
     public void sEtablecerColor(){
         System.out.println("");
     }
     
     public void arrancarCoche (){
         motorEncendido = true  ;
         velocidad = 10;
     }   
             
     public void apagarCoche (){
         motorEncendido = false ;
         velocidad = 0; 
     }
     
     public void  acelerarCoche (){
         velocidad = 20+10;
     }

     public void frenarCoche (){
         velocidad = 6-(20 +10); 
     }

     
     //Constructor por defecto 
      public Coche() {
        this.marca = "";
        this.modelo = "";
        this.color = "";
        this.velocidad = 0;
    }
      
     //Constructor parametrizado
    public Coche(String marca, String modelo, String color, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
    }
    
    //Getter
    
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }
    
    //Setter
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }
    
     //To String pero en formato diferente 
    public String obtenerEstado() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", velocidad=" + velocidad + ", motorEncendido=" + motorEncendido + '}';
    }
}