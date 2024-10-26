import java.util.Random;

public class Dados {
    static int dado() {
        // numero pseudo-aleatorio entre 1 y 6
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    static void ganador(int d1, int d2) {
        if (d1 > d2) {
            System.out.println("Ganador jugador 1");
        } else if (d1 < d2) {
            System.out.println("Ganador jugador 2");
        } else {
            System.out.println("Empate");
        }
    }


    public static void main(String[] args) {
        System.out.println("Lanzamiento del jugador 1: ");
        int dado1 = dado();
        int dado2 = dado();
        System.out.println(dado1);
        System.out.println(dado2);

        System.out.println("Lanzamiento del jugador 2: ");
        int dado3 = dado();
        int dado4 = dado();
        System.out.println(dado3);
        System.out.println(dado4);

        ganador(dado1 + dado2, dado3 + dado4);
    }
}
