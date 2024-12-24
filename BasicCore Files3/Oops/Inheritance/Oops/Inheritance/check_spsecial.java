package Oops.Inheritance;

import java.util.*;
class base{
    // int n = 0;
    int number = 0;
    int sumOfFactorials = 0;
    void accept(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number to check weather it is special or not = ");
            // n = sc.nextInt();
            number = sc.nextInt();
        }
    }
}
class check_spsecial extends base {
    // int s = 0;
    // int t = n;
    // void calculate(){
    //     while (t > 0) {
    //         int r = n%10;
    //         int f = 1;
    //         for (int i = 1; i <= r; i++) {
    //             f = f*r;
    //         }
    //         s += f;
    //         t = t/10;
    //     }
    //     if (s == n) {
    //         System.out.println(n+" is the special number!");
    //     }
    //     else{
    //         System.out.println(n+" is not the special number!");
    //     }
    void calculate(){    
        int temp = number;
        while (temp > 0) {
            int lastDigit = temp % 10;
            int factorial = 1;
    
            // Calculate factorial of last digit
            for (int i = 1; i <= lastDigit; i++) {
                factorial *= i;
            }
            sumOfFactorials += factorial;
            temp /= 10;
            }
    
            if (number == sumOfFactorials) {
                System.out.println(number + " is a special number.");
            } else {
                System.out.println(number + " is not a special number.");
            }
        }
    public static void main(String[] args) {
        check_spsecial cs = new check_spsecial();
        cs.accept();
        cs.calculate();
    }
}
