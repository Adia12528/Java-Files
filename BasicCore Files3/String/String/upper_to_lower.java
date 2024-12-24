package String;
import java.util.*;
public class upper_to_lower {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            int l = str.length();
            String s = " ";
            for (int j = 0; j <= l-1; j++) {
                char x = str.charAt(j);
                int a = x;
                if (a >= 65 && a <= 90) {
                    char c = Character.toLowerCase(x);
                    s =s + c;
                }
                else if (a >= 97 && a <= 120) {
                    char d = Character.toUpperCase(x);
                    s = s + d;
                }
                else{
                    s = s + x;
                }
                System.out.print(s);
            }
        }
    }
}
