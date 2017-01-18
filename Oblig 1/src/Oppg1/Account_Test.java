package Oppg1;

public class Account_Test {

    public static void main(String[] args) {

        Account testAccount = new Account("George", 1122, 1000, 1.5);
        testAccount.deposit(30);
        testAccount.deposit(40);
        testAccount.deposit(50);
        testAccount.withdraw(5);
        testAccount.withdraw(4);
        testAccount.withdraw(2);
        System.out.println("Name: " + testAccount.getName() +
                "\nIntrest rate: " + testAccount.getAnnualInterestRate() +
                "\nBalance: " + testAccount.getBalance() +
                "\n\nTransactions:\n" + testAccount.getTransactions()
        );
    }

}
