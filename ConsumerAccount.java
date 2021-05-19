/**
 * ConsumerAccount
 */
public class ConsumerAccount {

  protected static float accountBalance = 

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
