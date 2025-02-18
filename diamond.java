package practice;
import java.util.Scanner;

class trigopattern{
    public static void main(String Args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            int o = n-1;
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
            for (int l = o; l >= 1; l--) {
                for (int k = o; k <= m; k++) {
                    System.out.print(" ");
                }
                for (int k = o; k >= 1; k--) {
                    System.out.print("*");
                }
                for (int k = o-1; k >= 1; k--) {
                    System.out.print("*");
                }
                System.out.println();
                o--;
            }
        }
    }
}