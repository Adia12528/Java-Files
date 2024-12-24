package String;

import java.util.Scanner;

public class Convert_Count {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a word: ");
            String str =  sc.nextLine();
            str = str.toUpperCase();
            int len = str.length();
            char c,d;
            int count= 0;
   for (int i = 0; i <= len-2 ; i++) {
            c = str.charAt(i);
            d = str.charAt(i+1);
            if (c == d) {
                count = count+1;
            }
   }
   System.out.println("Number of double sequwsnce is = "+count);
        }
    }
}
