package Ejercicio2;

public class Libro extends Obra{
    int numPaginas;

    public Libro(String titulo, String autor, int numPaginas){
        super(titulo, autor);
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Libro " + titulo + " de " + autor + " con " + numPaginas + " páginas";
    }
}
