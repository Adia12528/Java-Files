package practice;
import java.util.Scanner;

public class reverse_triangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            final int m = n;
            for (int l = n; l >= 1; l--) {
                for (int k = n; k < m; k++) {
                    System.out.print(" ");
                }
                for (int k = n; k > 1; k--) {
                    System.out.print("*");
                }
                for (int k = n-1; k > 1; k--) {
                    System.out.print("*");
                }
                System.out.println();
                n--;
            }
        }
    }
}
