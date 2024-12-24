package do_while;

import java.util.Scanner;

public class table_of_3n {
        public static void main(String[] args) {
        int i = 3;
        int j = 1;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number till you want to print the table of three: ");
            int n = sc.nextInt();
            do {
                System.out.println(i+" * "+j+" = "+i*j);
                j++;
            } while (j < n+1);
        }
    }
}
