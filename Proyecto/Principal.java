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
    Connection conexion;

    public static void main(String[] args) {
        int opcion;
        menuInicio();
    }

    private static void menuInicio(){
        while (opcion != 3){
            System.out.println("Bienvenido a ____.\n\n");
            System.out.println("1. Iniciar Sesión");
            System.out.println("2. Registrarse");
            System.out.println("3. Salir");
    
            opcion = teclado.nextInt();
    
            // if (opcion = 1) 

        }
    }


    private static void menuDeAdmin(){
        while (opcion != 0) {
            System.out.println("~ ~ Menú Admin ~ ~ ");
        }
    }

    private static void menuDeUsuario() {

        while (opcion != 0) {
            System.out.println("~ ~ Menú ~ ~");
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
    
    private static void buscarProducto() {
        System.out.print("Introduzca el id del producto que desea buscar: ");
        String id_Prod = teclado.next();
    }
    
    private static void añadirProducto() {
        System.out.print("Introduzca el id del producto que desea añadir: ");
        String id_Prod = teclado.next();
        System.out.print("¿Cuántas unidades desea añadir?");
        int unidades_Prod = teclado.nextInt();
    }


    private static void registrarUsuario() {
        System.out.println("Introduzca los siguientes datos: ");
        System.out.print("DNI: ");
        String DNI = teclado.next();
        System.out.print("Correo electrónico: ");


    }
}