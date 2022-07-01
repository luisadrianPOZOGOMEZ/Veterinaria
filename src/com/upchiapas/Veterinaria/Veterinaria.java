package com.upchiapas.Veterinaria;
import java.util.Scanner;
public class Veterinaria {

    private static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;

        do{
            System.out.println("Vender productos");
            System.out.println("Añadir consultas");
            System.out.println("ver ventas totales");
            System.out.println("Ver historial de consultas");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("Decidiste salirte del sistema");
                    break;
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Error, la opcion se sale fuera del rango del menu, ingrese un numero valido");
                    break;
            }
        }while(opcion != 0);

    }
}
