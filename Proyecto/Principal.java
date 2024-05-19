/**
 * @author Juan José Rivera Montes
 */

/*
 * Hacer clases Catálogo y Pedidos
 * Completar métodos
 * Crear BD
 */
package Proyecto;

import java.sql.Connection;
import java.util.Scanner;

public class Principal {
    static int opcion;
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        menu();
    }

    private static void menu() {

        while (opcion != 0) {
            System.out.println("~ ~ Menú ~ ~");
            System.out.println("1. Registrarse");
            System.out.println("2. Buscar productos");
            System.out.println("3. Añadir producto a la cesta");
            System.out.println("4. Comprar productos");
            System.out.println("5. Salir");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    registrarUsuario();
                    break;

                case 2:
                    buscarProducto();
                    break;

                case 3:
                    añadirProducto();
                    break;

                case 4:
                    buscarProducto();
                    break;

                case 5:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    break;
            }
        }
    }

    private static void añadirProducto() {
        System.out.print("Introduzca el nombre del producto que desea añadir: ");
        String id_Prod = teclado.next();
    }

    private static void buscarProducto() {

    }

    private static void registrarUsuario() {

    }

}