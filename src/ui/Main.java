package ui;

import model.Tienda;

import java.util.Scanner;

public class Main {
    static String nombres[];
    static double precios[];
    static int cantidad[];
    static Tienda tienda;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nombres= new String[10];
        precios= new double[10];
        cantidad = new int[10];
        tienda=new Tienda();

        String continuar_sistema;
        do {
            menu();
            System.out.println("Desea continuar en el sistema?");
            continuar_sistema= sc.nextLine();
        } while (continuar_sistema.equalsIgnoreCase("si"));

    }
    public static void menu() {
        Scanner scan_int=new Scanner(System.in);
        System.out.println("Bienvenido a la tienda virtual\n" +
                "1. Agregar producto\n" +
                "2. Consultar producto por nombre\n" +
                "3. Consultar lista de productos\n" +
                "4. Buscar el producto con el mayor precio\n" +
                "5. Buscar el producto con el menor precio\n" +
                "6. Eliminar producto\n"+
                "Elija una opcion: ");
        int opcion = scan_int.nextInt();

        if (opcion==1) {
            tienda.agregarProducto(nombres,precios,cantidad);
        } else if (opcion==2){
            tienda.consultarNombre(nombres,precios,cantidad);
        } else if (opcion==3) {
            tienda.listaProducto(nombres,precios,cantidad);
        } else if (opcion==4) {
            tienda.mayorPrecio(precios);
        } else if (opcion==5){
            tienda.menorPrecio(precios);
        } else if (opcion==6) {
            tienda.eliminarProducto(nombres,precios,cantidad);
        } else {
            System.out.println("Datos incorrectos");
        }
    }
}