package Two_D_array;

import java.util.Scanner;

public class sum_matrix {
        public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int arr[][] = new int[3][3];
            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <= 2; j++) {
                    System.out.print("Enter the element = ");
                    arr[i][j] = sc.nextInt();
                }
            }
            int sum = 0;
            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <= 2; j++) {
                    sum = sum + arr[i][j];
                }
            }
            System.out.print(sum);
        }
    }
}
