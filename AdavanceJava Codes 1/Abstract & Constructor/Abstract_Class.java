import java.util.Scanner;

abstract class Bank{
    double balance;
    abstract void Deposit();
    abstract void Withdraw();
}
class Transaction extends Bank{
    int depamt;
    int Wamt;

    Transaction(double b) {
        balance = b;
    }
    void Deposit(){
        System.out.println("Enter the amount you want to deposit: ");
        Scanner sc = new Scanner(System.in);
        depamt = sc.nextInt();
        balance = depamt;
    }
    @Override
    void Withdraw(){
        System.out.println("Enter the amount you want to Withdrwal: ");
        Scanner sc = new Scanner(System.in);
        Wamt = sc.nextInt();
        if (balance == 0) {
            System.out.println("Empty account!");
        }
        else if(balance > 0){
            if (Wamt < 500) {
                System.out.println("Insufficient Fund");
            }
            else{
                System.out.println("Wait Until u recieve your cash: "+Wamt);
            }
        }
        else{
            System.out.println("Your current balance: "+balance);
        }
    }
    void Show(){
        System.out.println("Deposit: "+depamt +"\nBalance: "+balance +"\nWidthdrawl: "+Wamt);
    }
    public static void main(String[] args) {
        Transaction trans = new Transaction(0);
        trans.Deposit();
        trans.Withdraw();
        trans.Show();
    }
}