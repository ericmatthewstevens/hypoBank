public interface OverdraftCharge {
  
  final float overdraftFee = 15;

    /** Overdraft charge(float checkingBalance, float overdraftFee)
     *    Return type of (float) checkingBalance
     *      if (the checking balance is less than $0)
     *        checkingBalance += overdraftFee
     *    
     *    return checkingBalance;
     */


  public static float overdraftCharge() {
    return 0;
  }
}