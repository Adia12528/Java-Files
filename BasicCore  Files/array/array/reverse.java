package array;

import java.util.Scanner;

public class reverse {
        public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a[] = new int[10];
            for (int i = 0; i <= 9; i++) {
                System.out.print("Enter the element: ");
                a[i] = sc.nextInt();
            }
            for (int j = 9; j >= 0; j--) {
                System.out.print(a[j]+" ");
            }
        }
    }
}
