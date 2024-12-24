package Oops;

public class BankAccountProg {
    long AcNum;
    String AcName;
    double AcBalance;
    BankAccountProg(){
        AcNum = 0;
        AcName = " ";
        AcBalance = 0.0;
    }
    BankAccountProg(int n, double bal, String nam){
        AcNum = n;
        AcName = nam;
        AcBalance = bal;
    }
    public static void main(String[] args) {
        BankAccountProg ba = new BankAccountProg(245671, 11234.89, "Sarita");
        System.out.println(ba.AcName+ " Your account balance is: "+ba.AcBalance+ " Your account balance is: "+ba.AcNum);
    }
}
