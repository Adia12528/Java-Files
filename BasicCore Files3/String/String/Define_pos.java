package String;

import java.util.Scanner;

public class Define_pos {
    static StringBuffer rev(StringBuffer str, int m, int n){
        String strn = str.substring(m, m+n);
        StringBuffer str2 = new StringBuffer(strn);
        str2.reverse();
        return str2;
    }
    public static void main(String[] args) {
        try (Scanner buf = new Scanner(System.in)) {
            System.out.println("Please enter the string: ");
            String nam = buf.nextLine();
            StringBuffer t = new StringBuffer(nam);
            System.out.println("Please enter the position from whereto extract: ");
            int pos = buf.nextInt();
            System.out.println("Please enter the number to extract: ");
            int nm = buf.nextInt();
            StringBuffer strr = rev(t,pos, nm);
            System.out.print(strr);
        }
    }
}
