package ua.in.soul.epamprojects;

public class Triangle3 {

    public static void main(String[] args) {

        int k = 10;
        while (k > 0) {
            for (int i = 0; i < k; i++) {
                System.out.printf(" ");
            }
            for (int i = k; i < 10; i++) {
                System.out.printf("*");
            }
            System.out.println();
            k--;
        }
    }
}
