package array;

import java.util.Scanner;

public class odd_even {
            public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a[] = new int[10];
            for (int i = 0; i <= 9; i++) {
                System.out.print("Enter the element: ");
                a[i] = sc.nextInt();
            }
            for (int j = 0; j <= 9; j++) {
                if (a[j] % 2 == 0) {
                    System.out.print(a[j]+" ");
                }
            }
            System.out.println();
            for (int k = 0; k <= 9; k++) {
                if (a[k] % 2 != 0) {
                    System.out.print(a[k]+" ");
                }
            }
        }
    }
}
