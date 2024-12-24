import java.util.*;
public class sum
{
public static void main(String args[]) {
    try (Scanner sc = new Scanner(System.in)) {
        int a,b,c;
        System.out.print("Enter the value of a and b: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a+b;
        System.out.print("sum="+c);
        }
    }
}