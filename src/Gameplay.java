public class Gameplay {

    public static int playGame() {
        int resultletter = 0;
        int resultWord = 0;
        String word = ListOfMovies.getMovie().toUpperCase();
        char[] wordArray = Word.wordToArray(word);

        System.out.println("Słowo do odgadnięcia");
        Word.printX(word);
        boolean gameOver = false;

        while (!gameOver) {
            String userLetter = Word.getLetter().toUpperCase();
            if (Word.ifLetter(userLetter)) {
                char letter = userLetter.charAt(0);
                if (Game.letters.contains(letter)) {
                    System.out.println("Podałeś już tą liczbę");
                } else {
                    Game.letters.add(letter);
                    boolean isLetter = Word.findLetter(letter, wordArray);
                    if (isLetter) {
                        resultletter++;
                        Word.doIfIsLetter(letter, wordArray);
                    } else {
                        Game.error++;
                        printDeathMan.printError(Game.error);
                        if (Game.error < 6) {
                            Word.doIfNoLetter(letter, wordArray);
                        } else {
                            System.out.println("Niestety nie udało Ci się odgadnąć nazwy filmu. R.I.P. Aniołku [*]");
                            System.out.println("Szukane słowo to: " + word);
                            gameOver = true;
                            return resultletter;
                        }
                    }
                }
            } else {
                if (Word.tryGuess(userLetter, word)) {
                    resultWord = 20;
                    System.out.println("Gratulacje. Udało Ci się odgadnąć tytuł filmu.");
                    return resultWord;
                } else {
                    Game.error++;
                    printDeathMan.printError(Game.error);
                    if (Game.error < 6) {
                        System.out.println("Niestety nie udało Ci się odgadnąć nazwy filmu.");
                        Word.printWhatIsKnown(wordArray);
                    } else {
                        System.out.println("Niestety nie udało Ci się odgadnąć nazwy filmu. R.I.P. Aniołku [*]");
                        System.out.println("Szukane słowo to: " + word);
                        gameOver = true;
                        return resultletter;
                    }
                }
            }
        }
        return 0;
    }
}

