package Conditional;

import java.util.Scanner;

public class odd_even {
        public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int a = sc.nextInt();
            if(a % 2 == 0){
                System.out.println("Even number !");
            }
            else{
                System.out.println("Odd number !");
            }
        }
    }
}
