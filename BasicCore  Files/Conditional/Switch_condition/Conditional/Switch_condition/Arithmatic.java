package Conditional.Switch_condition;

import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("1.Addition of two nos.");
            System.out.println("2.Substraction of two nos.");
            System.out.println("3.Product od three nos.");
            System.out.println("Enter your choice from 1 to 3 - ");
            int n = sc.nextInt();
            switch (n) {

                case 1:
                    System.out.print("Enter first num - : ");
                    int c = sc.nextInt();
                    System.out.print("Enter second num - : ");
                    int d = sc.nextInt();
                    System.out.println("Addition: "+c+d);
                    break;

                case 2:
                    System.out.print("Enter first num - : ");
                    int l = sc.nextInt();
                    System.out.print("Enter second num - : ");
                    int b = sc.nextInt();
                    System.out.println("Area of rectrangle: "+(l-b));
                    break;

                case 3:
                    System.out.print("Enter first num - : ");
                    int x = sc.nextInt();
                    System.out.print("Enter second num - : ");
                    int y = sc.nextInt();
                    System.out.print("Enter third num - : ");
                    int z = sc.nextInt();
                    System.out.println("Area of rectrangle: "+x*y*z);
                    break;
            
                default:
                    System.out.println("Error wrong number selected make your choice again!");
                    break;
            }
        }
    }
}
