package org.example.articulo.modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Categoria> categorias = new ArrayList<Categoria>();
        precargarCategorias(categorias);
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
                    menuArticulos(Articulos, categorias);
                    break;
                case 2:
                    // Lógica para listar artículos
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                case 6:
                    // Lógica para listar categorías
                    mostrarCategorias(categorias);
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 3);



    }

    public static void precargarCategorias(ArrayList<Categoria> categorias) {

        Categoria categoria1 = new Categoria(1, "Electronica", "Productos tecnológicos y electrónicos ");

        Categoria categoria2 = new Categoria(2, "Periféricos ", "Accesorios para computadora ");

        Categoria categoria3 = new Categoria(3, "Alimentos", "Productos alimenticios");

        Categoria categoria4 = new Categoria(4, "Limpieza", "Artículos de limpieza del hogar");

        categorias.add(categoria1);
        categorias.add(categoria2);
        categorias.add(categoria3);
        categorias.add(categoria4);
    }

    public static void menuArticulos(ArrayList<Articulo> Articulos, ArrayList<Categoria> categorias) {
        String nombre;
        double precio;
        int categoriaId;
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("--- INGRESAR ARTÍCULO --- ");
            System.out.println("1 - Artículo electrónico");
            System.out.println("2 - Artículo alimenticio");
            System.out.println("0 - Salir");
            System.out.println("Seleccione el tipo de artículo:");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer
            if (opcion == 1) {
                opcion = 0;
                    // Lógica para ingresar artículo electrónico
                    System.out.println("--- INGRESAR ARTÍCULO --- ");
                    System.out.println("Ingresar nombre del artículo..");
                    nombre = sc.nextLine();
                    sc.nextLine(); // Limpiar el buffer
                    System.out.println("Ingresar precio del artículo..");
                    precio = sc.nextDouble();
                    sc.nextLine(); // Limpiar el buffer
                    System.out.println("Ingresar categoria");
                    System.out.println("opcion 1 : Electronica");
                    System.out.println("opcion 2 : Periféricos");
                    System.out.println("opcion 3 : Alimentos");
                    System.out.println("opcion 4 : Limpieza");
                    categoriaId = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                    if (categoriaId < 1 || categoriaId > 4) {
                        System.out.println("Categoría inválida. Intente nuevamente.");
                        return;
                    }
                    if (categoriaId == 1) {

                        ArticuloElectronico articuloElectronico = new ArticuloElectronico(1, nombre, precio, categorias.get(1), 12);
                        Articulos.add(articuloElectronico);
                        System.out.println("Articulo electrónico agregado correctamente.");
                    }

                    if (categoriaId == 3) {
                        ArticuloAlimenticio articuloAlimenticio = new ArticuloAlimenticio(1, nombre, precio, categorias.get(3), 60);
                        Articulos.add(articuloAlimenticio);
                        System.out.println("Articulo alimenticio agregado correctamente.");

                }
                break;
            } else if (opcion == 2) {
                // Lógica para ingresar artículo alimenticio
            } else {
                System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 0);
    }

    public static void mostrarCategorias(ArrayList<Categoria> categorias) {
        // Lógica para mostrar categorías
        System.out.println("--- CATEGORÍAS ---");
        System.out.println(categorias);
    }
}
