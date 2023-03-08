package Ejercicio1;

import java.util.Scanner;

public class JugadorGuerra {
   private int fichas;
   private Dado dado;
   private String nombre;

   public JugadorGuerra(int fichas, Dado dado, String nombre){
       this.fichas = fichas;
       this.dado = dado;
       this.nombre = nombre;
   }

   public int getFichas(){
       return fichas;
   }

   public void setFichas(int fichas){
       this.fichas = fichas;
   }

   public int lanzarDado(){
       return dado.lanzar();
   }

   public String getNombre(){
       return nombre;
   }

   public boolean tieneFichas(){
       return fichas > 0;
   }

   public void retirarFichas(){
       fichas --;
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dado dado = new Dado(6);

        System.out.println("Introduce el nombre del jugador 1: ");
        String nombre1 = sc.nextLine();
        JugadorGuerra jugador1 = new JugadorGuerra(10, dado, nombre1);
        System.out.println("Introduce el nombre del jugador 2: ");
        String nombre2 = sc.nextLine();
        JugadorGuerra jugador2 = new JugadorGuerra(10, dado, nombre2);

        int puntuacion1 = 0;
        int puntuacion2 = 0;

       do {
            int resultado1 = jugador1.lanzarDado();
            int resultado2 = jugador2.lanzarDado();

            System.out.println(jugador1.getNombre() + " ha sacado un: " + resultado1);
            System.out.println(jugador2.getNombre() + " ha sacado un: " + resultado2);

            if (resultado1 > resultado2){
                jugador2.retirarFichas();
                puntuacion1++;
                System.out.println(jugador1.getNombre() + " gana");
            } else if (resultado2 > resultado1) {
                jugador1.retirarFichas();
                puntuacion2++;
                System.out.println(jugador2.getNombre() + "gana");

            }else {
                System.out.println("Empate");
            }
        }while (jugador1.tieneFichas() && jugador2.tieneFichas());
    }

}
