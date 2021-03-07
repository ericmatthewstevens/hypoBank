import javax.swing.JOptionPane;

public class acctCalc {

  public double accountBalance, adjustmentAmount;

  acctCalc(double adjustmentAmount, double accountBalance) {
    this.accountBalance = accountBalance;
    this.adjustmentAmount = adjustmentAmount;
  }

  public double deposit(double adjustmentAmount, double accountBalance) {

    if (adjustmentAmount < 0) {

      JOptionPane.showMessageDialog(null, "Please enter a valid USD($) value.");

    } else if (adjustmentAmount > 0) {

      accountBalance = accountBalance + adjustmentAmount;

      JOptionPane.showMessageDialog(null, "The following amount has been added to your balance." + "\n"
       + "$" + adjustmentAmount + "\n" 
       + "Please allow 1-2 business days for the transaction to complete.");
       
       return accountBalance;

    }

    return accountBalance;

  }

  public double withdrawl(double adjustmentAmount, double account) {

    char decisionChar = ' ';

    if (adjustmentAmount < 0) {

      JOptionPane.showMessageDialog(null, "Please enter a valid USD($) value.");

    } else if (adjustmentAmount > accountBalance) {

      JOptionPane.showInputDialog(null, "Warning!" + "\n"
      + "You are about to withdrawl an amount that exceeds your available balance by " + (accountBalance + adjustmentAmount) + "\n"
      + "If you agree to this transaction, your account will be overdrawn and locked, until the overdrawn balance is debited." + "\n"
      + "Do you wish to continue with this transaction? Y/N");

      if (decisionChar == 'Y') {

        accountBalance = accountBalance - adjustmentAmount;

      } else if (decisionChar == 'N') {

        return accountBalance;

      }
    }

    return accountBalance;

  }

  
}
