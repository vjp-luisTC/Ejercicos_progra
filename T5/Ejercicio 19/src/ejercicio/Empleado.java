package ejercicio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danielcoello
 */
import java.util.Scanner;

public class Empleado {

    private String nombre;
    private int horas;
    private double tarifa;

    // Constructor donde se piden los datos al usuario (como exige el ejercicio)
    public Empleado() {
        //Pedir datos en main y pasar al parametrizado
        //Falta el constructor parametrizado , setter
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el nombre del empleado: ");
        nombre = scanner.nextLine();

        System.out.print("Introduzca las horas trabajadas: ");
        horas = scanner.nextInt();

        System.out.print("Introduzca la tarifa por hora: ");
        tarifa = scanner.nextDouble();
    }

    // Método que calcula el sueldo bruto según lo indicado
    public double calcularSueldo() {
        if (horas <= 40) {
            return horas * tarifa;
        } else {
            int extras = horas - 40;
            return (40 * tarifa) + (extras * tarifa * 1.5);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}