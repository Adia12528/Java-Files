package array;

import java.util.Scanner;

public class sum {
        public static void main(String[] args) {
            int p = 0;
        try (Scanner sc = new Scanner(System.in)) {
            int a[] = new int[10];
            for (int i = 0; i <= 9; i++) {
                System.out.print("Enter the element: ");
                a[i] = sc.nextInt();
            }
            for (int j = 0; j <= 9; j++) {
                p = p + a[j];
            }
            System.out.print(p);
        }
    }
}
