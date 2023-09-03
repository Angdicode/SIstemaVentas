package model;

import java.util.Scanner;

public class Tienda {
    static Scanner sc_string=new Scanner(System.in);
    static Scanner sc_double=new Scanner(System.in);
    static Scanner sc_int=new Scanner(System.in);

    public static void agregarProducto(String nombres[], double precios[], int cantidad[]) {
        for (int i=0; i< nombres.length; i++) {
            if(nombres[i]==null) {
                System.out.println("Ingrese el nombre del producto: ");
                String nombre_producto=sc_string.nextLine();
                nombres[i]=nombre_producto;
                System.out.println("Ingrese el precio del producto: ");
                double precio_producto= sc_double.nextDouble();
                precios[i]=precio_producto;
                System.out.println("Ingrese la cantidad: ");
                int cantidad_producto=sc_int.nextInt();
                cantidad[i]=cantidad_producto;
            }
        }
        System.out.println("Los productos se agregaron con exito");
    }

    public void consultarNombre(String nombres[],double precios[], int cantidad[]) {
        boolean producto_encontrado=false;
        System.out.println("Ingrese el nombre del producto que desea consultar: ");
        String nombre_buscar=sc_string.nextLine();
        for (int i=0; i< nombres.length;i++) {
            if(nombre_buscar.equalsIgnoreCase(nombres[i])) {
                continue;
            }
            System.out.println("Producto ingresado: "+nombre_buscar + "\nPrecio " + precios[i] +"\nCantidad: "+cantidad[i]);
            producto_encontrado=true;
            break;
        }
    }

    public void listaProducto(String nombres[],double precios[], int cantidad[]) {
        for (int i=0; i< nombres.length; i++) {
            System.out.println("Nombre: " + nombres[i] + "\nPrecio "+precios[i] + "\nCantidad: " + cantidad[i]);
        }
    }

    public void mayorPrecio(double precios[]) {
        double mayor_precio=0.0;
        for (int i=0; i<precios.length;i++) {
            if(precios[i]>mayor_precio) {
                mayor_precio=precios[i];
            }
        }
        System.out.println("El precio mas alto es " + mayor_precio);
    }

    public void menorPrecio(double precios[]) {
        double menor_precio=precios[0];
        for (int i=0; i<precios.length;i++) {
            if(precios[i]<menor_precio) {
                menor_precio=precios[i];
            }
        }
        System.out.println("El menor precio es: " + menor_precio);
    }

    public void eliminarProducto(String nombres[],double precios[], int cantidad[]) {
        System.out.println("Ingrese el nombre del producto que desea eliminar: ");
        String producto_eliminar=sc_string.nextLine();
        for (int i=0; i< nombres.length; i++) {
            if (nombres[i] != null && nombres[i].equalsIgnoreCase(producto_eliminar)) {
                nombres[i]=null;
                precios[i]=0.0;
                cantidad[i]=0;
                System.out.println("Producto eliminado con exito");
            }
        }
    }
}