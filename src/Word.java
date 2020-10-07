import java.util.Scanner;

public class Word {

    public static void printX(String word) {
        int length = word.length();
        for (int i = 0; i < length; i++) {
            char x = word.charAt(i);
            if (Character.compare(' ', x) == 0) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
    }

    public static String getLetter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nOdgadnij literę (nietrafione: " + Game.notFound.toString() +"). Zostało Ci " + (6-Game.error) + " prób zanim zawiśniesz.");
        String ch = sc.nextLine();
        return ch;
    }

    public static boolean findLetter(char letter, char[] wordArray) {
        for (char tmp :
                wordArray) {
            if (tmp == letter) {
                return true;
            }
        } return false;
    }


    public static char[] wordToArray(String word) {
        char[] wordArray = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            wordArray[i] = word.charAt(i);
        }
        return wordArray;
    }

    public static void doIfIsLetter(char letter, char[] wordArray) {
        Game.askedChars.add(letter);
        printWhatIsKnown(wordArray);
    }

    public static void doIfNoLetter(char letter, char[] wordArray) {
        Game.notFound.add(letter);
        printWhatIsKnown(wordArray);
    }

    public static void printWhatIsKnown (char[] wordArray) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wordArray.length; i++) {
            if (Game.askedChars.contains(wordArray[i])) {
                sb.append(wordArray[i]);
            } else if (Character.compare(' ', wordArray[i]) == 0){
                sb.append(' ');
            } else {
                sb.append('*');
            }
        } System.out.println("Słowo do odgadnięcia:\n" + sb);
    }

    public static boolean ifLetter (String word) {
        if (word.length() > 1) {
            return false;
        }
        return true;
    }

    public static boolean tryGuess (String userLetter, String movie) {
        if (userLetter.contains(movie)) {
            return true;
        } else {
            return false;
        }
    }
}
