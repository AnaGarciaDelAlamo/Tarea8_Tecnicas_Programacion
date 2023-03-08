package Ejercicio1;

import java.util.Random;

public class Dado {
    private int caras;
    private Random random;

    public Dado(int caras){
        this.caras= caras;
        this.random = new Random();
    }

    public int lanzar(){
        return random.nextInt(caras) + 1;
    }


}
