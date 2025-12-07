/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;
import java.util.Scanner;
/**
 *
 * @author danielcoello
 */
public class Test {
    static Scanner scanner = new Scanner(System.in);

    // Métodos de control
    public static int pedirDiscoDuro() {
        int disco;
        do {
            System.out.print("Introduce la capacidad del disco duro (múltiplo de 5): ");
            disco = scanner.nextInt();
        } while (disco % 5 != 0);
        return disco;
    }

    public static String pedirProcesador() {
        String[] opciones = {"Intel i5", "Intel i7", "AMD Ryzen 5", "AMD Ryzen 7"};
        String procesador;
        boolean valido;
        do {
            System.out.println("Elige modelo de procesador:");
            for (String op : opciones) {
                System.out.println("- " + op);
            }
            procesador = scanner.nextLine();
            valido = false;
            for (String op : opciones) {
                if (op.equalsIgnoreCase(procesador)) {
                    valido = true;
                    procesador = op; // formateamos correctamente
                    break;
                }
            }
        } while (!valido);
        return procesador;
    }

    public static double pedirPrecio() {
        double precio;
        do {
            System.out.print("Introduce el precio (mayor que 0): ");
            precio = scanner.nextDouble();
        } while (precio <= 0);
        return precio;
    }

    public static double pedirTamanoMonitor() {
        double tamano;
        do {
            System.out.print("Introduce tamaño del monitor (mayor a 14 pulgadas): ");
            tamano = scanner.nextDouble();
        } while (tamano <= 14);
        return tamano;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear objetos Servidor con constructor con parámetros
        Servidor servidor1 = new Servidor(16, 500, "Intel i7", "NVIDIA GTX 1660", 1200,
                24, "Logitech K120", "Logitech M100");
        Servidor servidor2 = new Servidor(32, 1000, "AMD Ryzen 7", "NVIDIA RTX 3060", 2000,
                27, "Corsair K70", "Razer DeathAdder");

        // Crear objetos Portátil con constructor con parámetros
        Portatil portatil1 = new Portatil(8, 250, "Intel i5", "Intel UHD", 800,
                "HP", 15.6, 2.1);
        Portatil portatil2 = new Portatil(16, 500, "AMD Ryzen 5", "AMD Radeon", 1200,
                "Dell", 17, 2.5);

        // Crear objetos Servidor y Portátil con constructor por defecto
        Servidor servidor3 = new Servidor();
        System.out.println("Introduce los datos del Servidor 3:");
        servidor3.setMemoriaRAM(16);
        servidor3.setDiscoDuro(pedirDiscoDuro());
        servidor3.setProcesador(pedirProcesador());
        servidor3.setTarjetaGrafica("NVIDIA GTX 1050");
        servidor3.setPrecio(pedirPrecio());
        servidor3.setTamanoMonitor(pedirTamanoMonitor());
        servidor3.setModeloTeclado("Microsoft");
        servidor3.setModeloRaton("Logitech");

        Portatil portatil3 = new Portatil();
        System.out.println("Introduce los datos del Portátil 3:");
        portatil3.setMemoriaRAM(8);
        portatil3.setDiscoDuro(pedirDiscoDuro());
        portatil3.setProcesador(pedirProcesador());
        portatil3.setTarjetaGrafica("Intel UHD");
        portatil3.setPrecio(pedirPrecio());
        portatil3.setMarca("Lenovo");
        portatil3.setTamanoPantalla(14);
        portatil3.setPeso(1.8);

        // Mostrar datos de los 6 objetos
        System.out.println("\n--- Servidores ---");
        System.out.println(servidor1);
        System.out.println(servidor2);
        System.out.println(servidor3);

        System.out.println("\n--- Portátiles ---");
        System.out.println(portatil1);
        System.out.println(portatil2);
        System.out.println(portatil3);
    }
}