
import java.util.Scanner;

class area_overiding {
    void area(int a, int b, int c){            // the void should be same
        int o = a*b*c;
        System.out.println("Area of rectrangle = "+o);
    }
    void area(int a){        // the void should be same
        int o = a*a;
        System.out.println("The area of sqyare = "+o);
    }
    void area(int a, int b){  // the void should be same
        int o = 1/2*a*b;
        System.out.println("The area of triangle = "+o);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            area_overiding ao = new area_overiding();
            System.out.println("Select:\n 1. for rectrangle \n 2. for square \n 3. for triangle.");
            int n = sc.nextInt();
            int x,y,z;
            switch (n) {
                case 1:
                System.out.println("You choose the number for rectrangle!");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    z = sc.nextInt();
                    ao.area(x, y, z);
                    break;
                case 2:
                System.out.println("You choose the number for square!");
                    x = sc.nextInt();
                    ao.area(x);
                    break;
                case 3:
                System.out.println("You choose the number for triangle!");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    ao.area(x, y);
                    break;
                default:
                    System.out.println("Wrong choice made !");
                    break;
            }
        }
    }
}
