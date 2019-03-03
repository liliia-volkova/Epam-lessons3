package ua.in.soul.epamprojects;

public class Triangle5 {

    private static final int TOP = 10;

    public static void main(String[] args) {

        int width = 0;
        while (width < TOP) {
            for (int i = 0; i < TOP - width; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < width * 2 + 1; i++) {
                System.out.print("*");
            }
            System.out.println();
            width++;
        }
        int width2 = 0;
        while (width2 < TOP) {
            for (int i = 0; i < TOP - width2; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < width2 * 2 + 1; i++) {
                System.out.print("*");
            }
            System.out.println();
            width2++;
        }
    }
}
