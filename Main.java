import java.util.Scanner;

public class Main extends acctCalc {

  acctCalc(double accountBalance, double adjustmentAmount) {
    this.accountBalance = accountBalance;
    this.adjustmentAmount = adjustmentAmount;
  }

  public double getAccountBalance(double accountBalance) {
    return accountBalance;
  }

  public double getAdjustmentAmount(double adjustmentAmount) {
    return adjustmentAmount;
  }
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

      
    
    scanner.close();

  }

}
