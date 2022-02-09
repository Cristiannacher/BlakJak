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

    public static Palo[]  cartas = {Palo.CORAZONES, Palo.PICAS, Palo.ROMBOS, Palo.TREBOLES};


    @Override
    public String toString() {
        switch (palo) {
            case CORAZONES:
                return numero + " de" + " ♥";
            case PICAS:
                return numero + " de" + " ♠";
            case ROMBOS:
                return numero + " de" + " ♦";
            case TREBOLES:
                return numero + " de" + " ♣";
        }
        return null;
    }

    public int getNumero() {
        return numero;
    }
    public Palo getPalo(){
        return palo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
