class MinTwo{
    int num1;
    int num2;
    int min;
    MinTwo(int nn, int mm){
        num1 = nn;
        num2 = mm;
    }
    int Minimum( ){
        if(num1 < num2){
            min=num1;
            return min;
        }
        else{
            min=num2;
            return min;
        }
    }
}
class MinThree extends MinTwo{
    int num3;
    

    MinThree(int n3){
        super(13,9);
        num3 = n3;
    }
    int Minimum( ){
        if (num1 < num2 && num1 < num3){
            min = num1;
            return min;
        }
        else if(num2 < num1 && num2 < num3){
            min = num2;
            return min;
        }
        else{
            min = num3;
            return min;
        }
    }
    void display(){
        System.out.println("num1: "+num1+"\nnum2: "+num2+"\nnum3: "+num3);
        System.out.println("Minimum = "+min);
    }
    public static void main(String[] args) {
        MinThree mt = new MinThree(20);
        int mtw = mt.Minimum();
        mt.display();
    }
}
