package src.main.java.com.hypo_bank;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String clientName = "";

        System.out.println("Enter your name below for a free account.");
        clientName = scanner.nextLine();
        bankAccount.getAccountSelection(clientName);
      }
  }