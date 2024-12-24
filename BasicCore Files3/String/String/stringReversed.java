package String;

public class stringReversed {
    static StringBuffer stringReverse(StringBuffer str){
        str.reverse();
        return str;
    }
    public static void main(String[] args) {
        StringBuffer t = new StringBuffer("Aditi");
        StringBuffer str = stringReverse(t);
        System.out.print(str);
    }
}
