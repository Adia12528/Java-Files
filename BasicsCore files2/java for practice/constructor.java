
public class constructor {
    int pi = 22/7;
    void initialise(){
        System.out.println("Value of pi = "+pi);
    }
    void initialise(int a,int r){
        System.out.println("The volume of sphere: "+4/3*pi*(r*r*r));
    }
    void initialise(int a,int r,int s){
        s = 4;
        System.out.println("The surface area of sphere: "+s*pi*(r*r));
    }
    public static void main(String[] args) {
        constructor c = new constructor();
        c.initialise();
        c.initialise(1, 2);
        c.initialise(1, 2, 3);
    }
}
