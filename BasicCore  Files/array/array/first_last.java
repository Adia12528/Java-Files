package array;

import java.util.Scanner;

public class first_last {
        public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a[] = new int[10];
            for (int i = 0; i <= 9; i++) {
                System.out.print("Enter the element: ");
                a[i] = sc.nextInt();
            }
            for (int j = 0; j <= 9; j++) {
                if (j == 0) {
                    System.out.print(a[j]+" ");
                }
                else if(j == 9){
                    System.out.print(a[j]+" ");
                }
            }
        }
    }
}
