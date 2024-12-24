import java.util.Scanner;

class base{
double a,b;
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        a = sc.nextInt();
        System.out.print("Enter the value: ");
        b = sc.nextInt();
    }
}
class child extends base{
    void display(){
        double x = a+b;
        double f = Math.sqrt(x);
        System.out.println("The value : "+f);
    }
}

public class value {
    public static void main(String[] args) {
        child b = new child();
        b.accept();
        b.display();
    }
}
