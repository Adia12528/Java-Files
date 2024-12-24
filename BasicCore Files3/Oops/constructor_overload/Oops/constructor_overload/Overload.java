package Oops.constructor_overload;

public class Overload {
    void num_calc(int num, char ch){
        int result = 0;
        
        if (ch == 's') {
            result = num*num;
        }
        else{
            result = num*num*num;
        }
        System.out.println(result);
    }
    void num_calc(int a, int b, char ch){
        int result;
        
        if (ch =='p') {
            result = a*b;
        }
        else{
            result = a+b;
        }
        System.out.println(result);
    }
    void num_calc(String s1, String s2){
        if (s1.equals(s2)) {
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
    public static void main(String[] args) {
        Overload obj = new Overload();
        obj.num_calc(10,'s');
        obj.num_calc(4,5,'p');
        obj.num_calc("ooo","ppp");
        
    }
}
