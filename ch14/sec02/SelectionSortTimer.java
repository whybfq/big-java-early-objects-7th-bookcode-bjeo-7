import java.util.Scanner;

/**
   This program measures how long it takes to sort an
   array of a user-specified size with the selection
   sort algorithm.
*/
public class SelectionSortTimer
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
      
         // Use stopwatch to time selection sort
      
         timer.start();
         SelectionSorter.sort(a);
         timer.stop();
      
         System.out.printf("Length:%8d Elapsed milliseconds:%8d%n",
            n, timer.getElapsedTime());
         timer.reset();
      }
   }
}

