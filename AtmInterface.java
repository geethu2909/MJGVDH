import java.util.Scanner;
public class AtmInterface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //your current balance .
        float cash = sc.nextFloat();
        sc.nextLine();

        while (true) {
            System.out.println("Insert your card");
            System.out.println("Enter user ID: ");
            String id = sc.nextLine();//user id may contain characters and numbers.


            System.out.println("Enter your pin number: ");  //user pin must be a 4 digit number.
            int pin = sc.nextInt();
            if (pin > 999 && pin <= 9999) {
                System.out.println("your card is processing\nplease donot remove your card");
                System.out.println(" 1.Transactions History\n 2.Withdraw \n 3.Deposit \n 4.quit");
                int choose = sc.nextInt(); //choose 1 to 4.
                switch (choose) {
                    case 1:
                        System.out.println("User Id: ******\n User pin:****\nYour current balance:" + cash);
                        break;
                    case 2:
                        System.out.println("enter amount:");
                        int withdraw = sc.nextInt();
                        if (withdraw <= cash)
                            cash = cash - withdraw;
                        else System.out.println("insufficient balance");
                        break;
                    case 3:
                        System.out.println("enter amount:");
                        int deposit_money = sc.nextInt();
                        cash = cash + deposit_money;
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("choose correct operation");
                        break;
                }
            } else
                System.out.println("You have entered wrong user pin.\n Please enter your correct pin.");

        }
    }
}
