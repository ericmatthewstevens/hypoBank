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

   public static void checkingInterface(String clientName, float checkingBalance) {
      
      boolean runChecking = true;

      while(runChecking) {

         System.out.println(clientName + "'s Checking Account Summary" + "\n" +
                           "Available Balance: $" + checkingBalance);

         System.out.println("Command List: " + "\n" +
                           "1. Deposit" + "\n" + 
                           "2. Withdraw" + "\n" +
                           "3. Back to main menu");

         String selectionKey = scanner.nextLine();

         switch (selectionKey) {
            case "1":
                  System.out.println("Enter your deposit amount.");
                  float depositAmount = scanner.nextFloat();
                  checkingBalance = deposit(depositAmount, checkingBalance);
               break;
         
            case "2":
                  System.out.println("Enter your withdrawl amount.");
                  float withdrawlAmount = scanner.nextFloat();
                  checkingBalance = withdraw(withdrawlAmount, checkingBalance);
               break;

            case "3":
                  runChecking = false;
                  bankAccount.getAccountSelection(clientName);
               break;               
      }


      }
   }

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

    public static float serviceFeeCharge(float checkingBalance, float serviceFee) {
       
       if(checkingBalance > 1500) {
          System.out.println("Great Job! No service fee this month!");
          return checkingBalance;
       } else if (checkingBalance > 1000 && checkingBalance <= 1500) {
          serviceFee = 10;
          return checkingBalance -= serviceFee;
       } else if (checkingBalance > 500 && checkingBalance <= 1500) {
          serviceFee = 15;
          return checkingBalance -= serviceFee;
       } else if (checkingBalance >= 0 && checkingBalance <= 500) {
          serviceFee = 20;
          return checkingBalance -= serviceFee;
       } else {
          return -1;
       }
       
    }

    /** Overdraft charge(float checkingBalance, float overdraftFee)
     *    Return type of (float) checkingBalance
     *      if (the checking balance is less than $0)
     *        checkingBalance += overdraftFee
     *    
     *    return checkingBalance;
     */

     public static float overdraftCharge(float checkingBalance, float overdraftFee) {
        if(checkingBalance < 0) {
           checkingBalance += overdraftFee;
        }

        return checkingBalance;
     }

     /** Withdraw method ((float) Transaction Amount)
     *    Use a getter for the correct account balance and subtract the (float) Transaction amount from it
     */

     public static float withdraw(float transactionAmount, float accountAmount) {
        return accountAmount - transactionAmount;
     }

         /** Deposit method ((float) Transaction Amount)
     *    Use a getter for the correct account balance and add the (float) Transaction amount to it
     * 
     */

     public static float deposit(float transactionAmount, float accountAmount) {
        return accountAmount + transactionAmount;
     }
  
}
