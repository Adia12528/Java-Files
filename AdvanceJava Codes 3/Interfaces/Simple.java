interface Account
 {
    double intrest();
    void display();
}
class Simple implements Account{
    long accnum;
    double principal,rate,time,si;
    Simple(long a ,double P ,double R ,double T){

        accnum = a;
        principal=P;
        rate=R;
        time=T;
        
    }
    @Override
    public double intrest()
    {

        si=(principal*rate*time)/100;
        return si;
    }
    @Override
    public void display()

    {
        System.out.println("account number "+accnum);
        System.out.println("principal"+principal);
        System.out.println("rate "+rate);
        System.out.println("time "+time);
        System.out.println("simple interest="+si);
        
    }
}
class Compound implements Account{
    long accnum;
    double principle,Rate,Time,ci;
    Compound(long a, double P, double R, double T) {
        accnum = a;
        principle = P;
        Rate = R;
        Time = T;
    }
    @Override
    public  double intrest(){
        
        ci = principle*Math.pow((1+(Rate/100)),Time)-principle;
        return ci;
        
    }
    @Override
    public void display(){
        
        System.out.println("account number "+accnum);
        System.out.println("principal"+principle);
        System.out.println("rate "+Rate);
        System.out.println("time "+Time);
        System.out.println("compound interest="+ci);
    }
    public static void main(String args[])
    {
        Compound obj=new Compound(898345998,100000.0,10.0,3.4);
        double simp= obj.intrest();
        obj.display();

        Simple obj1 =new Simple(898345998,100000.0,10.0,3.4);
        double simp1= obj1.intrest();
        obj1.display();
    }

    }
