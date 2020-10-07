public class printDeathMan {

    public static void print1() {
        String s = "\n ______";
        System.out.println(s);
    }

    public static void print2() {
        String s =
                "\n|" +
                "\n|" +
                "\n|" +
                "\n|" +
                "\n|" +
                "\n|______";
        System.out.println(s);
    }

    public static void print3() {
        String s = " -----" +
                "\n| " +
                "\n| " +
                "\n| " +
                "\n| " +
                "\n|" +
                "\n|______";
        System.out.println(s);
    }

    public static void print4() {
        String s = " -----" +
                "\n|     |" +
                "\n|     O" +
                "\n|" +
                "\n|" +
                "\n|" +
                "\n|______";
        System.out.println(s);
    }

    public static void print5() {
        String s = " -----" +
                "\n|     |" +
                "\n|     O" +
                "\n|    /|\\" +
                "\n|" +
                "\n|" +
                "\n|______";
        System.out.println(s);
    }

    public static void print6() {
        String s = " -----" +
                "\n|     |" +
                "\n|     O" +
                "\n|    /|\\  " +
                "\n|    / \\   " +
                "\n|" +
                "\n|______";
        System.out.println(s);
        System.out.println("GAME OVER");
    }

    public static void printError(int i) {
        if (i == 1) {
            print1();
        }
        if (i == 2) {
            print2();
        }
        if (i == 3) {
            print3();
        }
        if (i == 4) {
            print4();
        }
        if (i == 5) {
            print5();
        }
        if (i == 6) {
            print6();
        }
    }
}
