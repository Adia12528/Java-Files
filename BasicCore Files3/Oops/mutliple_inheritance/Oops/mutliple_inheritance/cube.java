package Oops.mutliple_inheritance;

import java.util.*;

class base{
    int no;
    @SuppressWarnings("resource")
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        no = sc.nextInt();
    }
}

class child1 extends base{
    int x;
    void square(){
        x = no*no;
        System.out.println("The square of number = "+x);
    }
}

class grand_child extends child1{
    int z;
    void cube_num(){
        z = no*no*no;
        System.out.println("The cube the number = "+z);
    }
}

public class cube {
    public static void main(String[] args) {
        grand_child gc = new grand_child();
        gc.accept();
        gc.square();
        gc.cube_num();
    }
}
