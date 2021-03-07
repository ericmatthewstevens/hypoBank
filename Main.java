import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.Document;

public class Main extends acctCalc {

  Main(double adjustmentAmount, double accountBalance) {
    super(adjustmentAmount, accountBalance);
  }

  //Main constructor contains a super that inherits the values of adjustmentAmount and accountBalance from acctCalc class.

  double accountBalance;
  double adjustmentAmount;

  public double getAccountBalance(double accountBalance) {
    return accountBalance;
  }

  public double getAdjustmentAmount(double adjustmentAmount) {
    return adjustmentAmount;
  }
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    JFrame frame = new JFrame("HypoBank, LLC");
    JButton loginButton = new JButton("Login");
    JButton signupButton = new JButton("New User");
    JTextArea usernameText = new JTextArea();
    JPasswordField passwordText = new JPasswordField();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 300);
    frame.setLayout(null);
    frame.setVisible(true);
    frame.setTitle("Welcome!");
    
    loginButton.setBounds(100, 185 , 80, 45);
    signupButton.setBounds(200, 185, 80, 45);
    usernameText.setBounds(40, 40, 300, 45);
    passwordText.setBounds(40, 100, 300, 45);

    frame.add(loginButton);
    frame.add(signupButton);
    frame.add(usernameText);
    frame.add(passwordText);
    
    
    scanner.close();

  }

}
