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

   private static float totalAcctBalance;
   private static float transactionAmount;
   private static float checkingBalance;
   private static float savingsBalance;
   public static Scanner scanner = new Scanner(System.in);

   /** bankAccount Constructor
    *     Initialize all variables
    */

    bankAccount(int accountNumber, int routingNumber, String clientName, String dateOfBirth, float totalAcctBalance, float transactionAmount, float checkingBalance, float savingsBalance) {
      this.accountNumber = accountNumber;
      this.routingNumber = routingNumber;
      this.clientName = clientName;
      this.dateOfBirth = dateOfBirth;
      this.totalAcctBalance = totalAcctBalance;
      this.transactionAmount = transactionAmount;
      this.checkingBalance = checkingBalance;
      this.savingsBalance = savingsBalance;
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

      
      String selectionKey = scanner.nextLine();

      switch (selectionKey) {
        case "1":
            CheckingAccount.userInterface(clientName, checkingBalance);
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

    }

    public static void userInterface(String clientName, float totalAcctBalance) {
      System.out.println("Error");
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
     

    /** Withdraw method ((float) Transaction Amount)
     *    Use a getter for the correct account balance and subtract the (float) Transaction amount from it
     */

    public static float withdraw() {
      return 0;
    }

    /** Deposit method ((float) Transaction Amount)
     *    Use a getter for the correct account balance and add the (float) Transaction amount to it
     * 
     */
    public static float deposit() {
      return 0;
    }


}