package Oops.recursion;

import java.util.Scanner;

public class factorial_recurssion {
        int facto(int n){
        if (n == 1) {
            return 1;
        }
        else{
            return n*facto(n-1);
        }
    }
    public static void main(String[] args) {
        factorial_recurssion fr = new factorial_recurssion();
        int s;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number to get its factorial = ");
            int z = sc.nextInt();
            s= fr.facto(z);
        }
        System.out.println("Factorial = "+s);
    }
}
