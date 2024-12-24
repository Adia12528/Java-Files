package Conditional;

import java.util.*;

public class leap_year_ornot {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Year: ");
                int a = sc.nextInt();
                if(a % 4 == 0){
                    System.out.println("Leap Year !");
                }
                else{
                    System.out.println("Is not leap year !");
                }
        }
    }
}
