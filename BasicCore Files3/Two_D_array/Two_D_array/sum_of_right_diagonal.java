package Two_D_array;

import java.util.Scanner;

public class sum_of_right_diagonal {
        public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int arr[][] = new int[3][3];
            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <= 2; j++) {
                    System.out.print("Enter the element = ");
                    arr[i][j] = sc.nextInt();
                }
            }
            int s = 0;
            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <= 2; j++) {
                    if ((i+j) == 2) {
                        s = s + arr[i][j]; 
                    }
                }
            }
            System.out.println(s);
        }
    }
}
