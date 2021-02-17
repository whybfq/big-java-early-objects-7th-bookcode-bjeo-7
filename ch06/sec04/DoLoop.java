import java.util.Scanner;

/**
   This program shows how you can prompt for input that fulfills
   a certain condition. Try entering negative values and then a 
   nonnegative value, such as -2 -0.5 9, to see how the negative
   values are rejected.
*/
public class DoLoop 
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      double value;
      do
      {
         System.out.print("Enter a number >= 0: ");
         value = in.nextDouble();
      }

      while (value < 0);  // with do together
      double root = Math.sqrt(value);
      System.out.println("The square root of the number is " + root);

      // The for loop won't check whether the initialization, condition and update experssions are related
//      double sum = 0, x = 0;
//      for (System.out.print("Input: " ); in.hasNextDouble(); sum = sum + x)
//      {
//         x = in.nextDouble();
//      }
   }
}

