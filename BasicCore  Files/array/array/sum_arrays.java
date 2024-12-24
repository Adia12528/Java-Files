package array;

import java.util.Scanner;

public class sum_arrays {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a[] = new int[5];
            for (int i = 0; i <= 4; i++) {
                System.out.print("Enter the element in a: ");
                a[i] = sc.nextInt();
            }
            int b[] = new int[5];
            for (int j = 0; j <= 4; j++) {
                System.out.print("Enter the element in b: ");
                b[j] = sc.nextInt();
            }
            int c[] = new int[5];
            for (int k = 0; k <= 4; k++) {
                c[k] = a[k] + b[k];
            }
            for (int i = 0; i <= 4; i++) {
                System.out.println(" c["+i+"] = "+" a["+i+"] + "+" b["+i+"] - "+c[i]);
                // System.out.println("Value - "+c[i]);
            }
        }
    }
}
