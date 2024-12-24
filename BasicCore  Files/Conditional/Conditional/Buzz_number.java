package Conditional;

import java.util.*;

public class Buzz_number{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            if(n % 7 == 0){
                System.out.println("Buzz number !");
            }
            else if(n % 10 == 7){
                System.out.println("Buzz number !");
            }
            else{
                System.out.println("Not a buzz number !");
            }
        }
    }
}