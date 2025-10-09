package Exercicio4;

import java.util.ArrayList;

public class Casa {
    ArrayList <Comodo> comodos;

    void main(String args[]){
        comodos = new ArrayList<Comodo>();
        comodos.add(new Comodo("Sala", "Sofa, TV, Mesa de Centro", 1, 2, 4.0, 5.0));
        comodos.add(new Comodo("Quarto", "Cama, Guarda-Roupa, Mesa de Cabeceira", 1, 1, 3.5, 4.0));
        comodos.add(new Comodo("Cozinha", "Geladeira, Fogão, Armários", 1, 1, 3.0, 3.5));
        imprimirCasa(comodos);
    }

    public static void imprimirCasa(ArrayList<Comodo> comodos) {
        double areaTotal = 0;
        System.out.println("Detalhes da Casa:");
        for (Comodo comodo : comodos) {
            System.out.println(comodo.imprimirComodo());
            System.out.println("-----------------------");
            areaTotal += comodo.calcularArea();
        }
        System.out.println("Area Total da Casa: " + areaTotal + "m²");
    }
}
