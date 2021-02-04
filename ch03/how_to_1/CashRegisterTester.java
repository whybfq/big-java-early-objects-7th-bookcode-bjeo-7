/**
   A class to test the CashRegister class.
*/
public class CashRegisterTester
{
   public static void main(String[] args)
   {
      CashRegister01 register = new CashRegister01();

      register.recordPurchase(29.50);
      register.recordPurchase(9.25);
      register.receivePayment(50);

      double change = register.giveChange();

      System.out.println(change);      
      System.out.println("Expected: 11.25");          
   }
}

