package Oops.polymorphism;

import java.util.Scanner;

public class fun_overloading {
    void Add(int a, int b){
        int c = a+b;
        System.out.println("Sum = "+c);
    }
    void Add(int a, int b, int c){
        int d = a+b+c;
        System.out.println("Sum = "+d);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            fun_overloading fo = new fun_overloading();
            int x,y,z;
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            fo.Add(x,y);
            fo.Add(x,y,z);
        }
    }
}
