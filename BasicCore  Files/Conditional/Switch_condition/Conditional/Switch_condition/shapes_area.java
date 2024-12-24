package Conditional.Switch_condition;

import java.util.*;

public class shapes_area {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("1.Square");
            System.out.println("2.Circle");
            System.out.println("3.rectrangle");
            System.out.println("4.Triangle");
            System.out.println("Enter your choice from 1 to 4 - ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Enter side of square: ");
                    int a = sc.nextInt();
                    System.out.println("Area of square: "+a*a);
                    break;

                case 2:
                    System.out.print("Enter radius of circle: ");
                    int c = sc.nextInt();
                    System.out.println("Area of circle: "+13.4*c*c);
                    break;

                case 3:
                    System.out.print("Enter lenght of rectrangle: ");
                    int l = sc.nextInt();
                    System.out.print("Enter breadth of rectrangle: ");
                    int b = sc.nextInt();
                    System.out.println("Area of rectrangle: "+l*b);
                    break;

                case 4:
                    System.out.print("Enter base of rectrangle: ");
                    int x = sc.nextInt();
                    System.out.print("Enter height of rectrangle: ");
                    int y = sc.nextInt();
                    System.out.println("Area of rectrangle: "+x*y);
                    break;
            
                default:
                    System.out.println("Error wrong number selected make your choice again!");
                    break;
            }
        }
    }
}
