package bankingapp;

import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args){
        BankAccount acc = new BankAccount("Ajay" ,"BA001");
        BankAccount acc2 = new BankAccount("Navya", "BA002");
        acc.showMenu();
        acc2.showMenu();
    }
}

class BankAccount {
    int balance;
    // Tracks the last deposit or withdraw amount
    int previousTransaction;
    String customerId;
    String customerName;
    static String bankName;

    static {
        bankName = "Navya LLC";
        System.out.println("BANK NAME IS: " + bankName);
    }

    BankAccount(String cname,String cid) {
        this.customerName = cname;
        this.customerId = cid;

    }

    void deposit(int amount) {
        if(amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }
    void withdraw(int amount) {
        if(amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }
    void getPreviousTransaction() {
        if(previousTransaction > 0) {
            System.out.println("Deposited: "+ previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("withdrawn: "+ Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction occurred");
        }
    }

    void showMenu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome " + customerName);
        System.out.println("welcome "+ customerId);
        System.out.println("\n");
        System.out.println("A. CheckBalance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("============================================================================================");
            System.out.println("Enter an option");
            System.out.println("============================================================================================");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch(option) {
                case 'A':
                    System.out.println("-----------------------------------------------------------------------------------");
                    System.out.println("Balance = " +balance);
                    System.out.println("-----------------------------------------------------------------------------------");
                    System.out.println("\n");
                    break;
                case 'B':
                    System.out.println("-----------------------------------------------------------------------------------");
                    System.out.println("Enter an amount to deposit: ");
                    System.out.println("-----------------------------------------------------------------------------------");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;
                case 'C':
                    System.out.println("----------------------------------------------------------------------------------");
                    System.out.println("Enter an amount to withdraw: ");
                    System.out.println("----------------------------------------------------------------------------------");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;
                case 'D':
                    System.out.println("----------------------------------------------------------------------------------");
                    getPreviousTransaction();
                    System.out.println("----------------------------------------------------------------------------------");
                    System.out.println("\n");
                    break;
                case 'E':
                    System.out.println("**********************************************************************************");
                    break;
                default:
                    System.out.println("Invalid option! !.please enter again");
                    break;
            }
        } while (option != 'E');

        System.out.println("ThankYou for using our services");
    }
}