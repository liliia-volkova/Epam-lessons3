package ua.in.soul.epamprojects;

public class Triangle1 {

    public static void main(String[] args) {

        int line = 1;
        while (line <= 9) {
            int value = line;
            while (value >= 1) {
                System.out.print("*");
                value--;
            }
            System.out.println();
            line++;
        }
        while (line >= 1) {
            int value = line;
            while (value >= 1) {
                System.out.print("*");
                value--;
            }
            System.out.println();
            line--;
        }
    }
}
