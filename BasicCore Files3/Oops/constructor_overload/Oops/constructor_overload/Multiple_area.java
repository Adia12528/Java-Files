package Oops.constructor_overload;

import java.util.Scanner;

public class Multiple_area {
    static int choices ;
    void area(int l, int b){
        int result ;
        if (choices == 1) {
            result = l*b;
            System.out.println("Area of rectrangle is: "+result);   
        }else{
            System.out.println("Area of rectrangle not selected!");
        }
    }
    void area(String s, int a){
        int result ;
        if (choices == 2) {
            result = a*a;
            System.out.println("Area of square is: "+result);   
        }else{
            System.out.println("Area of square not selected!");
        }
    }
    void area(int b, int h, String a){
        int result ;
        if (choices == 3) {
            result = 1/2*h*b;
            System.out.println("Area of triangle is: "+result);   
        }else{
            System.out.println("Area of triangle not selected!");
        }
    }
    public static void main(String[] args) {
        Multiple_area ma = new Multiple_area();
        try (Scanner sc = new Scanner(System.in)) {
            choices = sc.nextInt();
        }
        if (choices == 1) {
            ma.area(5, 10);
        }
        else if (choices == 2) {
            ma.area("Square", 0);
        }
        else if (choices == 3) {
            ma.area(12, 5, "triangle");
        }
    }
}
