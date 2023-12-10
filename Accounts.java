abstract class Accounts {
  double balance;
  long accountNumber;
  String accountHoldersName;
  String address;

  abstract void withdrawal(double amount);

  abstract void deposit(double amount);

  void display() {
    System.out.println("Balance: " + balance);
    System.out.println("Account Number: " + accountNumber);
  }
}

class SavingsAccount extends Accounts {

  double rateOfInterest;

  void calculateAmount() {
    // calculate interest amount based on rateOfInterest 
  }

  @Override
  void withdrawal(double amount) {
    // withdraw amount from balance 
  }

  @Override
  void deposit(double amount) {
   // deposit amount to balance
  }

}