package Functions;

import java.util.Scanner;

public class compund {
    public static void main(String[] args) {
        double r;
        r = compund_intrest();
        System.out.println("Compound intrest = "+r);
    }
    static double compund_intrest(){
        try (Scanner sc = new Scanner(System.in)) {
            double n = sc.nextDouble();
            double p = sc.nextDouble();
            double r = sc.nextDouble();
            double ci = p*(1+r/100);
            double t = Math.pow(ci, n);
            double s = t-p;
            return s;
        }
    }
}

