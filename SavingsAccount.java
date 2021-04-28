public class SavingsAccount extends bankAccount {

  private float interestRate;

  SavingsAccount (int accountNumber, int routingNumber, String clientName, String dateOfBirth, float totalAcctBalance, float transactionAmount, float checkingBalance, float savingsBalance, float interestRate) {
    super(accountNumber, routingNumber, clientName, dateOfBirth, totalAcctBalance, transactionAmount, checkingBalance, savingsBalance);
    this.interestRate = interestRate;
  }

  public float getInterestRate(float interestRate) {
    return interestRate;
  }
  
   /**   SAVINGS OVERVIEW
    *       Interface/Selections 
    *           Account Balance
    *           Deposit
    *           Withdraw 
    *           View Interest Rate
    *           View Future Balances with consistent deposits
    */


}
