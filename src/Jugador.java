import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Jugador {

    private String nombre;
    private List<Carta> cartasJugador = new LinkedList<>();


    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public void repartirCarta(Carta carta) {
        cartasJugador.add(carta);
    }




    public int getPuntuacion() {
        int puntuacion = 0;
        for(Carta carta: cartasJugador){
            if(carta.getNumero() >= 2 && carta.getNumero() <=10 )
                puntuacion = puntuacion + carta.getNumero();
            if(carta.getNumero() > 10)
                puntuacion += 10;
            if(carta.getNumero() == 1){
                if(puntuacion + 11 > 21)
                    puntuacion += 1;
                else puntuacion +=11;
            }

        }
        return puntuacion;
    }

    @Override
    public String toString() {
        return nombre + ":" + agrupacartas();
    }
    private String agrupacartas() {

        String cartasBaraja = "";
        for (Carta carta : cartasJugador)
            cartasBaraja += carta + ",";
        return cartasBaraja.substring(0, cartasBaraja.length() -1);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Carta> getCartasJugador() {
        return cartasJugador;
    }

    public void setCartasJugador(List<Carta> cartasJugador) {
        this.cartasJugador = cartasJugador;
    }
}
