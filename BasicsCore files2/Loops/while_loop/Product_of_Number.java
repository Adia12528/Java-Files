package while_loop;

import java.util.Scanner;

public class Product_of_Number {
        public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            int r;
            int s = 1;
            while (n > 0) {
                r = n%10;
                s = s*r;
                n = n/10;
            }
            System.out.println("Sum of digit: "+s);
        }
    }
}
