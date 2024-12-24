package String;

import java.util.Scanner;

public class concatination {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Please enter two string: ");
            String str1 = sc.next();
            String str2 = sc.next();
            String str3 = str1.concat(str2);
            System.out.print("the concentration string is: "+ str3);
        }
    }
}
