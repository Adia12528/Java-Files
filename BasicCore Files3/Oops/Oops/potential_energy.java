package Oops;

import java.util.Scanner;

public class potential_energy {
    static int pot;
    static String val;
    int h;
    int m;

    void accept(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the height: ");
            h =  sc.nextInt();
            System.out.print("Enter the mass in kg: ");
            m = sc.nextInt();
            System.out.print("Enter thr name of body: ");
            val = sc.next();
        }
    }
    void calculate(){
        pot = m*10*h;
    }
    public static void main(String[] args) {
        potential_energy obj = new potential_energy();
        obj.accept();
        obj.calculate();
        System.out.println("Potential Energy of "+val+" is "+pot);
    }
}

