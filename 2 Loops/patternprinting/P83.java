package patternprinting;

public class P83 {
    public static void main(String[] args) {

        System.out.println(" _______ ");
        System.out.println("|\\     /|");
        System.out.println("| \\   / |");
        System.out.println("|  \\ /  |");
        System.out.println("|   \\   |");
        System.out.println("|  / \\  |");
        System.out.println("| /   \\ |");
        System.out.println("|/_____\\|\n\n");

        int i, j;
        for (i = 0; i <= 7; i++) {
            for (j = 0; j <= 7; j++) {
                if (j == 0||j==7)
                    System.out.print("|");
                // if (i + j == 8)
                // System.out.print("/");
                if (i == j )
                    System.out.print("\\");
                if (i == 7&&j<=6)
                    System.out.print("_");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}