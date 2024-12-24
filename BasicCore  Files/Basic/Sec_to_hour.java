import java.util.Scanner;

public class Sec_to_hour {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int s,h,m,r;
            System.out.print("Enter time in seconds : ");
            s = sc.nextInt();
            if (s >= 1) {
                h = s/3600;
                r = s%3600;
                m = r/60;
                r = r%60;
                System.out.println(h+":"+m+":"+r);          
            }
            else{
                System.out.println("Error");
            }
        }
    }
}
