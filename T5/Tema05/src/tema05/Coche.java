/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema05;

/**
 *
 * @author danielcoello
 */
public class Coche {

    //1º Atributos (NO se inicializa)
    private String ruedas;
    private String suspesion;
    private int espejos;

    // 2. CONSTRUCTORES: permiter "construir" (instanciar) un objeto de este tipo.
    // Inicializan todos los atributos.
    // 2.1. CONSTRUCTOR POR DEFECTO
    public Coche() {
        this.ruedas = "";
        this.suspesion = " ";
        this.espejos = 0;
    }

    // 2.2. CONSTRUCTOR PARAMETRIZADO (sobrecarga de métodos y autorreferencia this)
    public Coche(String ruedas, String suspesion, int espejos) {
        this.ruedas = ruedas;
        this.suspesion = suspesion;
        this.espejos = espejos;
    }
    // 3. MÉTODOS:

    // 3.1. GETTERS Y SETTERS: devuelven y establecen el valor de los atributos
    
  
    public String getRuedas() {
        return this.ruedas;
    }

     public void setRuedas(String ruedas) {
        this.ruedas = ruedas;
    }
     
    public String getSuspesion() {
        return this.suspesion;
    }
    
    public void setSuspesion(String suspesion) {
        this.suspesion = suspesion;
    }

    public int getEspejos() {
        return this.espejos;
    }
   
    public void setEspejos(int espejos) {
        this.espejos = espejos;
    }

    // 3.2. OTROS MÉTODOS
    // 4. TO STRING: devuelve un String con los datos del objeto

     public void acelerar(){
         System.out.println("Acelerando coche....");
     }
     
     public void frenar (){
         System.out.println("Frenando coche....");
     }
     
     
     public void girar(){
         System.out.println("Girando coche.....");
     }
     
    @Override
    public String toString() {
        return "Mi coche tiene " + "ruedas" + ruedas + ", suspesion" + suspesion + ", espejos" + espejos ;
    }
  
}