public class CheckingAccount extends bankAccount {

  private float serviceFee;
  final float overdraftFee;

  /** CheckingAccount constructor;
   *    Initialize variables
   */

   CheckingAccount (int accountNumber, int routingNumber, String clientName, String dateOfBirth, float totalAcctBalance, float transactionAmount, float checkingBalance, float savingsBalance, float serviceFee, float overdraftFee) {
      super(accountNumber, routingNumber, clientName, dateOfBirth, totalAcctBalance, transactionAmount, checkingBalance, savingsBalance);
      this.serviceFee = serviceFee;
      this.overdraftFee = overdraftFee;
   }

   public float getServiceFee(float serviceFee) {
      return serviceFee;
   }

   public float getOverdraftFee(float overdraftFee) {
      return overdraftFee;
   }

   /**   CHECKING OVERVIEW
    *       Interface/Selections 
    *           Account Balance
    *           Deposit
    *           Withdraw 
    */

   /** Charge Service Fee method(float checkingBalance, float serviceFee)
    *  Return type of (float) checkingBalance
    *   if (the checking balance is greater than or equal to $0 AND less than or equal to $500)
    *        serviceFee = 20.00
    *        checkingBalance -= serviceFee;
    *   else if (the checking balance is greater than $500 AND less than or equal to $1000)
    *        serviceFee = 15.00
    *         checkingBalance -= serviceFee
    *   else if (the checking balance is greater than $1000 AND less than or equal to $1500)
    *        serviceFee = 10.00
    *        checkingBalance -= serviceFee
    *   else if (the checking balance is greter than $1500)
    *        sysout("Great Job! No service fee this month!")
    *   else 
    *        return -1;
    *        
    *
    *   return checkingBalance
    */

    /** Overdraft charge(float checkingBalance, float overdraftFee)
     *    Return type of (float) checkingBalance
     *      if (the checking balance is less than $0)
     *        checkingBalance += overdraftFee
     *    
     *    return checkingBalance;
     */
  
}
