package Oops;

import java.util.Scanner;

public class abc {
    double g;
    double pe,h,m;
    abc(){
        g = 9.8;
    }
    void accept(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the height & mass: ");
            m = sc.nextDouble();
            h = sc.nextDouble();
        }
    }
    void display(){
        pe = m*g*h;
        System.out.print("potential energy = "+pe);
    }
    public static void main(String[] args) {
        abc obj = new abc();
        obj.accept();
        obj.display();
    }
}
