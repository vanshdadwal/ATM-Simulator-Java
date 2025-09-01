import java.util.Scanner;

public class ATM {
    private static double balance = 7000.00;

    public static final int PIN  = 1234;
     public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your PIN :- ");
        int enteredPin = input.nextInt();

        if (enteredPin != PIN){
            System.out.println("Incorrect PIN . Access denied ! ");
            return ;
        }
        int choice ;
        do {
            System.out.println("\n======== ATM Menu ========");
            System.out.println(" 1.Check Balance ");
            System.out.println("2. Deposit Money ");
            System.out.println("3.withdraw Money ");
            System.out.println("4.Exit ");
            System.out.println("Enter your choice :");

            choice = input.nextInt();
            switch (choice) {
                case 1:
                    CheckBalance();
                    break;
                    case 2 :
                    Deposit(input);
                    break;
                    case 3 :
                    withdraw(input);
                    break;
                    case 4 :
                    System.out.println("Thank you for using ATM GOODBYE ! ");

            break ;
                default:
                    

                    System.out.println("Invadil choice ! Try again. ");
            }
    
               } while (choice != 4);
               input.close();
               
     }
     public static void CheckBalance(){
        System.out.println("Your current balance : Rs."+ balance);
     }
     public static void Deposit(Scanner input ){
        System.out.println("Enter amouunt to deposit : Rs ");
        double amount = input.nextDouble();
        if (amount>0){
            balance += amount;
            System.out.println("Successfully deposited Rs " + amount );
            CheckBalance();
        } else {
            System.out.println("Invadil deposit amount ! ");

        }
     }
     public static void withdraw(Scanner input ){
        System.out.println("Enter the amount to withdraw : Rs ");
        double amount = input.nextDouble();
        if (amount> 0 && amount <= balance){
            balance-= amount;
            System.out.println("Successfully withdraw Rs" + amount);
            CheckBalance();
        }
        else if (amount >balance ){
            System.out.println("Insufficient balance ! ");

        }else {
            System.out.println("Invadil withdraw amount ! ");
        }
     }
     }


