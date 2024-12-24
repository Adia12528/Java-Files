package String;

public class find_digit {
    static void find(String str){
        int len = str.length();
        System.out.print("The number of digit in the number = "+len);
    }
    static void repl(String a){
        char x = a.charAt(0);
        String j = a.replace(x, '0');
        System.out.print("The final String: = "+j);
    }
    public static void main(String[] args) {
        String f = "2567";
        find(f);
        repl(f);
    }
}
