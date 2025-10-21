package Exercicio6;

import java.util.ArrayList;

public class Baralho {
    public ArrayList<Carta> cartas;

    public void montarBaralho(){
        cartas = new ArrayList<Carta>();

        for (int i = 0; i < 10; i++) {
            int numero = (int)(Math.random() * 13) + 1;
            int naipe = (int)(Math.random() * 4) + 1;

            if(verificarSeCartaExiste(numero, naipe))
            {
                i--;
                continue;
            }

            Carta carta = new Carta(numero, naipe);
            cartas.add(carta);
        }
    }


    public String imprimirCartas() {
        String resultado = "";

        for (Carta carta : cartas) {
            resultado += "Naipe: " + carta.getNaipe() + ", Número: " + carta.getNumero() + "\n";
        }

        return resultado;
    }

    public boolean verificarSeCartaExiste(int numero, int naipe){
        for (Carta carta : cartas) {
            if(carta.getNumero() == numero && carta.getNaipe() == naipe){
                return true;
            }
        }
        return false;
    }
}
