package Oops.Hierarchae;

import java.util.Scanner;

class radius{
    double r;
    @SuppressWarnings("resource")
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius r: ");
        r = sc.nextDouble();
    }
}

class area_sphere extends radius{
    double s;
    void cal(){
        s = 4*3.14*r*r;
        System.out.println("Area of sphere: "+s);
    }
}

class volume_Sphere extends radius{
    double v;
    void cal(){
        v = 4/3*3.14*r*r*r;
        System.out.println("Volume of sphere: "+v);
    }
}

public class vol_sur_area {
    public static void main(String[] args) {
        area_sphere as = new area_sphere();
        as.accept();
        as.cal();
        volume_Sphere vs = new volume_Sphere();
        vs.accept();
        vs.cal();
    }
}
