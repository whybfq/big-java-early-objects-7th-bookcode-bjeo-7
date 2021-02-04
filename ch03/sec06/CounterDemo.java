public class CounterDemo
{
   public static void main(String[] args)
   {
      Counter1 tally = new Counter1();
      tally.click();
      tally.click();
      int result = tally.getValue(); // Sets result to 2
      System.out.print("result: ");
      System.out.println(result);
      tally.resetTo(10);
      tally.click();
      result = tally.getValue(); // Sets result to 11
      System.out.print("result: ");
      System.out.println(result);
   }
}

