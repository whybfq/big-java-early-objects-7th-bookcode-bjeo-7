import java.util.Scanner;

/**
   This program measures how long it takes to sort an
   array of a user-specified size with the merge
   sort algorithm.
*/
public class MergeSortTimer
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
         
         // Use stopwatch to time merge sort
         
         timer.start();
         MergeSorter.sort(a);
         timer.stop();
         
         System.out.printf("Length:%8d Elapsed milliseconds:%8d%n",
            n, timer.getElapsedTime());
         timer.reset();
      }
   }
}

   

