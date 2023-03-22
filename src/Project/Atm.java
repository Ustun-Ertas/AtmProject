package Project;

import java.util.Scanner;

public class Atm {

    static int balance = 2000;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("    ****************************************    ");
        System.out.println("   WELCOME TO JAVA ATM ");
        System.out.println("Balance Inquiry Press : 1\nWithraw Money Press : 2\nDeposit Press : 3\nExit Press: 4 ");
        choose();
    }
    private static void choose() {
        System.out.print("Please Select Your Action : ");
        int choose = scan.nextInt();
        switch (choose) {
            case 1:
                BalanceInquiry();
                break;
            case 2:
                WithrawMoney();
                break;
            case 3:
                Deposit();
                break;
            case 4:
                Exit();
                break;
        }
    }

   private static void Deposit() {
        System.out.print("Please select the amount you wish to deposit : ");
        int yatırılacakMiktar=scan.nextInt();
        balance+=yatırılacakMiktar;
        System.out.println("Money added to account");
        System.out.println("   ****************************************   ");
        System.out.println("For Continue Processing Press : 1\n Do Not Continue Press: 0\n ");
        int karar=scan.nextInt();
        if (karar ==1){
            choose();
        }else Exit();

    }

    private static void WithrawMoney () {
        System.out.print("How much would like to Withraw: ");
        int cekilecekMiktar=scan.nextInt();
        if (cekilecekMiktar>balance){
            System.out.println(" Insufficient Balance");
        }else {
            balance-=cekilecekMiktar;
            System.out.println("Successfully Withraw");
        }
        System.out.println("   ****************************************    ");
        System.out.println("For Continue Processing Press : 1\n Do Not Continue Press: 0\n ");
        int karar=scan.nextInt();
        if (karar ==1){
            choose();
        }else Exit();

    }

    private static void BalanceInquiry () {
        System.out.println("Current Balance :" + balance);
        System.out.println("    ****************************************    ");
        System.out.println("For Continue Processing Press 1\n Do Not Continue 0\n Press");
        int karar=scan.nextInt();
        if (karar ==1){
            choose();
        }else Exit();
    }
    private static void Exit() {

        System.out.println("Successful Exit, See you Next Time :)");
    }
}

