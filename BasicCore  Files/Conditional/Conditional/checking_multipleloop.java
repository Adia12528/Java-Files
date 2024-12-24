package Conditional;
import java.util.*;
public class checking_multipleloop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number - ");
            int a = sc.nextInt();
            if(a > 0){
                System.out.println("Number is positive !");
                if(a % 2 != 0){
                    System.out.println("Number is Odd");
                    if(a % 5 == 0){
                        System.out.println("Number is Divisivle by 5");
                    }else{
                        System.out.println("Not divisible by 5!");
                    }
                }
                else{
                    System.out.println("The number is even");   
                }
            }
            else if(a == 0){
                System.out.println("The number is Zero !");
            }else{
                System.out.println("Number is negative !");
            }
        }
    }
}
