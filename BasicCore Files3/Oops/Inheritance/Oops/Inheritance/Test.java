package Oops.Inheritance;

import java.util.*;
class student{
    @SuppressWarnings("resource")
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the roll = ");
        sc.nextInt();
        System.out.print("Enter the Name = ");
        sc.next();
    }
}
class Test extends student{
    int m1, m2, t;
    @SuppressWarnings("resource")
    void calculate(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks = ");
        m1 =  sc.nextInt();
        System.out.print("Enter the marks of sub2 = ");
        m2 = sc.nextInt();
        t = m1+m2;
        System.out.println("total = "+ t);
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.accept();
        t.calculate();
    }
}