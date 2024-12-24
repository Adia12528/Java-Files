package String;

import java.util.Scanner;

public class frequnency {
    public static void main(String[] args) {
        System.out.print("enter the String: ");
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            String upperstr = str.toUpperCase();
            int l = str.length();
            for (char ch = 'A';ch <= 'Z'; ch++) {
                int a = 0;
                for (int i = 0; i < l; i++) {
                    char c = upperstr.charAt(i);
                    if (c == ch) {
                        a++;
                    }
                    if (a != 0) {
                        System.out.println(c+"\t"+a);
                    }
                }
            }
        }
    }
}
