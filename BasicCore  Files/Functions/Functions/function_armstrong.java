package Functions;

import java.util.Scanner;

public class function_armstrong {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int f = Armstrong(n);
            if(f==1){
                System.out.println(n+" is a Armstrong number");
            }
            else{
                System.out.println(n+" is not aa Armstrong number");
            }
        }
    }
    static int Armstrong(int n){
        int m=n;
        int s=0;
        while (n != 0) {
            int r = n%10;
            s = s+r*r*r;
            n = n/10;
        }
        if(s==m)
        {
            return 1;
        }
        else{
            return 0;
        }
    }
}
