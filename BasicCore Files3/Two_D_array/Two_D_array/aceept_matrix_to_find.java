package Two_D_array;

import java.util.Scanner;

public class aceept_matrix_to_find {
        public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int arr[][] = new int[3][3];
            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <= 2; j++) {
                    System.out.print("Enter the element = ");
                    arr[i][j] = sc.nextInt();
                }
            }
            int max = arr[0][0];
            int min = arr[0][0];
            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <= 2; j++) {
                    if (arr[i][j] > max) {
                        max = arr[i][j];
                    }
                    else if (arr[i][j] < min) {
                        min = arr[i][j];
                    }
                    // System.out.print(arr[i][j]+" ");
                }
                // System.out.println( );
            }
            System.out.println("Highest = "+ max);
            System.out.println("Lowest = "+min);
        }
    }
}
