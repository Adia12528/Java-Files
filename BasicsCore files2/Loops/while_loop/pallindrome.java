package while_loop;

import java.util.*;

public class pallindrome {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number = ");
            int n = sc.nextInt();
            int x = n;
            int r;
            int s = 0;
            while (n > 0) {
                r = n%10;
                s = (s*10)+r;
                n = n/10;
            }
            if (x == s) {
                System.out.println("Is a Pallindrome Number!");
            }
            else{
                System.out.println("Is not a pallindrome Number!");
            }
        }
    }
}
