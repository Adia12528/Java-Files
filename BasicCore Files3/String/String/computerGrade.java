package String;

import java.io.IOException;
import java.util.Scanner;

public class computerGrade {
    static int roll_num, marksEng, marksMaths, marksComp;
    static double total, percent;
    static char grade;
    static String name;
    static void computeGrade(char g){
        grade = g;
    }
    static void replaceName(String nam) throws IOException{
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Print enter the word to replace: ");
            String n = sc.next();
            System.out.print("Please enter the new word");
            String n1 = sc.next();
            int x = nam.indexOf(n);
            if (x >= 0) {
                int len = n.length();
                int l = nam.length();
                if (x == 0) {
                    x = len-1;
                    len = x+1;
                }
                String str1 = nam.substring(0, x-len+1);
                String str2 = nam.substring(x+len, l);
                String str3 = str1.concat(n1);
                str3 = str3.concat(str2);
                System.out.print("The resulting string is "+str3);
            }
            else{
                System.out.println("name not found to be replaced!");
            }
        }
    }
    public static void main(String[] args) throws IOException {
        computeGrade('A');
        replaceName("Aditya Soni");
    }
}
