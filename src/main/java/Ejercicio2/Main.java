package Ejercicio2;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

   static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    static ArrayList<Obra> obrasDisponibles = new ArrayList<Obra>();
    static ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int opcion;

         do{
             System.out.println("--MENÚ PRINCIPAL--");
             System.out.println("0.- Salir");
             System.out.println("1.- Mostrar clientes");
             System.out.println("2.- Crear cliente");
             System.out.println("3.- Crear una obra");
             System.out.println("4.- Crear un pedido");
             System.out.println("5.- Mostrar pedidos");

             opcion = sc.nextInt();

             switch (opcion){
                 case 0:
                     System.out.println("Adiós");
                     return;
                 case 1:
                     System.out.println("--LISTA DE CLIENTES--");

                     break;
                 case 2:
                     break;
                 case 3:
                     break;
                 case 4:
                     break;
                 case 5:
                     break;
                 default:
                     System.out.println("Opción no válida");
             }
         }while (opcion != 6);
    }
}
