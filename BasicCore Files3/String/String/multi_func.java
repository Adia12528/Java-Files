package String;

public class multi_func {
    static void joyString(String s, char ch1, char ch2){
        String str = " ";
        int indx = s.indexOf(ch1);
        if (indx > -1) {
            str = s.replace(ch1, ch2);
        }else{
            System.out.println("Char"+ ch1 +"does not exist in" + s);
        }
        System.out.println("Output String: ");
        System.out.println(str);  
    }
    static void joyString(String s){
        int firstIndexOfSpace = s.indexOf(' ');
        int lastIndexOfSpace = s.lastIndexOf(' ');
        System.out.println("First index Of Space = "+ firstIndexOfSpace);
        System.out.println("Last index Of Space = "+ lastIndexOfSpace);
    }
    static void joyString(String s1, String s2){
        String s3 = s1.concat(" ").concat(s2);
        System.out.println(s3);
    }
    public static void main(String[] args) {
        joyString("Technology", 'a', 'o');
        joyString("Cloud is rain");
        joyString("Cloud", "rain");
    }
}
