package Oops;

import java.util.Scanner;

public class clan {
    static double s;
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a,b,c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            int sum = a+b+c;
            
            s = Math.pow(sum, 2);
        }
        clan obj = new clan();
        obj.display();
    }
    void display(){
        System.out.print("Sum = "+s);
    }
}
