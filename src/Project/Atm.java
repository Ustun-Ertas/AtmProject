package Project;

import java.util.Scanner;

public class Atm {

    static int balance = 2000;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(" ***************************  ");
        System.out.println("   WELCOME TO JAVA ATM ");
        System.out.println("Balance Inquiry Press : 1\nWithraw Money Press : 2\nDeposit Press : 3\nExit Press: 4 ");
        choose();
    }
    private static void choose() {
        System.out.print("Please Select Your Action : ");
        int choose = scan.nextInt();
        switch (choose) {
            case 1:
                balanceInquiry();
                break;
            case 2:
                withrawMoney();
                break;
            case 3:
                deposit();
                break;
            case 4:
                exit();
                break;
        }
    }

   private static void deposit() {
        System.out.print("Please select the amount you wish to deposit : ");
        int yatırılacakMiktar=scan.nextInt();
        balance+=yatırılacakMiktar;
        System.out.println("Money added to account");
        System.out.println(" ***************************   ");
        System.out.println("For Continue Processing Press : 1\n Do Not Continue Press: 0\n ");
        int karar=scan.nextInt();
        if (karar ==1){
            choose();
        }else exit();

    }

    private static void withrawMoney () {
        System.out.print("How much would like to Withraw: ");
        int cekilecekMiktar=scan.nextInt();
        if (cekilecekMiktar>balance){
            System.out.println(" Insufficient Balance");
        }else {
            balance-=cekilecekMiktar;
            System.out.println("Successfully Withraw");
        }
        System.out.println(" ***************************    ");
        System.out.println("For Continue Processing Press : 1\n Do Not Continue Press: 0\n ");
        int karar=scan.nextInt();
        if (karar ==1){
            choose();
        }else exit();

    }

    private static void balanceInquiry () {
        System.out.println("Current Balance :" + balance);
        System.out.println(" ***************************   ");
        System.out.println("For Continue Processing Press 1\n Do Not Continue 0\n Press");
        int karar=scan.nextInt();
        if (karar ==1){
            choose();
        }else exit();
    }
    private static void exit() {

        System.out.println("Successful Exit, See you Next Time :)");
    }
}

