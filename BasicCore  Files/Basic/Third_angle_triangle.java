import java.util.*;

public class Third_angle_triangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first angle: ");
            int angle_a = sc.nextInt();
            System.out.print("Enter second angle: ");
            int angle_b = sc.nextInt();
            int angle_c = 180 - (angle_a + angle_b);
            System.out.print("Third angle: "+angle_c);
        }
    }
}
