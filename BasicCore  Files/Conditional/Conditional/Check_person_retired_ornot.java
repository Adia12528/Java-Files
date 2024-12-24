package Conditional;

import java.util.Scanner;

public class Check_person_retired_ornot {
        public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your Age: ");
            int age = sc.nextInt();
            if(age > 60){
                System.out.println("Retired !");
            }
            else{
                System.out.println("Not retired !");
            }
        }
    }
}
