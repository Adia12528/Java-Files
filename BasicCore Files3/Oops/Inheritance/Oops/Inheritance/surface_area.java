package Oops.Inheritance;

import java.util.Scanner;
class parent{
    int radius = 0;
    void accept(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("To accept the the radius: ");
            radius = sc.nextInt();
        }
    }
}
class surface_area extends parent{
    float pie = 22/7;
    void calculate(){
        System.out.println("Area of sphere: "+4*pie*(radius*radius));
        System.out.println("Volume of sphere: "+4/3*pie*(radius*radius*radius));
    }
    public static void main(String[] args) {
        surface_area sa = new surface_area();
        sa.accept();
        sa.calculate();
    }
}
