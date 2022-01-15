package src.main.java.com.hypo_bank;
public class CheckingAccount extends bankAccount {

  private float serviceFee;
  private float overdraftFee = 0;

  /** CheckingAccount constructor;
   *    Initialize variables
   */

   CheckingAccount (int accountNumber, int routingNumber, String clientName, String dateOfBirth, float accountBalance, float transactionAmount, float checkingBalance) {
      super(accountNumber, routingNumber, clientName, dateOfBirth, accountBalance, transactionAmount, checkingBalance);
      this.serviceFee = serviceFee;
      this.overdraftFee = overdraftFee;
   }

   public float getServiceFee(float serviceFee) {
      return serviceFee;
   }

   public void setServiceFee(float serviceFee) {
      this.serviceFee = serviceFee;
   }

   public float getOverdraftFee(float overdraftFee) {
      return overdraftFee;
   }

   public float getCheckingBalance(float checkingBalance) {
      return checkingBalance;
   }

   public void setCheckingBalance(float checkingBalance) {
      this.checkingBalance = checkingBalance;
   }

   /**   CHECKING OVERVIEW
    *       Interface/Selections 
    *           Account Balance
    *           Deposit
    *           Withdraw 
    */

   public static void userInterface(String clientName, float checkingBalance) {
      
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
                  checkingBalance = Operations.deposit(depositAmount, checkingBalance);
               break;
         
            case "2":
                  System.out.println("Enter your withdrawl amount.");
                  float withdrawlAmount = scanner.nextFloat();
                  checkingBalance = Operations.withdraw(withdrawlAmount, checkingBalance);
               break;

            case "3":
                  getAccountSelection(clientName);
                  runChecking = false;
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

   //  public static float serviceFeeCharge(float checkingBalance, float serviceFee) {
       
   //     if(checkingBalance > 1500) {
   //        System.out.println("Great Job! No service fee this month!");
   //        return checkingBalance;
   //     } else if (checkingBalance > 1000 && checkingBalance <= 1500) {
   //        serviceFee = 10;
   //        return checkingBalance -= serviceFee;
   //     } else if (checkingBalance > 500 && checkingBalance <= 1500) {
   //        serviceFee = 15;
   //        return checkingBalance -= serviceFee;
   //     } else if (checkingBalance >= 0 && checkingBalance <= 500) {
   //        serviceFee = 20;
   //        return checkingBalance -= serviceFee;
   //     } else {
   //        return -1;
   //     }
       
   //  }

    /** Overdraft charge(float checkingBalance, float overdraftFee)
     *    Return type of (float) checkingBalance
     *      if (the checking balance is less than $0)
     *        checkingBalance += overdraftFee
     *    
     *    return checkingBalance;
     */


      public static float getAccountBalance() {
         return 0;
      }

}
