package Two_D_array;

import java.util.Scanner;

public class sum_of_boundary_elements {
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
                    if (arr[i][j] != arr[1][1]) {
                        s = s + arr[i][j]; 
                        System.out.print(arr[i][j]+" ");
                    }
                    else{
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
            System.out.println(s);
        }
    }
}
