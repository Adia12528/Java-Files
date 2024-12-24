package String;
import java.util.Scanner;
public class longestword {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String S = sc.nextLine();
            int l = S.length();
            String str;
            int j = 0;
            int k = 0;
            int len[] = new int[l];
            for (int i = 0; i <= l-1; i++) {
                char c = S.charAt(i);
                if (c == ' ') {
                    str = S.substring(j, i);
                    len[k] = str.length();
                    k++;
                    j = i+1;
                }
            }
            int max = 0;
            for (int x = 0; x <= k-1; x++) {
                if (len[x] > max) {
                    max = len[x];
                }
            }
            System.out.println("Length of the longest word is: "+max);
        }            
    }
}