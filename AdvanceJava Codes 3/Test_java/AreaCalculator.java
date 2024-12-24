import java.util.Scanner;

public class AreaCalculator {

    // Method to calculate the area of a square
    public static double area(double side) {
        return side * side;
    }

    // Method to calculate the area of a rectangle
    public static double area(double length, double breadth) {
        return length * breadth;
    }

    // Method to calculate the area of a circle
    public static double area(float radius) {
        final double PI = 3.14159;
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the shape to calculate the area:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                System.out.println("Area of the square: " + area(side));
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the breadth of the rectangle: ");
                double breadth = scanner.nextDouble();
                System.out.println("Area of the rectangle: " + area(length, breadth));
                break;
            case 3:
                System.out.print("Enter the radius of the circle: ");
                float radius = scanner.nextFloat();
                System.out.println("Area of the circle: " + area(radius));
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}