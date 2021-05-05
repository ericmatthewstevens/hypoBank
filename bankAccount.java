import java.util.Scanner;
import java.lang.Math;

public class bankAccount {
  
  /** Instance Variables
   *    PRIVATE
   *      (int) Account Number
   *      (int) Routing Number
   * 
   *      (String) Client Name
   *      (String) Date of Birth
   *      
   *      (float) Sum of all Account Balances 
   *      (float) Transaction amount
   *      (float) checking account balance
   *      (float) savings account balance
   */

   private static int accountNumber;
   private static int routingNumber;

   public static String clientName;
   private static String dateOfBirth;

   private static float accountBalance;
   private static float transactionAmount;
  //  private static float checkingBalance;
  //  private static float savingsBalance;
   public static Scanner scanner = new Scanner(System.in);

   /** bankAccount Constructor
    *     Initialize all variables
    */

    bankAccount(int accountNumber, int routingNumber, String clientName, String dateOfBirth, float accountBalance, float transactionAmount) {
      this.accountNumber = accountNumber;
      this.routingNumber = routingNumber;
      this.clientName = clientName;
      this.dateOfBirth = dateOfBirth;
      this.accountBalance = accountBalance;
      this.transactionAmount = transactionAmount;
    }


   /** public method, no return, utilizes switch cases
    *   in order to call different methods
    *    "Account Access Portal"
    *     case 1: call checking account;
    *               extended from checkingAccount sub class;
    *     case 2: call savings account;
    *               extended from savingsAccount sub class;
    *     case 3: call client information;
    *               within super class
    *     case 4: exit program;             
    * 
    */

    public String getClientName(String clientName) {
      return clientName;
    }

    public float getTotalAcctBalance(float accountBalance) {
      return accountBalance;
    }

    public void setTotalAcctBalance(float accountBalance) {
      this.accountBalance = accountBalance;
    }

    public static void main(String[] args) {
      
      System.out.println("Please provide your full name: ");
      clientName = scanner.nextLine();

      getAccountSelection(clientName);
    }

    public static void getAccountSelection(String clientName) {

      System.out.println("Welcome " + clientName + "!" + "\n" + 
                         "Account Acccess Portal" + "\n" + 
      "Which account would you like to access?");
      System.out.println("1. Individual Checking Account" + "\n" +
                         "2. High-Yield Interest Savings Account" + "\n" +
                         "3. Personal Information" + "\n" + 
                         "4. Exit");

      
      String accountKey = scanner.nextLine();
      String selectionKey;

      do {
      switch (accountKey) {
        case "1":
            consumerAccount checkingAccount = new consumerAccount(accountNumber, routingNumber, clientName, dateOfBirth, accountBalance, transactionAmount);

            do {
              System.out.println("Hello " + clientName + "!" + "\n" +
              "Current Balance: $" + checkingAccount.getAccountBalance(accountBalance) + "\n" +
              "How may we help you today?");
              System.out.println("1. Deposit" + "\n" + 
               "2. Withdrawl" + "\n" +
               "3. Back to Main Menu");
              selectionKey = scanner.nextLine(); 

                switch (selectionKey) {
                  case "1":
                    System.out.println("How much money would you like to deposit into your checking account?");
                    transactionAmount = scanner.nextFloat();
                    accountBalance = checkingAccount.deposit(transactionAmount, accountBalance);
                    System.out.println("Deposited $" + transactionAmount + " into your account.");
                  break;

                  case "2":
                    System.out.println("How much money would you like to withdraw from your checking account");
                    transactionAmount = scanner.nextFloat();
                    accountBalance = checkingAccount.withdraw(transactionAmount, accountBalance);
                    System.out.println("Withdrew $" + transactionAmount + " from your account.");
                    break;

                  case "3":
                    
                  break;

                } 
              }
              while (selectionKey == "1" || selectionKey == "2");
          break;
        case "2":

          break;
        case "3":
            getClientInfo(accountNumber,routingNumber,clientName,dateOfBirth);
          break;
        case "4":
          break;
      
        default:
          break;
         }
        } while (accountKey != "4");
      }


    /** public method, no return type
     *    use terminal to display the client's information
     *      Account Number, Routing Number, Client Name, Date of Birth
     * 
     */

    public static void getClientInfo(float accountNumber, float routingNumber, String clientName, String dateOfBirth) {
      System.out.println("Client Name: " + clientName + "\n" + 
                         "Date of Birth: " + dateOfBirth + "\n" + 
                         "Account Number: " + accountNumber + "\n" + 
                         "Routing Number: " + routingNumber);
      
      System.out.println("Exit or Edit?");
      
      String exitOrEdit = scanner.nextLine();
      switch (exitOrEdit) {

      case "Edit":
        System.out.println("Which field would you like to edit?");
        String clientInfoSelect = scanner.nextLine();
        switch (clientInfoSelect) {
          case "Client Name":
            System.out.println("Edit your name below.");
            clientName = scanner.nextLine();
            getClientInfo(accountNumber, routingNumber, clientName, dateOfBirth);
          break;
          case "Date of Birth":
            System.out.println("Edit your date of birth below.");
            dateOfBirth = scanner.nextLine();
            getClientInfo(accountNumber, routingNumber, clientName, dateOfBirth);
          break;
          case "Account Number":
            System.out.println("ATTENTION!" + "\n" +
                               "By typing \"Agree\", the client, " + clientName + " hereby accepts all Hypo Bank, LLC policies, terms and conditions." + "\n" + 
                               "Please be aware that the length of time for changes to take effect range from instant to 10 business days.");
            System.out.println("Please type \"Agree\" or \"Disagree\" below.");
            String policyAgreement = scanner.nextLine();
            if (policyAgreement == "Agree" || policyAgreement == "agree") {
              accountNumber = (int) Math.random();
              getClientInfo(accountNumber, routingNumber, clientName, dateOfBirth);
            } else {
              getClientInfo(accountNumber, routingNumber, clientName, dateOfBirth);
            }
        break;
        //Create an "Exit" switch case here to return to the main account select
        case "exit":
            getAccountSelection(clientName);
          break;
        }
       }  
      }

}