package String;
import java.util.*;
public class Pallin {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Please enter a String: ");
            String a = sc.nextLine();
            int len = a.length();
            String r ="";
            for (int i = len - 1; i >= 0; i--)
             {
                r = r+a.charAt(i);
            }
            if (r.equalsIgnoreCase(a)) {
                System.out.println("A Pallindrome Number");
            }
            else{
                System.out.println("Not Pallindrome Number");
            }
        }
    }
}
