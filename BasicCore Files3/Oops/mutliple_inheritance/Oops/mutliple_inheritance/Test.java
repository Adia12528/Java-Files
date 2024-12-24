package Oops.mutliple_inheritance;

import java.util.*;

class Parent{
    int a,b;
    @SuppressWarnings("resource")
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number = ");
        a = sc.nextInt();
        System.out.print("Enter the second number = ");
        b = sc.nextInt();
    }
}

class child extends Parent{
    int c;
    void Add(){
        c = a+b;
        System.out.println("Sum = "+c);
    }
}

class child2 extends child{
    int d;
    void product(){
        d = a*b;
        System.out.println("Product = "+d);
    }
}

public class Test {
    public static void main(String[] args) {
        child2 obj = new child2();
        obj.accept();
        obj.Add();
        obj.product();
    }    
}
