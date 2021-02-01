import java.util.Arrays;
import java.util.Scanner;

/**
   This program measures how long it takes to sort an
   array of a user-specified size with the Shell
   sort algorithm.
*/
public class ShellSortTimer
{  
   public static void main(String[] args)
   {  
      Scanner in = new Scanner(System.in);
      System.out.print("First array length: ");
      int firstLength = in.nextInt();
      System.out.print("Number of arrays: ");
      int numberOfArrays = in.nextInt();

      StopWatch timer = new StopWatch();      
      
      for (int k = 1; k <= numberOfArrays; k++)
      {
         int n = k * firstLength;

         // Construct random array
   
         int[] a = ArrayUtil.randomIntArray(n, 100);
         int[] a2 = Arrays.copyOf(a, a.length);
         int[] a3 = Arrays.copyOf(a, a.length);
      
         // Use stopwatch to time Shell sort
      
         timer.start();
         ShellSorter.sort(a);
         timer.stop();
      
         System.out.printf("Length:%8d Shell sort:%8d ",
            n, timer.getElapsedTime());

         timer.reset();
         timer.start();
         Arrays.sort(a2);
         timer.stop();

         System.out.printf("Arrays.sort:%8d ", 
            timer.getElapsedTime());

         if (!Arrays.equals(a, a2)) 
         { 
            throw new IllegalStateException("Incorrect sort result"); 
         }

         timer.reset();
         timer.start();
         InsertionSorter.sort(a3);
         timer.stop();

         System.out.printf("Insertion sort:%8d%n",
            timer.getElapsedTime());
      }
   }
}

   

