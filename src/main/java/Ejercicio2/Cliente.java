package Ejercicio2;

import java.util.ArrayList;

public class Cliente {
    String nombre;
    ArrayList<Obra> obrasCompradas;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.obrasCompradas = new ArrayList<Obra>();
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre;
    }
}
