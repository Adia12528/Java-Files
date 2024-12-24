import java.util.Scanner;

public class Sum_avg {
    public static void main(String args[]) {
    try (Scanner sc = new Scanner(System.in)) {
        int a,b,c,d,e,f,g;
        System.out.print("enter the value number");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f =  a+b+c+d+e;
        g = f/5;
        System.out.println("Sum = "+f);
        System.out.print("Avg = "+ g);
        }
    }
}
