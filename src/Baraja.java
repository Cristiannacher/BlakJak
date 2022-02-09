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

    public void Barajar() {
        List<Carta> barajaBarajada = new LinkedList<>();

        while (!barajaCartas.isEmpty()) {
            int randomIndex = random.nextInt(barajaCartas.size());
            Carta cartaRandom = barajaCartas.remove(randomIndex);
            barajaBarajada.add(cartaRandom);
        }
        barajaCartas = barajaBarajada;
    }

    public Carta extraerCartas() {
        int numeroAleatorio = random.nextInt(barajaCartas.size());
        return barajaCartas.remove(numeroAleatorio);
    }

    public void imprimeBaraja() {
        for (Carta carta : barajaCartas)
            System.out.println(carta);
    }

    private List<Carta> cartasPalo(Carta.Palo palo) {
        List<Carta> cartasDelPalo = new LinkedList<>();
        for (Carta carta : barajaCartas)
            if (carta.getPalo() == palo)
                cartasDelPalo.add(carta);
        return cartasDelPalo;
    }

    @Override
    public String toString() {
        imprimeCartas(cartasPalo(Carta.Palo.PICAS));
        imprimeCartas(cartasPalo(Carta.Palo.PICAS));
        imprimeCartas(cartasPalo(Carta.Palo.PICAS));
        imprimeCartas(cartasPalo(Carta.Palo.PICAS));
        return "Baraja{" +
                "barajaCartas=" + barajaCartas +
                ", random=" + random +
                '}';
    }
}

