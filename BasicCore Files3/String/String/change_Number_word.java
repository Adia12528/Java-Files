package String;

public class change_Number_word {
    public static void main(String[] args) {
        String str = "JANUARY 26 IS CELEBRATED AS REPUBLIC DAY OF INDIA";
        // int pos1  = str.indexOf("January 26");
        int l = str.length();
        int l3 = "JANUARY 26".length();
        String str2 = str.substring(l3+1, l);
        String s = "AUGUST 15 " + str2;
        int len1 = s.length();
        int pos3 = s.indexOf("REPUBLIC");
        int l2 = "REPUBLIC".length();
        String str3 = s.substring(0, pos3);
        String str4 = s.substring(pos3+l2+1,len1);
        System.out.println("The final string is: "+str3+"INDEPENDENCE"+str4);
    }
}