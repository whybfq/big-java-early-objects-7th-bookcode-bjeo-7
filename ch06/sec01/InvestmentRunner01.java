/**
   This program computes how long it takes for an investment
   to double.
*/
public class InvestmentRunner01
{
   public static void main(String[] args)
   {
      final double INITIAL_BALANCE = 10000;
      final double RATE = 5;
      Investment01 invest = new Investment01(INITIAL_BALANCE, RATE);
      invest.waitForBalance(2 * INITIAL_BALANCE);
      int years = invest.getYears();
      System.out.println("The investment doubled after "
            + years + " years");
   }   
}

