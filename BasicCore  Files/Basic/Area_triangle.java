import java.util.*;;
public class Area_triangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Height, Base");
            int a,b,c;
            a = sc.nextInt();
            b =  sc.nextInt();
            c = sc.nextInt();
            int s = (a+b+c)/2;
            int h = (int) Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Area of triangle using herons formula : "+h);
        }
    }
}
