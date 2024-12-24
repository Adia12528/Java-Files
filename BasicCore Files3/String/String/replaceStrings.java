package String;
import java.util.Scanner;
public class replaceStrings {
    static void replaceString(String h) {
        int x = h.indexOf("an");
        if (x >= 0) {
            int len = "an".length();
            int l = h.length();
            if (x == 0) {
                x = len-1;
                len = x+1;
            }
            String str1 = h.substring(0, x-len+1);
            String str2 = h.substring(x+len, l);
            String str3 = str1.concat("the");
            str3 = str3.concat(str2);
            System.out.print("The resulting string is: "+str3);
        }
        else{
            System.out.print("an NOT found to be replaced");
        }
    }
    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            System.out.print("Please enter the string: ");
            String sh = inp.next();
            replaceString(sh);
        }
    }
}
