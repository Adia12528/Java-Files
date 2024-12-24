package Conditional;

import java.util.Scanner;

public class check_type_of_triangle {
            public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the sides and their angles: ");
            System.out.print("Enter angle one = ");
            int a = sc.nextInt();
            System.out.print("Enter angle two = ");
            int b = sc.nextInt();
            System.out.print("Enter angle three = ");
            int c = sc.nextInt();
            if(a == b && b == c && c == a){
                System.out.println("Eqilateral traingle!");
            }
            else if(a == b || b == c || c == a){
                System.out.println("isoceles triangle!");
            }
            else{
                System.out.println("scalene traingle!");
            }
        }
    }
}
