package String;

import java.util.Scanner;

public class convert {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Write a word: ");
            String str = sc.next();
            String strLower = str.toLowerCase();
            String newstr = "";
            for (int i = 0; i < strLower.length(); i++) {
                char c = strLower.charAt(i);
                switch (c) {
                    case 'a':
                    case 'A':
                    case 'e':
                    case 'E':
                    case 'i':
                    case 'I':
                    case 'o':
                    case 'O':
                    case 'u':
                    case 'U':
                        newstr = newstr+(char)(c+1);
                        break;
                
                    default:
                        newstr = newstr+c;
                }
            }
            System.out.println("New String is: "+newstr);
        }
        
    }
}
