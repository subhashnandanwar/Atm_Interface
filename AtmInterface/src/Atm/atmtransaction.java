package Atm;
import java.util.Scanner;

public class atmtransaction {
    public static void main(String[] args) {
        int balance = 5000,withdraw,deposit;
        Scanner s=new Scanner(System.in);
        while(true)
        {
            System.out.println("Welcome to SBI");
            System.out.println("Press 1 for Withdraw");
            System.out.println("Press 2 for Deposit");
            System.out.println("Press 3 for Check balance");
            System.out.println("Press 4 for Exit");
            System.out.print("Press Button that you want to perform");
            int n=s.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("Enter amount to be withdrawn");
                withdraw = s.nextInt();
                if(balance>=withdraw)
                {
                    balance= balance - withdraw;
                    System.out.println("Please collect your cash");
                }
                else
                {
                    System.out.println("Insufficient balance");
                }
                    System.out.println("");
                    break;

                case 2:
                System.out.println("Enter amount to be deposited");
                deposit = s.nextInt();
                balance = balance + deposit;
                System.out.println("Your money has been successfully deposited");
                System.out.println("");
                break;

                case 3:
                System.out.println("Balance:"+balance);
                System.out.println("");
                break;

                case 4:
                    System.exit(0);


            }
        }
    }
}
