package while_loop;

public class fibonacci {
    public static void main(String[] args) {
        int a=1,b=1,c=0;
        System.out.println(a+" "+b+" ");
        while (c<144) {
            c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }




















}
