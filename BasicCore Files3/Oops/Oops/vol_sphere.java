package Oops;

import java.util.Scanner;

public class vol_sphere {
    int vol;
    String val;
    int r;

    void accept(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the radius to calculate the volume of sphere: ");
            r =  sc.nextInt();
            System.out.print("Enter thr nsme to display: ");
            val = sc.next();
        }
    }
    void calculate(){
        vol = (4/3)*(22/7)*r*r*r;
    }

    void display(){
        System.out.println("The volume of sphere is: "+vol);
        System.out.println("The name: "+val);
    }
    public static void main(String[] args) {
        vol_sphere obj = new vol_sphere();
        obj.accept();
        obj.calculate();
        obj.display();
    }
}
