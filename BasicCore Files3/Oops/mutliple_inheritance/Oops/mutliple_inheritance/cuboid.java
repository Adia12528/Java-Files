package Oops.mutliple_inheritance;

import java.util.*;

class grand_parent_clan{
    int len;
    int bdt;
    @SuppressWarnings("resource")
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of cuboid: ");
        len = sc.nextInt();
        System.out.print("Enter the breadth of cuboid: ");
        bdt = sc.nextInt();
    }
}

class parent_clan extends grand_parent_clan{
    int hgt;
    @SuppressWarnings("resource")
    void accept_val(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of cuboid: ");
        hgt = sc.nextInt();
    }
}

class child_clan extends parent_clan{
    int total;
    void calc(){
        total = len*bdt*hgt;
        System.out.println("The volume of cuboid = "+total);
    }
}

public class cuboid {
    public static void main(String[] args) {
        child_clan cc = new child_clan();
        cc.accept();
        cc.accept_val();
        cc.calc();
    }
}