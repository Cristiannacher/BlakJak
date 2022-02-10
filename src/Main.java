import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        Baraja baraja = new Baraja();
        baraja.barajar();
        Jugador pedro = new Jugador("Pedro");
        pedro.repartirCarta(baraja.extraerCarta());
        pedro.repartirCarta(baraja.extraerCarta());

        String contestacion = "";

        System.out.println(pedro);
        System.out.println(pedro.getPuntuacion());

        do {
            System.out.println("Quieres otra carta??");
            contestacion = reader.next();
            if (contestacion.equals("si")) {
                pedro.repartirCarta(baraja.extraerCarta());
                System.out.println(pedro);
                System.out.println(pedro.getPuntuacion());
            }

        } while (contestacion.equals("si") && pedro.getPuntuacion() <= 21);

        if(pedro.getPuntuacion()> 21)
        System.out.println("HAS PERDIDO !!!");
        else System.out.println("JIJIJI JA");
    }
}
