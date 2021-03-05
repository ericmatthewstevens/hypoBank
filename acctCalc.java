import javax.swing.JOptionPane;

public class acctCalc {

  double accountBalance, adjustmentAmount;

  acctCalc(double accountBalance, double adjustmentAmount) {
    this.accountBalance = accountBalance;
    this.adjustmentAmount = adjustmentAmount;
  }

  public double deposit(double adjustmentAmount, double accountBalance) {

    if (adjustmentAmount < 0) {
      JOptionPane.showMessageDialog(null, "Please enter a valid USD($) value.");
    } else if (adjustmentAmount > 0) {
      accountBalance += adjustmentAmount;
      JOptionPane.showMessageDialog(null, "The following amount has been added to your balance." + "\n"
       + "$" + adjustmentAmount + "\n" 
       + "Please allow 1-2 business days for the transaction to complete.");
    }
    return accountBalance;

  }

  
  
}
