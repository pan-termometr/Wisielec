import java.util.Scanner;

public class Player {
    private String name;
    private int points;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points += points;
    }

    public Player(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public static Player[] getPlayers () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ilu gra graczy?");
        int playersNumber = sc.nextInt();
        Player[] players = new Player[playersNumber];
        sc.nextLine();
        for (int i = 0; i < playersNumber; i++) {
            System.out.println("Podaj imię gracza");
            String name = sc.nextLine();
            players[i] = new Player(name, 0);
        }
        return players;
    }

    public static int getRounds() {
        System.out.println("Ile rund chcesz zagrać?");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
