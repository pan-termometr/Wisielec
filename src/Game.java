import org.w3c.dom.ls.LSOutput;

import java.io.FileNotFoundException;
import java.util.*;

public class Game {
    static List<Character> askedChars = new ArrayList<>();
    static int error = 0;
    static List<Character> notFound = new ArrayList<>();
    static Set<Character> letters = new TreeSet<>();

    public static void main(String[] args) {


        System.out.println("Witaj w grze Wisielec\n");
        Player[] players = Player.getPlayers();
        int rounds = Player.getRounds();

        for (int i = 0; i < rounds; i++) {
            System.out.println("Runda " + (i + 1));
            for (Player player :
                    players) {
                System.out.println("Gra: " + player.getName());
                int result = Gameplay.playGame();
                player.setPoints(result);
                askedChars.clear();
                notFound .clear();
                letters.clear();
                error = 0;
                System.out.println("Zdobyłeś: " + result + " pkt");
            }
        }

        System.out.println("\nKoniec gry. Oto wyniki: ");
        for (Player player :
                players) {
            System.out.println(player.getName() + " zdobył " + player.getPoints() + " pkt.");
        }
    }
}
