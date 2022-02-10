import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Baraja {
    List<Carta> barajaCartas = new LinkedList<>();

    public Baraja() {
        for (int i = 0; i < Carta.Palo.values().length; i++) {
            for (int j = 1; j < 14; j++) {
                Carta carta = new Carta(j, Carta.Palo.values()[i]);

                barajaCartas.add(carta);
            }
        }
    }

    Random random = new Random();

    public void barajar() {
        List<Carta> barajaBarajada = new LinkedList<>();

        while (!barajaCartas.isEmpty()) {
            int randomIndex = random.nextInt(barajaCartas.size());
            Carta cartaRandom = barajaCartas.remove(randomIndex);
            barajaBarajada.add(cartaRandom);
        }
        barajaCartas = barajaBarajada;
    }

    public Carta extraerCarta() {
        int numeroAleatorio = random.nextInt(barajaCartas.size());
        return barajaCartas.remove(numeroAleatorio);
    }

    public void imprimeBaraja() {
        for (Carta carta : barajaCartas)
            System.out.println(carta);
    }

    String pikas = "";
    String corazones = "";
    String rombos = "";
    String treboles = "";

    private void agrupaCartasPorPalo() {
        for (Carta carta : barajaCartas) {
            if (carta.getPalo() == Carta.Palo.PICAS)
                pikas += carta + "  ";
            if (carta.getPalo() == Carta.Palo.CORAZONES)
                corazones += carta + "  ";
            if (carta.getPalo() == Carta.Palo.ROMBOS)
                rombos += carta + "  ";
            if (carta.getPalo() == Carta.Palo.TREBOLES)
                treboles += carta + "  ";
        }
    }


    @Override
    public String toString() {
        agrupaCartasPorPalo();
        return pikas + "\n" + corazones +"\n" +  rombos + "\n" + treboles;
    }
}

