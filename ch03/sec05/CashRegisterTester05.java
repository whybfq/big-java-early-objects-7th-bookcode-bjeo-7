/**
   A class to test the CashRegister class.
*/
public class CashRegisterTester05
{
   public static void main(String[] args)
   {
      CashRegister05 register = new CashRegister05(5);
         // 5% sales tax on taxable purchases

      register.recordTaxablePurchase(10);
      register.recordPurchase(29.50);
      register.recordPurchase(9.25);
      register.receivePayment(50);

      double change = register.giveChange();

      System.out.println(change);      
      System.out.println("Expected: 0.75");          
   }
}

