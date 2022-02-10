public class Carta {
    private int numero;

    public enum Palo {
        PICAS,
        CORAZONES,
        ROMBOS,
        TREBOLES;
    }

    private Palo palo;

    public Carta(int numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public static Palo[] cartas = {Palo.CORAZONES, Palo.PICAS, Palo.ROMBOS, Palo.TREBOLES};


    @Override
    public String toString() {
        String valor = String.valueOf(numero);
        if (numero == 1)
          valor = "A";
        if (numero == 11)
            valor = "J";
        if (numero == 12)
            valor = "Q";
        if (numero == 13)
            valor = "K";

        switch (palo) {
            case CORAZONES:
                return valor + " de" + " ♥";
            case PICAS:
                return valor + " de" + " ♠";
            case ROMBOS:
                return valor + " de" + " ♦";
            default:
                return valor + " de" + " ♣";
        }
    }

    public int getNumero() {
        return numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
