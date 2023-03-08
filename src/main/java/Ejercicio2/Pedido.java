package Ejercicio2;

import java.util.ArrayList;

public class Pedido {
    Cliente cliente;
    ArrayList<Obra> obrasPedidas;

    public void Pedidio(Cliente cliente){
        this.cliente = cliente;
        this.obrasPedidas = new ArrayList<Obra>();
    }

    public void agregarObra(Obra obra){
        obrasPedidas.add(obra);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("* Pedido de: " + cliente.nombre + ":\n");
        for(Obra obra : obrasPedidas){
            sb.append("   - " + obra.toString() + "\n");
        }
        return sb.toString();
    }
}
