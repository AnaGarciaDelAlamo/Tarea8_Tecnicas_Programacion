package Ejercicio2;

public class Video extends Obra{
    int duracionMinutos;

    public Video(String titulo, String autor, int duracionMinutos){
        super(titulo, autor);
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public String toString() {
        int horas = duracionMinutos / 60;
        int minutos = duracionMinutos % 60;
        return "Video " + titulo + " de " + autor + " con duración " + horas + "h " + minutos + "min";
    }
}
