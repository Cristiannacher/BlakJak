public class Main {
    public static void main(String[] args) {

        Carta cuatroDeCorazones = new Carta(4, Carta.Palo.CORAZONES);
        Carta nueveDePicas = new Carta(9, Carta.Palo.PICAS);

        Baraja baraja = new Baraja();

        System.out.println(cuatroDeCorazones);

        baraja.imprimeBaraja();

    }
}
