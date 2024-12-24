package Oops.recursion;

import java.util.Scanner;

public class factorial {
    static int s = 1;
    int facto(int n){
        if (n == 0) {
            return 1;
        }
        else{
            return s=s*n;
        }
    }
    public static void main(String[] args) {
        factorial f = new factorial();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number to get its factorial = ");
            int z = sc.nextInt();
            for (int i = z; i >= 1; i--) {
                f.facto(i);
            }
        }
        System.out.println("Factorial = "+s);
    }
}


