package ua.in.soul.epamprojects;

public class Triangle4 {

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
        int n = 0;
        while (n < 10) {
            for (int i = 0; i < n; i++) {
                System.out.printf(" ");
            }
            for (int i = n; i < 10; i++) {
                System.out.printf("*");
            }
            System.out.println();
            n++;
        }
    }
}
