package Oops.constructor_overload;

import java.util.Scanner;

public class Multiple_Vol {
    static int choices ;
    void area(int a){
        int result ;
        if (choices == 1) {
            result = a*a*a;
            System.out.println("Volume of cube is: "+result);   
        }else{
            System.out.println("Volume of cube not selected!");
        }
    }
    void area(String s, int a){
        double result ;
        if (choices == 2) {
            result = (4/3)*(22/7)*Math.pow(a,3);
            System.out.println("Area of square is: "+result);   
        }else{
            System.out.println("Area of square not selected!");
        }
    }
    void area(int b, int h, String a){
        double result ;
        if (choices == 3) {
            result = 22/7*h*Math.pow(b, 2);
            System.out.println("Area of triangle is: "+result);   
        }else{
            System.out.println("Area of triangle not selected!");
        }
    }
    public static void main(String[] args) {
        Multiple_Vol mv = new Multiple_Vol();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the choice between 1 to 3: ");
            choices = sc.nextInt();
        }
        switch (choices) {
            case 1:
                mv.area(4);
                break;
            case 2:
                mv.area("Sphere", 5);
                break;
            case 3:
                mv.area(2, 5, "Cyclinder");
                break;
            default:
                System.out.println("Wromg Choice!");
                break;
        }
    }
}
