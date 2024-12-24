package array;

import java.util.Scanner;

public class desc {
        public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a[] = new int[10];
            int t = 0;
            for (int i = 0; i <= 9; i++) {
                System.out.print("Enter the element: ");
                a[i] = sc.nextInt();
            }
            for (int j = 0; j <= 9; j++) {
                for (int i = (j+1); i <= 9; i++) {
                    if (a[j] < a[i]) {    
                        t = a[j];
                        a[j] = a[i];
                        a[i] = t;
                    }
                }
                System.out.print(a[j]+" ");
            }
        }
    }
}
