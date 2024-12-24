package Oops.recursion;

import java.util.Scanner;

public class happy_number {
    public static void main(String Args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            int s = 0;
            while (n != 0) {
                int r = n%10;
                s = s+(r*r);
                n = n/10;
            }
            if (s == 1) {
                System.out.println("Is a happy number!");
            }
        }
    }
}
