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

  public static void userInterface(String clientName, float savingsBalance) {

    boolean runSavings = true;

    while(runSavings) {

      System.out.println("We greatly apologize for the inconvenience." + "\n" +
                        "Our upcoming Savings Account feature is not" + "\n" +
                        "yet available in your location." + "\n" +
                        "Contact your local bank associate for more information at the number below" + "\n" +
                        "+1 (858) 924-0180");
      
      runSavings = false;

    }
  }

  /** Savings Withdrawl and Deposit methods work differently
   *    Rather than only having the option to deposit and withdraw
   *    to and from the savings acct, the user will have the option to 
   *    deposit/withdraw cash or checking account funds.
   * 
   */


}
