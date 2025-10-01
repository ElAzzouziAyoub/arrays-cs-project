package samplearrays;

public class BankAccount {

    String name;
    double currentBalance;
    //TO-DO: Initialize an Array with 1000 in size that stores Double called 'transactions' to keep track of the user's transactions
    double[] transactions = new double[1000];
    int counter = 0;

    public BankAccount(String name, int startingBalance){
        this.name = name;
        this.currentBalance = startingBalance;

    }

    public void deposit(double amount){
      if ( amount <= 0 ){
        System.out.println("Invalid amount !");
        return;
      }
      System.out.println("Deposited "+ amount + "$" );
      this.currentBalance += amount;
      transactions[counter] = amount;
      counter++;

    }

    public void withdraw(double amount){
      if ( this.currentBalance - amount >= 0 ){
        System.out.println("Withdrawed "+ amount + "$" );
        transactions[counter] = -amount;
        this.currentBalance -= amount;
        counter++;
      }
      else{
        System.out.println("Insufficient Balance !");
      }

    }

    public void displayTransactions(){
      System.out.println("------------TRANSACTIONS-------------------");
      for (int i = 0 ; i < counter ; i++){
        if ( transactions[i] <0){
          System.out.println("Withdraw : " + transactions[i] + " $");
        }
        else{
          System.out.println("Deposit : "+transactions[i] + " $");
        }
      } 
      System.out.println("-----------------------------------------");
    }

    public void displayBalance(){
      System.out.println("Current Balance : " + this.currentBalance + " $");

    }

    public static void main(String[] args) {

        BankAccount john = new BankAccount("John Doe", 100);

        // ----- DO NOT CHANGE -----

        //Testing..
        john.displayBalance();
        john.deposit(0.25);
        john.withdraw(100.50);
        john.withdraw(40.90);
        john.deposit(-90.55);
        john.deposit(3000);
        john.displayTransactions();
        john.displayBalance();

        // ----- DO NOT CHANGE -----

    }

}
