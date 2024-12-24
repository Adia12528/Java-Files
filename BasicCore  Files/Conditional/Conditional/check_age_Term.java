package Conditional;

import java.util.*;

public class check_age_Term{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your Age: ");
            int age = sc.nextInt();
            if(age < 13){
                System.out.println("Child");
            }
            else if(age < 20){
                System.out.println("Teen agers");
            }
            else if(age < 45){
                System.out.println("Young");
            }
            else if(age < 60){
                System.out.println("Adult");
            }
            else{
                System.out.println("Old");
            }
        }
    }
}
