package while_loop;

import java.util.Scanner;

public class Armstrong {
        public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            int r;
            int x = n;
            int s = 0;
            while (n > 0) {
                r = n%10;
                s = s+r*r*r;
                n = n/10;
            }
            if (x == s){
                System.out.println("Is a Armstrong number!");
            }
            else{
                System.out.println("Is not a Armstrong number!");
            }
        }
    }
}
