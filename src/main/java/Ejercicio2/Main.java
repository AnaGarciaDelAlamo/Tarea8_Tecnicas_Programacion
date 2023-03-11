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
                     mostrarClientes();
                     break;
                 case 2:
                     crearCliente();
                     break;
                 case 3:
                        crearObra();
                     break;
                 case 4:
                        crearPedido();
                     break;
                 case 5:
                     mostrarPedidos();
                     break;
                 default:
                     System.out.println("Opción no válida");
             }
         }while (opcion != 6);
    }

    public static void mostrarClientes(){
        System.out.println("--LISTA DE CLIENTES--");
        for(Cliente cliente : clientes){
            System.out.println(cliente.toString());
        }
        System.out.println();
    }

    public static void crearCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--CREAR CLIENTE--");
        System.out.println("Nombre del cliente: ");
        String nombre = sc.nextLine();
        Cliente cliente = new Cliente(nombre);
        clientes.add(cliente);
        System.out.println("El cliente se ha añadido correctamente");
    }

    public static void crearObra(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--CREAR OBRA--");
        System.out.println("Título de la obra: ");
        String titulo = sc.nextLine();
        System.out.println("Autor de la obra: ");
        String autor = sc.nextLine();
        System.out.println("Tipo de obra (1.- Libro, 2.- Video): ");
        int tipo = sc.nextInt();
        if(tipo == 1){
            System.out.println("Número de páginas: ");
            int numPaginas = sc.nextInt();
            Libro libro = new Libro(titulo, autor, numPaginas);
            obrasDisponibles.add(libro);
            System.out.println("El libro se ha añadido correctamente");
        }else if(tipo == 2){
            System.out.println("Duración en minutos: ");
            int duracionMinutos = sc.nextInt();
            Video video = new Video(titulo, autor, duracionMinutos);
            obrasDisponibles.add(video);
            System.out.println("El vídeo se ha añadido correctamente");
        }else{
            System.out.println("Opción no válida");
        }
    }

    public static void crearPedido(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--CREAR PEDIDO--");
        System.out.println("Nombre del cliente: ");
        String nombre = sc.nextLine();
        Cliente cliente = null;
        for(Cliente c : clientes){
            if(c.nombre.equals(nombre)){
                cliente = c;
                break;
            }
        }
        if(cliente == null){
            System.out.println("Cliente no encontrado");
            return;
        }
        Pedido pedido = new Pedido();
        pedido.Pedidio(cliente);
        int opcion;
        do{
            System.out.println("0.- Salir");
            System.out.println("1.- Añadir obra");
            opcion = sc.nextInt();
            switch (opcion){
                case 0:
                    break;
                case 1:
                    System.out.println("Título de la obra: ");
                    sc.nextLine();
                    String titulo = sc.nextLine();
                    Obra obra = null;
                    for(Obra o : obrasDisponibles){
                        if(o.titulo.equals(titulo)){
                            obra = o;
                            break;
                        }
                    }
                    if(obra == null){
                        System.out.println("Obra no encontrada");
                        return;
                    }
                    pedido.agregarObra(obra);
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }while (opcion != 0);
        pedidos.add(pedido);
        System.out.println("Su pedido se ha añadido correctamente");
    }

    public static void mostrarPedidos(){
        System.out.println("--LISTA DE PEDIDOS--");
        for(Pedido pedido : pedidos){
            System.out.println(pedido.toString());
        }
        System.out.println();
    }
}
