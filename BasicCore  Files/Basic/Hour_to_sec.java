import java.util.Scanner;

public class Hour_to_sec {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int h;
            h = sc.nextInt();
            if (h >= 1) {
                int m = h*60;
                int s = m*60;
                System.out.println("Minutes = "+m);
                System.out.println("Seconds = "+s);
            }
            else{
                System.out.println("Error");
            }
        }
    }
}
