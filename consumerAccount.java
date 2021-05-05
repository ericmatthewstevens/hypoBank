public class consumerAccount extends bankAccount {

  public String getAccountBalance;

  consumerAccount(int accountNumber, int routingNumber, String clientName, String dateOfBirth, float accountBalance, float transactionAmount) {
    super(accountNumber, routingNumber, clientName, dateOfBirth, accountBalance, transactionAmount);
  }

  //A getter for the account balance should be used to view the current account balance.
  public float getAccountBalance(float accountBalance) {
    return accountBalance;
  }

    /** Withdraw method ((float) Transaction Amount)
   *    Use a getter for the correct account balance and subtract the (float) Transaction amount from it
   */

  public float withdraw(float transactionAmount, float accountBalance) {
    return accountBalance - transactionAmount;
    }

    /** Deposit method ((float) Transaction Amount)
     *    Use a getter for the correct account balance and add the (float) Transaction amount to it
     * 
     */
    public float deposit(float transactionAmount, float accountBalance) {
      return accountBalance + transactionAmount;
   }

}
