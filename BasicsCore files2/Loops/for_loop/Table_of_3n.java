package for_loop;

import java.util.Scanner;

public class Table_of_3n {
        public static void main(String[] args) {
        int i = 3;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number till you want to print the table of three: ");
            int n = sc.nextInt();
            for (int j = 1; j < n+1; j++) {
                System.out.println(i+" * "+j+" = "+i*j);
            }
        }
    }
}
