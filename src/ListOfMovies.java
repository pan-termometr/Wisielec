import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ListOfMovies {

    public static String getMovie() {
        List<String> list = new ArrayList<>();
        try {
            list = createListOfMovies();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Random rn = new Random();
        int random = rn.nextInt(500) + 1;

        String movie = list.get(random);
        return movie;
    }

    public static List<String> createListOfMovies() throws FileNotFoundException {
        File file = new File("movies.txt");
        Scanner in = new Scanner(file);
        List<String> list = new ArrayList<>();
            String nextLine;
            int i = 1;
            while ((nextLine = in.nextLine()) != null && i <= 500) {
                if (nextLine.equals(String.valueOf(i))) {
                    in.nextLine();
                    String tmp = in.nextLine();
                    list.add(tmp.substring(0, tmp.lastIndexOf(" ")));
                    i++;
                }
            }
        return list;
    }
}
