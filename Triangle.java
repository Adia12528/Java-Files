package practice;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            final int m = n;
            // int n = 1;
            for (int i = n; i >= 1; i--) {
                for (int j = n; j >= 1; j--) {
                    System.out.print(" ");
                }
                for (int j = n-1; j < m; j++) {
                    System.out.print("*");
                }
                for (int j = n-1; j < m-1; j++) {
                    System.out.print("*");
                }
                System.out.println();
                n--;
            }
        }
    }
}