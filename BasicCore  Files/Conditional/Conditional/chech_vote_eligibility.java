package Conditional;

import java.util.*;;

public class chech_vote_eligibility {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your Age: ");
            int age = sc.nextInt();
            if(age > 18){
                System.out.println("Eligible for voting !");
            }
            else{
                System.out.println("Not eligible for voting !");
            }
        }
    }
}
