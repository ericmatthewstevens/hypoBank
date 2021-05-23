public interface ServiceFeeCharge {
  
  final float serviceFee = 0;

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
}
