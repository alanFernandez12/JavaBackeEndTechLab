package org.example.articulo.modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        precargarCategorias();
        Scanner sc = new Scanner(System.in);
        ArrayList<Articulo> Articulos = new ArrayList<>();
        int opcion;
        do {
            System.out.println("================================");
            System.out.println("SISTEMA DE ARTÍCULOS - CLASE 4 (HERENCIA Y TO_STRING) ");
            System.out.println("1 - Ingresar artículo");
            System.out.println("2 - Listar artículos");
            System.out.println("3 - Consultar un artículo");
            System.out.println("4 - Modificar un artículo");
            System.out.println("5 - Eliminar un artículo");
            System.out.println("6 - Listar categorías");
            System.out.println("0 - Salir");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1: // Ingresar articulo

                    break;
                case 2:
                    // Lógica para listar artículos
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 3);



    }

    public static void precargarCategorias() {

        ArrayList<Categoria> categorias = new ArrayList<Categoria>();
        Categoria categoria1 = new Categoria(1, "Electronica", "Productos tecnológicos y electrónicos ");

        Categoria categoria2 = new Categoria(2, "Periféricos ", "Accesorios para computadora ");

        Categoria categoria3 = new Categoria(3, "Alimentos", "Productos alimenticios");

        Categoria categoria4 = new Categoria(4, "Limpieza", "Artículos de limpieza del hogar");

        categorias.add(categoria1);
        categorias.add(categoria2);
        categorias.add(categoria3);
        categorias.add(categoria4);
    }

    public static void menuArticulos() {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("--- INGRESAR ARTÍCULO --- ");
            System.out.println("1 - Artículo electrónico");
            System.out.println("2 - Artículo alimenticio");
            System.out.println("Seleccione el tipo de artículo:");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer
            if (opcion == 1) {
                // Lógica para ingresar artículo electrónico
            } else if (opcion == 2) {
                // Lógica para ingresar artículo alimenticio
            } else {
                System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 1 && opcion != 2);
    }
}
