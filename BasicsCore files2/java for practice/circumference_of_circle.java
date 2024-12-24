import java.util.Scanner;

public class circumference_of_circle {
    int r;
    int c;

    void accept(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the radius: ");
            r =  sc.nextInt();
        }
    }
    void calculate(){
        c = 2*(22/7)*r;
    }

    void display(){
        System.out.println("The circumference of circle is: "+c);
    }
    public static void main(String[] args) {
        circumference_of_circle obj = new circumference_of_circle();
        obj.accept();
        obj.calculate();
        obj.display();
    }
}
